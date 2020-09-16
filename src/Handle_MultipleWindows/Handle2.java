package Handle_MultipleWindows;


import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class Handle2 {

	public static WebDriver driver;
	@Test()
	public void testException1() throws InterruptedException 
		{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Windows.html");
		
		//System.out.println("Title of main window : " + driver.getTitle());
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='Tabbed']/a/button")).click();
		
		Thread.sleep(2000);
		
		SwitchWindow(2);
		System.out.println("The Title of child window :" + driver.getTitle());
		
		Thread.sleep(2000);
		driver.close();
		
		SwitchWindow(1);
		System.out.println("The Title of Parent window :" + driver.getTitle());
		
		
	  }
	public static void SwitchWindow(int index) {
		String WindowId= null;
		
		Set<String> windowsIds = driver.getWindowHandles();
		Iterator<String> iter = windowsIds.iterator();
		
		for(int i=1; i<=index; i++) {
			WindowId = iter.next();
		}
		
		driver.switchTo().window(WindowId);
	}
	
	
	
	
	
}