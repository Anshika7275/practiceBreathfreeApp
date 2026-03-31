package practicePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import baseClass.BaseClass2;
import io.appium.java_client.AppiumBy;

public class FullScreenTimeBasedScenarioTest extends BaseClass2{
	
	@Test
	public void healthCheckIns_SkipTest()
	{
		
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"skip\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Check-in Now\"]")).click();
		
		driver.findElement(AppiumBy.xpath("(//android.view.ViewGroup[@content-desc=\"2\"])[5]")).click();
		driver.findElement(AppiumBy.xpath("(//android.view.ViewGroup[@content-desc=\"1\"])[2]")).click();
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
				+ ".scrollIntoView(new UiSelector().text(\"In the past 7 days, how many days did you cough up mucus?\"))"));
		
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Click dropdown (Select button of specific question)
		WebElement dropdowns1 = wait1.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath(
				"//android.widget.TextView[contains(@text,'In the past 7 days, how many days did symptoms wake you at night?')]"
				+ "/ancestor::android.view.ViewGroup[2]//android.view.ViewGroup[@content-desc='Select']")));

		dropdowns1.click();

	    //Wait for options list & select value
		By valueLocator = AppiumBy.xpath("//android.widget.TextView[@text='5']");

		//WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));

		for (int i = 0; i < 5; i++) {
		    try {
		        WebElement value = wait1.until(
		                ExpectedConditions.visibilityOfElementLocated(valueLocator)
		        );
		        value.click();
		        break;
		    } catch (StaleElementReferenceException e) {
		        System.out.println("Retrying due to stale element...");
		    }
		}
		
		
//		option1.click();
		
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(5));
		//Second question
		WebElement dropdowns2 = wait2.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath(
				"//android.widget.TextView[contains(@text,'In the past 7 days, how many days did you cough up mucus?')]"
				+ "/ancestor::android.view.ViewGroup[2]//android.view.ViewGroup[@content-desc='Select']")));

		dropdowns2.click();

	    //Wait for options list & select value
		By valueLocator1 = AppiumBy.xpath("//android.widget.TextView[@text='3']");

		

		for (int i = 0; i < 3; i++) {
		    try {
		        WebElement value1 = wait2.until(
		                ExpectedConditions.visibilityOfElementLocated(valueLocator1)
		        );
		        value1.click();
		        break;
		    } catch (StaleElementReferenceException e) {
		    	
		        System.out.println("Retrying due to stale element...");
		    }
		}
		
		WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
		//third question
		WebElement dropdowns3 = wait3.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath(
				"//android.widget.TextView[contains(@text,'In the past 7 days, how many days did your symptoms stop you from attending school, work, or doing your usual daily activities?')]"
				+ "/ancestor::android.view.ViewGroup[2]//android.view.ViewGroup[@content-desc='Select']")));

		dropdowns3.click();

	    //Wait for options list & select value
		By valueLocator2 = AppiumBy.xpath("//android.widget.TextView[@text='7']");

		
		for (int i = 0; i < 7; i++) {
		    try {
		        WebElement value2 = wait3.until(
		                ExpectedConditions.visibilityOfElementLocated(valueLocator2)
		        );
		        value2.click();
		        break;
		    } catch (StaleElementReferenceException e) {
		        System.out.println("Retrying due to stale element...");
		    }
		}
		
		WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(10));
		// fourth question
		WebElement dropdowns4 = wait4.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath(
				"//android.widget.TextView[contains(@text,'In the past 7 days, how many days did you use your rescue inhaler?')]"
						+ "/ancestor::android.view.ViewGroup[2]//android.view.ViewGroup[@content-desc='Select']")));

		dropdowns4.click();

		// Wait for options list & select value
		By valueLocator4 = AppiumBy.xpath("//android.widget.TextView[@text='2']");

		
		for (int i = 0; i < 7; i++) {
		    try {
		        WebElement value4 = wait4.until(
		                ExpectedConditions.visibilityOfElementLocated(valueLocator4)
		        );
		        value4.click();
		        break;
		    } catch (StaleElementReferenceException e) {
		        System.out.println("Retrying due to stale element...");
		    }
		}
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
				+ ".scrollIntoView(new UiSelector().text(\"In the past 7 days, how many days did you use your rescue inhaler?\"))"));
		
		// Fifth question
		WebElement dropdowns5 = wait1.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath(
				"//android.widget.TextView[contains(@text,'Were your symptoms triggered by physical activity, stress, weather change, or allergen exposure during the past 7 days (dust, pollen, pets)?')]"
						+ "/ancestor::android.view.ViewGroup[2]//android.view.ViewGroup[@content-desc='Select']")));

		dropdowns5.click();

		WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(10));
		// Wait for options list & select value
		By valueLocator5 = AppiumBy.xpath("//android.widget.TextView[@text='3']");

		

		for (int i = 0; i < 3; i++) {
		    try {
		        WebElement value5 = wait5.until(
		                ExpectedConditions.visibilityOfElementLocated(valueLocator5)
		        );
		        value5.click();
		        break;
		    } catch (StaleElementReferenceException e) {
		        System.out.println("Retrying due to stale element...");
		    }
		}
		
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"No\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Submit\"]"));
		
		
	}
	
	

}
