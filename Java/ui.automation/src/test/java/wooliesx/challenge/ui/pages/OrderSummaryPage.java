package wooliesx.challenge.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import wooliesx.challenge.core.PageBase;

public class OrderSummaryPage extends PageBase {

	public OrderSummaryPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(linkText = "Other payment method")
	WebElement OtherPaymentMethod;
	
	
	@FindBy(xpath = "//button/span[contains(text(),'I confirm my order')]")
	public WebElement confirmMyOrderButton;
	
	// clicking on confirm order btn
	
	public OrderConfirmationPage clickOnConfirmButton()
	{
		confirmMyOrderButton.click();
		
		return new  OrderConfirmationPage(driver);
	}
    
	
	
	
}
