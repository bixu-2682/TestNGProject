package Scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.Test;

public class Scroll_Case1 {
	public static WebDriver driver;

	@Test()
	public void testException1() throws InterruptedException 
		{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.amazon.in/");
		driver.get("https://the-internet.herokuapp.com/infinite_scroll");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		/*1. scroll to specific location (x, y co-ordinates)
		 	https://www.amazon.in/
			window.scroll() window.scrollBy window.scrollTo
			jse.executeScript("window.scroll(0,1500)");
			 */
		
		/*2. Scroll up to an element  (Using scrollIntoView)
		 	WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'s Deals')]"));
			jse.executeScript("arguments[0].scrollIntoView(true)",ele);*/
		
		
		/*3. Scroll until the bottom of the pages (Using ScrollHeight)
			//jse.executeScript("window.scroll(0,document.body.scrollHeight)");*/
		
		
		/* 4. Horizontal scroll
		 //jse.executeScript("window.scroll(1500,0)");*/
		
		
		/*5. scroll bar ()  WebElement
		https://the-internet.herokuapp.com/horizontal_slider
		
		WebElement slidebar = driver.findElement(By.xpath("//input[@type='range']"));
		slidebar.sendKeys(Keys.END);*/
		
		//6. scroll dynamically for loading pages (loop)
		//https://the-internet.herokuapp.com/infinite_scroll
		
		long initialHeight = (long)(jse.executeScript("return document.body.scrollHeight"));
		while(true)
		{
			jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			Thread.sleep(2000);
			long currentHeight = (long)(jse.executeScript("return document.body.scrollHeight"));
			
			if(initialHeight==currentHeight)
			{
				break;
			}
		}
		
}
}