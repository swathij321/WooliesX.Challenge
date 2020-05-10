package wooliesx.challenge.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import wooliesx.challenge.core.PageBase;

public class ItemDetailsPage extends PageBase {
	
	public  ItemDetailsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css = "button[name='Submit']")
	public WebElement addToCartButton;
	
	
	//selected item added to shopping cart 
	
	public ShoppingCartPage clickOnAddToShoppingButton()
	{
		addToCartButton.click();
		
		return new  ShoppingCartPage(driver);
	}
}