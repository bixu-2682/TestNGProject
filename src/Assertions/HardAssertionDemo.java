package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionDemo {
	@Test
	public void testcase1() {
	System.out.println("================");
	System.out.println("Test1 Start");
	Assert.assertTrue(false);
	System.out.println("Test1 End");
	System.out.println("================");
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
//Hard Assertions 