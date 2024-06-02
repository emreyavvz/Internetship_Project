Feature: Assignments Discussion Feature Functionality

  Scenario:Starting a discussion and attaching files
    Given the student is logged into the system
    Given the student clicks the assignments link
    When the student clicks a random assignment
    And the student clicks the Discussion button
    Then the student attaches files
    When the student sends a message
    Then message sent successfully alert appears







