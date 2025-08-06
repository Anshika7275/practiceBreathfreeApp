package practicePackage;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import baseClass.BaseClass2;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class ExercisePageTest extends BaseClass2 {

	@Test
	public void exercisePageTest() throws InterruptedException {
		
		// nav to BE page
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.findElement(AppiumBy.xpath(
				"//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.View/android.view.ViewGroup[2]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView"))
				.click();

		// nav to BHT
		wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath(
				"//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup")))
				.click();

		// Start exercise
		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.Button[@text=\"Play Start\"]"))).click();

		Thread.sleep(20000);
		// Resume exercise
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(40));
		wait1.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.Button[@text=\"Stop Stop\"]"))).click();

		// navigate back to BE page
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@text=\"Back Arrow Icon\"]")).click();

		// Navigate to home page
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Home\"]")).click();

		Thread.sleep(1000);
		driver.findElement(AppiumBy.xpath(
				"//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageView"))
				.click();

		// back to BE page
		driver.findElement(AppiumBy.xpath(
				"//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup"))
				.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(
				AppiumBy.xpath("//android.view.View[@resource-id=\"root\"]/android.view.View[1]"))).click();

		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
				+ ".scrollIntoView(new UiSelector().text(\"Unlock Now\"))"));

		// click on unlock now cta
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Unlock Now\"]")).click();

		// close the payment page
		driver.findElement(AppiumBy.xpath(
				"//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView"))
				.click();
		
		//nav back to test page
		driver.findElement(AppiumBy.xpath("//com.horcrux.svg.GroupView")).click();
		
		// nav back to profile
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@text=\"Back Arrow Icon\"]")).click();
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
				+ ".scrollIntoView(new UiSelector().text(\"Logout\"))"));
		
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Logout\"]")).click();
		
		
		
	}
}
