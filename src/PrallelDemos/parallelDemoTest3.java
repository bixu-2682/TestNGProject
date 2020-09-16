package PrallelDemos;

import org.testng.annotations.Test;

public class parallelDemoTest3 {
	@Test
	public void testcasec() {
		System.out.println("This is test casec : " + Thread.currentThread().getId());
	}
	@Test
	public void testcasec1() {
		System.out.println("This is test casec1 : " + Thread.currentThread().getId());
	}
}
