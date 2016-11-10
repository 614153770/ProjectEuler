function applyImage(offerCode){
	var param = "prodOfferCode="+offerCode+"&custLoginId=TA@asiainfo.com"+"&orderType=anonymous";
	$.ajaxPost($.aries.service.aso.addOrder,param,function(data){
		 $.message.success("","",function(){
			//$.openPopupPage的用法
			//	$.openPopupPage("/ARIESRES/appEngine/demo/order.html",null,"Order","","",{"afterAction":"","draggable":true,"resizable":true});
		 },function(code,info){
        $.message.error("","","load data fail,code:"+code+",info:"+info);
    });
	},function(code,info){
		 $.message.error("","","load data fail,code:"+code+",info:"+info);
	});
}

function downLoadPaasStandardIde(){
	
}