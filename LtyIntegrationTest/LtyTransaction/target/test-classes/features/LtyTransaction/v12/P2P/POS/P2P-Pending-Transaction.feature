#language: en
@SPRING 
Feature: Verify P2P pending points to be earned when the transaction is financial for pending transactions 

#Star rewards plus earn for SPOS Pre sale purchase transaction with MCY PREMIER customer  for LTYTFS001 program when the presale  effective date is between the TFS program start and end date using Tender as PROP.
Scenario:
Verify P2P pending points to be earned when the transaction is financial for SPOS PRE SALE 
	Given I Enroll Customer Prior to P2P enrollment 
		|requestMethod |requestFile               |
		|POST          |Request_PROPCusenroll.xml |
		
	Then I LookUp Customer by Account Number 
		|requestMethod |requestFile                          |responseFile                         |
		|POST          |Request_cusLookupByAccountNumber.xml |Response_cusLookup_TFSDisEnrolled.xml|
		  
	Then I wait for 4000 millis 
	
	Then I Perform PROP Transaction for P2P enrollment 
		|DynamicClass	|requestMethod	|requestFile			   							|responseFile                                      |
		|23				|POST			|Request_LTYTransaction_EnrollTFS_excludedDept.xml	|Response_LTYTransaction_EnrollTFS_excludedDept.xml|
		
	Then I Perform PROP Transaction for SPOS Pre Purchase
		|DynamicClass	|requestMethod	|requestFile			   							|responseFile                           |
		|23				|POST			|Request_LTYTransaction_PrePurchase.xml    	        |Response_LTYTransaction_PrePurchase.xml|	
		
	And I Validate P2P enrollment in transaction response 
	
	And I Perform PresaleIssuance 
		|requestMethod |requestFile                                         |
		|POST          |Request_PreSaleIssuance.xml                         |
		
	And I Perform PROP Transaction for SPOS Presale purchase to check pending points to be financialized 
		|DynamicClass  |requestMethod |requestFile                       |responseFile                                     |
		|23    |POST   |Request_LTYTransaction_Return_IncludedDept.xml   |Response_LTYTransaction_VerifyPendingPts_SPOS.xml|
		
	And I Validate P2P enrollment in transaction response
	

#P2P earn  for ESEND purchase transaction with MCY PREMIER customer  for LTYTFS001 program using Tender as PROP	
Scenario: Verify P2P pending transaction points for ESEND PURCHASE TRANSACTION
	Given I Enroll Customer Prior to P2P enrollment
		|requestMethod	|requestFile			   	|
		|POST			|Request_PROPCusenroll.xml	|
		
	Then I LookUp Customer by Account Number
		|requestMethod	|requestFile			   			 |responseFile|
		|POST			|Request_cusLookupByAccountNumber.xml|Response_cusLookup_TFSDisEnrolled.xml|
		
	Then I wait for 4000 millis

	Then I Perform PROP Transaction for P2P enrollment
	    |DynamicClass	|requestMethod	|requestFile			   							|responseFile|
	 	|23				|POST			|Request_LTYTransaction_EnrollTFS_excludedDept.xml	|Response_LTYTransaction_EnrollTFS_excludedDept.xml|
	 	
	And I Validate P2P enrollment in transaction response
	
	Then I Perform PROP Transaction for ESEND with 3 included line items
	    |requestMethod	|requestFile			   								|responseFile|
	 	|POST			|Request_LTYTransaction_ESENDWith3IncludedLineItems.xml |Response_LTYTransaction_PresaleWith3IncludedLineItems.xml|
		
	And I Validate P2P ESEND pending points in transaction response
	
	And I Perform FedFilOrder for SC
		|requestMethod	|requestFile			|
	 	|POST			|Request_FedfilOrder_SC.xml|	
	 	
	And I Perform PROP Transaction for SPOS Presale purchase to check pending points to be financialized 
		|DynamicClass  |requestMethod |requestFile                       |responseFile                                     |
		|23    |POST   |Request_LTYTransaction_Return_IncludedDept.xml   |Response_LTYTransaction_VerifyPendingPts_SPOS.xml|
		
	And I Validate P2P ESEND pending return points in transaction response
	
	
#P2P earn for ICMCS purchase transaction with MCY PREMIER customer  for LTYTFS001 program using tender PROP
Scenario:
Verify P2P pending points to be earned when the transaction is financial for ICMCS purchase
	Given I Enroll Customer Prior to P2P enrollment 
		|requestMethod |requestFile               |
		|POST          |Request_PROPCusenroll.xml |
		
	Then I LookUp Customer by Account Number 
		|requestMethod |requestFile                          |responseFile                         |
		|POST          |Request_cusLookupByAccountNumber.xml |Response_cusLookup_TFSDisEnrolled.xml|
		  
	Then I wait for 4000 millis 
	
	Then I Perform PROP Transaction for P2P enrollment 
		|DynamicClass	|requestMethod	|requestFile			   							|responseFile                                       |
		|23				|POST			|Request_LTYTransaction_EnrollTFS_excludedDept.xml	|Response_LTYTransaction_EnrollTFS_excludedDept.xml|
		
	Then I Perform PROP Transaction for ICMCS Purchase
		|DynamicClass	|requestMethod	|requestFile			   							 |responseFile                                         |
		|23				|POST			|Request_LTYTrans_VerifyPendingPts_ForICMCSSource.xml|Response_LTYTrans_VerifyPendingPts_ForICMCSSource.xml|	
		
	And I Validate P2P enrollment in transaction response 
	
    And I Perform FedFilOrder for SC
		|requestMethod	|requestFile			                  |
	 	|POST			|Request_FedfilOrder_SC_ForICMCSSource.xml|
		
	And I Perform PROP Transaction for ICMCS purchase to check pending points to be financialized 
		|DynamicClass  |requestMethod |requestFile                       |responseFile                                     |
		|23    |POST   |Request_LTYTransaction_Return_IncludedDept.xml   |Response_LTYTransaction_VerifyPendingPts_SPOS.xml|
		
	And I Validate P2P enrollment in transaction response	



##P2P earn  for MSA purchase transaction with MCY PREMIER customer  for LTYTFS001 program using tender as PROP.		
Scenario:
Verify P2P pending points to be earned when the transaction is financial for MSA purchase
	Given I Enroll Customer Prior to P2P enrollment 
		|requestMethod |requestFile               |
		|POST          |Request_PROPCusenroll.xml |
		
	Then I LookUp Customer by Account Number 
		|requestMethod |requestFile                          |responseFile                         |
		|POST          |Request_cusLookupByAccountNumber.xml |Response_cusLookup_TFSDisEnrolled.xml|
		  
	Then I wait for 4000 millis 
	
	Then I Perform PROP Transaction for P2P enrollment 
		|DynamicClass	|requestMethod	|requestFile			   							|responseFile                                       |
		|23				|POST			|Request_LTYTransaction_EnrollTFS_excludedDept.xml	|Response_LTYTransaction_EnrollTFS_excludedDept.xml |
		
	Then I Perform PROP Transaction for MSA Purchase
		|DynamicClass	|requestMethod	|requestFile			   							 |responseFile                                         |
		|23				|POST			|Request_LTYTrans_VerifyPendingPts_ForMSASource.xml  |Response_LTYTrans_VerifyPendingPts_ForMSASource.xml  |	
		
	And I Validate P2P enrollment in transaction response 
	
    And I Perform FedFilOrder for SC
		|requestMethod	|requestFile			                  |
	 	|POST			|Request_FedfilOrder_SC_ForICMCSSource.xml|
		
	And I Perform PROP Transaction for MSA purchase to check pending points to be financialized 
		|DynamicClass  |requestMethod |requestFile                       |responseFile                                     |
		|23    |POST   |Request_LTYTransaction_Return_IncludedDept.xml   |Response_LTYTransaction_VerifyPendingPts_SPOS.xml|
		
	And I Validate P2P enrollment in transaction response	
	
	
		

					