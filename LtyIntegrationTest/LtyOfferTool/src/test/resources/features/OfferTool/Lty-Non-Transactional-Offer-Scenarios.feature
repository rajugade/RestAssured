#language: en
Feature: Non Transcational scenarios

  @scenario1
Scenario: Scenario: Verify offer type and event type in offer response for event type 'CC Enroll' and offer type 'Fixed for non-transactional behavior (no purchase required therefore product hierarch selection should be disabled)'
    Given I Create Offer
      | requestMethod | eventType | requestFile                                                     | responseFile                                              | offerType| txnSpendMin| txnSpendMax| points|
      | POST          | CC ENROLL | Request_CreateOffer_DiffEvents_FixedNonTransNoProduct.json | Response_CreateOffer_DiffEvents_FixedNonTransNoProduct.json | 9      | 100        | 1000       | 10    |
    Then I Verify Offer Response
   And I Retrieve offer
      | requestMethod | pathParameters      | responseFile                                              | offerType| txnSpendMin| txnSpendMax| points|
      | GET           | offerCode=offerCode | Response_CreateOffer_DiffEvents_FixedNonTransNoProduct.json | 9      | 100        | 1000       | 10    |
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
      
@scenario2
  Scenario: Verify offer type and event type in offer response for event type 'Loyalty Enroll' and offer type 'Fixed for non-transactional behavior (no purchase required therefore product hierarch selection should be disabled)'
    Given I Create Offer
      | requestMethod | eventType      | requestFile                                                     | responseFile                                              | offerType| txnSpendMin| txnSpendMax| points|
      | POST          | LOYALTY ENROLL | Request_CreateOffer_DiffEvents_FixedNonTransNoProduct.json | Response_CreateOffer_DiffEvents_FixedNonTransNoProduct.json | 9      | 100        | 1000       | 10    |
    Then I Verify Offer Response
    And I Retrieve offer
      | requestMethod | pathParameters      | responseFile                                              | offerType| txnSpendMin| txnSpendMax| points|
      | GET           | offerCode=offerCode | Response_CreateOffer_DiffEvents_FixedNonTransNoProduct.json | 9      | 100        | 1000       | 10    |
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

  @scenario3
  Scenario: Verify offer type and event type in offer response for event type 'Email add' and offer type 'Fixed for non-transactional behavior (no purchase required therefore product hierarch selection should be disabled)'
    Given I Create Offer
      | requestMethod | eventType | requestFile                                                     | responseFile                                              | offerType| txnSpendMin| txnSpendMax| points|
      | POST          | EMAIL ADD | Request_CreateOffer_DiffEvents_FixedNonTransNoProduct.json | Response_CreateOffer_DiffEvents_FixedNonTransNoProduct.json | 9      | 100        | 1000       | 10    |
    Then I Verify Offer Response
    And I Retrieve offer
      | requestMethod | pathParameters      | responseFile                                              | offerType| txnSpendMin| txnSpendMax| points|
      | GET           | offerCode=offerCode | Response_CreateOffer_DiffEvents_FixedNonTransNoProduct.json | 9      | 100        | 1000       | 10    |
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

  @scenario4
  Scenario: Verify offer type and event type in offer response for event type 'Tier upgrade' and offer type 'Fixed for non-transactional behavior (no purchase required therefore product hierarch selection should be disabled)'
    Given I Create Offer
      | requestMethod | eventType    | requestFile                                                     | responseFile                                              | offerType| txnSpendMin| txnSpendMax| points|
      | POST          | TIER UPGRADE | Request_CreateOffer_DiffEvents_FixedNonTransNoProduct.json | Response_CreateOffer_DiffEvents_FixedNonTransNoProduct.json    | 9        | 100        | 1000       | 10    |
    Then I Verify Offer Response
    And I Retrieve offer
      | requestMethod | pathParameters      | responseFile                                              | offerType| txnSpendMin| txnSpendMax| points|
      | GET           | offerCode=offerCode | Response_CreateOffer_DiffEvents_FixedNonTransNoProduct.json | 9      | 100        | 1000       | 10    |
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

  @scenario5
  Scenario: Verify offer type and event type in offer response for event type 'CC Enroll' and offer type 'Fixed for non-transactional behavior (purchase required)'
    Given I Create Offer
      | requestMethod | eventType | requestFile                                                      | responseFile                                               |
      | POST          | CC ENROLL | Request_CreateOffer_DiffEvents_FixedNonTransForProduct.json | Response_CreateOffer_DiffEvents_FixedNonTransForProduct.json |
    Then I Verify Offer Response
    And I Retrieve offer
      | requestMethod | pathParameters      | responseFile                                               |
      | GET           | offerCode=offerCode | Response_CreateOffer_DiffEvents_FixedNonTransForProduct.json |
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

  @scenario6
  Scenario: Verify offer type and event type in offer response for event type 'Loyalty Enroll' and offer type 'Fixed for non-transactional behavior (purchase required)'
    Given I Create Offer
      | requestMethod | eventType      | requestFile                                                      | responseFile                                               |
      | POST          | LOYALTY ENROLL | Request_CreateOffer_DiffEvents_FixedNonTransForProduct.json | Response_CreateOffer_DiffEvents_FixedNonTransForProduct.json |
    Then I Verify Offer Response
    And I Retrieve offer
      | requestMethod | pathParameters      | responseFile                                               |
      | GET           | offerCode=offerCode | Response_CreateOffer_DiffEvents_FixedNonTransForProduct.json |
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

  @scenario7
  Scenario: Verify offer type and event type in offer response for event type 'Email add' and offer type 'Fixed for non-transactional behavior (purchase required)'
    Given I Create Offer
      | requestMethod | eventType | requestFile                                                      | responseFile                                               |
      | POST          | EMAIL ADD | Request_CreateOffer_DiffEvents_FixedNonTransForProduct.json | Response_CreateOffer_DiffEvents_FixedNonTransForProduct.json |
    Then I Verify Offer Response
    And I Retrieve offer
      | requestMethod | pathParameters      | responseFile                                               |
      | GET           | offerCode=offerCode | Response_CreateOffer_DiffEvents_FixedNonTransForProduct.json |
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

  @scenario8
  Scenario: Verify offer type and event type in offer response for event type 'Tier upgrade' and offer type 'Fixed for non-transactional behavior (purchase required)'
    Given I Create Offer
      | requestMethod | eventType    | requestFile                                                      | responseFile                                               |
      | POST          | TIER UPGRADE | Request_CreateOffer_DiffEvents_FixedNonTransForProduct.json | Response_CreateOffer_DiffEvents_FixedNonTransForProduct.json |
    Then I Verify Offer Response
    And I Retrieve offer
      | requestMethod | pathParameters      | responseFile                                               |
      | GET           | offerCode=offerCode | Response_CreateOffer_DiffEvents_FixedNonTransForProduct.json |
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

  @scenario9
  Scenario: Verify offer type and event type in offer response for event type 'CC Enroll' and offer type 'Multiplier for non-transactional behavior (purchase required))'
    Given I Create Offer
      | requestMethod | eventType | requestFile                                                      | responseFile                                                    | offerType | multiplier | txnSpendMin |txnSpendMax | validInDays | triggerOfferEventPeriod |
      | POST          | CC ENROLL | Request_CreateOffer_DiffEvents_MultiplierNonTransForProduct.json | Response_CreateOffer_DiffEvents_MultiplierNonTransForProduct.json | 11 | 2 | 100 | 250 | 1 | 5 |
    Then I Verify Offer Response
    And I Retrieve offer
     | requestMethod | pathParameters      | responseFile                                                    | offerType | multiplier | txnSpendMin |txnSpendMax | validInDays | triggerOfferEventPeriod |
      | GET           | offerCode=offerCode | Response_CreateOffer_DiffEvents_MultiplierNonTransForProduct.json | 11 | 2 | 100 | 250 | 1 | 5 |
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

  @scenario10
  Scenario: Verify offer type and event type in offer response for event type 'Loyalty Enroll' and offer type 'Multiplier for non-transactional behavior (purchase required))'
    Given I Create Offer
      | requestMethod | eventType      | requestFile                                                           | responseFile                                                    | offerType | multiplier | txnSpendMin |txnSpendMax | validInDays | triggerOfferEventPeriod |
      | POST          | LOYALTY ENROLL | Request_CreateOffer_DiffEvents_MultiplierNonTransForProduct.json | Response_CreateOffer_DiffEvents_MultiplierNonTransForProduct.json | 11 | 2  | 100 | 250 | 1 | 5 |
    Then I Verify Offer Response
    And I Retrieve offer
      | requestMethod | pathParameters      | responseFile                                                    | offerType | multiplier | txnSpendMin |txnSpendMax | validInDays | triggerOfferEventPeriod |
      | GET           | offerCode=offerCode | Response_CreateOffer_DiffEvents_MultiplierNonTransForProduct.json | 11 | 2  | 100 | 250 | 1 | 5 |
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

  @scenario11
  Scenario: Verify offer type and event type in offer response for event type 'Email add' and offer type 'Multiplier for non-transactional behavior (purchase required))'
    Given I Create Offer
      | requestMethod | eventType | requestFile                                                           | responseFile                                                    | offerType | multiplier | txnSpendMin |txnSpendMax | validInDays | triggerOfferEventPeriod |
      | POST          | EMAIL ADD | Request_CreateOffer_DiffEvents_MultiplierNonTransForProduct.json | Response_CreateOffer_DiffEvents_MultiplierNonTransForProduct.json | 11 | 2  | 100 | 250 | 1 | 5 |
    Then I Verify Offer Response
    And I Retrieve offer
      | requestMethod | pathParameters      | responseFile                                                    | offerType | multiplier | txnSpendMin |txnSpendMax | validInDays | triggerOfferEventPeriod |
      | GET           | offerCode=offerCode | Response_CreateOffer_DiffEvents_MultiplierNonTransForProduct.json | 11 | 2  | 100 | 250 | 1 | 5 |
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

  @scenario12
  Scenario: Verify offer type and event type in offer response for event type 'Tier upgrade' and offer type 'Multiplier for non-transactional behavior (purchase required))'
    Given I Create Offer
      | requestMethod | eventType    | requestFile                                                           | responseFile                                                    | offerType | multiplier | txnSpendMin |txnSpendMax | validInDays | triggerOfferEventPeriod |
      | POST          | TIER UPGRADE | Request_CreateOffer_DiffEvents_MultiplierNonTransForProduct.json | Response_CreateOffer_DiffEvents_MultiplierNonTransForProduct.json | 11 | 2  | 100 | 250 | 1 | 5 |
   Then I Verify Offer Response
    And I Retrieve offer
     | requestMethod | pathParameters      | responseFile                                                    | offerType | multiplier | txnSpendMin |txnSpendMax | validInDays | triggerOfferEventPeriod |
     | GET           | offerCode=offerCode | Response_CreateOffer_DiffEvents_MultiplierNonTransForProduct.json | 11 | 2  | 100 | 250 | 1 | 5 |
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
      