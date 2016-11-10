define(function(require, exports, modules) {
	"require:nomunge,exports:nomunge,modules:nomunge";
	require('./aries-base');
	require('./aries-ui');

	//浏览器版本是否低于IE8
    function isIE8() {
        var UA = navigator.userAgent,
            isIE = UA.indexOf('MSIE') > -1,
            v = isIE ? /\d+/.exec(UA.split(';')[1]) : 'no ie';
        return v <= 8;
    }
    var lessThenIE8=isIE8();
	if(lessThenIE8){
		//console.log("lessThenIE8");
	}
	
	$.aries.common.globalInit();
});