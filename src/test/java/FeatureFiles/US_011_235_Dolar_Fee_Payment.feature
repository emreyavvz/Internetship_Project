Feature: 235 Dolar Fee Payment Functionality

  Background:
    Given The user is on the login page
    When The user enters a valid username and password
    And The user clicks the login button

  Scenario: Free Payment
    And Click on the Element in Dialog
      | HamburgerMenu |
      | Finance       |
      | MyFinance     |
      | StudentColumn |
      | Stripe        |
      | AmountDebt    |
      | PayCustom     |
    And User sending the keys in Dialog
      | InputAmount | 2 |
    And Click on the Element in Dialog
      | PayCustom |
      | PayButton |
  When the user switches to the iframe with index 0
 And User sending the keys in Dialog
   | CardNumber | 4242424242424242 |
   | ExpDate    | 1225             |
   | Ccv        | 123              |
  And User back to Recent Page
  And Click on the Element in Dialog
  | StripePay     |
  Then Payment Success Massege



      #And User sending the keys in Dialog

