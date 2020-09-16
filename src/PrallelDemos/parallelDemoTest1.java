package PrallelDemos;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallelDemoTest1 {
	public WebDriver driver;
	@Test
	public void testcase1() throws InterruptedException
	{
		System.out.println("This is testcase1 : " + Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers1\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
		System.out.println("This is before method");
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php#");
		Thread.sleep(3000);
		driver.close();
	}	
	
	@Test
	public void testcase2() {
		System.out.println("This is testcase2 :" + Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("This is before method");
		driver.get("https://www.youtube.com/");
	}
	
}
