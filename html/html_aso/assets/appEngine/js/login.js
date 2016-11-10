function logIn(){
	var userName=document.getElementById("email").value;
	var pwd=document.getElementById("passWord").value;
	
	if(undefined==userName){
        $.message.error("","Please fill in the username!");
        return;
	 }
	 if(undefined==pwd){
        $.message.error("","Please fill in the password!");
        return;
	 }
	
	var param = "userName="+userName+"&pwd="+pwd+"&loginType=1&credentialType=password&vertifyCode=";

	$.ajaxPost($.aries.service.aso.partyAuthenticate,param,function(data){
        if(data){
        	 $.message.success("","Login successed!",function(){
        		 $.cookie($.aries.config.sec.SEC_AUTH_TOKEN_KEY, data, {path : '/'});
        		 $.cookie("login_customer_id", userName, {path : '/'});
        		 window.location = '/aso/index.html';
     		 },function(code,info){
     			if(undefined==info.hub_value[0]){
   	             $.message.error("","Operation failed!");
	   			 }else{
	   	             $.message.error("","Operation failed,code:"+info.hub_value[0].code+",info:"+info.hub_value[0].value);
	   			 }          
     		 });
        }
    },function(code,info){
    	if(undefined==info.hub_value[0]){
            $.message.error("","Operation failed!");
		 }else{
            $.message.error("","Operation failed,code:"+info.hub_value[0].code+",info:"+info.hub_value[0].value);
		 } 
    });
}