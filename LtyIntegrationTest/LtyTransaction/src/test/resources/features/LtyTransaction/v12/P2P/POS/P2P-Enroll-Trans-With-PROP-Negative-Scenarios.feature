#language: en
@SPRING
Feature: P2P Enrollemt Negative Scenarios


	
Scenario: Perform P2P enrollment with only excluded dept Items for already existed loyalty account number to enroll P2P again
	Given I Enroll Customer Prior to P2P enrollment
		|requestMethod	|requestFile			  |
		|POST			|Request_PROPCusenroll.xml|
		
	Then I LookUp Customer by Account Number
		|requestMethod	|requestFile			   				|responseFile|
		|POST			|Request_cusLookupByAccountNumber.xml	|Response_cusLookup_TFSDisEnrolled.xml|
		
	Then I wait for 4000 millis
		
	And I Perform PROP Transaction for P2P enrollment
	    |DynamicClass	|requestMethod	|requestFile			   							|responseFile|
	 	|23				|POST			|Request_LTYTransaction_EnrollTFS_excludedDept.xml	|Response_LTYTransaction_EnrollTFS_excludedDept.xml|
	Then I Validate P2P enrollment in transaction response
	
  	And I Perform PROP Transaction for P2P enrollment
	    |DynamicClass	|requestMethod	|requestFile			   							|responseFile|
	 	|23				|POST			|Request_LTYTransaction_EnrollTFS_excludedDept.xml	|Response_LTYTransaction_TfsScenario_excludedDept_Existed_LtyAccNo.xml|
	Then I Validate P2P enrollment in transaction response

Scenario: Perform P2P enrollment with only excluded dept Items with invalid loyalty account number
    	Given I Enroll Customer Prior to P2P enrollment
		|requestMethod	|requestFile			   	|
		|POST			|Request_PROPCusenroll.xml	|
		
	Then I LookUp Customer by Account Number
		|requestMethod	|requestFile			   	|responseFile|
		|POST			|Request_cusLookupByAccountNumber.xml	|Response_cusLookup_TFSDisEnrolled.xml|
		
	Then I wait for 4000 millis
		
	And I Perform PROP Transaction for P2P enrollment
	    |DynamicClass	|requestMethod	|requestFile			   				|
	 	|23				|POST			|Request_LTYTransaction_TfsScenario_excludedDept_invalidLytAccNo.xml	|
	 	
	Then I Verify P2P enrollment for negative scenarios
	
	
Scenario: Perform P2P enrollment with only excluded dept Items with invalid tender type
     	Given I Enroll Customer Prior to P2P enrollment
		|requestMethod	|requestFile			   	|
		|POST			|Request_PROPCusenroll.xml	|
		
	Then I LookUp Customer by Account Number
		|requestMethod	|requestFile			   				|responseFile|
		|POST			|Request_cusLookupByAccountNumber.xml	|Response_cusLookup_TFSDisEnrolled.xml|
		
	Then I wait for 4000 millis
		
	And I Perform PROP Transaction for P2P enrollment
	    |DynamicClass	|requestMethod	|requestFile			   							|
	 	|23				|POST			|Request_LTYTransaction_TfsScenario_excludedDept_InvalidTender.xml	|
	 	
	Then I Verify P2P enrollment for negative scenarios	
	
	
Scenario: Perform P2P enrollment with only excluded dept Items with invalid Account number
     	Given I Enroll Customer Prior to P2P enrollment
		|requestMethod	|requestFile			   	|
		|POST			|Request_PROPCusenroll.xml	|
		
	Then I LookUp Customer by Account Number
		|requestMethod	|requestFile			   	|responseFile|
		|POST			|Request_cusLookupByAccountNumber.xml	|Response_cusLookup_TFSDisEnrolled.xml|
		
	Then I wait for 4000 millis
		
	And I Perform PROP Transaction for P2P enrollment
	    |DynamicClass	|requestMethod	|requestFile			   							|
	 	|23				|POST			|Request_LTYTransaction_TfsScenario_excludedDept_invalidAccNo.xml	|
	 	
	Then I Verify P2P enrollment for negative scenarios		

	
Scenario: Perform P2P enrollment with expired date
	Given I Enroll Customer Prior to P2P enrollment
		|requestMethod	|requestFile			   	|
		|POST			|Request_IRNCusenroll.xml	|
		
	Then I LookUp Customer by Account Number
		|requestMethod	|requestFile			   				|responseFile|
		|POST			|Request_cusLookupByAccountNumber.xml	|Response_cusLookup_TFSDisEnrolled.xml|
		
	Then I wait for 4000 millis
	
	And I Perform IRN Transaction for only with one non excluded line item without P2P Enrollment
	    |DynamicClass	|requestMethod	|requestFile			   							|responseFile|
	 	|23				|POST			|Request_LTYTransaction_EnrollP2P_Expireddate.xml   |Response_LTYTransaction_EnrollP2P_Expireddate.xml|	
	
