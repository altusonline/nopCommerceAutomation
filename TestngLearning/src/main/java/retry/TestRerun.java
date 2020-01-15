package retry;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRerun {
	
	@Test(retryAnalyzer = retry.RetryAnalyzer.class)
	public void test1() {
		Assert.fail();
	}
	
	@Test(retryAnalyzer = retry.RetryAnalyzer.class)
	public void test2() {
		Assert.assertTrue(true);
	}

	@Test(retryAnalyzer = retry.RetryAnalyzer.class)
	public void test3() {
		Assert.assertTrue(false);
	}
}
