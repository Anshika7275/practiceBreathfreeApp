package practicePackage;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import baseClass.BaseClass2;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class AppRegisterTest extends BaseClass2 {

	@Test
	public void LoginToApp() throws Throwable {

		Thread.sleep(5000);

		driver.findElement(AppiumBy.xpath(
				"//android.widget.TextView[@resource-id=\"com.google.android.gms:id/phone_number\" and @text=\"086578 99587\"]"))
				.click();

		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		//driver.pressKey(new KeyEvent(AndroidKey.BACK));

		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Continue\"]")).click();

		System.out.println("Successfully Login to app!!!!!!!!");

		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath(
				"//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]"))
				.click();
		
		Thread.sleep(1000);
		driver.findElement(AppiumBy.xpath(
				"//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]"))
				.click();
		
	}

	@Test
	public void detailsStep1() throws Throwable {

		Thread.sleep(1000);
		driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]")).click();

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

		driver.findElement(
				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));

		Thread.sleep(1000);
		WebElement FEET = driver.findElement(AppiumBy.xpath("(//android.widget.EditText[@text=\"0\"])[1]"));
		FEET.click();
		FEET.sendKeys("5");

		WebElement INCH = driver.findElement(AppiumBy.xpath("(//android.widget.EditText[@text=\"0\"])[1]"));
		INCH.click();
		INCH.sendKeys("5");

		Thread.sleep(1000);
		WebElement WEIGHT = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"0\"]"));
		WEIGHT.click();
		WEIGHT.sendKeys("50");

		driver.hideKeyboard();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Next\"]")).click();

		System.out.println("Entered details successfully!!!!!!!!!");
	}

	@Test
	public void detailsStep2() throws Throwable {

		Thread.sleep(3000);
		driver.findElement(AppiumBy.xpath(
				"//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]"))
				.click();
		driver.findElement(AppiumBy.xpath(
				"//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[7]"))
				.click();

		System.out.println("Successfully select the cohort!!!");

		Thread.sleep(3000);
		driver.findElement(AppiumBy.xpath(
				"//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]"))
				.click();
		driver.findElement(AppiumBy.xpath(
				"//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]"))
				.click();

		System.out.println("Successfully entered duration!!!");

		driver.findElement(AppiumBy.xpath(
				"//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]"))
				.click();
		driver.findElement(AppiumBy.xpath(
				"//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]"))
				.click();
		driver.findElement(AppiumBy.xpath(
				"//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]"))
				.click();

		System.out.println("Successfully enter the conditions!!!!");
	}

	@Test
	public void detailsStep3() throws InterruptedException {
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"No, I dont use any Inhaler\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Next\"]")).click();

		Thread.sleep(4000);
		driver.findElement(AppiumBy.xpath("//android.view.View")).click();

		System.out.println("Registered successfully!!!!!!");

	}

	@Test
	public void skipFTUX() throws Throwable {

		Thread.sleep(4000);
		driver.findElement(AppiumBy.xpath(
				"//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]"))
				.click();
		
		System.out.println("FTUX skipped successfully!!!!");

	}

}
