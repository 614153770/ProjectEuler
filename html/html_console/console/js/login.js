function login(){
	var userName=document.getElementById("login-user-name").value;
	var pwd=document.getElementById("login-password").value;
	var param = "userName="+userName+"&pwd="+pwd+"&loginType=1&credentialType=password&vertifyCode=";
	$("#global_loading").show();
	$.ajaxPost($.aries.service.aso.partyAuthenticate,param,function(data){
        if(data){
        	$("#global_loading").hide();
        	 $.message.success("","Login successed!",function(){
        		 $.cookie($.aries.config.sec.SEC_AUTH_TOKEN_KEY, data, {path : '/'});
        		 $.cookie("login_customer_id", userName, {path : '/'});
        		 window.location = '/console/frame.html';
     		 },function(code,info){
     			 if(undefined==info.hub_value[0]){
     	             $.message.error("","Login failed!");
     			 }else{
     	             $.message.error("","login failed,code:"+info.hub_value[0].code+",info:"+info.hub_value[0].value);
     			 }
         });
        }
    },function(code,info){
    	$("#global_loading").hide();
    	 if(undefined==info.hub_value[0]){
	             $.message.error("","Login failed!");
			 }else{
	             $.message.error("","login failed,code:"+info.hub_value[0].code+",info:"+info.hub_value[0].value);
			 }
    });
}

/**
 * 加载微信二维码
 */
function loadQrCode(){
    $.openPopupDiv('aso_qrCode_login','WeChat Login','470','',{"showButton":false});
   
    $.ajaxPost($.aries.service.aso.genQr,'senceIdPrefix=10',function(data){
        if(data && data.sceneId){
        	 $('#loaderOrganize-main').hide();
             $('#aso_qrCode_login').find('img.qrCode-img').attr('src',data.url);
             isLogin(data.sceneId);    
        }
    },function(code,info){
    	if(undefined==info.hub_value[0]){
            $.message.error("","Login failed!");
		 }else{
            $.message.error("","login failed,code:"+info.hub_value[0].code+",info:"+info.hub_value[0].value);
		 }
    });
}


//轮询是否已经登陆
function isLogin(sceneId){
	var polling = arguments.callee;
	setTimeout(function(){
		$.ajaxPost($.aries.service.aso.getWeChatLoginToken,'sceneId=' + sceneId,function(data){
			if(data){
				var token = data;
				$.cookie($.aries.config.sec.SEC_AUTH_TOKEN_KEY, token, {path : "/"});

                //获取登录操作员信息
                $.aries.ajax.post($.aries.service.aso.getOperInfo, null, function (data) {
                    if (data) {
                        if (!!data.attrs.CODE) {
                   		 $.cookie("login_customer_id", data.attrs.CODE, {path : '/'});
                   		 window.location.href = '/console/frame.html';
                        } else {
                        	$.message.error("","Login fails: Invalid user info.");
                        }
                    }
                }, function(code,info){
                   	 if(undefined==info.hub_value[0]){
        	             $.message.error("","Login failed!");
        			 }else{
        	             $.message.error("","login failed,code:"+info.hub_value[0].code+",info:"+info.hub_value[0].value);
        			 }
	            });
                
                   
			}else{
				polling(sceneId);
			}
		},function(code,info){
			 if(undefined==info.hub_value[0]){
	             $.message.error("","Login failed!");
			 }else{
	             $.message.error("","login failed,code:"+info.hub_value[0].code+",info:"+info.hub_value[0].value);
			 }
		});
	},500);
	
}