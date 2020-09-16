package PrallelDemos;

import org.testng.annotations.Test;

public class parallelDemoTest2 {
	
	@Test
	public void testcaseb() {
		System.out.println("This is test caseb : " + Thread.currentThread().getId());
	}

}
