package practicePackageOld;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import baseClass.BaseClass2;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class HomePage extends BaseClass2 {

	@Test
	public void ucapTest() throws Throwable {

		driver.findElement(AppiumBy.xpath(
				"//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.ScrollView/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView"))
				.click();
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@text=\"Continue >\"]")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement age = wait
				.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.EditText")));

		age.click();
		age.clear();

		Thread.sleep(1000);
		// age.sendKeys("24");

		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_2));
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_4));
		driver.hideKeyboard();

		driver.findElement(AppiumBy.xpath("//android.widget.RadioButton[@text=\"No\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.view.View[@resource-id=\"root\"]/android.view.View[7]")).click();

		driver.findElement(AppiumBy.xpath("//android.view.View[@resource-id=\"root\"]/android.view.View[8]")).click();
		driver.findElement(AppiumBy.xpath("//android.view.View[@resource-id=\"root\"]/android.view.View[9]")).click();

//		driver.findElement(
//				MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" + ".flingToEnd(10)"));
		
		driver.findElement(AppiumBy.androidUIAutomator(
			    "new UiScrollable(new UiSelector().scrollable(true)).flingToEnd(10)"
			));

		driver.findElement(AppiumBy.xpath("//android.view.View[@resource-id=\"root\"]/android.view.View[10]")).click();
		driver.findElement(AppiumBy.xpath("//android.view.View[@resource-id=\"root\"]/android.view.View[11]")).click();

		driver.findElement(AppiumBy.xpath("//android.widget.Button[@text=\"Next\"]")).click();

		driver.findElement(AppiumBy.xpath("//android.view.View[@resource-id=\"root\"]/android.view.View[3]")).click();
		driver.findElement(AppiumBy.xpath("//android.view.View[@resource-id=\"root\"]/android.view.View[6]")).click();

//		driver.findElement(
//				MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" + ".flingToEnd(10)"));
		
		driver.findElement(AppiumBy.androidUIAutomator(
			    "new UiScrollable(new UiSelector().scrollable(true)).flingToEnd(10)"
			));

		driver.findElement(AppiumBy.xpath("(//android.widget.Button[@text=\"0\"])[1]")).click();
		driver.findElement(AppiumBy.xpath("(//android.widget.Button[@text=\"2\"])[2]")).click();
		driver.findElement(AppiumBy.xpath("(//android.widget.Button[@text=\"5\"])[3]")).click();

		driver.findElement(AppiumBy.xpath("//android.widget.Button[@text=\"Next\"]")).click();

		driver.findElement(AppiumBy.xpath("//android.view.View[@resource-id=\"root\"]/android.view.View[3]")).click();
		driver.findElement(AppiumBy.xpath("//android.view.View[@resource-id=\"root\"]/android.view.View[6]")).click();

//		driver.findElement(
//				MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" + ".flingToEnd(10)"));
		
		driver.findElement(AppiumBy.androidUIAutomator(
			    "new UiScrollable(new UiSelector().scrollable(true)).flingToEnd(10)"
			));

		driver.findElement(AppiumBy.xpath("//android.view.View[@resource-id=\"root\"]/android.view.View[6]")).click();

		driver.findElement(AppiumBy.xpath("//android.widget.Button[@text=\"Calculate\"]")).click();

		driver.findElement(
				AppiumBy.xpath("//android.view.View[@content-desc=\"Yes, help me find a Breathefree clinic\"]"))
				.click();

		Thread.sleep(2000);
		WebElement back = driver.findElement(AppiumBy.xpath("//com.horcrux.svg.SvgView"));
		back.click();
		back.click();
		back.click();
		back.click();

	}

	@Test
	public void healthCheckinTest() throws Throwable {

		driver.findElement(AppiumBy.xpath(
				"//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]"))
				.click();
		driver.findElement(AppiumBy.xpath(
				"//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]"))
				.click();

		driver.findElement(AppiumBy.xpath(
				"//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]"))
				.click();

//		driver.findElement(
//				MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" + ".flingToEnd(10)"));
		
		driver.findElement(AppiumBy.androidUIAutomator(
			    "new UiScrollable(new UiSelector().scrollable(true)).flingToEnd(10)"
			));

		driver.findElement(AppiumBy.xpath(
				"//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]"))
				.click();
		driver.findElement(AppiumBy.xpath(
				"//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]"))
				.click();
		driver.findElement(AppiumBy.xpath(
				"//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]"))
				.click();

		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Submit\"]")).click();
		driver.findElement(AppiumBy.xpath(
				"//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]"))
				.click();

		Thread.sleep(1000);
//		driver.findElement(
//				MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" + ".flingToEnd(10)"));
		
		driver.findElement(AppiumBy.androidUIAutomator(
			    "new UiScrollable(new UiSelector().scrollable(true)).flingToEnd(10)"
			));

		driver.findElement(AppiumBy.xpath(
				"//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup"))
				.click();

		driver.findElement(AppiumBy.xpath(
				"//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup"))
				.click();

	}

	@Test
	public void bottomTabTest() throws Throwable {

		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath(
				"//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.View/android.view.ViewGroup[3]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView[3]"))
				.click();

		Thread.sleep(3000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Request a call\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Confirm\"]")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Okay\"]"))).click();

		//navigate to services page 
		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.view.View/android.view.ViewGroup[5]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.RectView[1]"))).click();

        //navigate to diet page
		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView"))).click();
		
		//navigate back to services page
		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup"))).click();

		// navigate to Home page
		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.view.View/android.view.ViewGroup[1]"))).click();

		// navigate to reward hub page
		wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath(
				"//android.view.View/android.view.ViewGroup[1]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView")))
				.click();

		//navigate to exercise page
		wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath(
				"//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView")))
				.click();

		//navigate back to reward hub page
		wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.widget.ImageView"))).click();

		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//com.horcrux.svg.PathView")).click();

		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//com.horcrux.svg.SvgView")).click();

	}
}
