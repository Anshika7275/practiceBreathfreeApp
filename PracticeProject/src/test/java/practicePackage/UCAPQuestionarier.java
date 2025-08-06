package practicePackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class UCAPQuestionarier {

	@Test
	public void UCAPQuestionarierTest() throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.get("https://breathefree.in/asthma-codp-risk-calculator/user");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		driver.findElement(By.xpath("//input[@id=\"phoneNumber\"]")).sendKeys("9999999999");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();

		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//input[@inputmode='numeric']"), 3));

		List<WebElement> otpInputs = driver.findElements(By.xpath("//input[@class=\"otp-input\"]"));

		String otp = "1122";
		for (int i = 0; i < otp.length(); i++) {
			otpInputs.get(i).sendKeys(Character.toString(otp.charAt(i)));
		}

		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Anshika Dubey");
		driver.findElement(By.xpath("//input[@name=\"age\"]")).sendKeys("24");
		driver.findElement(By.xpath("//input[@value=\"Female\"]")).click();
		driver.findElement(By.xpath("//button[@type=\"button\"]")).click();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type=\"number\"]")).sendKeys("24");
		driver.findElement(By.xpath("//input[@name=\"question-2\" and @value=\"Yes\"]")).click();
		driver.findElement(
				By.xpath("(//div[@class=\"flex items-center ml-0 \"]/descendant::input[@type=\"number\"])[1]"))
				.sendKeys("1");
		driver.findElement(
				By.xpath("(//div[@class=\"flex items-center ml-0 \"]/descendant::input[@type=\"number\"])[2]"))
				.sendKeys("1");
		driver.findElement(By.xpath("//input[@name=\"question-3\" and @value=\"Yes\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"question-4\" and @value=\"No\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"question-5\" and @value=\"No\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"question-6\" and @value=\"Yes\"]")).click();
		driver.findElement(By.xpath("//button[text()='Next']")).click();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name=\"question-7\" and @value=\"Yes\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"question-8\" and @value=\"No[0] attack\"]")).click();
		driver.findElement(By.xpath(
				"//u[text()='cough']/ancestor::div[@class=\"mb-2 bg-[#FFFFFF] px-4 py-4 rounded-xl\"]/descendant::button[text()='1']"))
				.click();
		driver.findElement(By.xpath(
				"//u[text()='sleep']/ancestor::div[@class=\"mb-2 bg-[#FFFFFF] px-4 py-4 rounded-xl\"]/descendant::button[text()='1']"))
				.click();
		driver.findElement(By.xpath(
				"//u[text()='chest tightness']/ancestor::div[@class=\"mb-2 bg-[#FFFFFF] px-4 py-4 rounded-xl\"]/descendant::button[text()='1']"))
				.click();
		driver.findElement(By.xpath("//button[text()='Next']")).click();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value=\"No, not limited at all\"]")).click();
		driver.findElement(By.xpath("//input[@value=\"None of the time\" and @name=\"question-13\"]")).click();
		driver.findElement(By.xpath("//input[@value=\"Most of the time\" and @name=\"question-14\"]")).click();
		driver.findElement(By.xpath("//button[text()='Calculate']")).click();

		Thread.sleep(1000);
		WebElement asthmaResultElement = driver
				.findElement(By.xpath("(//p[@class=\"text-xs font-bold text-[#141414]\"])[1]"));
		String asthmaRisk = asthmaResultElement.getText();
		System.out.println("Asthma Risk Result: " + asthmaRisk);

		WebElement copdResultElement = driver
				.findElement(By.xpath("(//p[@class=\"text-xs font-bold text-[#141414]\"])[2]"));
		String COPDRisk = copdResultElement.getText();
		System.out.println("COPD Risk Result: " + COPDRisk);

		driver.findElement(By.xpath("//a[@href=\"/breathefree-locator\"]")).click();

		Thread.sleep(4000);
		WebElement pinCode = driver.findElement(
				By.xpath("//input[@class=\"w-full py-3 border outline-none rounded-[10px] pl-12 bg-[#EFEFEF]\"]"));
		pinCode.click();
		pinCode.sendKeys("410206");

		driver.findElement(By.xpath("// button[text()='Search']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Direction']")).click();

	}

}
