package Annotataions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test
public class ApplyAnnotation {

	public WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		System.out.println("Before class");
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		}
	
	//@Test(priority=1, description= "LaunchBrowser")
	public void LaunchBrowser() {
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php#");
		boolean img =driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[1]/td[2]/img")).isDisplayed();
		Assert.assertTrue(img);
	}
	
	//@Test(priority=2, description= "Login into appliaaaction")
	public void Login() {
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
	}
	
	//@Test(priority=3, description="Current URL", invocationCount=3)
	public void currURL() {
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
	}
	

	//@Test(priority=4, description= "varify Title ")
	public void titleTest() {
		String actualTitle = driver.getTitle();
		  String expectedTitle = "OrangeHRM";
		  Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@AfterClass
	public void tearDown() {
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("After Class");
	}
	
	
}
