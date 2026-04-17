package practicePackage;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import baseClass.BaseClass2;
import io.appium.java_client.AppiumBy;

public class ProfileUpdatePrefrence_AssertionTest extends BaseClass2 {

	// 🔁 Safe click
	public void clickWithRetry(By locator) {
		for (int i = 0; i < 3; i++) {
			try {
				WebElement el = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

				try {
					el.click(); // normal click
				} catch (Exception e) {
					// fallback for Xiaomi
					((JavascriptExecutor) driver).executeScript("mobile: clickGesture",
							Map.of("elementId", ((RemoteWebElement) el).getId()));
				}
				return;

			} catch (Exception e) {
				System.out.println("Retry click...");
			}
		}
		throw new RuntimeException("Unable to click: " + locator);
	}

	@Test
	public void verifyCohortAndInhalerUpdate() throws InterruptedException {

		String cohort = "Asthma";
		String duration = "Less than a month";
		String inhalerName = "Metered-Dose";

		// ---------------- FORCE HOME ----------------
		try {
			driver.findElement(AppiumBy.accessibilityId("Home")).click();
			System.out.println("Navigated to Home");
		} catch (Exception e) {
			System.out.println("Already on Home");
		}

		By profileIcon = AppiumBy
				.xpath("//android.widget.TextView[string-length(@text)=1]/parent::android.view.ViewGroup");

		// Click profile (fresh find)
		WebElement profile = wait.until(ExpectedConditions.presenceOfElementLocated(profileIcon));

		((JavascriptExecutor) driver).executeScript("mobile: clickGesture",
				Map.of("elementId", ((RemoteWebElement) profile).getId()));

		// ---------------- PROFILE EDIT ----------------

//		clickWithRetry(AppiumBy.accessibilityId("EDIT"));
//		driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Save\"]")).click();

		// ---------------- COHORT ----------------

		// Click profile (fresh find)
//		((JavascriptExecutor) driver).executeScript("mobile: clickGesture",
//				Map.of("elementId", ((RemoteWebElement) profile).getId()));

		clickWithRetry(AppiumBy.xpath("//android.view.ViewGroup[contains(@content-desc,'lung condition')]"));

		By cohortOption = AppiumBy.xpath("//android.widget.TextView[@text='" + cohort + "']");
		clickWithRetry(cohortOption);

		// Duration
		By durationOption = AppiumBy.xpath("//android.view.ViewGroup[@content-desc='" + duration + "']");
		clickWithRetry(durationOption);

		// ---------------- INHALER FULL FLOW ----------------

		By inhalerSection = AppiumBy.xpath("//android.view.ViewGroup[contains(@content-desc,'Inhaler Use')]");

		List<WebElement> inhalerList = driver.findElements(inhalerSection);

		if (inhalerList.isEmpty()) {
			throw new SkipException("Inhaler section not present → Skipping test");
		} else {

			// ---- Open inhaler ----
			clickWithRetry(inhalerSection);

			// ---- Modify dosage ----
			clickWithRetry(AppiumBy.xpath("//android.view.ViewGroup[@content-desc='Modify your inhaler usage']"));
			clickWithRetry(AppiumBy.accessibilityId("Next"));
			clickWithRetry(AppiumBy.xpath("//android.widget.TextView[@text='Skip']"));

			// ---- Change inhaler ----
			clickWithRetry(inhalerSection);
			clickWithRetry(AppiumBy.xpath("//android.view.ViewGroup[@content-desc='Change your inhaler']"));

			By inhalerOption = AppiumBy.androidUIAutomator("new UiSelector().description(\"" + inhalerName + "\")");
			clickWithRetry(inhalerOption);

			clickWithRetry(AppiumBy.accessibilityId("Next"));

			// ---- Medicine selection ----
			clickWithRetry(AppiumBy.xpath("//android.view.ViewGroup[@content-desc='Foracort']"));
			clickWithRetry(AppiumBy.xpath("(//android.view.ViewGroup[@content-desc='Select'])[4]"));
			clickWithRetry(AppiumBy.xpath("//android.widget.TextView[@text='Skip']"));

			// ---- Stop inhaler ----
			clickWithRetry(inhalerSection);
			clickWithRetry(
					AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"I'm no longer using an inhaler\"]"));
			clickWithRetry(AppiumBy.xpath("//android.view.ViewGroup[@content-desc='No']"));

		}

		// ---------------- SAVE ----------------

//		clickWithRetry(AppiumBy.accessibilityId("Save"));

		// ---------------- ASSERTION ----------------

		Thread.sleep(2000);

		By updatedCohort = AppiumBy.xpath("//android.widget.TextView[contains(@text,'" + cohort + "')]");

		boolean isUpdated = wait.until(ExpectedConditions.presenceOfElementLocated(updatedCohort)).isDisplayed();

		Assert.assertTrue(isUpdated, "❌ Cohort update failed!");

		System.out.println("✅ End-to-End Flow Completed Successfully");
	}
}
