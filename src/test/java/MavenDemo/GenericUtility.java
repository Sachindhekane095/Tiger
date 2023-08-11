package MavenDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericUtility {
	static WebDriver driver;
	static WebElement getWebElement(By by)
	{
		return driver.findElement(by);
	}

	static void type(By by, String value)
	{
		getWebElement(by).sendKeys(value);
	}

	public static void main(String[] args) 
	{
		By firstName = By.name("firstname");
		By lastName  = By.name("lastname");
		By email     = By.name("reg_email__");
		By emailConfirmation = By.name("reg_email_confirmation__");
		By pwd       = By.name("reg_passwd__");

		String url = "https://www.facebook.com/";
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
	getWebElement(By.linkText("Create new account")).click();
	
	type(firstName, "Dhekane");
	type(lastName,"Sachin");
	type(email, "dhekanesachin095@gmail.com");
	type(emailConfirmation,"dhekanesachin095@gmail.com");
	type(pwd,"Cyber@123");
	
	}
}