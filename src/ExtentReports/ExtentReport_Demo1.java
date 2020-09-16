package ExtentReports;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class ExtentReport_Demo1 {

	WebDriver driver;
	@BeforeTest
	public void LaunchBrowser() {
		System.setProperty("wendriver.chrome.driver","");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("");
		System.out.println("Browser Launched");
	}
}
