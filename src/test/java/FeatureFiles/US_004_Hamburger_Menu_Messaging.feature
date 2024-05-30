Feature: Hamburger Menu Messaging Functionality

  Background: #Before Scenario
    Given The user is on the login page
    When The user enters a valid username and password
    And The user clicks the login button

  Scenario: Messaging functionality check
    When The user clicks to the hamburger menu button
    And The user clicks to the messaging button
    And The user clicks to the new message button
    Then The user should be at the new messages page
    When The user clicks to the hamburger menu button
    And The user clicks to the messaging button
    And The user clicks to the inbox button
    Then The user should be at the inbox page
    When The user clicks to the hamburger menu button
    And The user clicks to the messaging button
    And The user clicks to the outbox button
    Then The user should be at the outbox page
    When The user clicks to the hamburger menu button
    And The user clicks to the messaging button
    And The user clicks to the trash button
    Then The user should be at the trash page
