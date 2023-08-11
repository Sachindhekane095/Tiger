package MavenDemo;

import org.testng.annotations.Test;

public class Shipping {

	@Test(dataProvider = "DP2", dataProviderClass = DP.class)
	public void verifyPayment(String userName) {
		System.out.println(userName);
	}
}
