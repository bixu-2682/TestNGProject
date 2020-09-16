package IRetryAnalyzer_Demo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners_Demo implements ITestListener
{
	@Override
	public void onFinish(ITestContext arg0) {
			}
	@Override
	public void onStart(ITestContext arg0) {
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
			
	}
	@Override
	public void onTestFailure(ITestResult result)
	{		
		System.out.println("Testcases failed and Testcases details are " + result.getName());
	}
	@Override
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("Testcases Skipped and Testcases details are " + result.getName());
	}
	@Override
	public void onTestStart(ITestResult result)
	{
			System.out.println("Testcases Started and Testcases details are " + result.getName());
	}
	@Override
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Testcases Success and Testcases details are " + result.getName());
	}
}
