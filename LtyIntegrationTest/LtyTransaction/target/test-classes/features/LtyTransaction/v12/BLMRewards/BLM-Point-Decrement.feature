#language: en
@SPRING 
Feature: BLM Program Return scenario

Scenario: 
	Return evaluation scenario where point balance is sufficient to cover the return 
	Given I Enroll Customer Prior to BLM Enrollment 
		| requestMethod | requestFile              |
		| POST          | Request_PROPCusenrollBLM.xml |
	Then I LookUp Customer by Account Number 
		| requestMethod | requestFile                          | responseFile                          |
		| POST          | Request_cusLookupByAccountNumberBLM.xml | Response_cusLookup_BLM.xml |
	Then I wait for 4000 millis 
	Then I Perform PROP Transaction for BLM enrollment 
		| DynamicClass | requestMethod |Division | requestFile                                   | responseFile                                       |
		|           10 | POST          | 72|Request_LTYTransaction_EnrollTFS_nonExcludedDept.xml | Response_LTYTransaction_EnrollBLM.xml |
	Then I Validate P2P enrollment in transaction response 
	
	Then I wait for 4000 millis 
	
	Then I Perform PROP Transaction for Transcation Return 
		|DynamicClass	|requestMethod	|Division|requestFile			   							|responseFile|
		|10				|POST			|72|Request_LTYTransaction_Return_IncludedDept.xml		|Response_LTYTransaction_ReturnBLM.xml|
	And I Validate P2P return points in transaction response 
