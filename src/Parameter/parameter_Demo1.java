package Parameter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter_Demo1 {

	
	@Test
	@Parameters({"uname", "Pwd"})
	public void login(String uname, String Pwd) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D:\\Drivers1\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php#");
		
		driver.findElement(By.name("txtUserName")).sendKeys(uname);
		driver.findElement(By.name("txtPassword")).sendKeys(Pwd);
		
		driver.findElement(By.name("Submit")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Logout")).click();
	}
}
