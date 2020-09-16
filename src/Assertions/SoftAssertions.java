package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertions {
	
	SoftAssert obj = new SoftAssert();
	@Test
	public void testcase1() {
	System.out.println("================");
	System.out.println("Test1 Start");
	obj.assertTrue(false, null);	
	obj.assertEquals("Hello", "HELLO");
	System.out.println("Test1 End");
	System.out.println("================");
	obj.assertAll();
	}
	
	@Test
	public void testcase2() {
	System.out.println("================");
	System.out.println("Test2 Start");
	Assert.assertTrue(true);
	System.out.println("Test2 End");
	System.out.println("================");
	}
}
