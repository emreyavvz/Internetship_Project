Feature: Login Feature

  Scenario: Successful login with valid credentials
    Given The user is on the login page
    When The user enters a valid username and password
    And The user clicks the login button
    Then The user should be redirected to the home page
