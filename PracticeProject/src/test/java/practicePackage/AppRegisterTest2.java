package practicePackage;

import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import baseClass.BaseClass2;
import io.appium.java_client.AppiumBy;

public class AppRegisterTest2 extends BaseClass2 {

	WebDriverWait wait;

	@Test
	public void onboardingFlow() throws Exception {

		wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		// =========================
		// NOTIFICATION POPUP
		// =========================

		try {

			Thread.sleep(2000);

			if (driver.findElements(AppiumBy.xpath("//android.widget.Button[@text='ALLOW']")).size() > 0) {

				driver.findElement(AppiumBy.xpath("//android.widget.Button[@text='ALLOW']")).click();

				System.out.println("Notification popup handled");
			}

		} catch (Exception e) {

			System.out.println("Notification popup not displayed");
		}

		// =========================
		// GOOGLE PHONE NUMBER POPUP
		// =========================

		try {

			WebDriverWait shortWait = new WebDriverWait(driver, Duration.ofSeconds(5));

			WebElement cancelBtn = shortWait.until(ExpectedConditions
					.elementToBeClickable(AppiumBy.xpath("//android.widget.ImageView[@content-desc='Cancel']")));

			cancelBtn.click();

			System.out.println("Google popup closed");

		} catch (Exception e) {

			System.out.println("Google popup not displayed");
		}

		// =========================
		// MOBILE NUMBER
		// =========================

		WebElement mobileField = wait
				.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.className("android.widget.EditText")));

		mobileField.click();
		mobileField.clear();
		mobileField.sendKeys("9999999901");

		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Continue']")).click();

		System.out.println("Mobile number entered");

		// =========================
		// OTP
		// =========================

		Thread.sleep(3000);

		WebElement otpField = wait
				.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.className("android.widget.EditText")));

		otpField.sendKeys("1122");

		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Verify']")).click();

		System.out.println("OTP verified");

		// =========================
		// LANGUAGE
		// =========================

		Thread.sleep(5000);

		WebElement english = wait
				.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.accessibilityId("English, English")));

		english.click();

		Thread.sleep(3000);

		WebElement nextCTA = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Next")));

		safeClick(nextCTA);

		System.out.println("Language selected");

		// =========================
		// MYSELF
		// =========================

		Thread.sleep(4000);

		WebElement myself = wait
				.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.accessibilityId("Myself")));

		safeClick(myself);

		System.out.println("Myself selected");

		// =========================
		// NAME
		// =========================

		Thread.sleep(3000);

		driver.findElement(AppiumBy.xpath("//android.widget.EditText")).sendKeys("Testing");

		// Gender

		driver.findElement(
				AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]")).click();

		// DOB

		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='DD']")).sendKeys("11");

		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='MM']")).sendKeys("12");

		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='YYYY']")).sendKeys("2000");

		driver.hideKeyboard();

		Thread.sleep(2000);

		// =========================
		// SCROLL DOWN
		// =========================

		scrollDown();

		// =========================
		// HEIGHT
		// =========================

		driver.findElement(AppiumBy.xpath("(//android.widget.EditText[@text=\"0\"])[1]")).sendKeys("5");

		driver.findElement(AppiumBy.xpath("(//android.widget.EditText[@text=\"0\"])[2]")).click();

		driver.findElement(AppiumBy.xpath("(//android.widget.EditText[@text=\"0\"])[2]")).sendKeys("60");

		driver.hideKeyboard();

		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Next']")).click();

		System.out.println("Basic details entered");

		// =========================
		// COHORT
		// =========================

		Thread.sleep(3000);

		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Asthma']")).click();

		driver.findElement(AppiumBy.accessibilityId("Next")).click();

		System.out.println("Cohort selected");

		// =========================
		// SYMPTOMS
		// =========================

		Thread.sleep(3000);

		driver.findElement(AppiumBy.xpath(
				"//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]"))
				.click();

		driver.findElement(AppiumBy.xpath(
				"//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]"))
				.click();

		driver.findElement(AppiumBy.accessibilityId("Next")).click();

		System.out.println("Symptoms selected");

		// =========================
		// CONDITIONS
		// =========================

		Thread.sleep(3000);

		scrollDown();
		
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='None of the above']")).click();

		driver.findElement(AppiumBy.accessibilityId("Next")).click();

		System.out.println("Conditions selected");

		// =========================
		// INHALER SCREEN
		// =========================

		Thread.sleep(4000);

		WebElement noInhaler = wait.until(
				ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"No, I dont use any Inhaler\"]")));

		safeClick(noInhaler);

		Thread.sleep(2000);

		WebElement nextBtn = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Next")));

		safeClick(nextBtn);

		System.out.println("No inhaler selected");

		// =========================
		// CONTINUE CTA
		// =========================

		Thread.sleep(6000);

		WebElement continueBtn = wait
				.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.className("android.view.View")));

		safeClick(continueBtn);

		System.out.println("Onboarding completed successfully");
	}

	// ====================================
	// SAFE CLICK
	// ====================================

	public void safeClick(WebElement element) {

		try {

			wait.until(ExpectedConditions.elementToBeClickable(element));

			element.click();

		} catch (Exception e) {

			((JavascriptExecutor) driver).executeScript("mobile: clickGesture",
					Map.of("elementId", ((RemoteWebElement) element).getId()));
		}
	}

	// ====================================
	// STABLE SCROLL
	// ====================================

	public void scrollDown() {

		try {

			((JavascriptExecutor) driver).executeScript("mobile: scrollGesture",
					Map.of("left", 100, "top", 300, "width", 500, "height", 1000, "direction", "down", "percent", 0.7));

			Thread.sleep(2000);

		} catch (Exception e) {

			System.out.println("Scroll failed");
		}
	}
}