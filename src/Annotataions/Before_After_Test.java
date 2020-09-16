package Annotataions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Before_After_Test {

	/*Logger logger = Logger.getLogger("Logs");
	PropertyConfigurator.configure("log4j.properties");*/
	
	public WebDriver driver;	
	@BeforeTest
	public void setUp() {
		System.out.println("Before Test");
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php#");
	}
	
	
	
	@Test
	public void tc1() {
		String Title = driver.getTitle();
		System.out.println(Title);
	}
	
	@AfterTest
	public void tear() {
		driver.close();
		System.out.println("close the Brower");
	}
}
