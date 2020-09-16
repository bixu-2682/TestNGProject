package DataProvider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataProvider_Demo1 {

	public WebDriver driver;
	public void Baseclass()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers1\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php#");
	}
}
