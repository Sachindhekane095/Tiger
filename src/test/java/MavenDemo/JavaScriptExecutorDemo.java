package MavenDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Thread.sleep(4000l);
		// scrolldown using JavascriptExecutor
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,2000);", "");
		Thread.sleep(3000l);
		
		// scrollUp using JavascriptExecutor
		js.executeScript("window.scrollBy(0,-2000);","");
		
		//sendkeys/entering text into text field using javascriptexecutor
		WebElement txtSearch = driver.findElement(By.name("s"));
		js.executeScript("arguments[0].value='Sachin Prafull';",txtSearch);
		//clicking using javascriptexecutor
		WebElement lnkAbout = driver.findElement(By.xpath("//a[@href='https://jqueryui.com/about/']"));
		js.executeScript("arguments[0].click();",lnkAbout);
		
		WebElement actHdr = driver.findElement(By.xpath("//h1[contains(text(),'About jQuery UI')]"));
		String expHdr = "About jQuery UI";
		if(actHdr.equals(expHdr))
			System.out.println("Test case Passed");
		else
			System.out.println("Test Case Failed");
		
		driver.navigate().back();
		
		WebElement lnkTwitter = driver.findElement(By.linkText("Twitter"));
		
		js.executeScript("arguments[0].scrollIntoView(true);", lnkTwitter);
		driver.quit();

	}
	

	
	
	
	
}
