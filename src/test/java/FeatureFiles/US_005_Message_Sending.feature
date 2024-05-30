Feature: Message Sending Functionality

  Background:
    Given The user is on the login page
    When The user enters a valid username and password
    And The user clicks the login button

  Scenario: Messaging Sending Functionality Check
    When The user clicks to the hamburger menu button
    And The user clicks to the messaging button
    And The user clicks to the new message button
    And The user clicks add receivers button
    And The user types 'stu' to the reciever input
