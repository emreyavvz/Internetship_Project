Feature: Message Deletion Functionality

  Background:
    Given The user is on the login page
    When The user enters a valid username and password
    And The user clicks the login button

  Scenario: Message Deletion Functionality Check
    When The user clicks to the hamburger menu button
    And The user clicks to the messaging button
    And The user clicks to the outbox button
    And The user clicks to the delete message icon
    And The user clicks to the confirmation of the delete message
    Then The user should see the Message successfully moved to trash! message