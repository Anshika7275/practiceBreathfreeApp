package appWidgetPackage;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import io.appium.java_client.MobileBy;

import io.appium.java_client.AppiumBy;

public class RedirectionOfAppWidget_InhlerTest extends AddWidgteTest {

	@Test
	public void redirectionWidget_AsthmaAndInhalerTest() throws Throwable {
		// Update the cohort as Asthma
		driver.activateApp("breathefree.lung.health.asthma.breathing");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath(
				"//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup")))
				.click();

		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Profile description\"]")))
				.click();

		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Yes\"]"))).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(
				AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Have a lung condition\"]"))).click();
		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Asthma\"]"))).click();
		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"1 year or less\"]")))
				.click();
		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"1 year or less\"]")))
				.click();

		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Diabetes\"]"))).click();
		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Next\"]"))).click();

		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Track lung health\"]")))
				.click();
		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Build healthy habits\"]")))
				.click();
		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Next\"]"))).click();

		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Get started\"]"))).click();

		//Print the cohort name
		String cohortName = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Asthma\"]")).getText();
		System.out.println( "cohort name  "+cohortName);

		Thread.sleep(2000);
		driver.terminateApp("breathefree.lung.health.asthma.breathing");

		// click on inhaler widget
		driver.findElement(AppiumBy.xpath(
				"(//android.widget.LinearLayout[@resource-id=\"breathefree.lung.health.asthma.breathing:id/widget_item_container\"])[1]"))
				.click();

		Thread.sleep(3000);
		wait.until(
				ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Yes\"]")))
				.click();

		Thread.sleep(2000);
		driver.terminateApp("breathefree.lung.health.asthma.breathing");

		// click on the health check-ins widget
		driver.findElement(AppiumBy.xpath(
				"(//android.widget.LinearLayout[@resource-id=\"breathefree.lung.health.asthma.breathing:id/widget_item_container\"])[2]"))
				.click();

		Thread.sleep(3000);
		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Submit\"]")))
				.click();

		Thread.sleep(2000);
		driver.terminateApp("breathefree.lung.health.asthma.breathing");

		// click on breathing exercise widget
		driver.findElement(AppiumBy.xpath(
				"(//android.widget.LinearLayout[@resource-id=\"breathefree.lung.health.asthma.breathing:id/widget_item_container\"])[3]"))
				.click();

		wait.until(ExpectedConditions.presenceOfElementLocated(
				AppiumBy.xpath("//android.widget.TextView[@text=\"Diaphragmatic Breathing\"]"))).click();

		Thread.sleep(2000);
		driver.terminateApp("breathefree.lung.health.asthma.breathing");

		// click on pfr
		driver.findElement(AppiumBy.xpath(
				"(//android.widget.LinearLayout[@resource-id=\"breathefree.lung.health.asthma.breathing:id/widget_item_container\"])[4]"))
				.click();

		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Update\"]"))).click();

		Thread.sleep(2000);
		driver.terminateApp("breathefree.lung.health.asthma.breathing");

	}

	@Test
	public void redirectionWidget_COPDAndInhalerTest() throws InterruptedException {

		// Update the cohort as COPD
		driver.activateApp("breathefree.lung.health.asthma.breathing");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath(
				"//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup")))
				.click();

		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Profile description\"]")))
				.click();

		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Yes\"]"))).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(
				AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Have a lung condition\"]"))).click();
		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"COPD\"]"))).click();
		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"1 year or less\"]")))
				.click();
		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"1 year or less\"]")))
				.click();

		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Diabetes\"]"))).click();
		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Next\"]"))).click();

		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Track lung health\"]")))
				.click();
		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Build healthy habits\"]")))
				.click();
		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Next\"]"))).click();

		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Get started\"]"))).click();

		//Print the cohort name
		String cohortName = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"COPD\"]")).getText();
		System.out.println( "cohort name  "+cohortName);

		Thread.sleep(2000);
		driver.terminateApp("breathefree.lung.health.asthma.breathing");

		// Redirection of COPD widget

		// click on inhaler widget
		driver.findElement(AppiumBy.xpath(
				"(//android.widget.LinearLayout[@resource-id=\"breathefree.lung.health.asthma.breathing:id/widget_item_container\"])[1]"))
				.click();

		Thread.sleep(3000);
		wait.until(
				ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Yes\"]")))
				.click();

		Thread.sleep(2000);
		driver.terminateApp("breathefree.lung.health.asthma.breathing");

		// click on the health check-ins widget
		driver.findElement(AppiumBy.xpath(
				"(//android.widget.LinearLayout[@resource-id=\"breathefree.lung.health.asthma.breathing:id/widget_item_container\"])[2]"))
				.click();

		Thread.sleep(3000);
		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Submit\"]")))
				.click();

		Thread.sleep(2000);
		driver.terminateApp("breathefree.lung.health.asthma.breathing");

		// click on breathing exercise widget
		driver.findElement(AppiumBy.xpath(
				"(//android.widget.LinearLayout[@resource-id=\"breathefree.lung.health.asthma.breathing:id/widget_item_container\"])[3]"))
				.click();

		wait.until(ExpectedConditions.presenceOfElementLocated(
				AppiumBy.xpath("//android.widget.TextView[@text=\"Diaphragmatic Breathing\"]"))).click();

		Thread.sleep(2000);
		driver.terminateApp("breathefree.lung.health.asthma.breathing");
		
		driver.findElement(AppiumBy.xpath("(//android.widget.LinearLayout[@resource-id=\"breathefree.lung.health.asthma.breathing:id/widget_item_container\"])[4]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Cancel\"]")).click();
		
		Thread.sleep(2000);
		driver.terminateApp("breathefree.lung.health.asthma.breathing");	

	}
	
	@Test
	public void redirectionWidget_ILDAndInhalerTest() throws InterruptedException {

		// Update the cohort as ILD
		driver.activateApp("breathefree.lung.health.asthma.breathing");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath(
				"//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup")))
				.click();

		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Profile description\"]")))
				.click();

		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Yes\"]"))).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(
				AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Have a lung condition\"]"))).click();
		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"ILD\"]"))).click();
		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"1 year or less\"]")))
				.click();
		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"1 year or less\"]")))
				.click();

		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Diabetes\"]"))).click();
		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Next\"]"))).click();

		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Track lung health\"]")))
				.click();
		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Build healthy habits\"]")))
				.click();
		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Next\"]"))).click();

		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Get started\"]"))).click();

		String cohortName = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"ILD\"]")).getText();
		System.out.println( "cohort name  "+cohortName);

		Thread.sleep(2000);
		driver.terminateApp("breathefree.lung.health.asthma.breathing");

		// Redirection of ILD widget

		// click on inhaler widget
		driver.findElement(AppiumBy.xpath(
				"(//android.widget.LinearLayout[@resource-id=\"breathefree.lung.health.asthma.breathing:id/widget_item_container\"])[1]"))
				.click();

		Thread.sleep(3000);
		wait.until(
				ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Yes\"]")))
				.click();

		Thread.sleep(2000);
		driver.terminateApp("breathefree.lung.health.asthma.breathing");

		// click on the health check-ins widget
		driver.findElement(AppiumBy.xpath(
				"(//android.widget.LinearLayout[@resource-id=\"breathefree.lung.health.asthma.breathing:id/widget_item_container\"])[2]"))
				.click();

		Thread.sleep(3000);
		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Submit\"]")))
				.click();

		Thread.sleep(2000);
		driver.terminateApp("breathefree.lung.health.asthma.breathing");

		// click on breathing exercise widget
		driver.findElement(AppiumBy.xpath(
				"(//android.widget.LinearLayout[@resource-id=\"breathefree.lung.health.asthma.breathing:id/widget_item_container\"])[3]"))
				.click();

		wait.until(ExpectedConditions.presenceOfElementLocated(
				AppiumBy.xpath("//android.widget.TextView[@text=\"Diaphragmatic Breathing\"]"))).click();

		Thread.sleep(2000);
		driver.terminateApp("breathefree.lung.health.asthma.breathing");
		
		driver.findElement(AppiumBy.xpath("(//android.widget.LinearLayout[@resource-id=\"breathefree.lung.health.asthma.breathing:id/widget_item_container\"])[4]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Cancel\"]")).click();
		
		Thread.sleep(2000);
		driver.terminateApp("breathefree.lung.health.asthma.breathing");	

	}
	
	@Test
	public void redirectionWidget_ARAndInhalerTest() throws InterruptedException {

		// Update the cohort as AR
		driver.activateApp("breathefree.lung.health.asthma.breathing");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath(
				"//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup")))
				.click();

		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Profile description\"]")))
				.click();

		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Yes\"]"))).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(
				AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Have a lung condition\"]"))).click();
		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Allergic Rhinitis\"]"))).click();
		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"1 year or less\"]")))
				.click();
		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"1 year or less\"]")))
				.click();

		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Diabetes\"]"))).click();
		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Next\"]"))).click();

		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Track lung health\"]")))
				.click();
		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Build healthy habits\"]")))
				.click();
		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Next\"]"))).click();

		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Get started\"]"))).click();

		String cohortName = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Allergic Rhinitis\"]")).getText();
		System.out.println(cohortName+ "   cohort name");

		Thread.sleep(2000);
		driver.terminateApp("breathefree.lung.health.asthma.breathing");

		// Redirection of AR widget

		// click on inhaler widget
		driver.findElement(AppiumBy.xpath(
				"(//android.widget.LinearLayout[@resource-id=\"breathefree.lung.health.asthma.breathing:id/widget_item_container\"])[1]"))
				.click();

		Thread.sleep(3000);
		wait.until(
				ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Yes\"]")))
				.click();

		Thread.sleep(2000);
		driver.terminateApp("breathefree.lung.health.asthma.breathing");

		// click on the health check-ins widget
		driver.findElement(AppiumBy.xpath(
				"(//android.widget.LinearLayout[@resource-id=\"breathefree.lung.health.asthma.breathing:id/widget_item_container\"])[2]"))
				.click();

		Thread.sleep(3000);
		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Submit\"]")))
				.click();

		Thread.sleep(2000);
		driver.terminateApp("breathefree.lung.health.asthma.breathing");

		// click on breathing exercise widget
		driver.findElement(AppiumBy.xpath(
				"(//android.widget.LinearLayout[@resource-id=\"breathefree.lung.health.asthma.breathing:id/widget_item_container\"])[3]"))
				.click();

		wait.until(ExpectedConditions.presenceOfElementLocated(
				AppiumBy.xpath("//android.widget.TextView[@text=\"Diaphragmatic Breathing\"]"))).click();

		Thread.sleep(2000);
		driver.terminateApp("breathefree.lung.health.asthma.breathing");
		
		driver.findElement(AppiumBy.xpath("(//android.widget.LinearLayout[@resource-id=\"breathefree.lung.health.asthma.breathing:id/widget_item_container\"])[4]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Cancel\"]")).click();
		
		Thread.sleep(2000);
		driver.terminateApp("breathefree.lung.health.asthma.breathing");	

	}
	
	@Test
	public void redirectionWidget_OtherAndInhalerTest() throws InterruptedException {

		// Update the cohort as Other
		driver.activateApp("breathefree.lung.health.asthma.breathing");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath(
				"//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup")))
				.click();

		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Profile description\"]")))
				.click();

		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Yes\"]"))).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(
				AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Have a lung condition\"]"))).click();
		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Other lung condition\"]"))).click();
		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"1 year or less\"]")))
				.click();
		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"1 year or less\"]")))
				.click();

		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Diabetes\"]"))).click();
		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Next\"]"))).click();

		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Track lung health\"]")))
				.click();
		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Build healthy habits\"]")))
				.click();
		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Next\"]"))).click();

		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Get started\"]"))).click();

		String cohortName = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Other Condition\"]")).getText();
		System.out.println("cohort name  "+cohortName);

		Thread.sleep(2000);
		driver.terminateApp("breathefree.lung.health.asthma.breathing");

		// Redirection of Other widget

		// click on inhaler widget
		driver.findElement(AppiumBy.xpath(
				"(//android.widget.LinearLayout[@resource-id=\"breathefree.lung.health.asthma.breathing:id/widget_item_container\"])[1]"))
				.click();

		Thread.sleep(3000);
		wait.until(
				ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Yes\"]")))
				.click();

		Thread.sleep(2000);
		driver.terminateApp("breathefree.lung.health.asthma.breathing");

		// click on the health check-ins widget
		driver.findElement(AppiumBy.xpath(
				"(//android.widget.LinearLayout[@resource-id=\"breathefree.lung.health.asthma.breathing:id/widget_item_container\"])[2]"))
				.click();

		Thread.sleep(3000);
		wait.until(ExpectedConditions
				.presenceOfElementLocated(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Submit\"]")))
				.click();

		Thread.sleep(2000);
		driver.terminateApp("breathefree.lung.health.asthma.breathing");

		// click on breathing exercise widget
		driver.findElement(AppiumBy.xpath(
				"(//android.widget.LinearLayout[@resource-id=\"breathefree.lung.health.asthma.breathing:id/widget_item_container\"])[3]"))
				.click();

		String ExName = "Diaphragmatic Breathing";
		 driver.findElement(MobileBy.AndroidUIAutomator(
                 "new UiScrollable(new UiSelector().scrollable(true))" +
                         ".scrollIntoView(new UiSelector().textContains(\"" + ExName + "\"))"
         ));
		wait.until(ExpectedConditions.presenceOfElementLocated(
				AppiumBy.xpath("//android.widget.TextView[@text=\"Diaphragmatic Breathing\"]"))).click();

		Thread.sleep(2000);
		driver.terminateApp("breathefree.lung.health.asthma.breathing");
		
		driver.findElement(AppiumBy.xpath("(//android.widget.LinearLayout[@resource-id=\"breathefree.lung.health.asthma.breathing:id/widget_item_container\"])[4]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Cancel\"]")).click();
		
		Thread.sleep(2000);
		driver.terminateApp("breathefree.lung.health.asthma.breathing");	

	}

}
