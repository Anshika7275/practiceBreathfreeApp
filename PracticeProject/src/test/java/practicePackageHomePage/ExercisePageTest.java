package practicePackageHomePage;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import baseClass.BaseClass2;
import io.appium.java_client.AppiumBy;

public class ExercisePageTest extends BaseClass2{
	
	@Test
	public void normalExerciseTest() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Exercise\"]")))
				.click();

		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
				+ ".scrollIntoView(new UiSelector().text(\"Huff puff technique\"))"));

		wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath(
				"//android.view.ViewGroup[@content-desc=\"CLEANSE LUNGS, Huff puff technique, 1 min\"]/android.view.ViewGroup[2]")))
				.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy
				.xpath("//android.view.ViewGroup[@content-desc=\"Beginner , 3 , <1 min \"]/com.horcrux.svg.SvgView")))
				.click();
		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Start\"]"))).click();

		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofMinutes(1));

		wait1.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Finish!\"]")))
				.click();

		wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath(
				"//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/com.horcrux.svg.SvgView")))
				.click();

	}
	
	@Test
	public void premiumExerciseTest() throws Throwable {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Exercise\"]")))
				.click();

		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
				+ ".scrollIntoView(new UiSelector().text(\"Breath Stacking Technique\"))"));

		wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath(
				"//android.view.ViewGroup[@content-desc=\"YOGIC BREATHING, Breath Stacking Technique, 1 min\"]/android.view.ViewGroup/android.view.View")))
				.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy
				.xpath("//android.view.ViewGroup[@content-desc=\"Beginner , 3 , 1 min \"]/com.horcrux.svg.SvgView")))
				.click();

		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Start\"]"))).click();

		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofMinutes(2));

		wait1.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Finish!\"]"))).click();

	}

}
