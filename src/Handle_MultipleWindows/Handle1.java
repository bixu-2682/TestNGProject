package Handle_MultipleWindows;

import java.awt.AWTException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Handle1 {
	WebDriver driver;
	@Test()
	public void testException1() throws AWTException, InterruptedException 
		{
		System.setProperty("webdriver.gecko.driver", "D:\\Drivers1\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.automationtestinginsider.com/p/selenium-vi.html");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Selenium and it’s History')]")).click();
		Thread.sleep(3000);
		
		String mainTitle = driver.getTitle();
		System.out.println(mainTitle);
		//driver.findElement(By.xpath("span[text()='Selenium and it’s History']")).click();
		//driver.close();  //Closed main window
		
		
		Set<String> windowids = driver.getWindowHandles();
		Iterator<String> iterator = windowids.iterator();
		
		String mainwindow = iterator.next();
		String childwindow = iterator.next();
		
		driver.switchTo().window(childwindow);
		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[contains(@class,'wikipedia-search-button')]")).click();
		driver.close();
		
		driver.switchTo().window(mainwindow);
		
		if(driver.getTitle().equals(mainTitle)) {
			System.out.println("Both are same");
		}else
		{
			System.out.println("Both are not same");
		}
		driver.close();
		}
}