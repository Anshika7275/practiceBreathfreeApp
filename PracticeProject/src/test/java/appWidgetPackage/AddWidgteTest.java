package appWidgetPackage;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import baseClass.BaseClass3;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;

public class AddWidgteTest extends BaseClass3{
	
	@Test
	public void addWidgetTest() throws Throwable
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;

        // 1️⃣ Long press on empty home screen area using gesture
        Map<String, Object> longPress = new HashMap<>();
        longPress.put("x", 500);
        longPress.put("y", 1200);
        longPress.put("duration", 1500); // 1.5 sec
        js.executeScript("mobile: longClickGesture", longPress);
        
        Thread.sleep(1500);

        // 2️⃣ Click on "Widgets"
        driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiSelector().textContains(\"Widgets\")"
        )).click();
        
        Thread.sleep(2000);

        // 3️⃣ Scroll and find your widget (change app name here)
		String appName = "Breathefree"; // update widget name
				
		driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().textContains(\"" + appName + "\"))"
        ));
		
		//Thread.sleep(2000);
		
		driver.findElement(AppiumBy.xpath("(//android.widget.ImageView[@resource-id=\"com.miui.home:id/item_preview\"])[10]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.LinearLayout[@content-desc=\"Done\"]")).click();
			
	}
	
}
