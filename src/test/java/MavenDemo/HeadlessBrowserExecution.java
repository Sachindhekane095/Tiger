package MavenDemo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HeadlessBrowserExecution {
	
	static void launchurl(WebDriver driver)
	{
		  driver.get("https://www.google.com");
		  System.out.println("title :  " + driver.getTitle());
		  System.out.println("url   : " + driver.getCurrentUrl());
	}
	
	
	public static void main(String[] args) throws InterruptedException {

/*
		  ChromeOptions option = new ChromeOptions(); 
		  option.setHeadless(true); 
		  option.addArguments("--headless");
		  WebDriver driver = new ChromeDriver(option);
		  driver.get("https://www.google.com");
		  System.out.println("title :  " + driver.getTitle());
		  System.out.println("url: " + driver.getCurrentUrl());

		  driver.quit();
*/		
/*	
// Firefox headless 
		  FirefoxOptions option = new FirefoxOptions(); 
//		  option.setHeadless(true); 
		  option.addArguments("--headless");
		  WebDriver driver=new FirefoxDriver(option);
		  launchurl(driver);
*/		  
		  
// Edge 
		  EdgeOptions option = new EdgeOptions(); 
//		  option.setHeadless(true);
		  option.addArguments("--headless");
		  WebDriver driver = new EdgeDriver(option);
		  launchurl(driver);	
	}

}

