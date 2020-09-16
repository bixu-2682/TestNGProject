package CrossBrowsingTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossbrowserDemo {
	WebDriver driver;
	
	@Parameters("browser")
	@Test
	public void LaunchApp(String browser) throws InterruptedException {
		if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Drivers1\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Mozilla")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Drivers1\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", "D:\\Drivers1\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php#");
		
		Thread.sleep(3000);
		driver.quit();	
	}
}
