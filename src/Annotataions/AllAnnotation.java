package Annotataions;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotation {
	
	@BeforeSuite
	public void beforesuite() {
	System.out.println("BeforeSuite is Executed");
	
	}
		
	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeTest is Executed");
	}
	
	@BeforeClass
	public void beforeClass() {
	System.out.println("BeforeClass is Executed");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod is Executed");
	}

	
	@Test
	public void testcase1() {
		System.out.println("actually test case1");		
	}
	
	
	@Test
	public void testcase2() {
		System.out.println("actually test case2");		
	}
	

	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod is Executed");
	}
	
	@AfterClass
	public void afterClass() {
	System.out.println("AfterClass is Executed");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("AfterTest is Executed");
	}	
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("AfterSuite is Executed");
	}
}
