Feature: Assignments Icons Feature Functionality

  Scenario: Verifying assignment icons and discussion visibility
    Given the student is logged into the system
    Then the Information, Submit, and Mark it icons work
    When the student clicks outside icons on an assignment
    Then the student sees assignment details
    Given the student opened a discussion
    Then the Discussion icon is visible