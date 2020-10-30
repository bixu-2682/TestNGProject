package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
	WebDriver driver;

	 @Test(dataProvider="Entry")
	 public void disableEleTest(String field) {
	  System.setProperty("webdriver.chrome.driver","D:\\Drivers1\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com/");
	  WebElement search = driver.findElement(By.name("q"));
	  search.sendKeys(field+Keys.ENTER);
	  driver.close();
   }
	 
	 
	 @DataProvider(name="Entry")
	 public Object[][] load()
	 {
		 
		return new Object[][] {{"kbtutorial"}, {"youtube channel"}};
	 }
	 
}