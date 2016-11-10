define(function (require, exports, moudles) {
//;(function($, undefined){
	
	$.extend($.aries, {
		service : {
			veris7 : {
				/**
				 * index.html
				 */
			    createCustomerInfo : '/HubCrmServlet?servicecode=createCustomerInfo',
				/** 
				 * list.html
				 */
				getStaticDataByCodeType : '/HubCrmServlet?servicecode=vs_getStaticDataByCodeType',
				queryProductSpecificationList : '/veris/data/tmp/vs_queryProductSpecificationList.json',
				/** 
				 * detail.html
				 */
				acquireProductSpecification :'/veris/data/tmp/vs_acquireProductSpecification.json',
				hasResources : '/veris/data/tmp/vs_hasResources.json',
				confirmCustmerOrder : '/veris/data/tmp/confirmCustmerOrder.json',
				/** 
				 * order.html
				 */
				familyData : '/veris/data/tmp/loadCustomerOrderInfo2.json',
				acquireCustomerInfo : '/HubCrmServlet?servicecode=acquireCustomerInfo',
				/**
				 * submit.html
				 */

				getOrderOfferInfo:'/veris/data/tmp/vs_getOrderOfferInfo.json',
				/**
				 * addonoffer.html
				 */
				queryOrderdOffer : '/HubCrmServlet?servicecode=queryOrderdOffer',
				queryOffers : '/HubCrmServlet?servicecode=queryOffers',
				aequeryOffer : '/HubCrmServlet?servicecode=aequeryOffer',
				/**
				 * selectnumber.html
				 */
				getSpecIdByCode:'/HubCrmServlet?servicecode=getSpecIdByCode',
				queryNewPhoneNumber : '/HubCrmServlet?servicecode=queryNewPhoneNumber',
			    queryReservedPhoneNumber : '/HubCrmServlet?servicecode=queryReservedPhoneNumber',
			    reservePhoneNumber : '/HubCrmServlet?servicecode=reservePhoneNumber',
			    getServiceNumberOrderJSon:'/HubCrmServlet?servicecode=getServiceNumberOrderJSon',
			    createOrderResourceForPortIn : '/HubCrmServlet?servicecode=createOrderResourceForPortIn',
				/**
				 * addproduct.html
				 */
				queryOrderdProduct : '/HubCrmServlet?servicecode=queryOrderdProduct',
				queryProductSpecList : '/HubCrmServlet?servicecode=queryProductSpecList',
				aequeryProductSpec : '/HubCrmServlet?servicecode=aequeryProductSpec',
				querySubscribedAddOnProds : '/HubCrmServlet?servicecode=querySubscribedAddOnProds',
				queryCanSubscribeAddOnProds : '/HubCrmServlet?servicecode=queryCanSubscribeAddOnProds',
				//addDevice.js
				queryOrderdOfferForDevice : '/HubCrmServlet?servicecode=queryOrderdOfferForDevice',
				queryDevices : '/HubCrmServlet?servicecode=queryDevices',
				aequeryDevice : '/HubCrmServlet?servicecode=aequeryDevice',
				//selectAccount.js
				initAccoutData : '/HubCrmServlet?servicecode=initAccountData',
				queryNewAccountSelect : '/HubCrmServlet?servicecode=queryNewAccountSelect',
				queryIndiAccount : '/HubCrmServlet?servicecode=queryIndiAccount',
				confirmNewAccount : '/HubCrmServlet?servicecode=confirmNewAccount',
				queryPayBehalf : '/HubCrmServlet?servicecode=queryPayBehalf',
				confirmModifyAccount : '/HubCrmServlet?servicecode=confirmModifyAccount',
				confirmOrder : '/HubCrmServlet?servicecode=confirmCustomerOrder',

				queryNewCommonlyUsedAddress:'/HubCrmServlet?servicecode=queryNewCommonlyUsedAddress',
				getDyanamicAddrInfo:'/HubCrmServlet?servicecode=getDyanamicAddrInfo',
				getAddressInfoByAddrIdOrByAddrSpec:'/HubCrmServlet?servicecode=getAddressInfoByAddrIdOrByAddrSpec',
				addNewCommonlyUsedAddress:'/HubCrmServlet?servicecode=addNewCommonlyUsedAddress',
				deleteCustomerCommonlyUsed:'/HubCrmServlet?servicecode=deleteCustomerCommonlyUsedAddress',
				modifyDefaultAddress:'/HubCrmServlet?servicecode=modifyDefaultAddress',
				/**
				 * addonoffer.html
				 */
				queryOrderdOffer : '/HubCrmServlet?servicecode=queryOrderdOffer',
				queryOffers : '/HubCrmServlet?servicecode=queryOffers',

				/**
				 * login.html
				 */
				login:'/HubCrmServlet?servicecode=login',
				
				getNewIdList : '/HubCrmServlet?servicecode=getNewIdList',
			    submitCustomerOrder:'/HubCrmServlet?servicecode=submitCustomerOrder2'
			}
		}
	});
	
//})(jQuery);
});