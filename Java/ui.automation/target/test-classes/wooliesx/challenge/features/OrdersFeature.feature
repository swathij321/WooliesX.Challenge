Feature: Order creation
	In order to make an order
	As a shopping cart user
	I want to be able to add 2 items to the cart and place an order

Background:
	Given I am on the Landing page
	And I click sign in link and Go to Sign In page
	And I enter valid email address "swathi.jolla@automationpractice.com" and password "automationpractice.com"
	
@CartTest
Scenario Outline:  I want to be able to add 2 items to the cart
	Given I am on the My Account page and click the menu Women
    When I select the <product> from catalog and click on it
    And I click Add to cart button at the details page
    And Click Proceed to checkout button at the modal dialog

	Examples:
	| product      |
	| Faded Short Sleeve T-shirts |
	| Printed Chiffon Dress |
	
@OrderTest
Scenario:  I want to be able to place an order with 2 items in the cart
	Given I am on the My Account page and click the cart icon
    When Click Proceed to checkout button at the cart details page
    And Click Proceed to checkout button at the address page
    And Select the Terms of service checkbox at the shipping page and click Proceed to checkout button
    And Click on the Pay by bank wire button at the payment page
    And Click on the I confirm my order button at the order summary page
    Then I am able to see the order confirmation page
    And Click on sign out link to log out