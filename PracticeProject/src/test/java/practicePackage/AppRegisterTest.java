package practicePackage;

import java.time.Duration;
import java.util.List;
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


public class AppRegisterTest extends BaseClass2 {

	@Test
	public void LoginToApp() throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		Thread.sleep(1000);
		driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Cancel\"]")).click();
		// driver.pressKey(new KeyEvent(AndroidKey.BACK));

		WebElement ph_no = driver.findElement(AppiumBy.xpath("//android.widget.EditText"));
		ph_no.clear();
		ph_no.click();
		ph_no.sendKeys("9999999901");

		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Continue\"]")).click();

		Thread.sleep(1000);
		List<WebElement> otpFields = driver.findElements(AppiumBy.xpath("//android.widget.EditText"));

		String otp = "1122";

		if (otpFields.size() == 1) {
			otpFields.get(0).clear();
			otpFields.get(0).sendKeys(otp);
		}

		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Verify\"]")).click();
		System.out.println("Logged in successfully!!!!!");
		
		driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"English, English\"]")).click();
		
		WebElement nextCTA = driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Next\"]"));
		
		wait.until(ExpectedConditions.visibilityOf(nextCTA));
		
		try 
		{
			Thread.sleep(4000);
			wait.until(ExpectedConditions.elementToBeClickable(nextCTA));
			nextCTA.click();

		} 
		catch (Exception e) 
		{
		    ((JavascriptExecutor) driver).executeScript("mobile: clickGesture", Map.of(
		            "elementId", ((RemoteWebElement) nextCTA).getId()));
		}
		
		System.out.println("Language selected successfully !!!");

		WebElement whoYouAreUsing = driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Myself\"]"));

		try 
		{
			Thread.sleep(1000);
			whoYouAreUsing.click();
		} 
		catch (Exception e) 
		{
		    ((JavascriptExecutor) driver).executeScript("mobile: clickGesture", Map.of(
		            "elementId", ((RemoteWebElement) whoYouAreUsing).getId() ));
		}
		
		System.out.println("who are you using this app selected successfully !!!");
	}

	@Test
	public void detailsStep1() throws Throwable {

		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		Thread.sleep(1000);
		driver.findElement(
				AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]")).click();

		Thread.sleep(1000);
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Eg. Meera Kumar\"]")).sendKeys("Testing");
		driver.findElement(AppiumBy.xpath(
				"//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup"))
				.click();

		WebElement DD = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"DD\"]"));
		DD.click();
		DD.sendKeys("11");

		WebElement MM = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"MM\"]"));
		MM.click();
		MM.sendKeys("12");

		WebElement YY = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"YYYY\"]"));
		YY.click();
		YY.sendKeys("2000");

		driver.hideKeyboard();

		driver.findElement(
				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));

		WebElement FEET = driver.findElement(AppiumBy.xpath("(//android.widget.EditText[@text=\"0\"])[1]"));
		FEET.click();
		FEET.sendKeys("5");

		WebElement INCH = driver.findElement(AppiumBy.xpath("(//android.widget.EditText[@text=\"0\"])[1]"));
		INCH.click();
		INCH.sendKeys("5");

		WebElement WEIGHT = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"0\"]"));
		WEIGHT.click();
		WEIGHT.sendKeys("50");

		driver.hideKeyboard();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Next\"]")).click();

		System.out.println("Entered details successfully!!!!!!!!!");
	}

	@Test
	public void detailsStep2() throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		Thread.sleep(1000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Asthma\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Next\"]")).click();

		System.out.println("Successfully select the cohort!!!");

		Thread.sleep(1000);
		driver.findElement(AppiumBy.xpath(
				"//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]"))
				.click();
		driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Next\"]")).click();

		System.out.println("Successfully entered duration!!!");

		driver.findElement(AppiumBy.xpath(
				"//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]"))
				.click();
		driver.findElement(AppiumBy.xpath(
				"//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]"))
				.click();
		
		WebElement next = driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Next\"]"));
		
		try 
		{
			wait.until(ExpectedConditions.elementToBeClickable(next));
		    next.click();
		} 
		catch (Exception e) 
		{
		    ((JavascriptExecutor) driver).executeScript("mobile: clickGesture", Map.of(
		            "elementId", ((RemoteWebElement) next).getId()));
		}

		System.out.println("Successfully enter the Symptoms!!!!");

		driver.findElement(
				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));

		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Any Cardiac Issue\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"None of the above\"]")).click();

		driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Next\"]")).click();

		System.out.println("Successfully enter the condition!!!");

	}

	@Test
	public void detailsStep3() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"No, I dont use any Inhaler\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Next\"]")).click();

		Thread.sleep(2000);
		WebElement continueCTA = driver.findElement(AppiumBy.xpath("//android.view.View"));

		wait.until(ExpectedConditions.visibilityOf(continueCTA));
		
		try 
		{
			wait.until(ExpectedConditions.elementToBeClickable(continueCTA));
			continueCTA.click();
		} 
		catch (Exception e) 
		{
		    ((JavascriptExecutor) driver).executeScript("mobile: clickGesture", Map.of(
		            "elementId", ((RemoteWebElement) continueCTA).getId()));
		}
		
		System.out.println("Registered successfully!!!!!!");

	}

}
