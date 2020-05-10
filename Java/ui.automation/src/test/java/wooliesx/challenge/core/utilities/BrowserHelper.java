package wooliesx.challenge.core.utilities;

import wooliesx.challenge.core.browsers.Browser;
import wooliesx.challenge.core.browsers.ChromeBrowser;
import wooliesx.challenge.core.browsers.FirefoxBrowser;
import wooliesx.challenge.core.browsers.IEBrowser;

public class BrowserHelper {
	// Create browser instance
	public static Browser getBrowser(String browserName) {
		switch (browserName.toLowerCase()) {
			case "firefox":
				return new FirefoxBrowser();
			case "internetexplorer":
			case "ie":
				return new IEBrowser();
			case "chrome":
			default:
				return new ChromeBrowser();
		}
	}
}
