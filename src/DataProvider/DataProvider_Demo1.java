package DataProvider;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProvider_Demo1 {

	 WebDriver driver;

	 @Test
	 public void disableEleTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\Drivers1\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com/");
	  
	  List<WebElement> allElements = driver.findElements(By.xpath("//*"));
	  int totalWebElements = allElements.size();
	  System.out.println("Total WebElements: " + totalWebElements);
	  int enableCount = 0;
	  
	  for (WebElement ele : allElements) {
	   if (ele.isEnabled()) {
	    enableCount++;
	   }
	  }
	  System.out.println("Total Disable elements: " + (totalWebElements-enableCount));
	  driver.close();
	 } 
}
