#language: en
Feature: View offer scenarios 

@scenario1
Scenario: Verify sorting of GMM's in viewoffer response when all products are selected
	Given I Create Offer 
		|requestMethod	|requestFile			   			|responseFile|
		|POST			|Request_CreateOffer_AllProductsSelected.json	|Response_CreateOffer_AllProductsSelected.json|
		
	Then I Verify Offer Response
	
	And I Retrieve offer 
		|requestMethod	|pathParameters		|responseFile|
		|GET			|offerCode=offerCode|Response_ViewOffer_AllProductsSelected.json|
		
	Then I Verify Offer Response
	
	And I update offer status 
		|requestMethod	|offerStatus	|requestFile			   	|
		|PATCH			|CANCELLED		|Request_UpdateOffer.json	|	
		
	And I Delete offer 
		|requestMethod	|pathParameters		|
		|DELETE			|offerCode=offerCode|		

@scenario2
Scenario: Verify sorting of GMM's in viewoffer response when few products are selected	
    Given I Create Offer 
		|requestMethod	|requestFile			   			|responseFile|
		|POST			|Request_CreateOffer_FewProductsSelected.json	|Response_CreateOffer_FewProductsSelected.json|
		
	Then I Verify Offer Response
	
	And I Retrieve offer 
		|requestMethod	|pathParameters		|responseFile|
		|GET			|offerCode=offerCode|Response_ViewOffer_FewProductsSelected.json|
		
	And I update offer status 
		|requestMethod	|offerStatus	|requestFile			   	|
		|PATCH			|CANCELLED		|Request_UpdateOffer.json	|	
		
	And I Delete offer 
		|requestMethod	|pathParameters		|
		|DELETE			|offerCode=offerCode|			

@scenario3
Scenario: Verify sorting of GMM's in viewoffer response when GMMs,Divisions and Dept class are selected
    Given I Create Offer 
		|requestMethod	|requestFile			   			|responseFile|
		|POST			|Request_CreateOffer_GMMSDIVDeptClassSelected.json	|Response_CreateOffer_GMMSDIVDeptClassSelected.json|
		
	Then I Verify Offer Response
	
	And I Retrieve offer 
		|requestMethod	|pathParameters		|responseFile|
		|GET			|offerCode=offerCode|Response_ViewOffer_GMMSDIVDeptClassSelected.json|	
		
	And I update offer status 
		|requestMethod	|offerStatus	|requestFile			   	|
		|PATCH			|CANCELLED		|Request_UpdateOffer.json	|	
		
	And I Delete offer 
		|requestMethod	|pathParameters		|
		|DELETE			|offerCode=offerCode|				
		
@scenario4			
Scenario: Verify sorting of GMM's in viewoffer response when GMMs,Divisions and Dept VendorMarkStyle are selected
    Given I Create Offer 
		|requestMethod	|requestFile			   			|responseFile|
		|POST			|Request_CreateOffer_GMMSDIVDeptVendorMarkStyleSelected.json	|Response_CreateOffer_GMMSDIVDeptVendorMarkStyleSelected.json|
		
	Then I Verify Offer Response
	
	And I Retrieve offer 
		|requestMethod	|pathParameters		|responseFile|
		|GET			|offerCode=offerCode|Response_ViewOffer_GMMSDIVDeptVendorMarkStyleSelected.json|
		
	And I update offer status 
		|requestMethod	|offerStatus	|requestFile			   	|
		|PATCH			|CANCELLED		|Request_UpdateOffer.json	|	
		
	And I Delete offer 
		|requestMethod	|pathParameters		|
		|DELETE			|offerCode=offerCode|			
		
@scenario5			
Scenario: Verify View offer response when no GMMs are selected
    Given I Create Offer 
		|requestMethod	|requestFile			   			|responseFile|
		|POST			|Request_CreateOffer_NoGMMsSelected.json	|Response_CreateOffer_NoGMMsSelected.json|
		
	Then I Verify Offer Response
	
	And I Retrieve offer 
		|requestMethod	|pathParameters		|responseFile|
		|GET			|offerCode=offerCode|Response_ViewOffer_NoGMMsStyleSelected.json|
		
	And I update offer status 
		|requestMethod	|offerStatus	|requestFile			   	|
		|PATCH			|CANCELLED		|Request_UpdateOffer.json	|	
		
	And I Delete offer 
		|requestMethod	|pathParameters		|
		|DELETE			|offerCode=offerCode|	


@scenario6		
Scenario: Verify View offer response when tier selected Gold,Platinum and Silver
    Given I Create Offer 
		|requestMethod	|requestFile			   			|responseFile|
		|POST			|Request_CreateOfferWithTiers_GoldPlatinumSilver_MCOM.json	|Response_CreateOfferWithTier_GoldPlatinumSilver_MCOM.json|
		
	Then I Verify Offer Response
	
	And I Retrieve offer 
		|requestMethod	|pathParameters		|responseFile|
		|GET			|offerCode=offerCode|Response_ViewOfferWithTier_GoldPlatinumSilver_MCOM.json|
		
    And I update offer status 
		|requestMethod	|offerStatus	|requestFile			   	|
		|PATCH			|APPROVED		|Request_UpdateOffer.json	|		
		
	And I update offer status 
		|requestMethod	|offerStatus	|requestFile			   	|
		|PATCH			|CANCELLED		|Request_UpdateOffer.json	|	
		
	And I Delete offer 
		|requestMethod	|pathParameters		|
		|DELETE			|offerCode=offerCode|	
		
@scenario7		
Scenario: Verify View offer response when tier selected Gold and Silver
    Given I Create Offer 
		|requestMethod	|requestFile			   			|responseFile|
		|POST			|Request_CreateOfferWithTiers_GoldSilver_MCOM.json	|Response_CreateOfferWithTier_GoldSilver_MCOM.json|
		
	Then I Verify Offer Response
	
	And I Retrieve offer 
		|requestMethod	|pathParameters		|responseFile|
		|GET			|offerCode=offerCode|Response_ViewOfferWithTier_GoldSilver_MCOM.json|
		
    And I update offer status 
		|requestMethod	|offerStatus	|requestFile			   	|
		|PATCH			|APPROVED		|Request_UpdateOffer.json	|		
		
	And I update offer status 
		|requestMethod	|offerStatus	|requestFile			   	|
		|PATCH			|CANCELLED		|Request_UpdateOffer.json	|	
		
	And I Delete offer 
		|requestMethod	|pathParameters		|
		|DELETE			|offerCode=offerCode|			
		
		
@scenario8	
Scenario: Verify View offer response when tier selected TopOfTheList
    Given I Create Offer 
		|requestMethod	|requestFile			   			|responseFile|
		|POST			|Request_CreateOfferWithTier_TopOfTheList_BCOM.json	|Response_CreateOfferWithTier_TopOfTheList_BCOM.json|
		
	Then I Verify Offer Response
	
	And I Retrieve offer 
		|requestMethod	|pathParameters		|responseFile|
		|GET			|offerCode=offerCode|Response_ViewOfferWithTier_TopOfTheList_BCOM.json|
		
    And I update offer status 
		|requestMethod	|offerStatus	|requestFile			   	|
		|PATCH			|APPROVED		|Request_UpdateOffer.json	|		
		
	And I update offer status 
		|requestMethod	|offerStatus	|requestFile			   	|
		|PATCH			|CANCELLED		|Request_UpdateOffer.json	|	
		
	And I Delete offer 
		|requestMethod	|pathParameters		|
		|DELETE			|offerCode=offerCode|	
		
				
@scenario9	
Scenario: Verify View offer response when tier selected BCCLoyalist
    Given I Create Offer 
		|requestMethod	|requestFile			   			|responseFile|
		|POST			|Request_CreateOfferWithTier_BCCLoyallist_BCOM.json	|Response_CreateOfferWithTier_BCCLoyallist_BCOM.json|
		
	Then I Verify Offer Response
	
	And I Retrieve offer 
		|requestMethod	|pathParameters		|responseFile|
		|GET			|offerCode=offerCode|Response_ViewOfferWithTier_BCCLoyallist_BCOM.json|
		
    And I update offer status 
		|requestMethod	|offerStatus	|requestFile			   	|
		|PATCH			|APPROVED		|Request_UpdateOffer.json	|		
		
	And I update offer status 
		|requestMethod	|offerStatus	|requestFile			   	|
		|PATCH			|CANCELLED		|Request_UpdateOffer.json	|	
		
	And I Delete offer 
		|requestMethod	|pathParameters		|
		|DELETE			|offerCode=offerCode|	
		
@scenario10	
Scenario: Verify View offer response when tier selected ThirdPartyLoyalist
    Given I Create Offer 
		|requestMethod	|requestFile			   			|responseFile|
		|POST			|Request_CreateOfferWithTier_ThirdPartyLoyalist_BCOM.json	|Response_CreateOfferWithTier_ThirdPartyLoyalist_BCOM.json|
		
	Then I Verify Offer Response
	
	And I Retrieve offer 
		|requestMethod	|pathParameters		|responseFile|
		|GET			|offerCode=offerCode|Response_ViewOfferWithTier_ThirdPartyLoyalist_BCOM.json|
		
    And I update offer status 
		|requestMethod	|offerStatus	|requestFile			   	|
		|PATCH			|APPROVED		|Request_UpdateOffer.json	|		
		
	And I update offer status 
		|requestMethod	|offerStatus	|requestFile			   	|
		|PATCH			|CANCELLED		|Request_UpdateOffer.json	|	
		
	And I Delete offer 
		|requestMethod	|pathParameters		|
		|DELETE			|offerCode=offerCode|							