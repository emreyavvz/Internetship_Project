Feature: Theme Change Functionality

  Background:
    Given The user is on the login page
    When The user enters a valid username and password
    And The user clicks the login button

  Scenario: Change Function
    And Click on the Element in Dialogs
    |StudentSettings|
    |Settings|
    |ThemeMenu|
    |darkPurpleTheme|
    |savebuttonColor|
    Then Success Update Color
