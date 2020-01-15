package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTest implements ITestListener {

	public void onTestStart(ITestResult result) {
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test name " + result.getName() + " successfully completed");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test name " + result.getName() + " failed");
	}

	public void onTestSkipped(ITestResult result) {
	
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
	}

	public void onTestFailedWithTimeout(ITestResult result) {
	
	}

	public void onStart(ITestContext context) {
		System.out.println("Test started running at " +context.getStartDate());
	}

	public void onFinish(ITestContext context) {
		System.out.println("Test completed at " + context.getEndDate());
	}
	

}
