package attributes;

import org.testng.annotations.Test;

public class FlightSearch {
	
	@Test(description = "JIRA-12345 : admin can add user",groups = {"regression"})
	public void sprint1() {
		System.out.println("spring 1 test");
	}

	
	@Test(groups = {"regression"})
	public void sprint2() {
		System.out.println("spring 2 test");
	}

	
	@Test(groups = {"smoke"})
	public void sprint3() {
		System.out.println("spring 3 test");
	}

	
	@Test(groups = {"smoke"})
	public void sprint4() {
		System.out.println("spring 4 test");
	}

	
	@Test(groups = {"sanity"})
	public void sprint5() {
		System.out.println("spring 6 test");
	}

}
