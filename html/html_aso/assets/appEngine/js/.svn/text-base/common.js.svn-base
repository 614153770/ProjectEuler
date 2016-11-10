 $(".appEngine-product-filter ").on("click",'ul > li',function(e){ 
        var type = $(this).attr('tab-type');
        switch(type){
            case 'ide' :
                $("#ideContainer").show();
                $(this).addClass("active");
                $(this).siblings().removeClass("active");
                $("#imageContainer").hide();
                $("#saasContainer").hide();
                break;
            case 'image' :
                $("#ideContainer").hide();
                $("#imageContainer").show();
                $(this).addClass("active");
                $(this).siblings().removeClass("active");
                $("#saasContainer").hide();
                break;
            case 'saas' :
                $("#ideContainer").hide();
                $("#imageContainer").hide();
                $("#saasContainer").show();
                $(this).addClass("active");
                $(this).siblings().removeClass("active");
                break;
            default :
                $("#ideContainer").show();
                $(this).addClass("active");
                $(this).siblings().removeClass("active");
                $("#imageContainer").hide();
                $("#saasContainer").hide();
                break;
        }
    });

 /*login.html*/
 $(".re-checkbox ").find('input').on("click",function(){
     if($(".ckbox").find('label').hasClass('checked')){
         $(".ckbox").find('label').removeClass('checked');
     }else{
         $(".ckbox").find('label').addClass('checked');
     }
 });

 /*signUp.html*/
 $("#email").blur(function(){
     debugger
     var email = $("#email").val();
     if(email != ""){
         $("#email").addClass('active');
     }else{
         $("#email").removeClass('active');
     }
 });


 $("#passWord").blur(function(){
     var passWord = $("#passWord").val();
     if(passWord != ""){
         $("#passWord").addClass('active');
     }else{
         $("#passWord").removeClass('active');
     }
 });

 $("#passWordConfirm").blur(function(){
     var passWordConfirm = $("#passWordConfirm").val();
     if(passWordConfirm != ""){
         $("#passWordConfirm").addClass('active');
     }else{
         $("#passWordConfirm").removeClass('active');
     }
 });

 // setting面板显示隐藏
 $(".user-name").click(function () {
     $(this).find("ul").toggle(
         function () {
             $(".user-name").addClass("dropdown");
         }
     );
 });
/* //滚动条滚动 固定操作栏
 $(window).scroll(function(){
     if($(window).scrollTop()>= $(".header-back").height()){
         $(".appEngine-product-filter").addClass('appEngine-product-filter-fixed');
         if($(window).scrollTop()> $(".header-back").height()){
             $(".appEngine-product-filter").addClass('appEngine-product-filter-fixed');
         }else{
             $(".appEngine-product-filter").removeClass('appEngine-product-filter-fixed');
         }
     }else{
         $(".appEngine-product-filter").removeClass('appEngine-product-filter-fixed');
     }
 });*/

