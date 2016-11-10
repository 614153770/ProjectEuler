define(function (require, exports, moudles) {
    $.extend($.aries, {
        config: {
            common: {
                //加载页面url前缀，与nginx配置一致
                PAGE_REDIRECT_PREFIX: '',//http://web.crm.veris7.ai:30051/
                //ajax请求sv的url地址
                AJAX_URL_SV_PREFIX: '',
                //ajax请求json的url地址，与nginx配置一致
                AJAX_URL_JSON_PREFIX: '',
                //url串是否要encode编码，默认true
                IS_AJAX_URL_ENCODE: true,
                //写入cookie中国际化语言的key值
                I18N_LOCALE_KEY: 'AE_I18N',
                //默认显示语言
                I18N_LOCALE_DEFAULT: 'en_US',
                //业务流可访问SV路径前缀
                BIZFLOW_SUBMIT_SV_PREFIX: 'HubCrmServlet',
                //是否开启开发模式，会提示错误信息，上线时设置为false
                IS_DEVELOPE_MODE: true,
                //系统全局提示日志信息方式，console (默认方式) | msg
                GLOBAL_LOG_SHOW_TYPE: 'console',
                //是否启用tenant
                IS_USE_TENANT: true,
                //是否启用tenant作为url前缀
                IS_USE_TENANT_PREFIX: false,
                //是否启用租户模拟（开发模式有效，用作模拟登录租户）
                IS_SIMULATE_TENANT: true,
                SIMULATE_TENANT_ID: '21'
            },
            tenant: {
                CURRENCY_KEY: 'tenant-currency',
                TIMEZONE_KEY: 'tenant-timezone',
                LOGO_KEY: 'tenant-logo'
            },
            sec: {
                //临时授权Token的类型，有操作员授权与客户授权两种
                SEC_OPERATOR_TEMP_TOKEN: 'SEC_OPERATOR_TEMP_TOKEN',
                SEC_CUSTOMER_TEMP_TOKEN: 'SEC_CUSTOMER_TEMP_TOKEN',
                //临时授权Token传输给hub的code与value标识
                SEC_TEMP_AUTH_TOKEN_TO_HUB_CODE: 'tempAuthCode',
                SEC_TEMP_AUTH_TOKEN_TO_HUB_VALUE: 'tempAuthValue',
                //临时授权服务的入参授权人类型 ，操作员或客户
                SEC_TEMP_PERMISSION_TOKEN_TYPE_OPERATOR: 'Operator',
                SEC_TEMP_PERMISSION_TOKEN_TYPE_CUSTOMER: 'Customer',
                //临时授权服务的入参授权对象类型 ，功能集、服务 、数据权限 、属主授权
                SEC_TEMP_PERMISSION_ENTITY_TYPE_FUNCTIONSET: 'FunctionSet',
                SEC_TEMP_PERMISSION_ENTITY_TYPE_SERVICE: 'Service',
                SEC_TEMP_PERMISSION_ENTITY_TYPE_DATA: 'Data',
                SEC_TEMP_PERMISSION_ENTITY_TYPE_OWNER: 'Owner',
                //临时授权服务的入参授权类型，密码
                SEC_TEMP_PERMISSION_AUTHOR_TYPE_PWD: '1',
                //临时授权服务的入参需验证的输入信息，用户名、密码
                SEC_TEMP_PERMISSION_CHECK_INPUT_USERNAME: 'username',
                SEC_TEMP_PERMISSION_CHECK_INPUT_PWD: 'password',
                //权限服务返回编码类型，有权限 、未登录无权限、已登录无权限
                SEC_RETURN_TYPE_SUCCESS: 'AISEC0001',
                SEC_RETURN_TYPE_UNLOGIN_FAIL: 'AISEC0002',
                SEC_RETURN_TYPE_LOGINED_FAIL: 'AISEC0003',
                //需要多因子认证的错误编码
                SEC_RETURN_TYPE_MULTIPLE_FACTOR: 'AISEC0007',
                //Auth服务返回编码类型，不支持此种临时授权认证方式
                SEC_AUTH_TYPE_AUTHOR_TYPE_WRONG: 'AIATH0001',
                //Auth服务返回编码类型，操作员登陆验证信息失败，主要是登陆后返回的user为空
                SEC_AUTH_TYPE_LOGIN_FAILURE: 'AIATH0005',
                //Auth服务返回编码类型，session失效
                SEC_AUTH_TYPE_SESSION_EXPIRE: 'AIAUTH0008',
                //写入cookie中Token的key值
                SEC_AUTH_TOKEN_KEY: 'AppEngine_TokenId',
                //写入cookie中租户的key值
                SEC_AUTH_TENANT_KEY: 'AE_TENANT',
                //写入cookie中角色类型的key值
                SEC_AUTH_ROLETYPE_KEY: 'AE_ROLETYPE',
                //写入cookie中域的key值
                SEC_AUTH_ZONE_KEY: 'AE_ZONE',
                //用户名密码错误
                AUTH_LOGIN_FAILURE_ERROR: 'AIAUTH1003',
                //若15分钟未对系统进行操作，则中断用户会话
                AUTH_LOGIN_FAILURE_TIMEOUT: 'AIAUTH1004',
                //用户已登录系统8小时，则中断用户会话，要求用户重新登录
                AUTH_LOGIN_FAILURE_TOO_LONG: 'AIAUTH1005',
                //一个账号同时只能在一个地方登录
                AUTH_LOGIN_FAILURE_ONLY_ONCE: 'AIAUTH1006',
                //账号连续登录失败3次则锁定此账号30分钟，然后自动解锁此账号
                AUTH_LOGIN_FAILURE_OVERLOAD: 'AIAUTH1007',
                //用户密码每3个月要修改，且最近3次的密码不能相同，不能包含用户姓、名，账号名等
                AUTH_LOGIN_FAILURE_PWD_TOO_OLD: 'AIAUTH1009',
                //新创建账号或管理员重置密码账号，在用户登录时必须强制其修改账号口令
                AUTH_LOGIN_FIRST_CHANGE_PWD: 'AIAUTH1016'
            }
        },
        fn: {
            auth: {//安全相关
                //用户名密码错误 AIAUTH1003
                login_error: function (code, value) {
                	 $(".alert-danger").html('<i class="icon-error"></i>Incorrect username or password entered!').show();
		             $("#customerName").parent().addClass('has-error has-feedback');
                },
                //若15分钟未对系统进行操作，则中断用户会话 AIAUTH1004
                login_timeout: function (code, value) {
                	window.location.href  = '/console/login.html';
                },
                //用户已登录系统8小时，则中断用户会话，要求用户重新登录  AIAUTH1005
                login_too_long: function (code, value) {
                	window.location.href  = '/console/login.html';
                },
                //一个账号同时只能在一个地方登录 AIAUTH1006
                login_only_once: function (code, value) {
                },
                //账号连续登录失败3次则锁定此账号30分钟，然后自动解锁此账号 AIAUTH1007
                login_overload: function (code, value) {
                },
                //新创建账号或管理员重置密码账号，在用户登录时必须强制其修改账号口令  AIAUTH1008
                login_reset_pwd: function (code, value) {
                },
                //用户密码每3个月要修改，且最近3次的密码不能相同，不能包含用户姓、名，账号名等   AIAUTH1009
                login_pwd_too_old: function (code, value) {
                },
                //初次登陆需修改密码
                login_first_change_pwd: function (code, value, data) {
                }
            }
        }
    });
});