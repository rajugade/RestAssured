#language: en
Feature: fixed offer scenarios 

Scenario: Verify create Offer 
	Given I Create Offer 
		|requestMethod	|requestFile			   			|responseFile|
		|POST			|Request_CreateOffer_Scenario1.json	|Request_CreateOffer_Scenario1.json|
	Then I Verify Offer Response
	And I update offer status 
		|requestMethod	|offerStatus	|requestFile|
		|PATCH			|APPROVED		|Request_UpdateOffer.json|
	And I update offer status 
		|requestMethod	|offerStatus	|requestFile|
		|PATCH			|CANCELLED		|Request_UpdateOffer.json|
	And I Retrieve offer 
		|requestMethod	|pathParameters		|
		|GET			|offerCode=offerCode|
	And I Delete offer 
		|requestMethod	|pathParameters		|
		|DELETE			|offerCode=offerCode|
		
Scenario: CreateFixedOfferForAnyPurchase 
	Given I Create Offer 
		|requestMethod	|requestFile			   			|
		|POST			|Request_CreateFixedOfferForAnyPurchase.json|
	And I update offer status 
		|requestMethod	|offerStatus	|requestFile			 |
		|PATCH			|APPROVED		|Request_UpdateOffer.json|
	And I update offer status 
		|requestMethod	|offerStatus	|requestFile			 |
		|PATCH			|CANCELLED		|Request_UpdateOffer.json|
	And I Delete offer 
		|requestMethod	|pathParameters		|
		|DELETE			|offerCode=offerCode|	
		
Scenario: CreateFixedOfferForProductSpend 
	Given I Create Offer 
		|requestMethod	|requestFile			   			|
		|POST			|Request_CreateFixedOfferForProductSpend.json|
	And I update offer status 
		|requestMethod	|offerStatus	|requestFile			   	|
		|PATCH			|APPROVED		|Request_UpdateOffer.json	|
	And I update offer status 
		|requestMethod	|offerStatus	|requestFile			   	|
		|PATCH			|CANCELLED		|Request_UpdateOffer.json	|
	And I Delete offer 
		|requestMethod	|pathParameters		|
		|DELETE			|offerCode=offerCode|	
		
Scenario: CreateFixedOfferForTransactionSpend 
	Given I Create Offer 
		|requestMethod	|requestFile			   			|
		|POST			|Request_CreateFixedOfferForTransactionSpend.json|
	And I update offer status 
		|requestMethod	|offerStatus	|requestFile			   	|
		|PATCH			|APPROVED		|Request_UpdateOffer.json	|
	And I update offer status 
		|requestMethod	|offerStatus	|requestFile			   	|
		|PATCH			|CANCELLED		|Request_UpdateOffer.json	|
	And I Delete offer 
		|requestMethod	|pathParameters		|
		|DELETE			|offerCode=offerCode|