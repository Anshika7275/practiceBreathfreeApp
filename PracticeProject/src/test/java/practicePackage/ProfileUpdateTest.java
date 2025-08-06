package practicePackage;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import baseClass.BaseClass2;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class ProfileUpdateTest extends BaseClass2 {
	
	@Test
	public void profileUpdateTest()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath(
				"//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageView")))
				.click();

		// tap on profile description
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Profile description\"]")).click();

		// click on yes
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Yes\"]")).click();

		// click on have lung condition
		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Have a lung condition\"]")))
				.click();

		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Asthma\"]"))).click();
		
		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"1 year or less\"]"))).click();
		
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Diabetes\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"High Blood Pressure\"]")).click();
		
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Next\"]")).click();
		
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Track lung health\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Learn about lung health\"]")).click();
		
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Next\"]")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Get started\"]"))).click();
		
		//nav back to home page from profile

		wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath(
				"//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageView")))
				.click();
		
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
	}

}
