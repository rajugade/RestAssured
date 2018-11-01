#language: en
Feature: control elements feature


@scenario1
Scenario: Verify control elements when brand=MACYS,division=71,controlGroup=EVENTTYPE selected
	Given I invoke getcontrolelements api 
		|requestMethod	|queryParameters			   			       |responseFile|
		|GET			|brand=MACYS;division=71;controlGroup=EVENTTYPE|Response_ControlElements_ControlGroup_EVENTTYPE.json|
	
	Then I Verify Control Elements API Response
	
@scenario2
Scenario: Verify control elements when brand=MACYS,division=71,controlGroup=OFFERTYPE selected
	Given I invoke getcontrolelements api 
		|requestMethod	|queryParameters			   			       |responseFile|
		|GET			|brand=MACYS;division=71;controlGroup=OFFERTYPE|Response_ControlElements_ControlGroup_OFFERTYPE.json|
		
	Then I Verify Control Elements API Response
	
@scenario3
Scenario: Verify control elements when brand=MACYS,division=71,controlGroup=PRICESTATUS selected
	Given I invoke getcontrolelements api 
		|requestMethod	|queryParameters			   			       |responseFile|
		|GET			|brand=MACYS;division=71;controlGroup=PRICESTATUS|Response_ControlElements_ControlGroup_PRICESTATUS.json|
	
	Then I Verify Control Elements API Response
				
@scenario4
Scenario: Verify control elements when brand=MACYS,division=71,controlGroup=PRESENTMENT selected
	Given I invoke getcontrolelements api 
		|requestMethod	|queryParameters			   			       |responseFile|
		|GET			|brand=MACYS;division=71;controlGroup=PRESENTMENT|Response_ControlElements_ControlGroup_PRESENTMENT.json|
		
	Then I Verify Control Elements API Response
				
@scenario5
Scenario: Verify control elements when brand=MACYS,division=71,controlGroup=TIERLEVEL selected
	Given I invoke getcontrolelements api 
		|requestMethod	|queryParameters			   			       |responseFile|
		|GET			|brand=MACYS;division=71;controlGroup=TIERLEVEL|Response_ControlElements_ControlGroup_TIERLEVEL.json|
		
	Then I Verify Control Elements API Response	

@scenario6
Scenario: Verify control elements when brand=MACYS,division=71,controlGroup=CHANNELELIGIBLE selected
  Given I invoke getcontrolelements api 
		|requestMethod	|queryParameters			   			       |responseFile|
		|GET			|brand=MACYS;division=71;controlGroup=CHANNELELIGIBLE|Response_ControlElements_ControlGroup_CHANNELELIGIBLE.json|
	
	Then I Verify Control Elements API Response				

@scenario7
Scenario: Verify control elements when brand=MACYS,division=71,controlKey=2 and controlGroup=OFFERTYPE selected
	Given I invoke getcontrolelements api 
  	|requestMethod	|queryParameters			   			       |responseFile|
		|GET			|brand=MACYS;division=71;controlKey=2;controlGroup=OFFERTYPE|Response_ControlElements_ControlKey.json|
		
	Then I Verify Control Elements API Response		
	
@scenario8
Scenario: Verify control elements with no query parameters
	Given I invoke getcontrolelements api 
		|requestMethod	|responseFile                                              |
		|GET			|Response_ControlElements.json|
		
	Then I Verify Control Elements API Response