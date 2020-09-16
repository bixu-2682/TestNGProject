package DownLoad_Options;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Using_AutoIT {
	WebDriver driver;
	@Test()
	public void testException1() throws AWTException 
		{
		System.setProperty("webdriver.gecko.driver", "D:\\Drivers1\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://java.com/en/download/");
		
		driver.findElement(By.xpath("//span[contains(text(),'Java Download')]")).click();
		System.out.println("Java Download");
		
		driver.findElement(By.xpath("//span[contains(text(),'Agree and Start Free Download')]")).click();
		
		System.out.println("Agree and Start Free Download");
		}
}