package MavenDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendKeys {

public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String s1= "Sachin";
		String s2= "Rahul";
		String s3= "Sagar";
		String s4= "Pankaj";
		String s5= "Prafull";
		
		driver.findElement(By.name("s")).sendKeys(s1,s2,s3,s4,s5);
		
		driver.quit();
		
	}
}

