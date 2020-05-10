package wooliesx.challenge.core.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import javax.imageio.ImageIO;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Utilities {
	public static void waitUntilElementLocated(WebDriver driver, WebElement element, int pageTimeOutInSeconds) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(pageTimeOutInSeconds))
				.pollingEvery(Duration.ofMillis(250))
			    .ignoring(NoSuchElementException.class)
			    .ignoring(ElementNotVisibleException.class)
			    .ignoring(StaleElementReferenceException.class);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void saveScreenshotsForScenario(WebDriver driver) {
        try {
        	/*File screenshot = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshot, new File(String.format("./target/screenshots/WooliesX-%s.png", 
            		new SimpleDateFormat("yyyyMMdd-HHmmssSSS").format(new Date()))));*/
        	
        	String fileName = String.format("./target/screenshots/WooliesX-%s.png", 
            		new SimpleDateFormat("yyyyMMdd-HHmmssSSS").format(new Date()));
            
            Screenshot screenshot = new AShot().shootingStrategy(
            		ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
            ImageIO.write(screenshot.getImage(), "PNG", new File(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}
