package practicePackage;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import baseClass.BaseClass2;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class AddReminderTest extends BaseClass2 {

	@Test
	public void addReminderTest() throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath(
				"//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView")))
				.click();

		// Tap on add new reminder
		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Add new reminder\"]")))
				.click();

		// click on medicine reminder
		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Medicine Reminder\"]")))
				.click();

		// Choose the medicines
		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("(//android.widget.TextView[@text=\"Add\"])[2]"))).click();

		// save the reminder
		Thread.sleep(2000);
		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Save Reminder\"]")))
				.click();

		Thread.sleep(2000);

		// Tap on add new reminder again
		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Add new reminder\"]")))
				.click();
		
		String reminder = driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"Reminder already exists\"])[2]")).getText();
		
		if (reminder.contains("already exist")) {
			System.out.println(reminder);
		}
		
		else {
			
			// Click on BE reminder
			wait.until(ExpectedConditions
					.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Daily Check-in\"]")))
					.click();
	
			// choose reminder type
			wait.until(ExpectedConditions
					.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Weekly\"]"))).click();
	
			// save the reminder
			Thread.sleep(2000);
			wait.until(ExpectedConditions
					.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Save Reminder\"]")))
					.click();
		}
		
		wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath(
				"//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView")))
				.click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("(//android.widget.TextView[@text=\"EDIT\"])[1]"))).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Alternate days\"]"))).click();
		
		driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/com.horcrux.svg.SvgView")).click();
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
				+ ".scrollIntoView(new UiSelector().text(\"Regular\"))"));
		
		driver.findElement(AppiumBy.xpath("//android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup")).click();
		
		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Save Reminder\"]")))
				.click();
		
		driver.findElement(AppiumBy.xpath(
				"//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup"))
				.click();
		
		driver.pressKey(new KeyEvent(AndroidKey.BACK));

	}

}
