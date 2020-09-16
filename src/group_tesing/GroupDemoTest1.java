package group_tesing;

import org.testng.annotations.Test;

public class GroupDemoTest1 {

	
	@Test(groups = {"sanity"})
	public void test1()
	{
		System.out.println("sanity testing");
	}
	@Test(groups = {"sanity", "regression"})
	public void test2()
	{
		System.out.println("sanity and regression testing");
	}
	
	@Test(groups= {"regression"})
	public void test3()
	{
		System.out.println("regression testing");
	}
	
	@Test
	public void test4()
	{
		System.out.println("functional testing");
	}
}
