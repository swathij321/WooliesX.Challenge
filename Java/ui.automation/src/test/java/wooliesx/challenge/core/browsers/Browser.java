package wooliesx.challenge.core.browsers;

import org.openqa.selenium.WebDriver;

import wooliesx.challenge.resources.utilities.ResourceHelper;

public abstract class Browser {
	public Browser(String driverKey, String driver) {
		System.setProperty(driverKey, ResourceHelper.getResourcePath("drivers/" + driver));
	}
	
	public abstract WebDriver getDriver();
}
