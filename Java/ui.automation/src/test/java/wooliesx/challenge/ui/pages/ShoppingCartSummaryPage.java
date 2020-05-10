package wooliesx.challenge.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import wooliesx.challenge.core.PageBase;

public class ShoppingCartSummaryPage extends PageBase {

	public ShoppingCartSummaryPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css = "span[title='Continue shopping']")
	public WebElement continueShoppingButton;
	
	@FindBy(css = "p.cart_navigation a[title='Proceed to checkout']")
	public WebElement proceedToCheckoutButton;
	
	
	//click on Contiune shopping button
	
	public ItemDetailsPage clickOnContinueShoppingButton()
	{
		continueShoppingButton.click();
		
		return new  ItemDetailsPage(driver);
	}
	
	public AddressPage clickOnProceedToCheckoutButton()
	{
		proceedToCheckoutButton.click();
		
		return new  AddressPage(driver);
	}
}
