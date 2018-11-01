#language: en
Feature: cusEnroll negative scenarios

  @Scenario1
  Scenario: Enroll Customer with IRN
    Given I Enroll Customer with IRN
      | requestMethod | AccountType | requestFile              |
      | POST          | A           | Request_IRNCusenroll.xml |
    And I try to enroll Customer with enrolled phone number
      | requestMethod | Negative             | AccountType | requestFile              |
      | POST          | PHONE ALREADY EXISTS | A           | Request_IRNCusenroll.xml |
    And I try to enroll Customer invalid name
      | requestMethod | Negative                    | AccountType | requestFile              |
      | POST          | Name information is missing | A           | Request_IRNCusenroll.xml |

  @Scenario2
  Scenario: Enroll Customer with IRN
    Given I Enroll Customer with IRN
      | requestMethod | AccountType | requestFile              |
      | POST          | A           | Request_IRNCusenroll.xml |
    And I try to enroll Customer with enrolled account number
      | requestMethod | Negative         | AccountType | requestFile              |
      | POST          | System Exception | A           | Request_IRNCusenroll.xml |
    And I try to enroll Customer invalid zipcode
      | requestMethod | Negative                 | AccountType | requestFile              |
      | POST          | ZIP CODE MUST BE NUMERIC | A           | Request_IRNCusenroll.xml |

  @Scenario3
  Scenario: Enroll Customer with PROP
    Given I Enroll Customer with PROP
      | requestMethod | AccountType | requestFile              |
      | POST          | P           | Request_IRNCusenroll.xml |
    And I try to enroll Customer with enrolled phone number
      | requestMethod | Negative             | AccountType | requestFile              |
      | POST          | PHONE ALREADY EXISTS | P           | Request_IRNCusenroll.xml |
    And I try to enroll Customer invalid name
      | requestMethod | Negative                    | AccountType | requestFile              |
      | POST          | Name information is missing | P           | Request_IRNCusenroll.xml |

  @Scenario4
  Scenario: Enroll Customer with PROP
    Given I Enroll Customer with PROP
      | requestMethod | AccountType | requestFile              |
      | POST          | P           | Request_IRNCusenroll.xml |
    And I try to enroll Customer with enrolled account number
      | requestMethod | Negative         | AccountType | requestFile              |
      | POST          | System Exception | P           | Request_IRNCusenroll.xml |
    And I try to enroll Customer invalid zipcode
      | requestMethod | Negative                 | AccountType | requestFile              |
      | POST          | ZIP CODE MUST BE NUMERIC | P           | Request_IRNCusenroll.xml |
