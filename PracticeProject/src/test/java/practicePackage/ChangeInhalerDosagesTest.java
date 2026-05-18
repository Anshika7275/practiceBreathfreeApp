package practicePackage;

import java.time.Duration;
import java.util.Map;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Sequence;

import baseClass.BaseClass2;
import io.appium.java_client.AppiumBy;

public class ChangeInhalerDosagesTest extends BaseClass2 {

	@Test
	public void clickOnHomeeTab()

	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		By homeTab = AppiumBy.accessibilityId("Home");

		// Step 1: Safely click Home (no condition needed)
		try {
			WebElement home = wait.until(ExpectedConditions.presenceOfElementLocated(homeTab));

			((JavascriptExecutor) driver).executeScript("mobile: clickGesture",
					Map.of("elementId", ((RemoteWebElement) home).getId()));

			System.out.println("Clicked Home tab");
		} catch (Exception e) {
			System.out.println("Home click skipped");
		}

	}

	@Test
	public void inhalerHubTest() throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		// Track usage
		try {

			// Check if popup is displayed
			By popup = AppiumBy.accessibilityId("Bottom Sheet");

			wait.until(ExpectedConditions.visibilityOfElementLocated(popup));

			System.out.println("Popup is displayed");

			// Click cross icon
			By closeIcon = AppiumBy.xpath("//android.widget.ImageView");

			wait.until(ExpectedConditions.elementToBeClickable(closeIcon)).click();

			System.out.println("Popup closed");

			Thread.sleep(2000);

		} catch (Exception e) {

			System.out.println("Popup not displayed");
		}

		// Continue with Track Usage flow
		By trackUsageCTA = AppiumBy.xpath("//android.widget.TextView[@text='Track usage']");

		wait.until(ExpectedConditions.elementToBeClickable(trackUsageCTA)).click();

		System.out.println("Clicked on Track usage");

		// Small wait for RN rendering
		Thread.sleep(2000);

		// Update CTA
		By updateCTA = AppiumBy.xpath("//android.view.ViewGroup[@content-desc='Update']");

		for (int i = 0; i < 3; i++) {

			try {

				wait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(updateCTA))).click();

				System.out.println("Clicked Update CTA");

				break;

			} catch (Exception e) {

				Thread.sleep(1000);
			}
		}

		// Wait after click
		Thread.sleep(2000);

		// Update now popup
		By updateNowCTA = AppiumBy.xpath("//android.view.ViewGroup[@content-desc='No, update now']");

		wait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(updateNowCTA))).click();

		System.out.println("Clicked Update Now");

		Thread.sleep(2000);

		// Dosage wheel
		WebElement dosage120 = wait.until(
				ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text='120']")));

		int startX = dosage120.getRect().getX();
		int startY = dosage120.getRect().getY();

		PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");

		Sequence swipe = new Sequence(finger, 1);

		swipe.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY));

		swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));

		swipe.addAction(finger.createPointerMove(Duration.ofMillis(1200), PointerInput.Origin.viewport(), startX - 180,
				startY));

		swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

		driver.perform(Collections.singletonList(swipe));

		System.out.println("Dosage changed successfully");

		Thread.sleep(2000);

		// Submit
		By submitCTA = AppiumBy.xpath("//android.view.ViewGroup[@content-desc='Submit']");

		wait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(submitCTA))).click();

		System.out.println("Clicked Submit");

		Thread.sleep(3000);

		By successScreenCTA = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Continue\"]");
		WebElement successCTA = wait.until(ExpectedConditions.presenceOfElementLocated(successScreenCTA));
		successCTA.click();

		System.out.println("Dosage submit successfully");

		// success message
		By successMsg = AppiumBy.xpath("//android.widget.TextView[contains(@text,'saved successfully')]");

		String message = wait.until(ExpectedConditions.visibilityOfElementLocated(successMsg)).getText();

		System.out.println("Success Message : " + message);

		// dosage left value
		By dosageValue = AppiumBy
				.xpath("//android.widget.TextView[@text='Doses Left']/preceding-sibling::android.widget.TextView");

		String dosageLeft = wait.until(ExpectedConditions.visibilityOfElementLocated(dosageValue)).getText();

		System.out.println("Dosage Left : " + dosageLeft);

	}

}
