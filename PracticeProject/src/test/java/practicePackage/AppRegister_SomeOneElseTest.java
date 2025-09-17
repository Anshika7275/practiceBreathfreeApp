package practicePackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import baseClass.BaseClass2;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class AppRegister_SomeOneElseTest extends BaseClass2 {
	
	@Test
	public void loginToAccount() throws Throwable {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Cancel\"]")).click();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("(//android.widget.LinearLayout[@resource-id=\"com.google.android.gms:id/phone_number_list_item\"])[1]")))
				.click();

		WebElement ph_no = driver.findElement(AppiumBy.xpath("//android.widget.EditText"));
		ph_no.clear();
		ph_no.sendKeys("9999999905");
		
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Continue\"]")).click();

		Thread.sleep(2000);
		//List<WebElement> otpFields = driver.findElements(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup[3]/android.view.ViewGroup[2]"));

		List<WebElement> otpFields = driver.findElements(AppiumBy.xpath("//android.widget.EditText"));
		
		String otp = "1122";
		
		if (otpFields.size() == 1) {
		    otpFields.get(0).clear();
		    otpFields.get(0).sendKeys(otp);
		} 
		
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Verify\"]")).click();
		System.out.println("Logged in successfully!!!!!");
	}

	@Test
	public void LoginToApp() throws Throwable {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("(//android.widget.TextView[@text=\"English\"])[1]"))).click();

		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Next\"]"))).click();

		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Someone else\"]"))).click();
		
	}

	@Test
	public void detailsStep1() throws Throwable {
		
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Someone else\"]")).click(); //Optional

		Thread.sleep(1000);
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Eg. Meera Kumar\"]")).sendKeys("Testing");
		
		driver.findElement(AppiumBy.xpath(
				"//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup"))
				.click();
		
		//relation
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Eg. Parent\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Child\"]")).click();
		
		//Choose DOB
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

		//Height
		Thread.sleep(1000);
		WebElement FEET = driver.findElement(AppiumBy.xpath("(//android.widget.EditText[@text=\"0\"])[1]"));
		FEET.click();
		FEET.sendKeys("5");

		WebElement INCH = driver.findElement(AppiumBy.xpath("(//android.widget.EditText[@text=\"0\"])[1]"));
		INCH.click();
		INCH.sendKeys("5");

		//Weight
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
		
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Diabetes\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Next\"]")).click();
		
		
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

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath(
				"//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]")))
				.click();

//		Thread.sleep(4000);
//		
//		driver.findElement(AppiumBy.xpath(
//				"//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]"))
//				.click();
		
		System.out.println("FTUX skipped successfully!!!!");

	}

}
