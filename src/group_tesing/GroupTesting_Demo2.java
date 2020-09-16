package group_tesing;

import org.testng.annotations.Test;

public class GroupTesting_Demo2 {
	@Test(groups= {"Sanity"})
	public void testcase1()
	{
		System.out.println("Sanity testing");
	}
	@Test(groups= {"Sanity", "Regression"})
	public void testcase2()
	{
		System.out.println("Sanity testing and Regression Testing");
	}
	@Test(groups = {"Regression"})
	public void testcase3()
	{
		System.out.println("Regression Testing");
	}
	@Test(groups = {"System Testing"})
	public void testcase4()
	{
		System.out.println("System Testing");
	}
}
