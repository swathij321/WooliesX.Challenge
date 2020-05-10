package wooliesx.challenge.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import wooliesx.challenge.core.PageBase;

public class AuthenticationPage extends PageBase {

	public AuthenticationPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "email")
	public WebElement emailAddressBox;
	
	@FindBy(id = "passwd")
	public WebElement passwordBox;
	
	@FindBy(id = "SubmitLogin")
	public WebElement signinButton;
	
	// Invoke login
	public MyAccountPage login(String username, String password) {
		emailAddressBox.sendKeys(username);
		passwordBox.sendKeys(password);
		invokeActionClick(signinButton);
		
		return new MyAccountPage(driver);
	}

}