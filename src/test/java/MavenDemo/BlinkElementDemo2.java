package MavenDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlinkElementDemo2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		byte ticks = 100;
		
		driver.findElement(By.xpath("(//*[@role='button'])[2]")).click();
		Thread.sleep(4000l);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//Thread.sleep(2000l);
		WebElement txtFirstName = driver.findElement(By.name("firstname"));
		highlight(js,txtFirstName,"My Cyber",ticks);
		
		WebElement txtLastName = driver.findElement(By.name("lastname"));
		highlight(js,txtLastName,"Success",ticks);
		
		WebElement txtEmail = driver.findElement(By.name("reg_email__"));
		highlight(js,txtEmail,"CyberSuccess@gmail.com",ticks);
		
		String val = driver.findElement(By.name("firstname")).getAttribute("value");
		System.out.println("value: " + val);
		
		String txt = driver.findElement(By.name("firstname")).getText();
		System.out.println("txt: " + txt);
		}

	 private static void highlight(JavascriptExecutor js, WebElement element, String data, int ticks) {

		 {
			 for(int i=0;i<=ticks;i++)
			 {
				 if (i%2==0)
					 
					 js.executeScript("argument[0].style.backgroundcolor='red'", element);
				 else
					 js.executeScript("argument[0].style.backgroundcolor='white'", element);
			 }
			 js.executeScript("argument[0].style.backgroundcolor='white'", element);
             element.sendKeys(data);
		 }
	}
}
