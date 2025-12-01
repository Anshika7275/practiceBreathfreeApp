package appWidgetPackage;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;


public class RedirectionOfAppWidgetTest extends AddWidgteTest {
	
	@Test
	public void redirectionWidget_AsthmaAndInhalerTest() throws Throwable
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		//click on inhaler widget
		driver.findElement(AppiumBy.xpath("(//android.widget.LinearLayout[@resource-id=\"breathefree.lung.health.asthma.breathing:id/widget_item_container\"])[1]")).click();
		
		Thread.sleep(3000);
		wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Yes\"]"))).click();
		
		Thread.sleep(2000);
		driver.terminateApp("breathefree.lung.health.asthma.breathing");
		
		//click on the health check-ins widget
		driver.findElement(AppiumBy.xpath("(//android.widget.LinearLayout[@resource-id=\"breathefree.lung.health.asthma.breathing:id/widget_item_container\"])[2]")).click();
		
		Thread.sleep(3000);
		wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Submit\"]"))).click();
		
		Thread.sleep(2000);
		driver.terminateApp("breathefree.lung.health.asthma.breathing");
		
		//click on breathing exercise widget
		driver.findElement(AppiumBy.xpath("(//android.widget.LinearLayout[@resource-id=\"breathefree.lung.health.asthma.breathing:id/widget_item_container\"])[3]")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Diaphragmatic Breathing\"]"))).click();
		
		Thread.sleep(2000);
		driver.terminateApp("breathefree.lung.health.asthma.breathing");
		
		//click on pfr
		driver.findElement(AppiumBy.xpath("(//android.widget.LinearLayout[@resource-id=\"breathefree.lung.health.asthma.breathing:id/widget_item_container\"])[4]")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Update\"]"))).click();
		
		Thread.sleep(2000);
		driver.terminateApp("breathefree.lung.health.asthma.breathing");
		
	}

}
