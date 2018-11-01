#language: en
@FALL
Feature: loyalty transaction scenarios

Scenario: Perform TFS enrollment with only excluded dept Items
	Given I Enroll Customer Prior to TFS enrollment
		|requestMethod	|requestFile			   	|
		|POST			|Request_PROPCusenroll.xml	|
		
	Then I LookUp Customer by Account Number
		|requestMethod	|requestFile			   				|responseFile|
		|POST			|Request_cusLookupByAccountNumber.xml	|Response_cusLookup_TFSDisEnrolled.xml|
		
	
	And I Perform TFS enrollment for Prop with DotCom
	    |requestMethod	|requestFile			   				|responseFile|
	 	|POST			|Request_LTYTransaction_TfsScenario_DotCom.xml	|Response-LTYTransaction_TfsScenario_DotCom.xml|
	
	Then I wait for 4000 millis
	
  Then I LookUp Customer by Account Number and Verify TFS Enrollment
		|requestMethod	|requestFile			   				|responseFile|
	 	|POST			|Request_cusLookupByAccountNumber.xml	|Response_cusLookup_TFSEnrolled.xml|
		
	
	#Then I Verify TFS enrollment with DotCom