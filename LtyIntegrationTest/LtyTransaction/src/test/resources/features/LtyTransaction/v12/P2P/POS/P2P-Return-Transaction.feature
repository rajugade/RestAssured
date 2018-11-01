#language: en
@SPRING
Feature: P2P Enrollemt Scenarios with PROP Card


Scenario: P2P Rewards DECREMENT for SPOS RETURN TRANSACTION with Prop tender
	Given I Enroll Customer Prior to P2P enrollment
		|requestMethod	|requestFile			   	|
		|POST			|Request_PROPCusenroll.xml	|
		
	Then I LookUp Customer by Account Number
		|requestMethod	|requestFile			   				|responseFile|
		|POST			|Request_cusLookupByAccountNumber.xml	|Response_cusLookup_TFSDisEnrolled.xml|
		
	Then I wait for 4000 millis
		
	Then I Perform PROP Transaction for P2P enrollment
	    |DynamicClass	|requestMethod	|requestFile			   								|responseFile|
	 	|23				|POST			|Request_LTYTransaction_EnrollTFS_nonExcludedDept.xml	|Response_LTYTransaction_EnrollTFSAndP2P_nonExcludedDept.xml|
	 	
	And I Validate P2P enrollment in transaction response
 	
	And I Perform PROP Transaction for Transaction Return
	    |DynamicClass	|requestMethod	|requestFile			   							|responseFile|
	 	|23				|POST			|Request_LTYTransaction_Return_IncludedDept.xml		|Response_LTYTransaction_Return.xml|
	And I Validate P2P return points in transaction response
	
Scenario: P2P Rewards DECREMENT for SPOS PRE SALE and SPOS RETURN TRANSACTION
	Given I Enroll Customer Prior to P2P enrollment
		|requestMethod	|requestFile			   	|
		|POST			|Request_PROPCusenroll.xml	|
		
	Then I LookUp Customer by Account Number
		|requestMethod	|requestFile			   			|responseFile|
		|POST			|Request_cusLookupByAccountNumber.xml|Response_cusLookup_TFSDisEnrolled.xml|
		
	Then I wait for 4000 millis

	Then I Perform PROP Transaction for P2P enrollment
	    |DynamicClass	|requestMethod	|requestFile			   							|responseFile|
	 	|23				|POST			|Request_LTYTransaction_EnrollTFS_excludedDept.xml	| Response_LTYTransaction_EnrollTFS_excludedDept.xml|
	 	
	And I Validate P2P enrollment in transaction response
	
	Then I Perform PROP Transaction for Presale with 3 included line items
	    |requestMethod	|requestFile			   								|responseFile|
	 	|POST			|Request_LTYTransaction_PresaleWith3IncludedLineItems.xml| Response_LTYTransaction_PresaleWith3IncludedLineItems.xml|
	 	
	And I Validate P2P presale pending points in transaction response
	
	And I Perform PresaleIssuance
		|requestMethod	|requestFile			   	|
		|POST			|Request_PreSaleIssuance.xml|
	Then I Perform PROP Transaction for Return Transaction
	    |requestMethod	|requestFile			   								|responseFile|
	 	|POST			|Request_LTYTransaction_Return_PresaleWith3IncludedLineItems.xml| Response_LTYTransaction_Return_PresaleWith3IncludedLineItems.xml|
		
	And I Validate P2P presale pending return points transaction response
	
Scenario: P2P Rewards DECREMENT for ESEND PURCHASE TRANSACTION and SPOS RETURN
	Given I Enroll Customer Prior to P2P enrollment
		|requestMethod	|requestFile			   	|
		|POST			|Request_PROPCusenroll.xml	|
		
	Then I LookUp Customer by Account Number
		|requestMethod	|requestFile			   			|responseFile|
		|POST			|Request_cusLookupByAccountNumber.xml|Response_cusLookup_TFSDisEnrolled.xml|
		
	Then I wait for 4000 millis

	Then I Perform PROP Transaction for P2P enrollment
	    |DynamicClass	|requestMethod	|requestFile			   							|responseFile|
	 	|23				|POST			|Request_LTYTransaction_EnrollTFS_excludedDept.xml	| Response_LTYTransaction_EnrollTFS_excludedDept.xml|
	 	
	And I Validate P2P enrollment in transaction response
	
	Then I Perform PROP Transaction for ESEND with 3 included line items
	    |requestMethod	|requestFile			   								|responseFile|
	 	|POST			|Request_LTYTransaction_ESENDWith3IncludedLineItems.xml| Response_LTYTransaction_PresaleWith3IncludedLineItems.xml|
		
	And I Validate P2P ESEND pending points in transaction response
	
	And I Perform FedFilOrder for SC
		|requestMethod	|requestFile			|
	 	|POST			|Request_FedfilOrder_SC.xml|
	 	
	And I Perform FedFilOrder for RC
		|requestMethod	|requestFile			|
	 	|POST			|Request_FedfilOrder_RC.xml|
	 	
	Then I Perform PROP Transaction for Return Transaction
	    |requestMethod	|requestFile			   								|responseFile|
	 	|POST			|Request_LTYTransaction_Return_ESENDWith3IncludedLineItems.xml| Response_LTYTransaction_Return_PresaleWith3IncludedLineItems.xml|
		
	And I Validate P2P ESEND pending return points in transaction response
