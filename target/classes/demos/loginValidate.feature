Feature: feature to test login functionality

  Scenario: Check whether login is successful with valid credentials or not
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the home page
