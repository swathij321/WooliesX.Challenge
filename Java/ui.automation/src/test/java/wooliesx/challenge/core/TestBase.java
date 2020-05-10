package wooliesx.challenge.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.Scenario;
import wooliesx.challenge.core.interfaces.IConfiguration;
import wooliesx.challenge.core.utilities.Configuration;
import wooliesx.challenge.core.utilities.Utilities;

public abstract class TestBase {
	protected WebDriver driver;
	protected IConfiguration configuration;
	
	private String KeySignedIn = "signedIn";
	private String KeyCartQuantity = "cartQuantity";
	
	public TestBase(Configuration configuration) {
		// Load configurations
		this.configuration = configuration;
		driver = TestContext.driver;
	}
	
	// Setup Web driver
	public void setup(Scenario scenario)
	{
		if(driver == null)
		{
			TestContext.setup(configuration.get("browser"));
			driver = TestContext.driver;
			driver.manage().window().maximize();
			// Open browser and load the landing page
			driver.get(configuration.get("testHost"));
		}
	}
	
	// Dispose Web Driver
	public void teardown(Scenario scenario, Boolean quit)
	{
		if(driver != null) {
			// In case of failed test, take screenshot
			saveScreenshotsForScenario();
			
			if(quit)
			{
				// Quit the driver
				driver.quit();
			}
		}
	}
	
	public void setSignedIn()
	{
		TestContext.setContext(KeySignedIn, true);
	}
	
	public Boolean hasSignedIn()
	{
		Object signedIn = TestContext.getContext(KeySignedIn);
		return signedIn != null && (Boolean)signedIn;
	}
	
	public void setCartQuantity(int quantity)
	{
		TestContext.setContext(KeyCartQuantity, quantity);
	}
	
	public int getCartQuantity()
	{
		Object quantity = TestContext.getContext(KeyCartQuantity);
		return quantity == null ? 0 : (int)quantity;
	}
	
	public void waitUntilElementLocated(WebElement element) {
		int pageTimeOutInSeconds = Integer.parseInt(configuration.get("pageTimeOutInSeconds"));
		Utilities.waitUntilElementLocated(driver, element, pageTimeOutInSeconds);
	}
	
	// Take screenshot
	public void saveScreenshotsForScenario() {
        Utilities.saveScreenshotsForScenario(driver);
    }
}
