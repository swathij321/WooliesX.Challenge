package wooliesx.challenge.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import wooliesx.challenge.core.PageBase;

public class ShippingPage extends PageBase {

	public ShippingPage(WebDriver driver) {
		
		super(driver);
	}
	
	@FindBy(css = "td.delivery_option_radio")
	public WebElement delivaryOptionRadioBtn;
	
	@FindBy(css = "#uniform-cgv input")
	public WebElement termsConditionsCheckbox;
	
	@FindBy(css = "button[name='processCarrier']")
	public WebElement proceedToCheckoutButton;
	
	
	@FindBy(css = "a[title='Previous']")
	public WebElement continueShoppingBtn;
	
	
	//verify  delivary option radio btn is dispalying
	
	public boolean verifyDelivaryOptionRadioBtn()
	
	{
		delivaryOptionRadioBtn.isDisplayed();
		
		return true;
	}
		
	//clicking the terms and conditions checkbox
		
	public void clickTermsConditionsCheckbox()
	
	{
		invokeActionClick(termsConditionsCheckbox);
		
	}
		
	// click the proceed to checkout btn
		
	public PaymentPage clickOnProceedToCheckoutButton()
	
	{
		proceedToCheckoutButton.click();
		
		return new  PaymentPage(driver);
	}
		
	// click on the continue shopping button 
		
	public AddressPage clickOnContinueShoppingButton()			
	 {
		continueShoppingBtn.click();
				
		return new  AddressPage(driver);
		
	  }
				
		
		
		
	
	
}


