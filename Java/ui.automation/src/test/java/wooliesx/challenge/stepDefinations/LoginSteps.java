package wooliesx.challenge.stepDefinations;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import wooliesx.challenge.core.TestBase;
import wooliesx.challenge.core.utilities.Configuration;
import wooliesx.challenge.ui.pages.AuthenticationPage;
import wooliesx.challenge.ui.pages.HomePage;
import wooliesx.challenge.ui.pages.MyAccountPage;

public class LoginSteps extends TestBase
{
	private HomePage homePage;
	private AuthenticationPage authenticationPage;
	private MyAccountPage myAccountPage;
	
	public LoginSteps(Configuration configuration) {
		super(configuration);
	}
	
	@Given("^I am on the Landing page$")
	public void i_am_on_the_Landing_page() throws Exception {
		if(homePage == null)
		{
			homePage = new HomePage(driver);
		}
		// Wait until the page loaded and shopping cart link is visible
		waitUntilElementLocated(homePage.shoppingCart);
		// Assert true if the page is loaded and shopping cart link is visible
	    Assert.assertTrue(homePage.shoppingCart.isDisplayed());
	}

	@Given("^I click sign in link and Go to Sign In page$")
	public void i_click_sign_in_link_and_Go_to_Sign_In_page() throws Exception {
		if(hasSignedIn())	// User already logged in
		{
			// Wait until the page loaded and sign out link is visible
			waitUntilElementLocated(homePage.signOutLink);
			// Assert true if the page is loaded and sign out link is visible
		    Assert.assertTrue(homePage.signOutLink.isDisplayed());
		}
		else	// User not logged in
		{
			authenticationPage = homePage.clickOnSigninLink();
			// Wait until the page loaded and email address textbox is visible
			waitUntilElementLocated(authenticationPage.emailAddressBox);
			// Assert true if the page is loaded and email address textbox is visible
		    Assert.assertTrue(authenticationPage.emailAddressBox.isDisplayed());
		}
	}

	@Given("^I enter valid email address \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void i_enter_valid_email_address_and_password(String emailAddress, String password) throws Exception {
		if(hasSignedIn())	// User already logged in
		{
			myAccountPage = homePage.clickOnMyAccount();
		}
		else	// User not logged in
		{
			myAccountPage = authenticationPage.login(emailAddress, password);
			setSignedIn();
		}
		
		// Wait until the page loaded and menu is visible
		waitUntilElementLocated(myAccountPage.menu);
		// Assert true if the page is loaded and title is My account
	    Assert.assertEquals(driver.getTitle(), "My account - My Store");
	}
}
