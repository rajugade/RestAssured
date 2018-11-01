#language: en
@SPRING
Feature: Customer Accommodations Scenarios with IRN Card

Scenario: Perform Customer Accommodations verify with IRN card
#CusEnroll
	Given I Enroll Customer Prior to P2P enrollment
		|requestMethod	|requestFile			   	|
		|POST			|Request_IRNCusenroll.xml	|
#LookupByAccountNumber
	Then I LookUp Customer by Account Number
		|requestMethod	|requestFile			   				|responseFile|
		|POST			|Request_cusLookupByAccountNumber.xml	|Response_cusLookup_TFSDisEnrolled.xml|
		
	Then I wait for 4000 millis

#Enroll to P2P exclude dept
	And I Perform IRN Transaction for P2P enrollment
	    |DynamicClass	|requestMethod	|requestFile			   																|responseFile|
	 	  |23				    |POST			      |Request_LTYTransaction_EnrollTFS_excludedDept.xml	|Response_LTYTransaction_EnrollTFS_excludedDept.xml|
	 	
#Verify P2P	
	Then I LookUp Customer by Account Number and Verify P2P Enrollment
		|requestMethod	|requestFile			   				|responseFile|
	 	|POST			|Request_cusLookupByAccountNumber.xml	|Response_cusLookup_TFSEnrolled.xml|
	 	
#Customer Accommodations by LtyCustServiceReward	
	And I Perform LtyCustServiceReward
	    |requestMethod	| requestFile			   				|responseFile|
	 	  |POST						| Request_LtyCustServiceReward.xml|Response_LtyCustServiceReward.xml|
	 	
#LtyLookupLoyaltyDetail
	And I Validate Loyalty Detail
	    |requestMethod	|requestFile			   				|responseFile|
	 	|POST			|Request_LtyLookupLoyaltyDetail.xml|Response_LtyLookupLoyaltyDetail.xml|	 	