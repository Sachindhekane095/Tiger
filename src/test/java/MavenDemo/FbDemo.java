package MavenDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbDemo {
public static void main(String[]args)throws InterruptedException{
	String url = "https://www.facebook.com/";
	WebDriver driver = new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	
	WebElement txtEmail = driver.findElement(By.id("email"));
	txtEmail.clear();
	txtEmail.sendKeys("abc@gmail.com");
	
	WebElement txtpwd = driver.findElement(By.id("pass"));
	txtpwd.clear();
	txtpwd.sendKeys("abc@123");
	
	Thread.sleep(3000l);
	
	WebElement btnLogin = driver.findElement(By.name("login"));
	btnLogin.click();
	
	WebElement lnkForgotpwd = driver.findElement(By.className("_97w4"));
	lnkForgotpwd.clear();
	
	driver.findElement(By.id("identify_email")).sendKeys("abc@gmail.com");
	driver.findElement(By.id("did_submit")).click();
	
	Thread.sleep(3000l);
	
	
	driver.quit();
}
}
