package practicePackage;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import baseClass.BaseClass2;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class AppLoginTest extends BaseClass2{

	@Test
	public void loginTest() throws Throwable
	{
		
		Thread.sleep(1000);
		driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Cancel\"]")).click();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
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

		driver.findElement(AppiumBy.xpath(
				"//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageView"))
				.click();

		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
				+ ".scrollIntoView(new UiSelector().text(\"Logout\"))"));
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Logout\"]")).click();
		
		System.out.println("Logout successfully!!!!");
	}
}
