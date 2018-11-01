#language: en
@SPRING 
Feature: P2P Enrollemt by checking the Topic with the concerned message 

Scenario: Customer enroll message check in tibco topic 
	Given I Enroll Customer with Non Macys card for Star Reward program for POS 
		| requestMethod |AddedByApp | requestFile              |
		| POST          |SPOS       | Request_NonMacysCusenrollOnline.xml |
		
	Then Tibco connection check Tests