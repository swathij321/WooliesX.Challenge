package wooliesx.challenge.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import wooliesx.challenge.core.PageBase;

public class DashboardPage extends PageBase {

	public DashboardPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(linkText = "Logout")
	public WebElement logoutButton;
}

