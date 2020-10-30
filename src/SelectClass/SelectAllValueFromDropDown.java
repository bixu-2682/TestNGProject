package SelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAllValueFromDropDown {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D:\\Drivers1\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://127.0.0.1/orangehrm-2.6/login.php#");
		  driver.findElement(By.name("txtUserName")).sendKeys("admin");
		  driver.findElement(By.name("txtPassword")).sendKeys("admin");
		  driver.findElement(By.name("Submit")).click();
		  
		  driver.switchTo().frame(0);
		  	  
		  WebElement ele = driver.findElement(By.xpath("//*[@name='loc_code']"));
		  
		  Select sel = new Select(ele);
		  
		  List<WebElement> all = sel.getOptions();
		  int totalsize = all.size();
		  System.out.println(totalsize);
		  
		  for (WebElement allElement : all) {
			allElement.getText();
			System.out.println(allElement.getText());
		}
	}
}
