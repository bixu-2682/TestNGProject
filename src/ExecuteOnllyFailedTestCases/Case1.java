package ExecuteOnllyFailedTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Case1 {

	
	@Test
	public void testcase1() {
		Assert.assertTrue(true);
		System.out.println("testcase 1 passed at the assert true");
	}
	
	@Test
	public void testcase2() {
		Assert.assertTrue(1>0);
		System.out.println("testcase 2 passed as 1 is greater then 0");
	}
	
	@Test
	public void testcase3() {
		Assert.assertTrue(false);
		System.out.println("testcase 3 failed at the assert false");
	}
	
	@Test
	public void testcase4() {
		Assert.assertTrue(1<0);
		System.out.println("testcase 2 passed as 0 is less then 1");
	}
}
