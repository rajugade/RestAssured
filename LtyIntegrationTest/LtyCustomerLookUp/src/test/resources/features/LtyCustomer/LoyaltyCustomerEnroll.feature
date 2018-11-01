#language: en
Feature: loyalty lookup scenarios

  @Scenario1
  Scenario: Enroll Customer with IRN
    Given I Enroll Customer with IRN
      | requestMethod | AccountType | requestFile              |
      | POST          | A           | Request_IRNCusenroll.xml |
    Then I do CusInfoMaint
      | requestMethod | requestFile                        | responseFile                        |
      | POST          | Request_cusLookup_cusInfoMaint.xml | Response_cusLookup_CusInfoMaint.xml |
    And I CusLookUp by Phone
      | requestMethod | requestFile                   | responseFile               |
      | POST          | Request_cusLookup_byPhone.xml | Response_cusLookup_IRN.xml |
    And I CusLookUp by Account Number
      | requestMethod | requestFile                    | responseFile               |
      | POST          | Request_cusLookup_Scenario.xml | Response_cusLookup_IRN.xml |
    And I CusLookUp by ZipCode
      | requestMethod | requestFile                     | responseFile                     |
      | POST          | Request_cusLookup_byZipCode.xml | Response_cusLookup_ByZipCode.xml |
    And I CusLookUp by Name
      | requestMethod | requestFile                  | responseFile                     |
      | POST          | Request_cusLookup_byName.xml | Response_cusLookup_ByZipCode.xml |
    And I do CusNotesMaint
      | requestMethod | requestFile                         | responseFile                        |
      | POST          | Request_cusLookup_cusNotesMaint.xml | Response_cusLookup_CusInfoMaint.xml |
    And I do CusAcctMaint
      | requestMethod | requestFile                        | responseFile                        |
      | POST          | Request_cusLookup_cusAcctMaint.xml | Response_cusLookup_CusInfoMaint.xml |
   
  @Scenario2
  Scenario: Enroll Customer with PROP
    Given I Enroll Customer with PROP
      | requestMethod | AccountType | requestFile              |
      | POST          | P           | Request_IRNCusenroll.xml |
    Then I do CusInfoMaint
      | requestMethod | requestFile                        | responseFile                        |
      | POST          | Request_cusLookup_cusInfoMaint.xml | Response_cusLookup_CusInfoMaint.xml |
    And I CusLookUp by Phone
      | requestMethod | requestFile                   | responseFile               |
      | POST          | Request_cusLookup_byPhone.xml | Response_cusLookup_IRN.xml |
    And I CusLookUp by Account Number
      | requestMethod | requestFile                    | responseFile               |
      | POST          | Request_cusLookup_Scenario.xml | Response_cusLookup_IRN.xml |
    And I CusLookUp by ZipCode
      | requestMethod | requestFile                     | responseFile                     |
      | POST          | Request_cusLookup_byZipCode.xml | Response_cusLookup_ByZipCode.xml |
    And I CusLookUp by Name
      | requestMethod | requestFile                  | responseFile                     |
      | POST          | Request_cusLookup_byName.xml | Response_cusLookup_ByZipCode.xml |
    And I do CusNotesMaint
      | requestMethod | requestFile                         | responseFile                        |
      | POST          | Request_cusLookup_cusNotesMaint.xml | Response_cusLookup_CusInfoMaint.xml |
    And I do CusAcctMaint
      | requestMethod | requestFile                        | responseFile                        |
      | POST          | Request_cusLookup_cusAcctMaint.xml | Response_cusLookup_CusInfoMaint.xml |
   