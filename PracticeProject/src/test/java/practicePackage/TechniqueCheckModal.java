package practicePackage;

import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import baseClass.BaseClass2;
import io.appium.java_client.AppiumBy;

public class TechniqueCheckModal extends BaseClass2{
	
	@Test
	public void cancelModal()
	{

		    WebDriverWait shortWait = new WebDriverWait(driver, Duration.ofSeconds(5));
		    
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

			By homeTab = AppiumBy.accessibilityId("Home");

			// Step 1: Safely click Home (no condition needed)
			try {
				WebElement home = wait.until(ExpectedConditions.presenceOfElementLocated(homeTab));

				((JavascriptExecutor) driver).executeScript("mobile: clickGesture",
						Map.of("elementId", ((RemoteWebElement) home).getId()));

				System.out.println("Clicked Home tab");
			} catch (Exception e) {
				System.out.println("Home click skipped");
			}

		    try {

		        // Check if popup is displayed
		        By popup = AppiumBy.accessibilityId("Bottom Sheet");

		        shortWait.until(ExpectedConditions.visibilityOfElementLocated(popup));

		        System.out.println("Popup is displayed");

		        // Click cross icon
		        By closeIcon = AppiumBy.xpath(
		                "//android.widget.ImageView");

		        shortWait.until(ExpectedConditions.elementToBeClickable(closeIcon))
		                .click();

		        System.out.println("Popup closed");

		        Thread.sleep(2000);

		    } catch (Exception e) {

		        System.out.println("Popup not displayed");
		    }

		    // Continue with Track Usage flow
		    By trackUsageCTA = AppiumBy.xpath(
		            "//android.widget.TextView[@text='Track usage']");

		    shortWait.until(ExpectedConditions.elementToBeClickable(trackUsageCTA))
		            .click();

		    System.out.println("Clicked on Track usage");
	}

}
