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
    And The user clicks a student
    And The user clicks add button
    And The user types 'tea' to the reciever input
    And The user clicks a teacher
    And The user clicks add and exit button
    And The user types the subject of the mail
    And The user types the message
    And The user clicks the attach files button
    And The user clicks the from local button
    And The user writes Empty Pdf and presses enter
    And The user clicks the send button
    Then The user should see the message
    When The user clicks to the hamburger menu button
    And The user clicks to the messaging button
    And The user clicks to the outbox button
    Then The user should see the message in the outbox