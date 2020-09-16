package runFailedTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class runFailedTestcase1 {

	@Test
	public void testcase1() {
	System.out.println("this is testcase1");
	Assert.assertTrue(true);
	}
	
	@Test
	public void testcase2() {
	System.out.println("this is testcase1");
	Assert.assertTrue(true);
	}
}
