Feature: PizzaHut Payment Test

  Scenario: 
    Given Website launche with url
    Then A black color auto pop up screen will be displayed. Close it
    Then set the user delivery location as Lulu Mall, Bangalore
    Then click on view all deals
    And enter delivery address
    And The user is now on the Deals page. Validate that the URL has text as ‘deals’
    Then Go to sides and add any item that is below 200
    And Validate that the product is added under Basket but checkout button price item is still not showing
    Then Navigate to the Drinks page
    Then Add any two drinks so that total cart pricing is more than 200
    Then Click on the Checkout button. The user will be navigated to the checkout page
    And Validate that the Online Payment radio button is selected by default
    Then Change the Payment option to Cash
    And Validate that the I agree checkbox is checked by default
    Then Enter name, mobile, and email address
    And Click on the Apply Gift Card link
    When A pop up should appear. Click on the Voucher
    Then Give the Voucher code as 12345 and submit
    And Validate if an error is coming that the number is incorrect
    Then Close the voucher pop up
    And The user should again navigate to your Basket page.
