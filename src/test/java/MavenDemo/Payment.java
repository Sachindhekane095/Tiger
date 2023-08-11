package MavenDemo;

import org.testng.annotations.Test;

public class Payment {

	@Test(dataProvider = "DP1", dataProviderClass = DP.class)
	public void verifyPayment(String userName, String password) {
		System.out.println(userName + " : " + password);
	}
}
