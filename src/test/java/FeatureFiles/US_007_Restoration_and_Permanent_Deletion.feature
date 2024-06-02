Feature: Restoration and Permanent Deletion Functionality

  Background:
    Given The user is on the login page
    When The user enters a valid username and password
    And The user clicks the login button

  Scenario: Message Deletion Functionality Check
    When The user clicks to the hamburger menu button
    And The user clicks to the messaging button
    And The user clicks to the trash button
    And The user clicks to the restore message icon
    Then The user should see the confirmation of the restoration message