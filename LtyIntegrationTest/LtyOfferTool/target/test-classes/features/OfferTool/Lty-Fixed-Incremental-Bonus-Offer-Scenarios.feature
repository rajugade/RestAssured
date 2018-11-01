#language: en
Feature: fixed incremental offer scenarios 

@scenario1
Scenario: Verify create Offer for fixed incremental points for every purchase of $XX(no products) with isincremental true and incremental amount
	Given I Create Offer 
		|requestMethod	|requestFile			   			|responseFile|
		|POST			|Request_CreateOffer_Noproducts_isinctrueandwithincamount.json	|Response_CreateOffer_Noproducts_isinctrueandwithincamount.json|
		
	Then I Verify Offer Response
	
	And I Retrieve offer 
		|requestMethod	|pathParameters		|responseFile|
		|GET			|offerCode=offerCode|Response_ViewOffer_Noproducts_isinctrueandwithincamount.json|
		
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
Scenario: Verify create Offer for fixed incremental points for every purchase of $XX product spend with isincremental true and incremental amount
	Given I Create Offer 
		|requestMethod	|requestFile			   			|responseFile|
		|POST			|Request_CreateOffer_productspend_isinctrueandwithincamount.json	|Response_CreateOffer_productspend_isinctrueandwithincamount.json|
		
	Then I Verify Offer Response
	
	And I Retrieve offer 
		|requestMethod	|pathParameters		|responseFile|
		|GET			|offerCode=offerCode|Response_ViewOffer_productspend_isinctrueandwithincamount.json|
		
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
Scenario: Verify create Offer for fixed incremental points for every purchase of $XX(no products) with isincremental false
	Given I Create Offer 
		|requestMethod	|requestFile			   			|responseFile|
		|POST			|Request_CreateOffer_Noproducts_isincrementalfalse.json	|Response_CreateOffer_Noproducts_isincrementalfalse.json|
		
	Then I Verify Offer Response
	
	And I Retrieve offer 
		|requestMethod	|pathParameters		|responseFile|
		|GET			|offerCode=offerCode|Response_ViewOffer_Noproducts_isincrementalfalse.json|
		
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

@scenario4
Scenario: Verify create Offer for fixed incremental points for every purchase of $XX product spend with isincremental false
	Given I Create Offer 
		|requestMethod	|requestFile			   			|responseFile|
		|POST			|Request_CreateOffer_productspend_isincrementalfalse.json	|Response_CreateOffer_productspend_isincrementalfalse.json|
		
	Then I Verify Offer Response
	
	And I Retrieve offer 
		|requestMethod	|pathParameters		|responseFile|
		|GET			|offerCode=offerCode|Response_ViewOffer_productspend_isincrementalfalse.json|
		
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
	

