#language: en
Feature:Points per Dollar scenarios

Scenario: Verify offer type and event type in offer request and response for event type 'Generic' and offer type 'get x points per $ after any purchase'
   Given I Create Offer
    | requestMethod | eventType | requestFile                           | responseFile                                                                   | offerType | multiplier|
    | POST          | GENERIC | Request_CreateOffer_DiffEvents_FixedNonTransNoProduct.json | Response_CreateOffer_DiffEvents_FixedNonTransNoProduct.json | 12        | 20        |
  Then I Verify Offer Response
   And I Retrieve offer
    | requestMethod | pathParameters      | responseFile                                               | offerType | multiplier|
    | GET           | offerCode=offerCode | Response_ViewOffer_DiffEvents_FixedNonTransNoProduct.json  | 12        | 20        |
   Then I Verify Offer Response
   And I update offer status
    | requestMethod | offerStatus | requestFile              |
    | PATCH         | APPROVED    | Request_UpdateOffer.json |
   And I update offer status
   | requestMethod | offerStatus | requestFile              |
    | PATCH         | CANCELLED   | Request_UpdateOffer.json |
   And I Delete offer
    | requestMethod | pathParameters      |
   | DELETE        | offerCode=offerCode |

Scenario: Verify offer type and event type in offer request and response for event type 'Generic' and offer type 'get x points per $ after $Y spend'
    Given I Create Offer
    | requestMethod | eventType | requestFile                           | responseFile                            | offerType | multiplier | txnSpendMin | validInDays | triggerOfferEventPeriod |
    | POST          | GENERIC | Request_CreateOffer_DiffEvents_MultiplierNonTransForProduct.json | Response_CreateOffer_DiffEvents_MultiplierNonTransForProduct.json | 13 | 20 | 20 | 0 | 0 |
    Then I Verify Offer Response
   And I Retrieve offer
    | requestMethod | pathParameters      | responseFile                           | offerType | multiplier| txnSpendMin | validInDays | triggerOfferEventPeriod |
    | GET           | offerCode=offerCode | Response_CreateOffer_DiffEvents_MultiplierNonTransForProduct.json | 13 | 20 | 20 | 0 | 0|
   Then I Verify Offer Response
   And I update offer status
   | requestMethod | offerStatus | requestFile              |
    | PATCH         | APPROVED    | Request_UpdateOffer.json |
   And I update offer status
    | requestMethod | offerStatus | requestFile              |
    | PATCH         | CANCELLED   | Request_UpdateOffer.json |
   And I Delete offer
    | requestMethod | pathParameters      |
    | DELETE        | offerCode=offerCode |
    
Scenario: Verify offer type and event type in offer request and response for event type 'Generic' and offer type 'get x points per $ after $Y product spend'
  Given I Create Offer
    | requestMethod | eventType | requestFile                           | responseFile                             | offerType | multiplier |deptSpendMin | validInDays | triggerOfferEventPeriod|
    | POST          | GENERIC | Request_CreateOffer_DiffEvents_MultiplierNonTransForProduct.json | Response_CreateOffer_DiffEvents_MultiplierNonTransForProduct.json | 14 | 20 | 20 | 0 | 0|
   Then I Verify Offer Response
   And I Retrieve offer
    | requestMethod | pathParameters      | responseFile                             | offerType | multiplier| deptSpendMin | validInDays | triggerOfferEventPeriod|
    | GET           | offerCode=offerCode | Response_CreateOffer_DiffEvents_MultiplierNonTransForProduct.json | 14 | 20 | 20 | 0 | 0 |
   Then I Verify Offer Response
   And I update offer status
   | requestMethod | offerStatus | requestFile              |
    | PATCH         | APPROVED    | Request_UpdateOffer.json |
   And I update offer status
    | requestMethod | offerStatus | requestFile              |
    | PATCH         | CANCELLED   | Request_UpdateOffer.json |
   And I Delete offer
    | requestMethod | pathParameters      |
    | DELETE        | offerCode=offerCode |