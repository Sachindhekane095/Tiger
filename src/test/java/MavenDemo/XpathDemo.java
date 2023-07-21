package MavenDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.letskodeit.com/practice";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

		// WebElement rBtnBmw = driver.findElement(By.xpath("//input[@id='bmwradio']"));
		// rBtnBmw.click();
		//driver.findElement(By.xpath("//input[@value='bmw'and type='radio]")).click();
		//WebElement rBtnHonda = driver.findElement(By.xpath("//input[@id='hondaradio']"));
		//rBtnHonda.click();
		//driver.findElement(By.xpath("//input[@value='honda'and type='radio]")).click();
		WebElement rBtnBenz = driver.findElement(By.xpath("//input[@id='benzradio']"));
		rBtnBenz.click();
		//driver.findElement(By.xpath("//input[@value='benz'and type='radio]")).click();
		Thread.sleep(4000l);
		driver.quit();
	}

}
