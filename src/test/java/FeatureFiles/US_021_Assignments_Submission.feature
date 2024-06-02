Feature: Assignments Submission Feature Functionality

  Background:
    Given The user is on the login page
    When The user enters a valid username and password
    And The user clicks the login button

  Scenario: Submit an assignment successfully
    Given The user clicks to assignments
    And The user clicks on Semester tab
    And The user clicks on all
    And The user clicks on submit button