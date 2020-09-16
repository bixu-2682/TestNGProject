package runner;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class TestRunner {

	public static void main(String[] args) {
		
		TestNG runner = new TestNG(); //Creating object of TestNG class. 
		
		List<String> list = new ArrayList<>(); //creating of list
		
		list.add("C:\\Users\\Lakshmi\\eclipse-NewStart\\TestNG_Project\\test-output\\IRetryAnalyzer\\testng-failed.xml"); //Add Files
		
		runner.setTestSuites(list);
		
		runner.run();
	}
}
