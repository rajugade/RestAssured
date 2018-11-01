#language: en
Feature: pickyourday eventtype scenarios 

@scenario1
Scenario: Verify create Offer for eventype 'PICK YOUR DAY' and offertype 'Multiplier for any purchase get Xx points after any purchase'
	Given I Create Offer 
		|requestMethod	|requestFile			   			|responseFile|
		|POST			|Request_CreateOffer_PICKYOURDAY_Multiplierforanypurchase.json	|Response_CreateOffer_PICKYOURDAY_Multiplierforanypurchase.json|
		
	Then I Verify Offer Response
	
	And I Retrieve offer 
		|requestMethod	|pathParameters		|responseFile|
		|GET			|offerCode=offerCode|Response_ViewOffer_PICKYOURDAY_Multiplierforanypurchase.json|
		
	Then I Verify Offer Response
	
	And I update offer status 
		|requestMethod	|offerStatus	|requestFile			   	|
		|PATCH			|APPROVED		|Request_UpdateOffer.json	|
		
	And I update offer status 
		|requestMethod	|offerStatus	|requestFile			   	|
		|PATCH			|CANCELLED		|Request_UpdateOffer.json	|	
		
	And I Delete offer 
		|requestMethod	|pathParameters		|
		|DELETE			|offerCode=offerCode|	
		

@scenario2
Scenario: Verify create Offer for eventype 'PICK YOUR DAY' and offertype 'Multiplier for Product Spend: Get Xx Points $Y product spend'
	Given I Create Offer 
		|requestMethod	|requestFile			   			|responseFile|
		|POST			|Request_CreateOffer_PICKYOURDAY_MultiplierforProductSpend.json	|Response_CreateOffer_PICKYOURDAY_MultiplierforProductSpend.json|
		
	Then I Verify Offer Response
	
	And I Retrieve offer 
		|requestMethod	|pathParameters		|responseFile|
		|GET			|offerCode=offerCode|Response_ViewOffer_PICKYOURDAY_MultiplierforProductSpend.json|
		
	Then I Verify Offer Response
	
	And I update offer status 
		|requestMethod	|offerStatus	|requestFile			   	|
		|PATCH			|APPROVED		|Request_UpdateOffer.json	|
		
	And I update offer status 
		|requestMethod	|offerStatus	|requestFile			   	|
		|PATCH			|CANCELLED		|Request_UpdateOffer.json	|	
		
	And I Delete offer 
		|requestMethod	|pathParameters		|
		|DELETE			|offerCode=offerCode|			
		

@scenario3
Scenario: Verify create Offer for eventype 'PICK YOUR DAY' and offertype 'Multiplier for Transaction Spend: Get Xx Points after $Y spend'
	Given I Create Offer 
		|requestMethod	|requestFile			   			|responseFile|
		|POST			|Request_CreateOffer_PICKYOURDAY_MultiplierforTransactionSpend.json	|Response_CreateOffer_PICKYOURDAY_MultiplierforTransactionSpend.json|
		
	Then I Verify Offer Response
	
	And I Retrieve offer 
		|requestMethod	|pathParameters		|responseFile|
		|GET			|offerCode=offerCode|Response_ViewOffer_PICKYOURDAY_MultiplierforTransactionSpend.json|
		
	Then I Verify Offer Response
	
	And I update offer status 
		|requestMethod	|offerStatus	|requestFile			   	|
		|PATCH			|APPROVED		|Request_UpdateOffer.json	|
		
	And I update offer status 
		|requestMethod	|offerStatus	|requestFile			   	|
		|PATCH			|CANCELLED		|Request_UpdateOffer.json	|	
		
	And I Delete offer 
		|requestMethod	|pathParameters		|
		|DELETE			|offerCode=offerCode|			
		
		
  

	

