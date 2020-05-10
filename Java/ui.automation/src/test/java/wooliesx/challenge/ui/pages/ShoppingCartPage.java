package wooliesx.challenge.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends HeaderPage {

	public ShoppingCartPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css = "span[title='Continue shopping']")
	public WebElement continueShoppingButton;
	
	@FindBy(css = "a[title='Proceed to checkout']")
	public WebElement proceedToCheckoutButton;
	
	
	//click on Continue shopping button
	
	public ItemDetailsPage clickOnContinueShoppingButton()
	{
		continueShoppingButton.click();
		
		return new  ItemDetailsPage(driver);
	}
	
	
	//click on proceed to checkout button
	
	public ShoppingCartSummaryPage clickOnProceedToCheckoutButton()
	{
		proceedToCheckoutButton.click();
		
		return new  ShoppingCartSummaryPage(driver);
	}
	
	
}
