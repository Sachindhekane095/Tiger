package MavenDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestPractice {
	static WebDriver driver;

	private static WebElement getWebElement(By by) {
		return driver.findElement(by);
	}

	private static void type(By by, String value) {
		getWebElement(by).sendKeys(value);
	}

	public static void main(String[] args)  {
		String url = "https://www.facebook.com/login/";
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize(); 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
		getWebElement(By.xpath("//a[@class='_97w5']")).click();

		By fname = By.xpath("(//input[@type='text'])[1]");
		By lname = By.xpath("(//input[@type='text'])[2]");
		By email = By.xpath("(//input[@type='text'])[3]");
		By reemail = By.xpath("(//div[3]//input[@type='text'])[1]");
		By password = By.xpath("//input[@id='password_step_input']");
		By day = By.xpath("//select[@id='day']");
		By month = By.xpath("//select[@id='month']");
		By year = By.xpath("//select[@id='year']");
		
		
		type(fname, "Sachin");
		type(lname, "Dhekane");
		type(email, "dhekanesachin095@gmail.com");
		type(reemail, "dhekanesachin095@gmail.com");
		type(password, "Sachin@123");
		type(day, "03");
		type(month, "May");
		type(year, "1998");
		
		getWebElement(By.xpath("(//span/input[@type='radio'])[3]")).click();
		getWebElement(By.xpath("//div/select[@aria-label='Select your pronoun']")).click();
		getWebElement(By.xpath("//div/select/option[@value='1']")).click();

		//getWebElement(By.xpath("//div[7]//span[2]//input")).click();
		//getWebElement(By.xpath("//div[11]//button")).click();
	
	}
}