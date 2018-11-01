#language: en
@SPRING
Feature: Earn scenarios for SPOS PURCHASE TRANSACTION for different tenders and
         their combination with excluded and included departments

  Scenario: Earn scenario for SPOS PURCHASE TRANSACTION with THIRD PARTY and excluded dept
    Given I Enroll Customer Prior to P2P enrollment
      | requestMethod | requestFile              |
      | POST          | Request_IRNCusenroll.xml |
    Then I LookUp Customer by Account Number
      | requestMethod | requestFile                          | responseFile                          |
      | POST          | Request_cusLookupByAccountNumber.xml | Response_cusLookup_TFSDisEnrolled.xml |
    Then I wait for 4000 millis
    And I Perform IRN Transaction for P2P enrollment with one line item
      | DynamicClass | requestMethod | requestFile                                   | responseFile                                       |
      |           24 | POST          | Request_LTYTransaction_withCatchupAndEarn.xml | Response_LTYTransaction_EnrollTFS_excludedDept.xml |
    Then I Validate P2P enrollment in transaction response
    Then I LookUp Customer by Account Number and Verify P2P Enrollment
      | requestMethod | requestFile                          | responseFile                       |
      | POST          | Request_cusLookupByAccountNumber.xml | Response_cusLookup_TFSEnrolled.xml |
    #Perform P2P Transcation with THIRD PARTY as Tender for excluded dept
    And I Perform IRN Transaction for P2P Enrollment with excluded dept and THIRD PARTY tender
      | TenderType | DynamicDepts | PointsExpected | requestMethod | requestFile                                      | responseFile                       |
      |         23 |        42,42 |            0.0 | POST          | Request_LTYTransaction_EnrollWithDiffTenders.xml | Response_LTYTransaction_Return.xml |
    Then I Validate P2P enrollment in transaction response

  Scenario: Earn scenario for SPOS PURCHASE TRANSACTION with THIRD PARTY and included dept
    Given I Enroll Customer Prior to P2P enrollment
      | requestMethod | requestFile              |
      | POST          | Request_IRNCusenroll.xml |
    Then I LookUp Customer by Account Number
      | requestMethod | requestFile                          | responseFile                          |
      | POST          | Request_cusLookupByAccountNumber.xml | Response_cusLookup_TFSDisEnrolled.xml |
    Then I wait for 4000 millis
    And I Perform IRN Transaction for P2P enrollment with one line item
      | DynamicClass | requestMethod | requestFile                                   | responseFile                                       |
      |           24 | POST          | Request_LTYTransaction_withCatchupAndEarn.xml | Response_LTYTransaction_EnrollTFS_excludedDept.xml |
    Then I Validate P2P enrollment in transaction response
    Then I LookUp Customer by Account Number and Verify P2P Enrollment
      | requestMethod | requestFile                          | responseFile                       |
      | POST          | Request_cusLookupByAccountNumber.xml | Response_cusLookup_TFSEnrolled.xml |
    #Perform P2P Transcation with THIRD PARTY as Tender for included dept
    And I Perform IRN Transaction for P2P Enrollment with included dept and THIRD PARTY tender
      | TenderType | DynamicDepts | PointsExpected | requestMethod | requestFile                                      | responseFile                       |
      |         23 |      147,247 |            0.0 | POST          | Request_LTYTransaction_EnrollWithDiffTenders.xml | Response_LTYTransaction_Return.xml |
    Then I Validate P2P enrollment in transaction response

  Scenario: Earn scenario for SPOS PURCHASE TRANSACTION with cash tender and excluded dept
    Given I Enroll Customer Prior to P2P enrollment
      | requestMethod | requestFile              |
      | POST          | Request_IRNCusenroll.xml |
    Then I LookUp Customer by Account Number
      | requestMethod | requestFile                          | responseFile                          |
      | POST          | Request_cusLookupByAccountNumber.xml | Response_cusLookup_TFSDisEnrolled.xml |
    Then I wait for 4000 millis
    And I Perform IRN Transaction for P2P enrollment with one line item
      | DynamicClass | requestMethod | requestFile                                   | responseFile                                       |
      |           24 | POST          | Request_LTYTransaction_withCatchupAndEarn.xml | Response_LTYTransaction_EnrollTFS_excludedDept.xml |
    Then I Validate P2P enrollment in transaction response
    Then I LookUp Customer by Account Number and Verify P2P Enrollment
      | requestMethod | requestFile                          | responseFile                       |
      | POST          | Request_cusLookupByAccountNumber.xml | Response_cusLookup_TFSEnrolled.xml |
    #Perform P2P Transcation with CASH as Tender for excluded dept
    And I Perform IRN Transaction for P2P Enrollment with excluded item and cash tender
      | TenderType | DynamicDepts | PointsExpected | requestMethod | requestFile                                      | responseFile                       |
      |         26 |        42,42 |            0.0 | POST          | Request_LTYTransaction_EnrollWithDiffTenders.xml | Response_LTYTransaction_Return.xml |
    Then I Validate P2P enrollment in transaction response

  Scenario: Earn scenario for SPOS PURCHASE TRANSACTION with cash tender and included dept
    Given I Enroll Customer Prior to P2P enrollment
      | requestMethod | requestFile              |
      | POST          | Request_IRNCusenroll.xml |
    Then I LookUp Customer by Account Number
      | requestMethod | requestFile                          | responseFile                          |
      | POST          | Request_cusLookupByAccountNumber.xml | Response_cusLookup_TFSDisEnrolled.xml |
    Then I wait for 4000 millis
    And I Perform IRN Transaction for P2P enrollment with one line item
      | DynamicClass | requestMethod | requestFile                                   | responseFile                                       |
      |           24 | POST          | Request_LTYTransaction_withCatchupAndEarn.xml | Response_LTYTransaction_EnrollTFS_excludedDept.xml |
    Then I Validate P2P enrollment in transaction response
    Then I LookUp Customer by Account Number and Verify P2P Enrollment
      | requestMethod | requestFile                          | responseFile                       |
      | POST          | Request_cusLookupByAccountNumber.xml | Response_cusLookup_TFSEnrolled.xml |
    #Perform P2P Transcation with CASH as Tender for included dept
    And I Perform IRN Transaction for P2P Enrollment with included dept and cash tender
      | TenderType | DynamicDepts | PointsExpected | requestMethod | requestFile                                      | responseFile                       |
      |         26 |      147,247 |            0.0 | POST          | Request_LTYTransaction_EnrollWithDiffTenders.xml | Response_LTYTransaction_Return.xml |
    Then I Validate P2P enrollment in transaction response

  Scenario: Earn for SPOS PURCHASE TRANSACTION with GIFT CARD and excluded dept
    Given I Enroll Customer Prior to P2P enrollment
      | requestMethod | requestFile              |
      | POST          | Request_IRNCusenroll.xml |
    Then I LookUp Customer by Account Number
      | requestMethod | requestFile                          | responseFile                          |
      | POST          | Request_cusLookupByAccountNumber.xml | Response_cusLookup_TFSDisEnrolled.xml |
    Then I wait for 4000 millis
    And I Perform IRN Transaction for P2P enrollment with one line item
      | DynamicClass | requestMethod | requestFile                                   | responseFile                                       |
      |           24 | POST          | Request_LTYTransaction_withCatchupAndEarn.xml | Response_LTYTransaction_EnrollTFS_excludedDept.xml |
    Then I Validate P2P enrollment in transaction response
    Then I LookUp Customer by Account Number and Verify P2P Enrollment
      | requestMethod | requestFile                          | responseFile                       |
      | POST          | Request_cusLookupByAccountNumber.xml | Response_cusLookup_TFSEnrolled.xml |
    #Perform P2P Transcation with GIFT CARD as Tender for excluded dept
    And I Perform IRN Transaction for P2P Enrollment with excluded dept and GIFT CARD tender
      | TenderType | DynamicDepts | PointsExpected | requestMethod | requestFile                                      | responseFile                       |
      |         47 |        42,42 |            0.0 | POST          | Request_LTYTransaction_EnrollWithDiffTenders.xml | Response_LTYTransaction_Return.xml |
    Then I Validate P2P enrollment in transaction response

  Scenario: Earn for SPOS PURCHASE TRANSACTION with GIFT CARD and included dept
    Given I Enroll Customer Prior to P2P enrollment
      | requestMethod | requestFile              |
      | POST          | Request_IRNCusenroll.xml |
    Then I LookUp Customer by Account Number
      | requestMethod | requestFile                          | responseFile                          |
      | POST          | Request_cusLookupByAccountNumber.xml | Response_cusLookup_TFSDisEnrolled.xml |
    Then I wait for 4000 millis
    And I Perform IRN Transaction for P2P enrollment with one line item
      | DynamicClass | requestMethod | requestFile                                   | responseFile                                       |
      |           24 | POST          | Request_LTYTransaction_withCatchupAndEarn.xml | Response_LTYTransaction_EnrollTFS_excludedDept.xml |
    Then I Validate P2P enrollment in transaction response
    Then I LookUp Customer by Account Number and Verify P2P Enrollment
      | requestMethod | requestFile                          | responseFile                       |
      | POST          | Request_cusLookupByAccountNumber.xml | Response_cusLookup_TFSEnrolled.xml |
    #Perform P2P Transcation with GIFT CARD as Tender for included dept
    And I Perform IRN Transaction for P2P Enrollment with included dept and GIFT CARD tender
      | TenderType | DynamicDepts | PointsExpected | requestMethod | requestFile                                      | responseFile                       |
      |         47 |      147,247 |            0.0 | POST          | Request_LTYTransaction_EnrollWithDiffTenders.xml | Response_LTYTransaction_Return.xml |
    Then I Validate P2P enrollment in transaction response

  Scenario: Earn for SPOS PURCHASE TRANSACTION with PROP tender, cash tender and excluded dept
    Given I Enroll Customer Prior to P2P enrollment
      | requestMethod | requestFile               |
      | POST          | Request_PROPCusenroll.xml |
    Then I LookUp Customer by Account Number
      | requestMethod | requestFile                          | responseFile                          |
      | POST          | Request_cusLookupByAccountNumber.xml | Response_cusLookup_TFSDisEnrolled.xml |
    Then I wait for 4000 millis
    #Perform P2P Transcation with PROP, CASH as tenders for excluded dept
    And I Perform PROP Transaction for P2P enrollment with excluded dept and CASH tender
      | TenderType | DynamicDepts | requestMethod | requestFile                                     | responseFile                                       |
      |         26 |        42,42 | POST          | Request_LTYTransaction_EnrollWithTwoTenders.xml | Response_LTYTransaction_EnrollTFS_excludedDept.xml |
    Then I Validate P2P enrollment in transaction response

  Scenario: Earn for SPOS PURCHASE TRANSACTION with PROP tender, cash tender and included dept
    Given I Enroll Customer Prior to P2P enrollment
      | requestMethod | requestFile               |
      | POST          | Request_PROPCusenroll.xml |
    Then I LookUp Customer by Account Number
      | requestMethod | requestFile                          | responseFile                          |
      | POST          | Request_cusLookupByAccountNumber.xml | Response_cusLookup_TFSDisEnrolled.xml |
    Then I wait for 4000 millis
    #Perform P2P Transcation with PROP, CASH as tenders for included dept
    And I Perform PROP Transaction for P2P enrollment with included item and CASH tender
      | TenderType | DynamicDepts | PointsExpected | requestMethod | requestFile                                     | responseFile                                              |
      |         26 |      358,456 |           5.24 | POST          | Request_LTYTransaction_EnrollWithTwoTenders.xml | Response_LTYTransaction_WithNonexcludedDept_P2PEnroll.xml |
    Then I Validate P2P enrollment in transaction response

  Scenario: Earn for SPOS PURCHASE TRANSACTION with IRN tender, GC with included dept scenario
    Given I Enroll Customer Prior to P2P enrollment
      | requestMethod | requestFile              |
      | POST          | Request_IRNCusenroll.xml |
    Then I LookUp Customer by Account Number
      | requestMethod | requestFile                          | responseFile                          |
      | POST          | Request_cusLookupByAccountNumber.xml | Response_cusLookup_TFSDisEnrolled.xml |
    Then I wait for 4000 millis
    #Perform P2P Transcation with IRN, GIFT CARD as tenders for included dept
    And I Perform IRN Transaction for P2P enrollment with included dept and GIFT CARD
      | TenderType | DynamicDepts | PointsExpected | requestMethod | requestFile                                     | responseFile                                              |
      |         47 |      358,456 |           5.24 | POST          | Request_LTYTransaction_EnrollWithTwoTenders.xml | Response_LTYTransaction_WithNonexcludedDept_P2PEnroll.xml |
    Then I Validate P2P enrollment in transaction response

  Scenario: Earn for SPOS PURCHASE TRANSACTION with IRN tender, GC with excluded dept scenario
    Given I Enroll Customer Prior to P2P enrollment
      | requestMethod | requestFile              |
      | POST          | Request_IRNCusenroll.xml |
    Then I LookUp Customer by Account Number
      | requestMethod | requestFile                          | responseFile                          |
      | POST          | Request_cusLookupByAccountNumber.xml | Response_cusLookup_TFSDisEnrolled.xml |
    Then I wait for 4000 millis
    #Perform P2P Transcation with IRN, GIFT CARD as tenders for excluded dept
    And I Perform IRN Transaction for P2P enrollment with excluded dept and GIFT CARD
      | TenderType | DynamicDepts | requestMethod | requestFile                                     | responseFile                                       |
      |         47 |        42,42 | POST          | Request_LTYTransaction_EnrollWithTwoTenders.xml | Response_LTYTransaction_EnrollTFS_excludedDept.xml |
    Then I Validate P2P enrollment in transaction response

  Scenario: Earn for SPOS PURCHASE TRANSACTION with PROP tender backstage scenario and included dept
    Given I Enroll Customer Prior to P2P enrollment
      | requestMethod | requestFile               |
      | POST          | Request_PROPCusenroll.xml |
    Then I LookUp Customer by Account Number
      | requestMethod | requestFile                          | responseFile                          |
      | POST          | Request_cusLookupByAccountNumber.xml | Response_cusLookup_TFSDisEnrolled.xml |
    Then I wait for 4000 millis
    #Perform P2P Transcation with PROP tender backstage scenario for included dept
    And I Perform PROP Transaction for P2P enrollment with included dept
      | DynamicClass | DynamicDepts | requestMethod | requestFile                           | responseFile                                       |
      |           24 |      358,456 | POST          | Request_LTYTransaction_EnrollEarn.xml | Response_LTYTransaction_EnrollTFS_excludedDept.xml |
    Then I Validate P2P enrollment in transaction response

  Scenario: Earn for SPOS PURCHASE TRANSACTION with PROP tender backstage scenario and excluded dept
    Given I Enroll Customer Prior to P2P enrollment
      | requestMethod | requestFile               |
      | POST          | Request_PROPCusenroll.xml |
    Then I LookUp Customer by Account Number
      | requestMethod | requestFile                          | responseFile                          |
      | POST          | Request_cusLookupByAccountNumber.xml | Response_cusLookup_TFSDisEnrolled.xml |
    Then I wait for 4000 millis
    #Perform P2P Transcation with PROP tender backstage scenario for excluded dept
    And I Perform PROP Transaction for P2P enrollment with excluded dept
      | DynamicClass | DynamicDepts | requestMethod | requestFile                           | responseFile                                       |
      |           24 |        42,42 | POST          | Request_LTYTransaction_EnrollEarn.xml | Response_LTYTransaction_EnrollTFS_excludedDept.xml |
    Then I Validate P2P enrollment in transaction response
