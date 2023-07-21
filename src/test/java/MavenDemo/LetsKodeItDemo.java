package MavenDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LetsKodeItDemo {

	public static void main(String[] args) throws InterruptedException{
String url = "https://www.letskodeit.com/practice";
WebDriver driver = new ChromeDriver();
driver.get(url);
driver.manage().window().maximize();

System.out.println(driver.getCurrentUrl());
System.out.println(driver.getTitle());

driver.findElement(By.id("hondaradio")).click();
Thread.sleep(3000l);

driver.findElement(By.id("bmwradio")).click();
Thread.sleep(3000l);

driver.findElement(By.id("benzradio")).click();
Thread.sleep(3000l);

driver.quit();
	}

}
