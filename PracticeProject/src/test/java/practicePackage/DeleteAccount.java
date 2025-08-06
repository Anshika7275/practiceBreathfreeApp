package practicePackage;

import org.testng.annotations.Test;

import baseClass.BaseClass2;
import io.appium.java_client.AppiumBy;

public class DeleteAccount extends BaseClass2{
	
	@Test
	public void deleteAccount() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(AppiumBy.xpath(
				"//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup"))
				.click();
		
		Thread.sleep(1000);
		driver.findElement(AppiumBy.androidUIAutomator(
			    "new UiScrollable(new UiSelector().scrollable(true)).flingToEnd(10)"
			));

		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Delete my account\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Delete account\"]")).click();
		
		System.out.println("Logout successfully!!!!!");
		
		driver.quit();
		
	}

}
