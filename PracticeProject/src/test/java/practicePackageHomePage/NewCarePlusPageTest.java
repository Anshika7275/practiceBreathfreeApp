package practicePackageHomePage;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import baseClass.BaseClass2;
import io.appium.java_client.AppiumBy;

public class NewCarePlusPageTest extends BaseClass2{
	
	@Test(priority = 1)
	public void YourSymptomsTest() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Care\"]/android.view.ViewGroup[2]/android.widget.ImageView")))
		        .click();

		// Tap on update symptoms
		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Update your symptoms\"]"))).click();
		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Submit\"]"))).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath(
				"//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup")))
				.click();

		// Nav back to care+ page
		wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath(
				"//android.view.ViewGroup[@content-desc=\"Care\"]/android.view.ViewGroup[2]/android.widget.ImageView"))).click();

		// nav to view status

		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"View status\"]"))).click();
		
		//nav back to care screen again

		wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath(
				"//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")))
				.click();

	}
	
	@Test(priority = 2)
	public void TrackInhalerUsageTest() throws Throwable {
		
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Care\"]/android.view.ViewGroup[2]/android.widget.ImageView")))
		        .click();
		
		WebElement inhalerUsage = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"TRACK INHALER USAGE\"]"));
		
		if(inhalerUsage.isDisplayed())
		{
			wait.until(ExpectedConditions
					.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"View details  >\"]")))
					.click();

			Thread.sleep(2000);
			wait.until(ExpectedConditions
					.presenceOfElementLocated(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Update\"]"))).click();

			wait.until(ExpectedConditions
					.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"No, update now\"]")))
					.click();

			WebElement dosageSlider = driver.findElement(AppiumBy.xpath(
					"(//android.widget.SeekBar[@content-desc=\"Bottom Sheet\"])[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.HorizontalScrollView/android.view.ViewGroup"));

			int startX = dosageSlider.getLocation().getX();
			int sliderWidth = dosageSlider.getSize().getWidth();
			int endX = startX + sliderWidth;
			int centerY = dosageSlider.getLocation().getY() + (dosageSlider.getSize().getHeight() / 2);

			// Example: 120 is max dosage, target is 100
			int maxDosage = 120;
			int targetDosage = 80;

			// Map dosage to slider pixel position
			int targetX = startX + (sliderWidth * targetDosage / maxDosage);

			// Perform swipe from right → left
			PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
			Sequence swipe = new Sequence(finger, 1);

			// 👉 Start near the right edge (endX - 10)
			swipe.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), endX - 10, centerY));
			swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));

			// 👉 Move leftwards toward targetX
			swipe.addAction(finger.createPointerMove(Duration.ofMillis(800), PointerInput.Origin.viewport(), targetX, centerY));
			swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

			driver.perform(Arrays.asList(swipe));
			
			Thread.sleep(2000);
			wait.until(ExpectedConditions
					.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Submit\"]"))).click();
			
			Thread.sleep(2000);
			wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Continue\"]"))).click();

			// nav back
			wait.until(ExpectedConditions.presenceOfElementLocated(
					AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Inhaler Hub\"]/android.view.ViewGroup")))
					.click();

			// again tap on update 
			Thread.sleep(2000);
			wait.until(ExpectedConditions
					.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Update\"]"))).click();
			
			wait.until(ExpectedConditions
					.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"No, update now\"]")))
					.click();
			
			WebElement dosageSlider1 = driver.findElement(AppiumBy.xpath("(//android.widget.SeekBar[@content-desc=\"Bottom Sheet\"])[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.HorizontalScrollView/android.view.ViewGroup"));

			int startX1 = dosageSlider1.getLocation().getX();
			int startY1 = dosageSlider1.getLocation().getY();
			int endX1 = startX1 + dosageSlider1.getSize().getWidth();
			int centerY1 = startY1 + (dosageSlider1.getSize().getHeight() / 2);

			// Create finger pointer
			PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
			Sequence swipe1 = new Sequence(finger1, 1);

			// Swipe from left → right
			swipe1.addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX1 + 50, centerY1));
			swipe1.addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
			swipe1.addAction(finger1.createPointerMove(Duration.ofMillis(700), PointerInput.Origin.viewport(), endX1 - 50, centerY1));
			swipe1.addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

			driver.perform(Arrays.asList(swipe1));

			wait.until(ExpectedConditions
					.presenceOfElementLocated(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Submit\"]"))).click();
			wait.until(ExpectedConditions
					.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Continue\"]"))).click();
				

		}
		else {
			
			System.out.println("User is non-inhaler user !!!!!!!!");
		}
		
	}
	
	@Test(priority = 3)
	public void knowMoreAboutSymptoms() throws Throwable {
		
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Care\"]/android.view.ViewGroup[2]/android.widget.ImageView")))
		        .click();
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
				+ ".scrollIntoView(new UiSelector().text(\"Know more about your condition\"))"));
		
		wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath(
				"//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView")))
				.click();
		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Care\"]/android.view.ViewGroup[2]/android.widget.ImageView"))).click();
		
		
	}
	
	@Test(priority = 4)
	public void understandYourSymptoms() throws Throwable {
		
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Care\"]/android.view.ViewGroup[2]/android.widget.ImageView")))
		        .click();
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
				+ ".scrollIntoView(new UiSelector().text(\"Understand your symptoms better\"))"));
		
		wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath(
				"//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")))
				.click();
		
		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Care\"]/android.view.ViewGroup[2]/android.widget.ImageView"))).click();
		
	}
	
	@Test(priority = 5)
	public void trackVitals_Activities() throws Throwable{
		Thread.sleep(2000);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Care\"]/android.view.ViewGroup[2]/android.widget.ImageView")))
		        .click();
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
				+ ".scrollIntoView(new UiSelector().text(\"TRACK VITALS & ACTIVITIES\"))"));
		
		wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"View All >\"]"))).click();
		
		Thread.sleep(2000);
		driver.navigate().back();
		
		WebElement PFR = driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView"));
		
		if(PFR.isDisplayed())
		{
			PFR.click();
			wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Update\"]"))).click();
			wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Continue\"]"))).click();
			
			List<WebElement> popUp = driver.findElements(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup"));
			
			if(popUp.size()>0)
			{
				wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"No, not now\"]"))).click();
			}
			else {
				
				System.out.println("PopUp not display!!!");
			}
			
		}
		else {
			
			System.out.println("PFR is not present !!!!");
		}
		
		wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.ScrollView/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup"))).click();
		
		Thread.sleep(2000);
		driver.navigate().back();
		
	}
	
}

