Feature: Login User

  Scenario: User invalid login
    When User go to Web HRM
    And User enter username password invalid
    And User click button login
    Then User invalid credentials

  Scenario: User valid login
    When User enter username password valid
    And User click button login valid
    Then User valid credentials