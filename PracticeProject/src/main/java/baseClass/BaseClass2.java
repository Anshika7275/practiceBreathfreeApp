package baseClass;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BaseClass2 {

	public AndroidDriver driver;
	public WebDriverWait wait;

	@BeforeClass
	public void startApp() throws Throwable {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Android Device");
		caps.setCapability("platformName", "Android");
		caps.setCapability("automationName", "UiAutomator2");
		caps.setCapability("noReset", true);
		caps.setCapability("appWaitActivity", "*");
		caps.setCapability("autoGrantPermissions", false);
		caps.setCapability("ignoreHiddenApiPolicyError", true);
		caps.setCapability("disableWindowAnimation", true);
		caps.setCapability("uiautomator2ServerInstallTimeout", 120000);
		caps.setCapability("uiautomator2ServerLaunchTimeout", 120000);
		caps.setCapability("adbExecTimeout", 120000);
		caps.setCapability("newCommandTimeout", 300);

		URL u = new URL("http://127.0.0.1:4723");

		driver = new AndroidDriver(u, caps);
		driver.activateApp("breathefree.lung.health.asthma.breathing");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		System.out.println("App launched successfully");
	}
		
		// ========================= CLICK METHOD =========================

	public void click(By locator) {

		wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
	}

	// ========================= SENDKEYS METHOD =========================

	public void sendKeys(By locator, String value) {

		wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(value);
	}

	// ========================= DISPLAY METHOD =========================

	public boolean isDisplayed(By locator) {

		try {

			return driver.findElement(locator).isDisplayed();

		} catch (Exception e) {

			return false;
		}
	}

	// ========================= SAFE CLICK METHOD =========================

	public void safeClick(By locator) {

		try {

			wait.until(ExpectedConditions.elementToBeClickable(locator)).click();

		} catch (Exception e) {

			System.out.println("Retrying click for locator: " + locator);

			wait.until(ExpectedConditions.presenceOfElementLocated(locator)).click();
		}
	}

	// ========================= DRIVER ALIVE METHOD =========================

	public boolean isDriverAlive() {

		try {

			driver.getPageSource();

			return true;

		} catch (Exception e) {

			return false;
		}

	}

	@AfterClass
	public void closeApp() {
		// driver.terminateApp("breathefree.lung.health.asthma.breathing");
	}

}
