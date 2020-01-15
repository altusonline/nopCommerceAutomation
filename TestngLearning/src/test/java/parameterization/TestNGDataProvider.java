package parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProvider {
	
	@Test(dataProvider = "getData")
	public void userLoginTest(String userName, String userPassword) {
		System.out.println("Login ID is: " + userName + "   " + "Password is " + userPassword);
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[4][2];
		
		data[0][0] = "user1@gmail.com";
		data[0][1] = "user1Password";
		
		data[1][0] = "user2@gmail.com";
		data[1][1] = "user2Password";
		
		data[2][0] = "user3@gmail.com";
		data[2][1] = "user3Password";
		
		data[3][0] = "user4@gmail.com";
		data[3][1] = "user4Password";
		
		return data;
		
	}

}
