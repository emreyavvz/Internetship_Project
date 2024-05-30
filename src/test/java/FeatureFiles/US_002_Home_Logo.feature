Feature: Home Logo Functionality

  Scenario: Home Logo to home page
    Given The user is on the login page
    When The user enters a valid username and password
    And The user clicks the login button
    And The user clicks to the Home Logo
    Then The user should be redirected to the Techno Study page