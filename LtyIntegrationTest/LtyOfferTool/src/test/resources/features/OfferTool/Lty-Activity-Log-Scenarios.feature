#language: en
Feature:Activity Log Scenarios

@scenario1
Scenario: Verify activity log after create Offer and in Draft Status
	Given I Create Offer 
		|requestMethod	|requestFile			   			|responseFile|
		|POST			|Request_CreateOffer_Scenario1.json	|Request_CreateOffer_Scenario1.json|
	Then I Verify Offer Response
	And I retrieve activitylog
			|requestMethod	|pathParameters		| responseFile |
	  	|GET			|offerCode=offerCode|Response_ActivityLog_Scenario_Draft.json|
	Then I Verify Activity Log Response
	And I Delete offer 
		|requestMethod	|pathParameters		|
		|DELETE			|offerCode=offerCode|
		
@scenario2
Scenario: Verify activity log after Create Offer and Update Offer with PENDING status
 Given I Create Offer 
		|requestMethod	|requestFile			   			|responseFile|
		|POST			|Request_CreateOffer_Scenario1.json	|Request_CreateOffer_Scenario1.json|
	Then I Verify Offer Response
	And I retrieve activitylog
			|requestMethod	|pathParameters		| responseFile |
	  	|GET			|offerCode=offerCode|Response_ActivityLog_Scenario_Draft.json|
	Then I Verify Activity Log Response
	And I update offer status 
		|requestMethod	|offerStatus	|requestFile|
		|PATCH			|PENDING		|Request_UpdateOffer.json|
	And I retrieve activitylog
			|requestMethod	|pathParameters		| responseFile |
	  	|GET			|offerCode=offerCode|Response_ActivityLog_Scenario_Draft_Pending.json|
	Then I Verify Activity Log Response	
	And I Delete offer 
		|requestMethod	|pathParameters		|
		|DELETE			|offerCode=offerCode|
	

@scenario3
Scenario: Verify activity log after Create Offer and Update Offer with PENDING and Cancelled Statuses
 Given I Create Offer 
		|requestMethod	|requestFile			   			|responseFile|
		|POST			|Request_CreateOffer_Scenario1.json	|Request_CreateOffer_Scenario1.json|
	Then I Verify Offer Response
	And I retrieve activitylog
			|requestMethod	|pathParameters		| responseFile |
	  	|GET			|offerCode=offerCode|Response_ActivityLog_Scenario_Draft.json|
	Then I Verify Activity Log Response
	And I update offer status 
		|requestMethod	|offerStatus	|requestFile|
		|PATCH			|PENDING		|Request_UpdateOffer.json|
	And I retrieve activitylog
			|requestMethod	|pathParameters		| responseFile |
	  	|GET			|offerCode=offerCode|Response_ActivityLog_Scenario_Draft_Pending.json|
	Then I Verify Activity Log Response	
	And I update offer status 
	  	|requestMethod	|offerStatus	|requestFile|
		  |PATCH			|CANCELLED		|Request_UpdateOffer.json|
	And I retrieve activitylog
			|requestMethod	|pathParameters		| responseFile |
	  	|GET			|offerCode=offerCode|Response_ActivityLog_Scenario_Draft_Pending_Cancelled.json|
	Then I Verify Activity Log Response	
	And I Delete offer 
		|requestMethod	|pathParameters		|
  	|DELETE			|offerCode=offerCode|	
		
@scenario4
Scenario: Verify activity log after Create Offer and Update Offer with PENDING,APPROVED and CANCELLED Statuses
 Given I Create Offer 
		|requestMethod	|requestFile			   			|responseFile|
		|POST			|Request_CreateOffer_Scenario1.json	|Request_CreateOffer_Scenario1.json|
	Then I Verify Offer Response
	And I retrieve activitylog
			|requestMethod	|pathParameters		| responseFile |
	  	|GET			|offerCode=offerCode|Response_ActivityLog_Scenario_Draft.json|
	Then I Verify Activity Log Response
  And I update offer status 
		|requestMethod	|offerStatus	|requestFile|
		|PATCH			|PENDING		|Request_UpdateOffer.json|
	And I retrieve activitylog
			|requestMethod	|pathParameters		| responseFile |
	  	|GET			|offerCode=offerCode|Response_ActivityLog_Scenario_Draft_Pending.json|
	Then I Verify Activity Log Response	
	And I update offer status 
	  	|requestMethod	|offerStatus	|requestFile|
		  |PATCH			|APPROVED		|Request_UpdateOffer.json|
	And I retrieve activitylog
			|requestMethod	|pathParameters		| responseFile |
	  	|GET			|offerCode=offerCode|Response_ActivityLog_Scenario_Draft_Pending_Approved.json|
	Then I Verify Activity Log Response	
	And I update offer status 
	  	|requestMethod	|offerStatus	|requestFile|
		  |PATCH			|CANCELLED		|Request_UpdateOffer.json|
	And I retrieve activitylog
			|requestMethod	|pathParameters		| responseFile |
	  	|GET			|offerCode=offerCode|Response_ActivityLog_Scenario_Draft_Pending_Approved_Cancelled.json|
	Then I Verify Activity Log Response	
	And I Delete offer 
		|requestMethod	|pathParameters		|
		|DELETE			|offerCode=offerCode|		

@scenario5
Scenario: Verify activity log after Create Offer and Update Offer with PENDING status
 Given I Create Offer 
		|requestMethod	|requestFile			   			|responseFile|
		|POST			|Request_CreateOffer_Scenario1.json	|Request_CreateOffer_Scenario1.json|
	Then I Verify Offer Response
	And I retrieve activitylog
			|requestMethod	|pathParameters		| responseFile |
	  	|GET			|offerCode=offerCode|Response_ActivityLog_Scenario_Draft.json|
	Then I Verify Activity Log Response
	And I update offer status 
		|requestMethod	|offerStatus	|requestFile|
		|PATCH			|PENDING		|Request_UpdateOffer.json|
	And I retrieve activitylog
  	|requestMethod	|pathParameters		| responseFile |
  	|GET			|offerCode=offerCode|Response_ActivityLog_Scenario_Draft_Pending.json|
	Then I Verify Activity Log Response	
	And I update offer status 
		|requestMethod	|offerStatus	|requestFile|
		|PUT			|DRAFT		|Request_UpdateOffer_ModifyData.json|
	And I retrieve activitylog
			|requestMethod	|pathParameters		| responseFile |
	  	|GET			|offerCode=offerCode|Response_ActivityLog_Update_Pending.json|
	Then I Verify Activity Log Response	
	And I Delete offer 
		|requestMethod	|pathParameters		|
		|DELETE			|offerCode=offerCode|		

@scenario6
Scenario: Verify activity log after editing the offer in Draft Stage
Given I Create Offer 
		|requestMethod	|requestFile			   			|responseFile|
		|POST			|Request_CreateOffer_Scenario1.json	|Request_CreateOffer_Scenario1.json|
	Then I Verify Offer Response
	And I retrieve activitylog
			|requestMethod	|pathParameters		| responseFile |
	  	|GET			|offerCode=offerCode|Response_ActivityLog_Scenario_Draft.json|
	Then I Verify Activity Log Response
	And I update offer status 
		|requestMethod	|offerStatus	|requestFile|
		|PUT			|DRAFT		|Request_ActivityLog_UpdateOffer.json|
  And I retrieve activitylog
			|requestMethod	|pathParameters		| responseFile |
	  	|GET			|offerCode=offerCode|Response_ActivityLog_Scenario_Draft_Edit.json|
	Then I Verify Activity Log Response
		And I Delete offer 
		|requestMethod	|pathParameters		|
 	  |DELETE			|offerCode=offerCode|	

@scenario7
Scenario: Verify the Activity Log after Rejecting the Offer 
 Given I Create Offer 
		|requestMethod	|requestFile			   			|responseFile|
		|POST			|Request_CreateOffer_Scenario1.json	|Request_CreateOffer_Scenario1.json|
	Then I Verify Offer Response
	And I retrieve activitylog
			|requestMethod	|pathParameters		| responseFile |
	  	|GET			|offerCode=offerCode|Response_ActivityLog_Scenario_Draft.json|
	Then I Verify Activity Log Response
	And I update offer status 
		|requestMethod	|offerStatus	|requestFile|
		|PATCH			|PENDING		|Request_UpdateOffer.json|
	And I retrieve activitylog
			|requestMethod	|pathParameters		| responseFile |
	  	|GET			|offerCode=offerCode|Response_ActivityLog_Scenario_Draft_Pending.json|
	Then I Verify Activity Log Response	
	And I update offer status 
	  	|requestMethod	|offerStatus	|requestFile|
		  |PATCH			|DRAFT		|Request_UpdateOffer_Reject.json|
	And I retrieve activitylog
			|requestMethod	|pathParameters		| responseFile |
	  	|GET			|offerCode=offerCode|Response_ActivityLog_Scenario_Draft_Pending_Reject.json|
  Then I Verify Activity Log Response	
	And I Delete offer 
		|requestMethod	|pathParameters		|
 	  |DELETE			|offerCode=offerCode|	
