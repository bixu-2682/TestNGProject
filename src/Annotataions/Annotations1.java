package Annotataions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations1 {

	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		System.out.println("Before Method");
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php#");
		
	}
	
	@Test
	public void Title() {
		System.out.println("testcase1");
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	@Test(enabled=true)
	public void login() {
		System.out.println("testcase2");
	driver.findElement(By.name("txtUserName")).sendKeys("admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin");
	driver.findElement(By.name("Submit")).click();
	
	}
	
	
	@AfterMethod
	public void tearDown() {
		System.out.println("AfterMethod");
		driver.close();
	}
}