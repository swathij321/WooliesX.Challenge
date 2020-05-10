package wooliesx.challenge.stepDefinations;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import wooliesx.challenge.core.TestBase;
import wooliesx.challenge.core.utilities.Configuration;
import wooliesx.challenge.ui.pages.MyAccountPage;
import wooliesx.challenge.ui.pages.OrderConfirmationPage;
import wooliesx.challenge.ui.pages.OrderSummaryPage;
import wooliesx.challenge.ui.pages.PaymentPage;
import wooliesx.challenge.ui.pages.ShippingPage;
import wooliesx.challenge.ui.pages.ShoppingCartSummaryPage;
import wooliesx.challenge.ui.pages.AddressPage;

public class OrdersSteps extends TestBase 
{
	private MyAccountPage myAccountPage;
	private ShoppingCartSummaryPage shoppingCartSummaryPage;
	private AddressPage addressPage;
	private ShippingPage shippingPage;
	private PaymentPage paymentPage;
	private OrderSummaryPage orderSummaryPage;
	private OrderConfirmationPage orderConfirmationPage;
	
	public OrdersSteps(Configuration configuration) {
		super(configuration);
	}

	@Given("^I am on the My Account page and click the cart icon$")
	public void i_am_on_the_My_Account_page_and_click_the_cart_icon() throws Exception {
		if(myAccountPage == null)
		{
			myAccountPage = new MyAccountPage(driver);
		}
		
		shoppingCartSummaryPage = myAccountPage.clickOnShoppingCart();
		// Wait until the page loaded and proceed to checkout button is visible
		waitUntilElementLocated(shoppingCartSummaryPage.proceedToCheckoutButton);
		// Assert true if the page is loaded and proceed to checkout button is visible
	    Assert.assertTrue(shoppingCartSummaryPage.proceedToCheckoutButton.isDisplayed());
	}

	@When("^Click Proceed to checkout button at the cart details page$")
	public void click_Proceed_to_checkout_button_at_the_cart_details_page() throws Exception {
		addressPage = shoppingCartSummaryPage.clickOnProceedToCheckoutButton();
		// Wait until the page loaded and proceed to checkout button is visible
		waitUntilElementLocated(addressPage.proceedToCheckoutButton);
		// Assert true if the page is loaded and proceed to checkout button is visible
	    Assert.assertTrue(addressPage.proceedToCheckoutButton.isDisplayed());
	}

	@When("^Click Proceed to checkout button at the address page$")
	public void click_Proceed_to_checkout_button_at_the_address_page() throws Exception {
		shippingPage = addressPage.clickOnProceedToCheckoutButton();
		// Wait until the page loaded and proceed to checkout button is visible
		waitUntilElementLocated(shippingPage.proceedToCheckoutButton);
		// Assert true if the page is loaded and proceed to checkout button is visible
	    Assert.assertTrue(shippingPage.proceedToCheckoutButton.isDisplayed());
	}

	@When("^Select the Terms of service checkbox at the shipping page and click Proceed to checkout button$")
	public void select_the_Terms_of_service_checkbox_at_the_shipping_page_and_click_Proceed_to_checkout_button() throws Exception {
		shippingPage.clickTermsConditionsCheckbox();
	    paymentPage = shippingPage.clickOnProceedToCheckoutButton();
		// Wait until the page loaded and pay By Bank Wire button is visible
		waitUntilElementLocated(paymentPage.payByBankWire);
		// Assert true if the page is loaded and pay By Bank Wire button is visible
	    Assert.assertTrue(paymentPage.payByBankWire.isDisplayed());
	}

	@When("^Click on the Pay by bank wire button at the payment page$")
	public void click_on_the_Pay_by_bank_wire_button_at_the_payment_page() throws Exception {
		orderSummaryPage = paymentPage.clickOnPayByBankWire();
		// Wait until the page loaded and confirm My Order button is visible
		waitUntilElementLocated(orderSummaryPage.confirmMyOrderButton);
		// Assert true if the page is loaded and confirm My Order button is visible
	    Assert.assertTrue(orderSummaryPage.confirmMyOrderButton.isDisplayed());
	}

	@When("^Click on the I confirm my order button at the order summary page$")
	public void click_on_the_I_confirm_my_order_button_at_the_order_summary_page() throws Exception {
		orderConfirmationPage = orderSummaryPage.clickOnConfirmButton();
	}

	@Then("^I am able to see the order confirmation page$")
	public void i_am_able_to_see_the_order_confirmation_page() throws Exception {
		// Wait until the page loaded and confirm My Order button is visible
		waitUntilElementLocated(orderConfirmationPage.confirmOrderMessage);
		// Assert true if the page is loaded and confirm My Order button is visible
	    Assert.assertTrue(orderConfirmationPage.confirmOrderMessage.isDisplayed());
	    // Save screenshot
	    saveScreenshotsForScenario();
	}

	@Then("^Click on sign out link to log out$")
	public void Click_on_sign_out_link_to_log_out() throws Exception {
		// Click sign out link to log out
		orderConfirmationPage.signOutLink.click();
	}
}
