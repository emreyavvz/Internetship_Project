Feature: Grading Print Feature Functionality

  Scenario: Downloading a grade report as a PDF

    Given the student is logged into the system
    Given the student is on the grading page
    When the student navigates to the Course Grade or Students Transcript page
    When the student clicks the Print icon
    When the student clicks the Download button
    Then the PDF document should be downloaded to the student's local computer















