#language: en
@SPRING
Feature: P2P Enroll Catchup Scenarios


Scenario: Perform P2P enrollment Catchup with excluded items
	Given I Enroll Customer Prior to P2P enrollment
		|requestMethod	|requestFile			   	|
		|POST			|Request_IRNCusenroll.xml	|
		
	Then I LookUp Customer by Account Number
		|requestMethod	|requestFile			   				|responseFile|
		|POST			|Request_cusLookupByAccountNumber.xml	|Response_cusLookupByAccountNumber.xml|
		
	Then I wait for 4000 millis
	
	And I Perform IRN Transaction for only with one non excluded line item without P2P Enrollment
	    |DynamicClass	|requestMethod	|requestFile			   							|responseFile|
	 	|23				|POST			|Request_LTYTransaction_WithNonexcludedDept.xml	    |Response_LTYTransaction_WithNonexcludedDept.xml|
	 	
	And I Perform IRN Transaction for P2P enrollment
	    |DynamicClass	|requestMethod	|requestFile			   							|responseFile|
	 	|23				|POST			|Request_LTYTransaction_EnrollTFS_nonExcludedDept.xml	|Response_LTYTransaction_WithNonexcludedDept_P2PEnroll.xml|
   
    And I Perform IRN Transaction for one non excluded line item
	    |DynamicClass	|requestMethod	|requestFile			   							|responseFile|
	 	|23				|POST			|Request_LTYTransaction_WithNonexcludedDept.xml	    |Response_LTYTransaction_WithNonexcludedDept_Catchup.xml|	
	
	 	
	Then I Validate P2P enrollment in transaction response
	
Scenario: Perform P2P enrollment Catchup with non excluded and excluded items
	Given I Enroll Customer Prior to P2P enrollment
		|requestMethod	|requestFile			   	|
		|POST			|Request_IRNCusenroll.xml	|
		
	Then I LookUp Customer by Account Number
		|requestMethod	|requestFile			   				|responseFile|
		|POST			|Request_cusLookupByAccountNumber.xml	|Response_cusLookupByAccountNumber.xml|
		
	Then I wait for 4000 millis
	
	And I Perform IRN Transaction for only with one excluded line item without P2P Enrollment
	    |DynamicClass	|requestMethod	|requestFile			   							|responseFile|
	 	|23				|POST			|Request_LTYTransaction_WithNonexcludedDept.xml	    |Response_LTYTransaction_WithNonexcludedDept.xml|
	 	
	And I Perform IRN Transaction for P2P enrollment
	    |DynamicClass	|requestMethod	|requestFile			   							|responseFile|
	 	|23				|POST			|Request_LTYTransaction_EnrollTFS_nonExcludedDept.xml	|Response_LTYTransaction_WithNonexcludedDept_P2PEnroll.xml|
	 	
	And I Perform IRN Transaction for one excluded line item
	    |DynamicClass	|requestMethod	|requestFile			   							 |responseFile|
	 	|23				|POST			|Request_LTYTransaction_withexcludedDept_catchup.xml|Response_LTYTransaction_EnrollTFS_withexcludedDept_catchup.xml|
	 	
	Then I Validate P2P enrollment in transaction response		
	
	
	
	#void scenario
Scenario: Perform P2P enrollment Catchup with non excluded and excluded items
	Given I Enroll Customer Prior to P2P enrollment
		|requestMethod	|requestFile			   	|
		|POST			|Request_IRNCusenroll.xml	|
		
	Then I LookUp Customer by Account Number
		|requestMethod	|requestFile			   				|responseFile|
		|POST			|Request_cusLookupByAccountNumber.xml	|Response_cusLookupByAccountNumber.xml|
		
	Then I wait for 4000 millis
	
	And I Perform IRN Transaction for only with 5 non excluded line items without P2P Enrollment
	    |DynamicClass	|requestMethod	|requestFile			   							|responseFile|
	 	|23				|POST			|Request_LTYTransaction_5NonExcludedLineItems.xml	    |Response_LTYTransaction_5NonExcludedLineItems.xml|
	 	
	And I Perform IRN Transaction for return
	    |DynamicClass	|requestMethod	|requestFile			   							|responseFile|
	 	|23				|POST			|Request_LTYTransaction_5NonExcludedLineItems_Return.xml	|Response_LTYTransaction_5NonExcludedLineItems_Return.xml|
	 	
	And I Perform IRN Transaction for post_void
	    |DynamicClass	|requestMethod	|requestFile			   							 |responseFile|
	 	|23				|POST			|Request_LTYTransaction_5NonExcludedLineItems_PostVoid.xml|Response_LTYTransaction_5NonExcludedLineItems_PostVoid.xml|
	 	
	 	And I Perform IRN Transaction for only with one non excluded line item without P2P Enrollment
	    |DynamicClass	|requestMethod	|requestFile			   							|responseFile|
	 	|23				|POST			|Request_LTYTransaction_ForP2P.xml	                |Response_LTYTransaction_ForP2P.xml|
	 	
	Then I Validate P2P enrollment in transaction response

	
	
	
