package MavenDemo;

import org.junit.Assert;
import org.testng.annotations.Test;

public class TestNg1 {

	@Test
	public void verifyUrl()
	{
		Assert.fail();
		System.out.println("Verify URL...");
	}

	
	@Test
	public void verifyTitle()
	{
		System.out.println("Verify test title...");
}
}