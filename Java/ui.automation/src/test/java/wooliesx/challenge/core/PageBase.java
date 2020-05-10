package wooliesx.challenge.core;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public abstract class PageBase {
	protected WebDriver driver;
	private Actions actions;
	
	public PageBase(WebDriver driver) {
		this.driver = driver;
		actions = new Actions(driver);
		PageFactory.initElements(driver, this);
	}
	
	protected WebElement findElementByCss(String cssSelector)
	{
		return driver.findElement(By.cssSelector(cssSelector));
	}
	
	protected void invokeActionClick(WebElement element)
	{
		actions.moveToElement(element).click().perform();
	}
	
	protected void invokeJavaScriptClick(WebElement element)
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", element); 
	}
}
