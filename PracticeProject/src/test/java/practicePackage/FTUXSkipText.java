package practicePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import baseClass.BaseClass2;
import io.appium.java_client.AppiumBy;

public class FTUXSkipText extends BaseClass2{
	
	@Test
	public void ftuxSkipTest()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		WebElement continueCTA = driver.findElement(AppiumBy.xpath("//android.view.View"));
		wait.until(ExpectedConditions.elementToBeClickable(continueCTA));
		continueCTA.click();
		
		By proceedBtn = AppiumBy.xpath(
				"//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup");

		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(proceedBtn));
		element.click();
		System.out.println("FTUX skipped successfully!!!!");
	}
	

}
