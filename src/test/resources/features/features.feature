Feature: IRCTC Login

  Scenario: Successful login with valid credentials
    Given I open the IRCTC login page
    When I enter valid username and password
    Then I should be logged in successfully
