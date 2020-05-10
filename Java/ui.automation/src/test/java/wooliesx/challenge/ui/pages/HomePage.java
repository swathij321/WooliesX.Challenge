package wooliesx.challenge.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends HeaderPage {
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css = "img[alt='Printed Chiffon Dress']")
	public WebElement item1;
    
   // click on Item
 	public ItemDetailsPage clickOnItem(String itemName) 
 	{
 		WebElement item = findElementByCss(String.format("img[alt='" + itemName + "']"));
 		invokeJavaScriptClick(item);
 		
 		return new ItemDetailsPage(driver);
 	}	
}

