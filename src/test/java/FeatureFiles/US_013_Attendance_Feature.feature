Feature: Attendance Feature Functionality

  Background:
    Given The user is on the login page
    When The user enters a valid username and password
    And The user clicks the login button

  Scenario: Attendance Feature
    And Click on the Element in Dialogs
      | Attendance |
    And Rollover to Excuses
    And Click on the Element in Dialogs
      | Excuses |
    And Attendence Execuses Click with Robot