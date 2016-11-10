/**
 * 
 */
function signUp(){
	var custLoginId = $("#email").val();
	var custPwd = $("#passWord").val();
	 if(undefined==custLoginId){
         $.message.error("","Please fill in the username!");
         return;
	 }
	 if(undefined==custPwd){
         $.message.error("","Please fill in the password!");
         return;
	 }
	var param = "custLoginId="+custLoginId+"&custPwd="+custPwd;
	$.ajaxPost($.aries.service.aso.signUp,param,function(data){
        $.message.success("","Signup Successed!",function(){
        		 window.location = '/aso/login.html';
     		 },function(code,info){
     			if(undefined==info.hub_value[0]){
     	            $.message.error("","Operation failed!");
     			 }else{
     	            $.message.error("","Operation failed,code:"+info.hub_value[0].code+",info:"+info.hub_value[0].value);
     			 } 
         });
        
    },function(code,info){
    	if(undefined==info.hub_value[0]){
            $.message.error("","Operation failed!");
		 }else{
            $.message.error("","Operation failed,code:"+info.hub_value[0].code+",info:"+info.hub_value[0].value);
		 } 
    });
}