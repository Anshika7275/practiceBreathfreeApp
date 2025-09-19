package practicePackageHomePage;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import baseClass.BaseClass2;
import io.appium.java_client.AppiumBy;

public class HomePage extends BaseClass2 {

	@Test
	public void manageYourSymptomsTest() throws Throwable {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		Thread.sleep(2000);
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
				+ ".scrollIntoView(new UiSelector().text(\"MONITOR YOUR SYMPTOMS\"))"));

		driver.findElement(AppiumBy.xpath(
				"//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView"))
				.click();
		
		Thread.sleep(2000);
		wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.Button[@text=\"Continue >\"]"))).click();

		// Step 1
		wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.EditText"))).click();
		//driver.findElement(AppiumBy.xpath("//android.widget.EditText")).sendKeys("24");
		Thread.sleep(3000);

		driver.hideKeyboard();

		wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("(//android.widget.RadioButton[@text=\"No\"])[1]"))).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("(//android.widget.RadioButton[@text=\"No\"])[2]"))).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("(//android.widget.RadioButton[@text=\"No\"])[3]"))).click();

		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
				+ ".scrollIntoView(new UiSelector().text(\"Next\"))"));

		wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("(//android.widget.RadioButton[@text=\"No\"])[4]"))).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("(//android.widget.RadioButton[@text=\"No\"])[5]"))).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.Button[@text=\"Next\"]"))).click();

		// Step 2
		Thread.sleep(2000);
		wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.RadioButton[@text=\"Yes\"]"))).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.RadioButton[@text=\"One[1] attack\"]"))).click();

		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
				+ ".scrollIntoView(new UiSelector().text(\"Next\"))"));

		wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("(//android.widget.Button[@text=\"3\"])[1]"))).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("(//android.widget.Button[@text=\"2\"])[2]"))).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("(//android.widget.Button[@text=\"4\"])[3]"))).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.Button[@text=\"Next\"]"))).click();

		// Step 3
		Thread.sleep(2000);
		wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.RadioButton[@text=\"Yes, limited a little\"]"))).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.RadioButton[@text=\"Most of the time\"]"))).click();
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
				+ ".scrollIntoView(new UiSelector().text(\"Calculate\"))"));
		
		wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("(//android.widget.RadioButton[@text=\"Some of the time\"])[2]"))).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.Button[@text=\"Calculate\"]"))).click();

		// Result screen
		Thread.sleep(2000);
		String asthmaText = driver.findElement(AppiumBy.xpath("//android.widget.Image[@text=\"Asthma Risk\"]"))
				.getText();
		String copdText = driver.findElement(AppiumBy.xpath("//android.widget.Image[@text=\"COPD Risk\"]")).getText();

		System.out.println("Asthma result : " + asthmaText);
		System.out.println("COPD result : " + copdText);

		// Navigate to doctor locator
		driver.findElement(
				AppiumBy.xpath("//android.view.View[@content-desc=\"Yes, help me find a Breathefree clinic\"]"))
				.click();

		wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//com.horcrux.svg.PathView"))).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//com.horcrux.svg.PathView"))).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//com.horcrux.svg.PathView"))).click();

		// Nav back to Home screen and tap on control guid
		wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Control guide\"]"))).click();
		driver.findElement(AppiumBy.xpath(
				"//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.ImageView"))
				.click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Home\"]"))).click();
		
		//Nav to BE page
		driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Breathing exercises\"]/android.view.ViewGroup/android.widget.ImageView")).click();
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
				+ ".scrollIntoView(new UiSelector().text(\"Unlock Now\"))"));
		
		wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Unlock Now\"]"))).click();
		driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/com.horcrux.svg.SvgView")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//com.horcrux.svg.SvgView"))).click();
		
		//nav to live session
		driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Live sessions\"]/android.view.ViewGroup/android.widget.ImageView")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")).click();
        driver.findElement(AppiumBy.xpath("//com.horcrux.svg.GroupView")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Home\"]")).click();
        
        //nav to track medication
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Track medication\"]"))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Add new medicine\"]"))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("(//android.view.ViewGroup[@content-desc=\"Add\"])[3]"))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Alternate days\"]"))).click();
        
        Thread.sleep(3000);
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.view.View"))).click();
        
        driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView")).click();
        
	}
		@Test
		public void monitorYourSymptomsTest() throws Throwable
		{
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			
			Thread.sleep(2000);
			driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
					+ ".scrollIntoView(new UiSelector().text(\"MONITOR YOUR SYMPTOMS\"))"));
			
			//nav to health check-ins
			driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageView")).click();
			wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Submit\"]"))).click();
			
			//tap on doc locator 
			
			//nav back 
			driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]")).click();
			
			//nav to vital screen
			driver.findElement(AppiumBy.xpath(
					"//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView"))
					.click();
			
			//click on water

			driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[6]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView")).click();
			WebElement water = driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView"));

			water.click();
			water.click();
			water.click();
			
			wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.view.View"))).click();
			wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Continue\"]"))).click();
			wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"No, not now\"]"))).click();
			wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Home\"]/android.view.ViewGroup/android.widget.ImageView"))).click();
			
		}
		
		@Test
		public void yourSymptomsRecordTest() {
			
			driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageView")).click();
			driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView")).click();
			
			driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView")).click();
			driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
					+ ".scrollIntoView(new UiSelector().text(\"Sleep Score\"))"));
			
			driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView")).click();
			
		}
		
		@Test
		public void doctorCorner() throws Throwable {
			
			Thread.sleep(2000);
			
			driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
					+ ".scrollIntoView(new UiSelector().text(\"MONITOR YOUR SYMPTOMS\"))"));
			
			driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
					+ ".scrollIntoView(new UiSelector().text(\"DOCTOR CORNER\"))"));
			
			driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")).click();
			driver.findElement(AppiumBy.xpath("//com.horcrux.svg.PathView")).click();
			
			driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToBeginning(10)")).click();
			
			
		}

}
