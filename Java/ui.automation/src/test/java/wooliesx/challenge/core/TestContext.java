package wooliesx.challenge.core;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import wooliesx.challenge.core.browsers.Browser;
import wooliesx.challenge.core.utilities.BrowserHelper;

public class TestContext {
	public static WebDriver driver;
	private static Map<String, Object> scenarioContext;
	
	public static void setup(String browserName)
	{
		if(scenarioContext == null)
		{
			scenarioContext = new HashMap<>();
		}
		
		if(driver == null)
		{
			// Create browser instance based on configurations
			Browser browser = getBrowser(browserName);
			// Create web driver
			driver = browser.getDriver();
		}
	}
	
	public static void setContext(String key, Object value) {
        scenarioContext.put(key, value);
    }
	 
    public static Object getContext(String key){
    	return scenarioContext.get(key);
    }

    public static Boolean isContains(String key){
        return scenarioContext.containsKey(key);
    }
	
	// Get Browser from configurations
	private static Browser getBrowser(String browserName) {
		return BrowserHelper.getBrowser(browserName);
	}
}
