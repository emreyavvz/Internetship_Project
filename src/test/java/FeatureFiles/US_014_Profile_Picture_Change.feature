Feature: Profile Picture Change Functionality

  Background:
    Given The user is on the login page
    When The user enters a valid username and password
    And The user clicks the login button

  Scenario: Profile Picture
    And Click on the Element in Dialogs
    |StudentSettings|
    |Settings|
    |image|
    |upload|
    And Upoad The Picture
    Then Success Massege