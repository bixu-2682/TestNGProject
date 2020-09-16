package Handle_Exception_TestNG;



import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testException {
	
	WebDriver driver;
	@Test(expectedExceptions = { IOException.class, NoSuchElementException.class })
	public void testException1() 
		{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q"));
	}
}
