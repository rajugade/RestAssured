#language: en
@SPRING
Feature: Verify TFS_EVENT_NAME in Customer lookup


Scenario: Perform P2P enrollment Catchup
	Given I Enroll Customer Prior to P2P enrollment
		|requestMethod	|requestFile			   	|
		|POST			|Request_IRNCusenroll.xml	|
		
	Then I LookUp Customer by Account Number
		|requestMethod	|requestFile			   				|responseFile|
		|POST			|Request_cusLookupByAccountNumber.xml	|Response_cusLookup_TFSDisEnrolled.xml|
		
	And I LookUp Customer by ZipCode
		|requestMethod	|requestFile			   				|responseFile|
		|POST			|Request_cusLookupByZipCode.xml	        |Response_cusLookupByZipCode.xml|		
		
    And I LookUp Customer by Name
		|requestMethod	|requestFile			   				|responseFile|
		|POST			|Request_cusLookupByName.xml        	|Response_cusLookupByName.xml|	
		
	And I LookUp Customer by Phone
		|requestMethod	|requestFile			   				|responseFile|
		|POST			|Request_cusLookupByPhone.xml        	|Response_cusLookupByPhone.xml|				
		
	
	
	
	
	

