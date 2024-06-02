Feature: Assignments Feature Functionality

  Scenario: Viewing total number of assignments and all assignments
    Given the student is on the home page
    When the student hovers over the assignments link
    Then the student should see the total number of assignments
    When the student is on the assignments page
    Then the student should see all assignments
