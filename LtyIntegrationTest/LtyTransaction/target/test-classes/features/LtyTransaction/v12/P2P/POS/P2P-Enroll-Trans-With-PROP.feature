#language: en
@SPRING
Feature: P2P Enrollemt Scenarios with PROP Card


Scenario: Perform P2P enrollment with only excluded dept Items
	Given I Enroll Customer Prior to P2P enrollment
		|requestMethod	|requestFile			   	|
		|POST			|Request_PROPCusenroll.xml	|
		
	Then I LookUp Customer by Account Number
		|requestMethod	|requestFile			   				|responseFile|
		|POST			|Request_cusLookupByAccountNumber.xml	|Response_cusLookup_TFSDisEnrolled.xml|
		
	Then I wait for 4000 millis
		
	And I Perform PROP Transaction for P2P enrollment
	    |DynamicClass	|requestMethod	|requestFile			   							|responseFile|
	 	|23				|POST			|Request_LTYTransaction_EnrollTFS_excludedDept.xml	|Response_LTYTransaction_EnrollTFS_excludedDept.xml|
	 	
	Then I Validate P2P enrollment in transaction response
	
	Then I LookUp Customer by Account Number and Verify P2P Enrollment
		|requestMethod	|requestFile			   				|responseFile|
	 	|POST			|Request_cusLookupByAccountNumber.xml	|Response_cusLookup_TFSEnrolled.xml|
	
	And I Perform PROP Transaction for P2P DisEnrollment
	    |DynamicClass	|requestMethod	|requestFile			   				|responseFile|
	 	|23				|POST			|Request_LTYTransaction_DisEnrollTFS.xml|Response_LTYTransaction_DisEnrollTFS.xml|
	 	
	Then I Validate P2P enrollment in transaction response
	
	Then I LookUp Customer by Account Number and Verify P2P DisEnrollment
		|requestMethod	|requestFile			   				|responseFile|
	 	|POST			|Request_cusLookupByAccountNumber.xml	|Response_cusLookup_TFSDisEnrolled.xml|

Scenario: Perform P2P enrollment with only non excluded dept Items
	Given I Enroll Customer Prior to P2P enrollment
		|requestMethod	|requestFile			   	|
		|POST			|Request_PROPCusenroll.xml	|
		
	Then I LookUp Customer by Account Number
		|requestMethod	|requestFile			   	|responseFile|
		|POST			|Request_cusLookupByAccountNumber.xml	|Response_cusLookup_TFSDisEnrolled.xml|
		
	Then I wait for 4000 millis

	Then I Perform PROP Transaction for P2P enrollment
	    |DynamicClass	|requestMethod	|requestFile			   				|responseFile|
	 	|23				|POST			|Request_LTYTransaction_EnrollTFS_nonExcludedDept.xml	| Response_LTYTransaction_EnrollTFSAndP2P_nonExcludedDept.xml|
	 	
	And I Validate P2P enrollment in transaction response
		
	Then I LookUp Customer by Account Number and Verify P2P Enrollment
		|requestMethod	|requestFile			   				|responseFile|
	 	|POST			|Request_cusLookupByAccountNumber.xml	|Response_cusLookup_TFSEnrolled.xml|
	
	And I Perform PROP Transaction for P2P DisEnrollment
	    |DynamicClass	|requestMethod	|requestFile			   								|responseFile|
	 	|23				|POST			|Request_LTYTransaction_DisEnrollTFS_nonExcludedDept.xml|Response_LTYTransaction_DisEnrollTFS.xml|
	 	
	Then I Validate P2P enrollment in transaction response
	
	Then I LookUp Customer by Account Number and Verify P2P DisEnrollment
		|requestMethod	|requestFile			   				|responseFile|
	 	|POST			|Request_cusLookupByAccountNumber.xml	|Response_cusLookup_TFSDisEnrolled.xml|

   
 
   
   