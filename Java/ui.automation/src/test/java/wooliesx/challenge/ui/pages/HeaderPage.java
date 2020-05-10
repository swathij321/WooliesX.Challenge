package wooliesx.challenge.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import wooliesx.challenge.core.PageBase;

public class HeaderPage extends PageBase {

	public HeaderPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css = "a.login")
	public WebElement signInLink;
	
	@FindBy(css = "a.logout")
	public WebElement signOutLink;
	
	@FindBy(css = "a.account")
	public WebElement accountLink;
	
	@FindBy(css = "div.shopping_cart a")
	public WebElement shoppingCart;
	
	@FindBy(css = "div.shopping_cart a span[class='ajax_cart_quantity']")
	public WebElement shoppingCartQuantity;
	
	@FindBy(css = "div#block_top_menu a[title='Women']")
	public WebElement menu;
	
	// click on login
	public AuthenticationPage clickOnSigninLink() {
		
		signInLink.click();
		
		return new AuthenticationPage(driver);
	}
	
	//navigates to Women menu
	public CatalogPage clickOnWomenMenu() {	
		menu.click();
		return new CatalogPage(driver);
	}
	
	//navigates to my account
	public MyAccountPage clickOnMyAccount() {	
		accountLink.click();
		return new MyAccountPage(driver);
	}
	
	//navigates to shopping cart
	public ShoppingCartSummaryPage clickOnShoppingCart() {	
		shoppingCart.click();
		return new ShoppingCartSummaryPage(driver);
	}	
}
