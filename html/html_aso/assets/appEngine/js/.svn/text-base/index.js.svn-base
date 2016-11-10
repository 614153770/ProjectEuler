function applyImageAc(offerCode){
	var custLoginId = $.cookie("login_customer_id");
	var param = "prodOfferCode="+offerCode+"&custLoginId="+custLoginId+"&orderType=anonymous";
	$.ajaxPost($.aries.service.aso.addOrder,param,function(data){
		$("#global_loading").hide();
		 $.message.success("","",function(){
			 
		 },function(code,info){
			 if(undefined==info.hub_value[0]){
	             $.message.error("","Operation failed!");
			 }else{
	             $.message.error("","Operation failed,code:"+info.hub_value[0].code+",info:"+info.hub_value[0].value);
			 } 
    });
	},function(code,info){
		$("#global_loading").hide();
		if(undefined==info.hub_value[0]){
            $.message.error("","Operation failed!");
		 }else if("AISEC0002"==info.hub_value[0].code){
		     $.message.error("","No service permission,please log in!");
		 }else if("AISEC0003"==info.hub_value[0].code){
		     $.message.error("","No service permission!");
		 }else{
	         $.message.error("","Operation failed,code:"+info.hub_value[0].code+",info:"+info.hub_value[0].value);
		 }
	});
	$("#global_loading").show();
}
function applyImageCc(offerCode){
	var custLoginId = $.cookie("login_customer_id");
	if(""==custLoginId || undefined==custLoginId){
		$.message.error("", "No permission,please log in!");
	}else{
		$.openPopupPage("/aso/register.html");
	}
}

function signIn(){
	//清cookie
	$.removeCookie($.aries.config.sec.SEC_AUTH_TOKEN_KEY, {path : '/'});
	 window.location = '/aso/login.html';
}

function downLoadTestCat(){
	window.open("http://10.11.20.128:9998/aitools/");
}