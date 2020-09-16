package DownLoad_Options;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Using_RobotClass {
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
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		System.out.println("First Tab");
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		System.out.println("Second Tab");
		
		r.keyPress(KeyEvent.VK_ENTER);
		
		}
}

