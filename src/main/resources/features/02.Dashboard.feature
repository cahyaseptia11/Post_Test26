Feature: Dashboard User

  Scenario: Dashboard user function
    When User click menu Dashboard
    And User on menu Dashboard
    And User click menu Requirement
    And User on menu Requirement
    And User clik menu Add
    And User enter firstname middlename lastname
    And User enter email
    And User click save
    Then User get Application Stage
