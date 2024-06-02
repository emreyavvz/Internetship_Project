Feature: Fee Payment Functionality

  Scenario:Making a payment and verifying the balance update

    Given the student is logged into the system
    When the student clicks the Finance link in the Hamburger menu
    When the student clicks on the row with their name on the finance page
    Then the student is redirected to the payment page
    Then the student sees Online Payment and FeeBalance Detail buttons
    When the student selects Stripe and makes a payment
    Then the balance is updated correctly
    And the student sees the successful payment message in the top right message box

