package wooliesx.challenge.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import wooliesx.challenge.core.PageBase;

public class PaymentPage  extends PageBase {

	public PaymentPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css = "a[title='Pay by bank wire']")
	public WebElement payByBankWire;
	
	@FindBy(css = "a[title='Pay by check.']")
	public WebElement payBycheck;
	
	@FindBy(css = "a[title='Previous']")
	public WebElement continueShoppingBtn;
	
	
	//clicking on continue shopping btn
	
	
	public ShippingPage clickOnProceedToCheckoutButton()
	{
		continueShoppingBtn.click();
		
		return new  ShippingPage(driver);
	}
	
	
	public OrderSummaryPage clickOnPayByBankWire()
	{
		payByBankWire.click();
		return new OrderSummaryPage(driver);
	}
    
	
	
}

