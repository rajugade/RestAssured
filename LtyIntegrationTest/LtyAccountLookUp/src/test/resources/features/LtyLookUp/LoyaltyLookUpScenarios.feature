#language: en
Feature: loyalty lookup scenarios


Scenario: Verify lookUp Offer 
	Given I Create Offer for LookUp 
#		|requestMethod	|requestFile			   			|responseFile|
#		|POST			|Request_hitService.json	|Request_CreateOffer_Scenario1.json|
				
#	And I update offer status for LookUp
#		|requestMethod	|offerStatus	|requestFile|
#		|PATCH			|APPROVED		|Request_UpdateOffer.json|
#		
# Then I wait for 4000 millis
#
#	Then I LookUp Offer
#		|requestMethod	|requestFile			   			|responseFile|
#		|POST			|Request_LTYLookUP_Scenario1.xml	|Response_LTYLookUP_Scenario1.xml|
#	
#  And I verify LookUp Offer
