package runFailedTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class runFailedTestcase2 {

	@Test
	public void testcase3() {
	System.out.println("this is testcase3");
	Assert.assertTrue(true);
	}
	
	@Test
	public void testcase4() {
	System.out.println("this is testcase4");
	Assert.assertTrue(false);
	}
}
