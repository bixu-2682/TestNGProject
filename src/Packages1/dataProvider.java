package Packages1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class dataProvider {
	WebDriver driver;
	@BeforeMethod
	public void setUp() {		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		System.out.println("This is before method");
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php#");
	}	
	
	@Test(dataProvider="LoginData")
	public void login(String uname,String pwd) {
	System.out.println("Login started");
	driver.findElement(By.name("txtUserName")).sendKeys(uname);
	driver.findElement(By.name("txtPassword")).sendKeys(pwd);
	driver.findElement(By.name("Submit")).click();
	System.out.println("Login sucess");
	System.out.println(driver.getTitle());
	Assert.assertTrue(driver.getTitle().contains("OrangeHRM"));
	System.out.println("Title matched");
	driver.findElement(By.linkText("Logout")).click();
	}
	
	@AfterMethod
	public void tearDown() {
		System.out.println("This is After method");
		driver.quit();
	}
	@DataProvider(name = "LoginData")
	public static Object[][] logincredential(){
		 Object[][] data = new Object[3][2];//rows/col
		 data[0][0] = "admin";
		 data[0][1] = "admin";
		
		 data[1][0] = "admin";
		 data[1][1] = "admin";
		 
		 data[2][0] = "admin";
		 data[2][1] = "admin";		
		 
		 return data;
		 }	
}
