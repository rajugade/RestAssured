#language: en
@FALL
Feature: TFS Enrollemt Negative Scenarios


	
Scenario: Perform TFS enrollment with only excluded dept Items for already existed loyalty account number to enroll tfs again
	Given I Enroll Customer Prior to TFS enrollment
		|requestMethod	|requestFile			   	|
		|POST			|Request_PROPCusenroll.xml	|
		
	Then I LookUp Customer by Account Number
		|requestMethod	|requestFile			   	|responseFile|
		|POST			|Request_cusLookupByAccountNumber.xml	|Response_cusLookup_TFSDisEnrolled.xml|
		
	Then I wait for 4000 millis
		
	And I Perform PROP Transaction for TFS enrollment
	    |requestMethod	|requestFile			   				|responseFile|
	 	|POST			|Request_LTYTransaction_EnrollTFS_excludedDept.xml	|Response_LTYTransaction_EnrollTFS_excludedDept.xml|
	Then I Validate TFS enrollment in transaction response
	
  	And I Perform PROP Transaction for TFS enrollment
	    |requestMethod	|requestFile			   				|responseFile|
	 	|POST			|Request_LTYTransaction_EnrollTFS_excludedDept.xml	|Response_LTYTransaction_TfsScenario_excludedDept_Existed_LtyAccNo.xml|
	Then I Validate TFS enrollment in transaction response

Scenario: Perform TFS enrollment with only excluded dept Items with invalid loyalty account number
    	Given I Enroll Customer Prior to TFS enrollment
		|requestMethod	|requestFile			   	|
		|POST			|Request_PROPCusenroll.xml	|
		
	Then I LookUp Customer by Account Number
		|requestMethod	|requestFile			   	|responseFile|
		|POST			|Request_cusLookupByAccountNumber.xml	|Response_cusLookup_TFSDisEnrolled.xml|
		
	Then I wait for 4000 millis
		
	And I Perform PROP Transaction for TFS enrollment
	    |requestMethod	|requestFile			   				|
	 	|POST			|Request_LTYTransaction_TfsScenario_excludedDept_invalidLytAccNo.xml	|
	 	
	Then I Verify TFS enrollment for negative scenarios
	
	
Scenario: Perform TFS enrollment with only excluded dept Items with invalid tender type
     	Given I Enroll Customer Prior to TFS enrollment
		|requestMethod	|requestFile			   	|
		|POST			|Request_PROPCusenroll.xml	|
		
	Then I LookUp Customer by Account Number
		|requestMethod	|requestFile			   	|responseFile|
		|POST			|Request_cusLookupByAccountNumber.xml	|Response_cusLookup_TFSDisEnrolled.xml|
		
	Then I wait for 4000 millis
		
	And I Perform PROP Transaction for TFS enrollment
	    |requestMethod	|requestFile			   							|
	 	|POST			|Request_LTYTransaction_TfsScenario_excludedDept_InvalidTender.xml	|
	 	
	Then I Verify TFS enrollment for negative scenarios	
	
	
Scenario: Perform TFS enrollment with only excluded dept Items with invalid Account number
     	Given I Enroll Customer Prior to TFS enrollment
		|requestMethod	|requestFile			   	|
		|POST			|Request_PROPCusenroll.xml	|
		
	Then I LookUp Customer by Account Number
		|requestMethod	|requestFile			   	|responseFile|
		|POST			|Request_cusLookupByAccountNumber.xml	|Response_cusLookup_TFSDisEnrolled.xml|
		
	Then I wait for 4000 millis
		
	And I Perform PROP Transaction for TFS enrollment
	    |requestMethod	|requestFile			   							|
	 	|POST			|Request_LTYTransaction_TfsScenario_excludedDept_invalidAccNo.xml	|
	 	
	Then I Verify TFS enrollment for negative scenarios		
	
