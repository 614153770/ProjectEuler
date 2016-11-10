define(function (require, exports, moudles) {
//;(function($, undefined){
	
	$.extend($.aries, {
		service : {
			aso: {
				addOrder:'/HubCrmServlet?servicecode=c8bf6b6c-5501-0010-84c8-2bb6fb99ca75',
				qryOrderByOfferType:'/HubCrmServlet?servicecode=d17c8e5e-5501-0010-9714-b5290a272a38',
				addConstruction:'/HubCrmServlet?servicecode=72a36d6c-5501-0010-84c8-2bb6fb99ca75',
				qryConstructionsByCustId:'/HubCrmServlet?servicecode=c9da9e81-5501-0010-83fb-b9a8fff3d56f',
				uninstall:'/HubCrmServlet?servicecode=a0dd6d81-5501-0010-83fb-b9a8fff3d56f',
				install:'/HubCrmServlet?servicecode=b962ef90-5501-0010-b402-bb0f9b8252f6',
				startEnv:'/HubCrmServlet?servicecode=68d29690-5501-0010-b402-bb0f9b8252f6',
				stopEnv:'/HubCrmServlet?servicecode=0b576081-5501-0010-83fb-b9a8fff3d56f',
				deleteEnv:'/HubCrmServlet?servicecode=2aa6987c-5501-0010-819b-4133f54dd074',
				signUp:'/HubCrmServlet?servicecode=0ffb0177-5501-0010-b269-8d8e7395a8e1',
        		partyAuthenticate:'/HubCrmServlet?servicecode=464edc1a-5201-0010-ba3b-a9d9d2299a7d',
        		qryOrderByCustId:'/HubCrmServlet?servicecode=428c8d5e-5501-0010-9714-b5290a272a38',
        		installDevEnv:'/HubCrmServlet?servicecode=28967769-5601-0010-a9da-b36df2c36b3a',
        		qryOrderByCustIdAndOfferType:'/HubCrmServlet?servicecode=4b97198c-5601-0010-9bfb-cb788e289281',
        		buildDevEnv:'/HubCrmServlet?servicecode=b3a6a27c-5601-0010-8637-0d9cfc16ce17',
        		releaseDevEnv:'/HubCrmServlet?servicecode=f2eedf7d-5601-0010-8637-0d9cfc16ce17'
			},
			veris7 : {
				//device
				/**
				 * index.html
				 */
			    createCustomerInfo : '/HubCrmServlet?servicecode=createCustomerInfo',
				/** 
				 * home.html
				 */
				getStaticDataByCodeType : '/HubCrmServlet?servicecode=getStaticDataByCodeType',
				queryProductSpecificationList : '/HubCrmServlet?servicecode=queryProductSpecificationList',
				/** 
				 * detail.html
				 */
				acquireProductSpecification :'/HubCrmServlet?servicecode=acquireProductSpecificationForEShop',
				hasResources : '/HubCrmServlet?servicecode=hasResources',
				queryCustomerContactMedium:'/HubCrmServlet?servicecode=queryCustomerContactMediumSaas',
				saveCustomerArrivalRemindContactMedium:'/HubCrmServlet?servicecode=saveCustomerArrivalRemindContactMedium',
				buyNowForAcquireProductSpecification : '/HubCrmServlet?servicecode=buyNowForAcquireProductSpecification',
				confirmCustmerOrder : '/HubCrmServlet?servicecode=confirmCustmerOrder',
				//通过终端产品规格id查保险offer
				queryProdOfferByFromProdSpecId:'/HubCrmServlet?servicecode=queryProdOfferByFromProdSpecId',
				//查询营销资源规格
				acquireMarketingResourceSpecAllCondition:'/HubCrmServlet?servicecode=acquireMarketingResourceSpecAllCondition',
				//构建保险offer
			    createInsuranceOfferForSaas:'/HubCrmServlet?servicecode=createInsuranceOfferForSaas',
				/** 
				 * order.html
				 */
			    queryBIISpecChar:'/HubCrmServlet?servicecode=queryBIISpecChar',
				familyData : '/HubCrmServlet?servicecode=loadCustomerOrderInfo2',
				acquireCustomerInfo : '/HubCrmServlet?servicecode=acquireCustomerInfo',
				/**
				 * submit.html
				 */
				getOrderOfferInfo:'/HubCrmServlet?servicecode=getOrderOfferInfo2',
				queryNewCommonlyUsedAddress:'/HubCrmServlet?servicecode=queryNewCommonlyUsedAddress',
				getDyanamicAddrInfo:'/HubCrmServlet?servicecode=getDyanamicAddrInfo',
				getAddressInfoByAddrIdOrByAddrSpec:'/HubCrmServlet?servicecode=getAddressInfoByAddrIdOrByAddrSpec',
				addNewCommonlyUsedAddress:'/HubCrmServlet?servicecode=addNewCommonlyUsedAddress',
				deleteCustomerCommonlyUsed:'/HubCrmServlet?servicecode=delCustomerUsedAddress',
			    getAdditionalInformationFileds:	'/HubCrmServlet?servicecode=getAdditionalInformationFileds',
				acquireCustomerCommonlyUsedAddress:	'/HubCrmServlet?servicecode=getCustomerUsedAddress',
				//根据客户选择的时间，查询可用的物流投递选项
				queryLogisticSlotDateAction:'/HubCrmServlet?servicecode=queryLogisticSlotDateSass',
				/**
				 * payment.html
				 */
				queryStatisticsOneTimeFee : '/HubCrmServlet?servicecode=queryStatisticsOneTimeFee1',
				updateBIIFee: '/HubCrmServlet?servicecode=updateBIIFee1',
				sendBillingReceiptInfo:'/HubCrmServlet?servicecode=sendBillingReceiptInfo',
				applyDiscountOneTimeFee  :  '/HubCrmServlet?servicecode=applyDiscountOneTimeFee1',
				/**
				 * selectNumber.html
				 */
				getSpecIdByCode:'/HubCrmServlet?servicecode=getSpecIdByCode',
				queryNewPhoneNumber : '/HubCrmServlet?servicecode=queryNewPhoneNumber',
			    queryReservedPhoneNumber : '/HubCrmServlet?servicecode=queryReservedPhoneNumber',
			    reservePhoneNumber : '/HubCrmServlet?servicecode=reservePhoneNumber',
			    getServiceNumberOrderJSon:'/HubCrmServlet?servicecode=getServiceNumberOrderJSon',
			    createOrderResourceForPortIn : '/HubCrmServlet?servicecode=createOrderResourceForPortIn',
			    queryLiLabel : '/HubCrmServlet?servicecode=queryLiLabel',
			    queryTemporaryNumber :'/HubCrmServlet?servicecode=queryTemporaryNumber',
			    queryPhoneNumberLevel:'/HubCrmServlet?servicecode=queryPhoneNumberLevel',
			    queryNumPatternByLevel:'/HubCrmServlet?servicecode=queryNumPatternByLevel',
			    queryPortInEffectiveDate : '/HubCrmServlet?servicecode=queryPortInEffectiveDate',
				/**
				 * addProduct.html
				 */
				queryOrderdProduct : '/HubCrmServlet?servicecode=queryOrderdProduct',
				queryProductSpecList : '/HubCrmServlet?servicecode=queryProductSpecList',
				aequeryProductSpec : '/HubCrmServlet?servicecode=aequeryProductSpec',
				querySubscribedAddOnProds : '/HubCrmServlet?servicecode=querySubscribedAddOnProds',
				queryCanSubscribeAddOnProds : '/HubCrmServlet?servicecode=queryCanSubscribeAddOnProds',
				/**
				 * device.html
				 */
				acquireOfferingDetailForSaas :  '/HubCrmServlet?servicecode=acquireOfferingDetailForSaas',
				/**
				 * addDevice.html
				 */
				queryOrderdOfferForDevice : '/HubCrmServlet?servicecode=queryOrderdOfferForDevice',
				queryDevices : '/HubCrmServlet?servicecode=queryDevices',
				aequeryDevice : '/HubCrmServlet?servicecode=aequeryDevice',
				/**
				 * selectAccount.html
				 */
				initAccoutData : '/HubCrmServlet?servicecode=initAccountData',
				queryNewAccountSelect : '/HubCrmServlet?servicecode=queryNewAccountSelect',
				queryIndiAccount : '/HubCrmServlet?servicecode=queryIndiAccount',
				confirmNewAccount : '/HubCrmServlet?servicecode=confirmNewAccount',
				queryPayBehalf : '/HubCrmServlet?servicecode=queryPayBehalf',
				confirmModifyAccount : '/HubCrmServlet?servicecode=confirmModifyAccount',
				confirmOrder : '/HubCrmServlet?servicecode=confirmCustomerOrder',
				transeMedium:'/HubCrmServlet?servicecode=transeMedium',
				/**
				 * addOffer.html
				 */
				queryOrderdOffer : '/HubCrmServlet?servicecode=queryOrderdOffer',
				queryOffers : '/HubCrmServlet?servicecode=queryOffers',
				aequeryOffer : '/HubCrmServlet?servicecode=aequeryOffer',
				//addOffer.js
				getOfferingRelClassForJson:'/HubCrmServlet?servicecode=getOfferingRelClassForJson',
				dealAgreementPrice : '/HubCrmServlet?servicecode=dealAgreementPrice',
				dealAddOnOfferNumber:'/HubCrmServlet?servicecode=dealAddOnOfferNumber',
				dealAddOnOfferCharData : '/HubCrmServlet?servicecode=dealAddOnOfferCharData',
				checkPenalty:'/HubCrmServlet?servicecode=checkPenalty',
				/**
				 * assignUser.html
				 */
				getOrgIdBycustId:'/HubCrmServlet?servicecode=getOrgIdBycustId',
				/**
				 * login.html
				 */
				login:'/HubCrmServlet?servicecode=login2',
				mergeCustomerAndLogin : '/HubCrmServlet?servicecode=mergeCustomerAndLogin',

				getNewIdList : '/HubCrmServlet?servicecode=getNewIdList',
				
				//cart
				showCartInfo:'/HubCrmServlet?servicecode=getCartInfo',
				addToCartForOfferInfo : '/HubCrmServlet?servicecode=addToCartForOfferInfo',
				deleteCartItems:'/HubCrmServlet?servicecode=deleteCartItems',
				checkOut:'/HubCrmServlet?servicecode=calculateSumTotal',	
				addToCartForProOffer : '/HubCrmServlet?servicecode=addToCartForProOffer',	
				
				//message
				queryCampaignTask: '/HubCrmServlet?servicecode=queryCampaignTask',
				queryOffering: '/HubCrmServlet?servicecode=queryOffering',
				/**
				 * b2b
				 */
				//getAccountManager : '/veris/data/b2b/getAccountManager.json',
				getAccountManager : '/HubCrmServlet?servicecode=getAccountManager',
				queryOrganization : '/HubCrmServlet?servicecode=getOrganization',
				terminateOrganization : '/HubCrmServlet?servicecode=terminateOrganization',
				queryCustomer : '/HubCrmServlet?servicecode=queryCustomerForUI',
				getPartyRoleInfo : '/HubCrmServlet?servicecode=getPartyRoleInfoForUI',
				getPartyInfo : '/HubCrmServlet?servicecode=getPartyInfoForUI',
				getOrganizationInfo:'/HubCrmServlet?servicecode=getOrganizationInfo',
				//获取动态的地址信息
				getDyanamicAddrInfo:'/HubCrmServlet?servicecode=getDyanamicAddrInfo',
				//根据地址实例id或者地址规格获取地址的信息
				getAddressInfoByAddrIdOrByAddrSpec:'/HubCrmServlet?servicecode=getAddressInfoByAddrIdOrByAddrSpec',
				addContactMedium:'/HubCrmServlet?servicecode=addContactMediumSaas',
				queryCustomerAccountByPartyId: '/HubCrmServlet?servicecode=queryCustomerAccountByPartyId',
				queryUser: '/HubCrmServlet?servicecode=queryUser',
				acquireOrgnizationHierarchy:'/HubCrmServlet?servicecode=acquireOrgnizationHierarchy',
				acquireOrganizationForUI:'/HubCrmServlet?servicecode=acquireOrganizationForUI',
				getStaticDataByCodeType : '/HubCrmServlet?servicecode=getStaticDataByCodeType',
				acquirePartySpecAttrForEShop: '/HubCrmServlet?servicecode=acquirePartySpecAttrForEShop',
				acquireCustomerSegmentForEShop:'/HubCrmServlet?servicecode=acquireCustomerSegmentForEShop',
				acquireCustomerSegmentByTypeForEShop:'/HubCrmServlet?servicecode=acquireCustomerSegmentByTypeForEShop',
				getOrgAdditionalFields:'/HubCrmServlet?servicecode=getOrgAdditionalFields',
				getPartyRoleAdditionalFields:'/HubCrmServlet?servicecode=getPartyRoleAdditionalFields',
				queryTempUser: '/HubCrmServlet?servicecode=queryTempUser',
				deleteAddress:'/HubCrmServlet?servicecode=deleteAddressSaas',
				deleteAddressByPartyRole:'/HubCrmServlet?servicecode=deleteAddressByPartyRole',
				updateAddress:'/HubCrmServlet?servicecode=updateAddressSaas',
				addAddress:'/HubCrmServlet?servicecode=addAddressSaas',
				deleteIndustryType:'/HubCrmServlet?servicecode=deleteIndustryType',
				addIndustryType:'/HubCrmServlet?servicecode=addIndustryType',
				deleteContactMedium:'/HubCrmServlet?servicecode=deleteContactMediumSaas',
				deleteContactMediumByPartyRole:'/HubCrmServlet?servicecode=deleteContactMediumByPartyRole',
				deletePartyAssoc:'/HubCrmServlet?servicecode=deletePartyAssoc',
				updateContactMedium:'/HubCrmServlet?servicecode=updateContactMediumSaas',
				updatePartyAssoc:'/HubCrmServlet?servicecode=updatePartyAssoc',
				queryExistAddress:'/HubCrmServlet?servicecode=queryExistAddress',
				queryIndustryForEShop: '/HubCrmServlet?servicecode=queryIndustryForEShop',
				updateOrgInfo:'/HubCrmServlet?servicecode=updateOrgInfo',
				view360addContactMedium:'/HubCrmServlet?servicecode=view360addContactMedium',
				view360updateContactMedium:'/HubCrmServlet?servicecode=view360updateContactMedium',
				view360deleteContactMedium:'/HubCrmServlet?servicecode=view360deleteContactMedium',
				queryCustomerAccountByCustId:'/HubCrmServlet?servicecode=queryCustomerAccountByCustId',
				acquireAssignedManagerInfo:'/HubCrmServlet?servicecode=acquireAssignedManagerInfo',
				assignedManagerInfo:'/HubCrmServlet?servicecode=assignedManagerInfo',
				qrySubscriber:'/HubCrmServlet?servicecode=qrySubscriber',
				qryOrderSubscriber:'/HubCrmServlet?servicecode=qryOrderSubscriber',
				qryInstOffering:'/HubCrmServlet?servicecode=qryInstOffering',
				qryOrderOffering:'/HubCrmServlet?servicecode=qryOrderOffering',
				getCustomerBasicInformationByCustomerId:'/HubCrmServlet?servicecode=getCustomerBasicInformationByCustomerId',
				view360getPartyInfo:'/HubCrmServlet?servicecode=view360getPartyInfo',
				createNewAccount:'/HubCrmServlet?servicecode=createNewAccount',
				updateAccount:'/HubCrmServlet?servicecode=updateAccount',
				//获取payer 可选的组织层级
				acquirePayerOrgHierarchy:'/HubCrmServlet?servicecode=acquirePayerOrgHierarchy',
				queryManagerForEshop:'/HubCrmServlet?servicecode=queryManagerForEshop',
				getCustomerAddressByCustomerId:'/HubCrmServlet?servicecode=getCustomerAddressByCustomerId',
				//acquireSubscriptionInfoByCustId:'/veris/data/tmp/acquireSubscriptionInfoByCustId.json',
				acquireSubscriptionInfoByCustId:'/HubCrmServlet?servicecode=acquireSubscriptionInfoByCustId',
				//acquireBasicOfferInstInfo:'/veris/data/tmp/acquireBasicOfferInstInfo.json',
				acquireBasicOfferInstInfo:'/HubCrmServlet?servicecode=acquireBasicOfferInstInfo',
				getNextPageKeyByBIIId:'/HubCrmServlet?servicecode=getNextPageKeyByBIIId',
				getOrderJsonObject:'/HubCrmServlet?servicecode=getOrderJsonObject',
				getBIJsonObject:'/HubCrmServlet?servicecode=getBIJsonObject',
				//获取产品订单详情页面
				acquireSubscriberInfoBySubscriberId:'/HubCrmServlet?servicecode=acquireSubscriberInfoBySubscriberId',
				//获取产品订单详情页面
				//querySubscriber4Individual:'/veris/data/tmp/querySubscriber4Individual.json',
				querySubscriber4Individual:'/HubCrmServlet?servicecode=querySubscriber4Individual',
				//获取产品订单详情页面
				querySubscriber4Corporation:'/HubCrmServlet?servicecode=querySubscriber4Corporation',
				view360queryBusinessInteraction:'/HubCrmServlet?servicecode=view360queryBusinessInteraction',
				queryServiceNumberList:'/HubCrmServlet?servicecode=queryServiceNumberList',
				assignNumberRange:'/HubCrmServlet?servicecode=assignNumberRange',
				qryCustomerforNumber:'/HubCrmServlet?servicecode=qryCustomerforNumber',
				queryMarketingResourceType : '/HubCrmServlet?servicecode=queryMarketingResourceType2',
				qryNumberRangeByCondition:'/HubCrmServlet?servicecode=qryNumberRangeByCondition',
				getResSpecByResTypeId:'/HubCrmServlet?servicecode=getResSpecByResTypeId',
				changeNumRangeOwner:'/HubCrmServlet?servicecode=changeNumRangeOwner',
				modifyNumRange:'/HubCrmServlet?servicecode=modifyNumRange',
				releaseReservedNumRange:'/HubCrmServlet?servicecode=releaseReservedNumRange',
				queryAllInOneOrganizationInfo:'/HubCrmServlet?servicecode=queryAllInOneOrganizationInfo',
				queryCustNumRange:'/HubCrmServlet?servicecode=queryCustNumRange',
				queryMarketingResourceSpec : '/HubCrmServlet?servicecode=queryMarketingResourceSpec2',
				addSIMCardReserved:'/HubCrmServlet?servicecode=addSIMCardReserved',
				getExistSIMCardReserved:'/HubCrmServlet?servicecode=getExistSIMCardReserved',
				getExistSIMCardDetail:'/HubCrmServlet?servicecode=getExistSIMCardDetail',
				updateSimCard :'/HubCrmServlet?servicecode=updateSimCard2',
				deleteSimCard:	'/HubCrmServlet?servicecode=deleteSimCard2',
				countNumberRange : '/HubCrmServlet?servicecode=countNumberRangeAction',
				countCustomerSIMCardForSaas:'/HubCrmServlet?servicecode=countCustomerSIMCardForSaas',
				queryUploadItemSaas : '/HubCrmServlet?servicecode=queryUploadItemSaas',
				deleteEmployeeFromUI:'/HubCrmServlet?servicecode=deleteEmployeeFromUI',
				deleteOrgPostRelFromUI:'/HubCrmServlet?servicecode=deleteOrgPostRelFromUI',
				createOrganizationPostRelFromUI: '/HubCrmServlet?servicecode=createOrganizationPostRelFromUI',
				acquireOrganizationPostForUI:'/HubCrmServlet?servicecode=acquireOrganizationPostForUI',
				createDepartment:'/HubCrmServlet?servicecode=createDepartment',
				getPartySpec:'/HubCrmServlet?servicecode=getPartySpec',
				queryEmployeeForEshop:'/HubCrmServlet?servicecode=queryEmployeeForEshop',
				createEmployeeForEshop:'/HubCrmServlet?servicecode=createEmployeeForEshop',
				updateEmployeeForEshop:'/HubCrmServlet?servicecode=updateEmployeeForEshop',
				acquirePositionByOrganization:'/HubCrmServlet?servicecode=acquirePositionByOrganization',
				createCorperation:'/HubCrmServlet?servicecode=createCorperation',
				getUpOrganizationJsonObj:'/HubCrmServlet?servicecode=getUpOrganizationJsonObj',
				getPartyDynamicAttrInfo:'/HubCrmServlet?servicecode=getPartyDynamicAttrInfo',
				updateOrganizationFromUI : '/HubCrmServlet?servicecode=updateOrganizationFromUI',
				deleteOrganizationFromUI : '/HubCrmServlet?servicecode=deleteOrganizationFromUI',
				acquireAllOrgnizationHierarchy: '/HubCrmServlet?servicecode=acquireAllOrgnizationHierarchy',
				putInServiceNumberBatch : '/HubCrmServlet?servicecode=putInServiceNumberBatch2',
				queryServNumberLevel: '/HubCrmServlet?servicecode=queryServNumberLevelForEshop',
				removeServNumberLevel:'/HubCrmServlet?servicecode=removeServNumberLevelForEShop',
				updateServNumberLevel:'/HubCrmServlet?servicecode=updateServNumberLevelForEshop',
				querylevelRulel:'/HubCrmServlet?servicecode=querylevelRulelForEShop',
				createServNumberLevel:'/HubCrmServlet?servicecode=createServNumberLevelForEshop',
				querylevelPattern:'/HubCrmServlet?servicecode=querylevelPatternForEShop',
				updateServNumberInfo:'/HubCrmServlet?servicecode=updateServNumberInfo',
				addNumberRange:'/HubCrmServlet?servicecode=addNumberRange',
				splitNumberRange:'/HubCrmServlet?servicecode=splitNumberRanges',
				qryServiceNumberByCondition:'/HubCrmServlet?servicecode=qryServiceNumberByCondition',
				matchPhoneNumLevel:'/HubCrmServlet?servicecode=matchPhoneNumLevel',
				querySimCardOperatorLog:'/HubCrmServlet?servicecode=querySimCardOperatorLog2',
				queryServiceNumberOperatorLog:'/HubCrmServlet?servicecode=ServiceNumberOperatorLog',
				createOrganizationForEshop:'/HubCrmServlet?servicecode=createOrganizationForEshop',
				querySimCard :'/HubCrmServlet?servicecode=querySimCard2',
				queryEmployeeForUI:'/HubCrmServlet?servicecode=queryEmployeeForUI',
				queryContactsForUI:'/HubCrmServlet?servicecode=queryContactsForUI',
				//agreement
				getAgreementsByCustomerId : '/HubCrmServlet?servicecode=getAgreementsByCustomerId',
				//assignuser
				acquireAllOrgnizationHierarchyForAssignUser : '/HubCrmServlet?servicecode=acquireAllOrgnizationHierarchyForAssignUser',
				queryStaff : '/HubCrmServlet?servicecode=queryStaff',
				//Hierarchy
				getPRSpecValueUseByCodeAndPRSpec : '/HubCrmServlet?servicecode=getPRSpecValueUseByCodeAndPRSpec',
				getPSpecValueUseByCodeAndPSpec : '/HubCrmServlet?servicecode=getPSpecValueUseByCodeAndPSpec',
				deleteContactsForUI:'/HubCrmServlet?servicecode=deleteContactsForUI',
				createContactsForUI:'/HubCrmServlet?servicecode=createContactsForUI',
				updateContactsForUI:'/HubCrmServlet?servicecode=updateContactsForUI',
				queryPartyForUI:'/HubCrmServlet?servicecode=queryPartyForUI',
				//查询employee
				queryContactsForPage:'/HubCrmServlet?servicecode=queryContactsForPage',
				//根据客户ID查询该客户所在集团下的所有客户
				queryCorporateCustomerForSaas:'/HubCrmServlet?servicecode=queryCorporateCustomerForSaas',
				//校验CUG Name唯一性
				checkCUGNameUniqueForSaas:'/HubCrmServlet?servicecode=checkCUGNameUniqueForSaas',
                checkNumUniqueness:'/HubCrmServlet?servicecode=checkNumUniqueness',
				/**
				 * profile
				 */
				acquirePartyInfo: '/HubCrmServlet?servicecode=acquirePartyInfo',
				updateCustomerInfo : '/HubCrmServlet?servicecode=updateCustomerInfo',
				changePassword : '/HubCrmServlet?servicecode=changePassword',
				checkSubscriberPassword:'/HubCrmServlet?servicecode=checkSubscriberPassword',
				checkTerminationProd :'/HubCrmServlet?servicecode=checkTerminationProd', //确认是否共线
				// used by component haltReason/haltReason.js
				getHaltReasonSelectData:'/HubCrmServlet?servicecode=getHaltReasonData',
				getHaltReasonDateData:'/HubCrmServlet?servicecode=getHaltReasonDateData',
				identifyCustomerWrapped:'/HubCrmServlet?servicecode=identifyCustomerWrapped',
				checkCustomerPasswordWrapped:'/HubCrmServlet?servicecode=checkCustomerPasswordWrapped',
				newProdSesAssoc:'/HubCrmServlet?servicecode=newProdSesAssoc',
				queryStatisticsOneTimeFee : '/HubCrmServlet?servicecode=queryStatisticsOneTimeFee1',
				applyDiscountOneTimeFee  :  '/HubCrmServlet?servicecode=applyDiscountOneTimeFee1',
				updateBIIFee: '/HubCrmServlet?servicecode=updateBIIFee1',
				sendBillingReceiptInfo:'/HubCrmServlet?servicecode=sendBillingReceiptInfo',
				submitCustOrderInit : '/HubCrmServlet?servicecode=getOrderOfferInfo2',
				submitCustOrder_usingCoupon : '/HubCrmServlet?servicecode=getCoupons',
				queryUpgradeProductOffering:'/HubCrmServlet?servicecode=queryUpgradeProductOffering1',
				checkIsPriceNegotiationOffer:'/HubCrmServlet?servicecode=checkIsPriceNegotiationOffer',
				offering_info_guess : '/HubCrmServlet?servicecode=acquireProductOfferingForEShopGuess',
				getBusinessCommonConstCache : '/HubCrmServlet?servicecode=getBusinessCommonConstCache',
				budgetControl:'/HubCrmServlet?servicecode=acquireBudgetControl',
                checkAutoResumption:'/HubCrmServlet?servicecode=checkAutoResumption',
				//addMember
				getOrderProductforProductSpec:'/HubCrmServlet?servicecode=getOrderProductforProductSpec',
				checkSubscriberHaveCUGProduct:'/HubCrmServlet?servicecode=checkSubscriberHaveCUGProduct',
				querySubscriberByOfferinstId:'/HubCrmServlet?servicecode=querySubscriberByOfferinstId',
				queryOrderSubscriberByOfferinstId:'/HubCrmServlet?servicecode=queryOrderSubscriberByOfferinstId',
				queryAllContactMedium:'/HubCrmServlet?servicecode=queryAllContactMedium',
				updateCustomerCommonlyUsed:	'/HubCrmServlet?servicecode=updateCustomerUsedAddress',








				/**
				 * order
				 */
				//loadCustomerOrderInfos:'/veris/data/tmp/loadCustomerOrderInfos.json',
				loadCustomerOrderInfos:'/HubCrmServlet?servicecode=loadCustomerOrderInfos',
				isCancelOngoingOrder:'/HubCrmServlet?servicecode=isCancelOngoingOrderSaas', //myOrer.html 订单是否可取消
				submitCancelOrder:'/HubCrmServlet?servicecode=submitCancelOrder', //myOrder.html 撤销订单 ，上面不用了？


				//TODO 70-assets72下同步过来的服务，如不需要可删除
				queryCustmer:'/HubCrmServlet?servicecode=queryCustmer',
				loadTreeToAsync:'/test?servicecode=loadTreeToAsync',
				queryCustomers:'/HubCrmServlet?servicecode=queryCustomers',
				loadHierarchy:'/HubCrmServlet?servicecode=loadHierarchy',
				queryUpOrganizationInfo:'HubCrmServlet?servicecode=queryUpOrganizationInfo',
				queryPayerAccountInfo:'/HubCrmServlet?servicecode=queryPayerAccountInfo',
				queryUserInfo:'/HubCrmServlet?servicecode=queryUserInfo',
				getAllMktResSpecType:'/HubCrmServlet?servicecode=getAllMktResSpecType',
				qryLatestSubscriber:'/HubCrmServlet?servicecode=qryLatestSubscriber',
				acquireSubscriptionDtlBySubscriberId:'/HubCrmServlet?servicecode=acquireSubscriptionDtlBySubscriberId',
				saveUpdateCustomerInfo:'/HubCrmServlet?servicecode=saveUpdateCustomerInfo',
				generateLogicNumber:'/HubCrmServlet?servicecode=generateLogicNumber2',
				//checkNumUniqueness:'/HubCrmServlet?servicecode=checkNumUniqueness',
				queryLogicNum:'/HubCrmServlet?servicecode=queryLogicNum',
				getRbCharSpecByCode:'/HubCrmServlet?servicecode=getRbCharSpecByCode',


				submitCustOrderPost:'/HubCrmServlet?servicecode=submitCustomerOrder2',
				
				//broadband
				/**
				 * home.html
				 */
				getOffering:'/HubCrmServlet?servicecode=getOffering',
				buyNowFromOffering:'/HubCrmServlet?servicecode=buyNow',
				
			    //mobile
				offering_info : '/HubCrmServlet?servicecode=acquireProductOfferingForEShop',
			    //family
				/**
				 * offeringComposi.html
				 */
			    acquireProductOfferingById : '/HubCrmServlet?servicecode=acquireFamilyInfo',
				//acquireProductOfferingById : '/veris/data/tmp/acquireFamilyInfo.json',
			    queryOfferingComposi:'/HubCrmServlet?servicecode=queryOfferingComposi',
			    queryProductInstByAccessNo:'/HubCrmServlet?servicecode=queryProductInstByAccessNo',
			    /**
			     * selectLogicNumber.html
			     */
			    queryLogicNum:'/HubCrmServlet?servicecode=queryLogicNum',
				//查询User的基本信息
				queryUserPartyRoleForSaas:'/HubCrmServlet?servicecode=queryUserPartyRoleForSaas',
				//修改User信息
				updateUserForSaas:'/HubCrmServlet?servicecode=updateUserForSaas',
				/**
				 * selectPayer.html
				 */
				acquireCustomer : '/HubCrmServlet?servicecode=acquireCustomer',
				//查询User
				queryUser2:'/HubCrmServlet?servicecode=queryUser2',
			    /**
			     * addAddress.html
			     */
				getAddressInfoByPostCodeOrByAddr:'/HubCrmServlet?servicecode=getAddressInfoByPostCodeOrByAddr',
				/**
				 * selectSimCardType.html
				 */
			    queryMarketingResourceSpecForSaaS: '/HubCrmServlet?servicecode=queryMarketingResourceSpecForSaaS',
			    queryAvailableReservedSimCard:'/HubCrmServlet?servicecode=queryAvailableReservedSimCardForSaas',
			    /**
			     * selectUser.html
			     */
			    createUser:'/HubCrmServlet?servicecode=createUserForSaaS',
			    /**
			     * finishTask.html
			     */
			    queryTasksByObjectId:'/HubCrmServlet?servicecode=queryTasksByObjectId',
				finishUserTask:'/HubCrmServlet?servicecode=finishUserTask',
				getSimDeviceConfiguration:'/HubCrmServlet?servicecode=getSimDeviceConfiguration',
				autoAssignICCID:'/HubCrmServlet?servicecode=autoAssignICCID',
				autoAssignBarcode:'/HubCrmServlet?servicecode=autoAssignBarcode',
				manualAssignICCIDOrIMEI:'/HubCrmServlet?servicecode=manualAssignICCIDOrIMEI',
				cleanIdenData:'/HubCrmServlet?servicecode=cleanIdenData',
				/**
				 * address.html
				 */
				queryFixedLineAddress : '/HubCrmServlet?servicecode=queryFixedLineAddress',
				/**
				 * priceNegotiation.html
				 */
				acquirePriceNegotiationInfo:'/HubCrmServlet?servicecode=acquirePriceNegotiationInfo',
			    calculateCustomizedOfferPriceForPage:'/HubCrmServlet?servicecode=calculateCustomizedOfferPriceForPage',
			    retrunProductOfferingInstOrder:'/HubCrmServlet?servicecode=retrunProductOfferingInstOrder',
				/**
				 * uploadFilesTest.html
				 */
				queryUploadItem : '/HubCrmServlet?servicecode=queryUploadItemAction',
				/**
				 * QuerySvgImg.html
				 */
				queryWorkflowSvg:'/HubCrmServlet?servicecode=queryWorkflowSvg',
				acquireCustomerOrderItemForSaas:'/HubCrmServlet?servicecode=acquireCustomerOrderItemForSaas',

				queryWorkflowSvg:'/HubCrmServlet?servicecode=queryWorkflowSvg',
				/**
				 * addressCollinear.html
				 */
				qryOngoingProduct:'/HubCrmServlet?servicecode=qryOngoingProduct',
				qryRelaProduct:'/HubCrmServlet?servicecode=qryRelaProduct',
				queryPayMethodsByChannelForSaas:'/HubCrmServlet?servicecode=queryPayMethodsByChannelForSaas',
					
				/**
				 * appointTime.html
				 */
			    getEffectiveMethodByBIISPCode:'/HubCrmServlet?servicecode=getEffectiveMethodByBIISPCode',
			    calculateAccountNextBillDate:'/HubCrmServlet?servicecode=calculateAccountNextBillDate',
			    getNoPenaltyDate:'/HubCrmServlet?servicecode=getNoPenaltyDate',
			    printBILog:'/HubCrmServlet?servicecode=printBILog',
			    //根据渠道和订单类型查询寄送方式
			    queryDeliveryTypesAction:'/HubCrmServlet?servicecode=queryDeliveryTypesForSass',
                //预占号
			    reserveResource:'/HubCrmServlet?servicecode=reserveResourceForSaas',
			    //CampaignInfo.html
				getProductOfferingForEShop: '/HubCrmServlet?servicecode=getProductOfferingForEShop',
				recordMarketingTaskResultForEShop: '/HubCrmServlet?servicecode=recordMarketingTaskResultForEShop',
				/**
				 * address.html
				 */
				deleteAddressSingle : '/HubCrmServlet?servicecode=deleteAddressSingle'
			}
		}
	});
	
//})(jQuery);
});