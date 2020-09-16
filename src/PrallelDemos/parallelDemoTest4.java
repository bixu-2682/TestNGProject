package PrallelDemos;

import org.testng.annotations.Test;

public class parallelDemoTest4 {

	@Test
	public void testcase1() {
		System.out.println("This is testcase1 : " + Thread.currentThread().getId());
	}
	
	@Test
	public void testcase2() {
		System.out.println("This is testcase2 : " + Thread.currentThread().getId());
	}
}
