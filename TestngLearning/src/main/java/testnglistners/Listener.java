package testnglistners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("test  " + result.getName() + " started");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName() +  "completed");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName() + "failed");
	}

	public void onTestSkipped(ITestResult result) {
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
	
	}

	public void onStart(ITestContext context) {
		System.out.println("test started at " + context.getStartDate());
	}

	public void onFinish(ITestContext context) {
		System.out.println("test started at " + context.getEndDate());
	}


	
}
