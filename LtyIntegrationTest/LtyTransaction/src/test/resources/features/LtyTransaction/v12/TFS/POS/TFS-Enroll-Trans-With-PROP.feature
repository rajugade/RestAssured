#language: en
@FALL
Feature: TFS Enrollemt Scenarios with PROP Card


Scenario: Perform TFS enrollment with only excluded dept Items
	Given I Enroll Customer Prior to TFS enrollment
		|requestMethod	|requestFile			   	|
		|POST			|Request_PROPCusenroll.xml	|
		
	Then I LookUp Customer by Account Number
		|requestMethod	|requestFile			   				|responseFile|
		|POST			|Request_cusLookupByAccountNumber.xml	|Response_cusLookup_TFSDisEnrolled.xml|
		
	Then I wait for 4000 millis
		
	And I Perform PROP Transaction for TFS enrollment
	    |requestMethod	|requestFile			   							|responseFile|
	 	|POST			|Request_LTYTransaction_EnrollTFS_excludedDept.xml	|Response_LTYTransaction_EnrollTFS_excludedDept.xml|
	 	
	Then I Validate TFS enrollment in transaction response
	
	Then I LookUp Customer by Account Number and Verify TFS Enrollment
		|requestMethod	|requestFile			   				|responseFile|
	 	|POST			|Request_cusLookupByAccountNumber.xml	|Response_cusLookup_TFSEnrolled.xml|
	
	And I Perform PROP Transaction for TFS DisEnrollment
	    |requestMethod	|requestFile			   				|responseFile|
	 	|POST			|Request_LTYTransaction_DisEnrollTFS.xml|Response_LTYTransaction_DisEnrollTFS.xml|
	 	
	Then I Validate TFS enrollment in transaction response
	
	Then I LookUp Customer by Account Number and Verify TFS DisEnrollment
		|requestMethod	|requestFile			   				|responseFile|
	 	|POST			|Request_cusLookupByAccountNumber.xml	|Response_cusLookup_TFSDisEnrolled.xml|

Scenario: Perform TFS enrollment with only non excluded dept Items
	Given I Enroll Customer Prior to TFS enrollment
		|requestMethod	|requestFile			   	|
		|POST			|Request_PROPCusenroll.xml	|
		
	Then I LookUp Customer by Account Number
		|requestMethod	|requestFile			   	|responseFile|
		|POST			|Request_cusLookupByAccountNumber.xml	|Response_cusLookup_TFSDisEnrolled.xml|
		
	Then I wait for 4000 millis

	Then I Perform PROP Transaction for TFS enrollment
	    |requestMethod	|requestFile			   				|responseFile|
	 	|POST			|Request_LTYTransaction_EnrollTFS_nonExcludedDept.xml	| Response_LTYTransaction_EnrollTFSAndP2P_nonExcludedDept.xml|
	 	
	And I Validate TFS enrollment in transaction response
		
	Then I LookUp Customer by Account Number and Verify TFS Enrollment
		|requestMethod	|requestFile			   				|responseFile|
	 	|POST			|Request_cusLookupByAccountNumber.xml	|Response_cusLookup_TFSEnrolled.xml|
	
	And I Perform PROP Transaction for TFS DisEnrollment
	    |requestMethod	|requestFile			   								|responseFile|
	 	|POST			|Request_LTYTransaction_DisEnrollTFS_nonExcludedDept.xml|Response_LTYTransaction_DisEnrollTFS_nonExcludedDept.xml|
	 	
	Then I Validate TFS enrollment in transaction response
	
	Then I LookUp Customer by Account Number and Verify TFS DisEnrollment
		|requestMethod	|requestFile			   				|responseFile|
	 	|POST			|Request_cusLookupByAccountNumber.xml	|Response_cusLookup_TFSDisEnrolled.xml|

   
 
   
   