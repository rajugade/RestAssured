#language: en
Feature: loyalty lookup scenarios

  @Scenario1
  Scenario: Enroll Customer with IRN
    Given I Enroll Customer with IRN
      | requestMethod | AccountType | requestFile              |
      | POST          | A           | Request_IRNCusenroll.xml |
   Then I do CusInfoMaint
      | requestMethod | Scenario | requestFile                        | responseFile                        |
      | POST          | Negative |Request_cusLookup_cusInfoMaint.xml | Response_cusLookup_CusInfoMaint.xml |
    And I do CusAcctMaint
      | requestMethod |Scenario | requestFile                        | responseFile                        |
      | POST          |Negative | Request_cusLookup_cusAcctMaint_wrongTier.xml | Response_cusLookup_CusInfoMaint.xml |
    And I do CusNotesMaint
      | requestMethod |Scenario | requestFile                         | responseFile                        |
      | POST          |Negative | Request_cusLookup_cusNotesMaint_wrongNotePriority.xml | Response_cusLookup_CusInfoMaint.xml |
    And I CusLookUp by Phone
      | requestMethod |Scenario | requestFile                   | responseFile               |
      | POST          |Negative |Request_cusLookup_byPhone.xml | Response_cusLookup_IRN.xml |
    And I CusLookUp by ZipCode
      | requestMethod |Scenario | requestFile                     | responseFile                     |
      | POST          |Negative | Request_cusLookup_byZipCode.xml | Response_cusLookup_ByZipCode.xml |
    And I CusLookUp by Name
      | requestMethod |Scenario |NameType | requestFile                  | responseFile                     |
      | POST          |Negative |LastName | Request_cusLookup_byName.xml | Response_cusLookup_ByZipCode.xml |
    And I CusLookUp by Account Number
      | requestMethod |Scenario | requestFile                    | responseFile               |
      | POST          |Negative |  Request_cusLookup_Scenario.xml | Response_cusLookup_IRN.xml |
    
 