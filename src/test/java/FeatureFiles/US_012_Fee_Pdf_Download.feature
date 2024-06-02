Feature: Fee Pdf Download Functionality

  Background:
    Given The user is on the login page
    When The user enters a valid username and password
    And The user clicks the login button

  Scenario: Fee Pdf Download
    And Click on the Element in Dialog
    |HamburgerMenu|
    |Finance|
    |MyFinance|
    |SelectMenu|
    |pdfDoc|
    And Download Document



