package practicePackageOld;

import org.testng.annotations.Test;

import baseClass.BaseClass2;
import io.appium.java_client.AppiumBy;

public class AppTour extends BaseClass2{
	
	@Test
	public void homePageAppTour() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"NEXT\"]")).click();
		
		Thread.sleep(1000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"NEXT\"]")).click();
		
		Thread.sleep(1000);
		driver.findElement(AppiumBy.xpath(
				"//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]"))
				.click();
		
		Thread.sleep(1000);
		driver.findElement(AppiumBy.xpath(
				"//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]"))
				.click();
		
		System.out.println("App tour completed successfully!!!");
		
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Claim Now\"]")).click();
		
		System.out.println("Daily login claim successfully!!!");

	}

}
