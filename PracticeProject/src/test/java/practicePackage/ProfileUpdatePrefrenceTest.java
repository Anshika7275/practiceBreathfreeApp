package practicePackage;

import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;
import org.testng.annotations.Test;

import baseClass.BaseClass2;
import io.appium.java_client.AppiumBy;

public class ProfileUpdatePrefrenceTest extends BaseClass2 {

	@Test(priority = 1)
	public void clickOnProfileTab()
	
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		By homeTab = AppiumBy.accessibilityId("Home");

		// Step 1: Safely click Home (no condition needed)
		try {
		    WebElement home = wait.until(ExpectedConditions.presenceOfElementLocated(homeTab));
		    
		    ((JavascriptExecutor) driver).executeScript("mobile: clickGesture", Map.of(
		            "elementId", ((RemoteWebElement) home).getId()
		    ));
		    
		    System.out.println("Clicked Home tab");
		} catch (Exception e) {
		    System.out.println("Home click skipped");
		}
			
	}
	
	@Test (priority = 2)
	public void profileEditIconTest() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		By profileIcon = AppiumBy.xpath("//android.view.ViewGroup[@content-desc]/android.view.ViewGroup");
		
		// Step 2: Click Profile icon
		WebElement profile = wait.until(ExpectedConditions.presenceOfElementLocated(profileIcon));

		((JavascriptExecutor) driver).executeScript("mobile: clickGesture",
				Map.of("elementId", ((RemoteWebElement) profile).getId()));

		System.out.println("Profile icon clicked");
		
		// driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc]/android.view.ViewGroup")).click();
		driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"EDIT\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Save\"]")).click();

	}

	@Test(priority = 3)
	public void cohortChangeTest() {

		String text = "Asthma";
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		By profileIcon = AppiumBy.xpath("//android.widget.TextView[string-length(@text)=1]/parent::android.view.ViewGroup");

		// Click profile (fresh find)
		WebElement profile = wait.until(ExpectedConditions.presenceOfElementLocated(profileIcon));

		((JavascriptExecutor) driver).executeScript("mobile: clickGesture",
				Map.of("elementId", ((RemoteWebElement) profile).getId()));

		// driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc]/android.view.ViewGroup")).click();

		// 4. Click "Have a lung condition"
		By conditionOption = AppiumBy.xpath("//android.view.ViewGroup[contains(@content-desc,'lung condition')]");

		wait.until(ExpectedConditions.presenceOfElementLocated(conditionOption)).click();

		By cohortOption = AppiumBy.xpath("//android.widget.TextView[@text='" + text + "']");
		wait.until(ExpectedConditions.presenceOfElementLocated(cohortOption)).click();

		// Duration
		String option = "Less than a month";

		By optionLocator = AppiumBy.xpath("//android.view.ViewGroup[@content-desc='" + option + "']");
		driver.findElement(optionLocator).click();
		
		
	}
	
	@Test(priority = 4)
	public void SymptomsChange() {
			
		
	}
	
	@Test(priority = 5)
	public void inhalerUse() {
		
		By inhalerUseOption = AppiumBy.xpath("//android.view.ViewGroup[contains(@content-desc,'Inhaler Use')]");

		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

			WebElement inhaler = wait.until(ExpectedConditions.visibilityOfElementLocated(inhalerUseOption));

			inhaler.click();
			System.out.println("Inhaler option clicked");
			
			//MOdify your inhaler dose
			By ChangeDosages = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Modify your inhaler usage\"]");
			WebElement modifyDosages = wait.until(ExpectedConditions.visibilityOfElementLocated(ChangeDosages));
			modifyDosages.click();
			
			WebElement nextCTA = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Next\"]")));
			nextCTA.click();
			
			WebElement skipCTA = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Skip\"]")));
			skipCTA.click();
			
			//Change your inhaler 
			inhaler.click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Change your inhaler\"]"))).click();
			
			String inhalerName = "Metered-Dose";   // change dynamically

			By inhalerOption = AppiumBy.xpath("//android.view.ViewGroup[@content-desc='" + inhalerName + "']");

			WebElement listiOfInhaler = wait.until(ExpectedConditions.visibilityOfElementLocated(inhalerOption));

			listiOfInhaler.click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Next\"]"))).click();
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Foracort\"]"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("(//android.view.ViewGroup[@content-desc=\"Select\"])[4]"))).click();
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Skip\"]"))).click();
			
			inhaler.click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"I'm no longer using an inhaler\"]"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"No\"]")));
			

		} catch (org.openqa.selenium.TimeoutException e) {
			throw new SkipException("Inhaler option not visible → Skipping test");
		}
	}
	
	@Test(priority = 6)
	public void updateBMI() {
		
			
	}

}
