package Annotataions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsOnMethods_Demo {
	@Test
	public void testcase1() {
		System.out.println("testcase1 pass");		
		//Assert.assertTrue(false);
	}
	
	
	@Test(dependsOnMethods = {"testcase1"})
	public void testcase2() {
		System.out.println("testcase1 pass and testcase2 pass");		
	}
	
	@Test(dependsOnMethods = {"testcase1", "testcase2"})
	public void testcase3() {
		System.out.println("testcase1 pass and testcase2 pass and testcase3 pass");		
	}
}
