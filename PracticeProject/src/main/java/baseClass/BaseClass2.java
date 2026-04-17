package baseClass;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;

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
		caps.setCapability("autoGrantPermissions", true);

		URL u = new URL("http://127.0.0.1:4723");

		driver = new AndroidDriver(u, caps);
		driver.activateApp("breathefree.lung.health.asthma.breathing");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		// ✅ Initialize wait here
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
	}
	@org.testng.annotations.AfterClass
	public void closeApp()
	{
		//driver.terminateApp("breathefree.lung.health.asthma.breathing");
	}
	

}
