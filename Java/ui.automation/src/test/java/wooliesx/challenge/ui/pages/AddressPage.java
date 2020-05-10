package wooliesx.challenge.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import wooliesx.challenge.core.PageBase;

public class AddressPage extends PageBase {

	public AddressPage(WebDriver driver) {
		
		super(driver);
	}
	
	@FindBy(css = "a[title='Previous']")
	public WebElement continueShoppingBtn;
	
	@FindBy(css = "button[name='processAddress']")
	public WebElement proceedToCheckoutButton;
	
	
	// click on continue shopping btn
	 	public ShoppingCartSummaryPage clickOnContinueShoppingBtn() {
	 		
	 		continueShoppingBtn.click();
	 		
	 		return new ShoppingCartSummaryPage(driver);
	 	}
	 	
	public ShippingPage clickOnProceedToCheckoutButton() {
	 		
		proceedToCheckoutButton.click();
	 		
	 		return new ShippingPage(driver);
	 	}
	
	
	
}