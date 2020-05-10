package wooliesx.challenge.stepDefinations;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import wooliesx.challenge.core.TestBase;
import wooliesx.challenge.core.utilities.Configuration;
import wooliesx.challenge.ui.pages.CatalogPage;
import wooliesx.challenge.ui.pages.ItemDetailsPage;
import wooliesx.challenge.ui.pages.MyAccountPage;
import wooliesx.challenge.ui.pages.ShoppingCartPage;
import wooliesx.challenge.ui.pages.ShoppingCartSummaryPage;

public class CartSteps extends TestBase
{
	private MyAccountPage myAccountPage;
	private CatalogPage catalogPage;
	private ItemDetailsPage itemDetailsPage;
	private ShoppingCartPage shoppingCartPage;
	private ShoppingCartSummaryPage shoppingCartSummaryPage;
	
	public CartSteps(Configuration configuration) {
		super(configuration);
	}

	@Given("^I am on the My Account page and click the menu Women$")
	public void i_am_on_the_My_Account_page_and_click_the_menu_Women() throws Exception {
		if(myAccountPage == null)
		{
			myAccountPage = new MyAccountPage(driver);
		}
		
		catalogPage = myAccountPage.clickOnWomenMenu();
		// Wait until the page loaded and item1 is visible
		waitUntilElementLocated(catalogPage.item1);
		// Assert true if the page is loaded and item1 is visible
	    Assert.assertTrue(catalogPage.item1.isDisplayed());
	}

	@When("^I select the (.*) from catalog and click on it$")
	public void i_select_the_from_catalog_and_click_on_it(String product) throws Exception {
		itemDetailsPage = catalogPage.clickOnItem(product);
		// Wait until the page loaded and add to cart button is visible
		waitUntilElementLocated(itemDetailsPage.addToCartButton);
		// Assert true if the page is loaded and add to cart button is visible
	    Assert.assertTrue(itemDetailsPage.addToCartButton.isDisplayed());
	}

	@When("^I click Add to cart button at the details page$")
	public void i_click_Add_to_cart_button_at_the_details_page() throws Exception {
		shoppingCartPage = itemDetailsPage.clickOnAddToShoppingButton();
		// Wait until the page loaded and proceed to checkout button is visible
		waitUntilElementLocated(shoppingCartPage.proceedToCheckoutButton);
		// Assert true if the page is loaded and proceed to checkout button is visible
	    Assert.assertTrue(shoppingCartPage.proceedToCheckoutButton.isDisplayed());
	}

	@When("^Click Proceed to checkout button at the modal dialog$")
	public void click_Proceed_to_checkout_button_at_the_modal_dialog() throws Exception {
		shoppingCartSummaryPage = shoppingCartPage.clickOnProceedToCheckoutButton();
		// Wait until the page loaded and proceed to checkout button is visible
		waitUntilElementLocated(shoppingCartSummaryPage.proceedToCheckoutButton);
		// Assert true if the page is loaded and proceed to checkout button is visible
	    Assert.assertTrue(shoppingCartSummaryPage.proceedToCheckoutButton.isDisplayed());
	    int cartQuantity = getCartQuantity();
	    cartQuantity += 1;
	    // Assert true if expected items in the cart
	    Assert.assertEquals(Integer.toString(cartQuantity), shoppingCartPage.shoppingCartQuantity.getText());
	    System.out.println("cart quantity %s"+shoppingCartPage.shoppingCartQuantity.getText());
	    setCartQuantity(cartQuantity);
	}
}