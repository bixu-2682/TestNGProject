package Annotataions;

import org.testng.annotations.Test;

public class PriorityDemo {
	
	
	@Test(enabled=false)
	public void testcase1()
	{
		System.out.println("enabled testcases");
	}
	@Test(enabled=false)
	public void testcase2()
	{
		System.out.println("disabled testcase");
	}
	@Test(enabled=true)
	public void testcase3()
	{
		System.out.println("enabled testcases");
	}
}
