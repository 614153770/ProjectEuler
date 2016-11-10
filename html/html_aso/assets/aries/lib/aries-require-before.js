define(function(require,exports,modules){require("./handlebars");require("./handlebars-helpers");require("./jquery-scroll");require("./jquery-metadata");require("./aries-core");require("../config/aries-config");require("./aries-load");
//如果是租户状态，则设置系统的货币
if($.aries.config.common.IS_USE_TENANT){
	$.cookie($.aries.config.tenant.CURRENCY_KEY , $.veriscrm.config.common.CURRENCY_VALUE || '€');
}
require("./webuploader");});