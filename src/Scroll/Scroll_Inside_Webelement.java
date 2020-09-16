package Scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Scroll_Inside_Webelement {
	public static WebDriver driver;

	@Test()
	public void testException1() throws InterruptedException 
		{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/WebTable.html");
		
		WebElement ele = driver.findElement(By.xpath("/html/body/section/div[1]/div/div[3]/div[2]/div[1]/div[2]/select"));
		
		Select select = new Select(ele);
		select.selectByVisibleText("30");
		
		Thread.sleep(2000);
		
		EventFiringWebDriver eventfiringwebdriver = new EventFiringWebDriver(driver);
		
		eventfiringwebdriver.executeScript("document.querySelector('//div[@class='ui-grid-viewport ng-isolate-scope']').scrollTop = 500");
		}
}