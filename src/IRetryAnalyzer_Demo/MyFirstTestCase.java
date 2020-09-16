package IRetryAnalyzer_Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



@Listeners(IRetryAnalyzer_Demo.Listeners_Demo.class)
public class MyFirstTestCase {
	@Test
	public void GoogleTitleVerify()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.close();
	}
}
