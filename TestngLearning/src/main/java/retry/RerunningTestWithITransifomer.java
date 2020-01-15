package retry;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RerunningTestWithITransifomer {

	
	@Test
	public void test1() {
		Assert.fail();
	}
	
	@Test
	public void test2() {
		Assert.assertTrue(true);
	}

	@Test
	public void test3() {
		Assert.assertTrue(false);
	}
}
