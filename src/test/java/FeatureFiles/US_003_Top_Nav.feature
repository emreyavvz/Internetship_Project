Feature: Top Nav Functionality

  Scenario: Top Nav functionality checking
    Given The user is on the login page
    When The user enters a valid username and password
    And The user clicks the login button
    And The user clicks to calendar
    And The user clicks to attendance
    And The user clicks to assignments
    And The user clicks to grading
    And The user clicks to the hamburger menu button
    And The user clicks an empty space
    And The user clicks to the messages button
    And The user clicks to the messages close button
    And The user clicks to the new messages button
    And The user clicks to the new messages close button
    And The user clicks to the profile
    And The user clicks an empty space
    Then The user should be at the courses page