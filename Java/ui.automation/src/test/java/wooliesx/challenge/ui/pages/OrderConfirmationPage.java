package wooliesx.challenge.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderConfirmationPage extends HeaderPage {

	public OrderConfirmationPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//p[@class='cheque-indent']/strong[contains(text(),'Your order on My Store is complete.')]")
	public WebElement confirmOrderMessage;
}