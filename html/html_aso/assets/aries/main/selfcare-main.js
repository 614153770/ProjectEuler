define('selfcare-main',function(require, exports, modules) {
	require('../lib/aries-require-before');
	//可自定义Hub服务配置文件路径
	require('../config/aries-service');
	
	//国际化资源资源必须位于aries-require-before和aries-require-after之间，如下：
	//require("../../../../I18NRES/assets/i18n/crm_resource#");
	
	require('../lib/aries-require-after');
});