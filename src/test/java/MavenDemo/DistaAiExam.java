package MavenDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DistaAiExam {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://dista.ai/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Thread.sleep(2000l);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500);", "");
		Thread.sleep(3000l);
		WebElement ele = driver.findElement(By.xpath("//div/span[@class='elementor-counter-number']"));
		WebElement ele1 = driver.findElement(By.xpath("//div/span[@class='elementor-counter-number-suffix']"));
		WebElement ele2 = driver.findElement(By.xpath("//div[@class='elementor-counter-title']"));
        System.out.println("1st text: "+ele.getText() + ele1.getText());
        System.out.println("Last text: " + ele2.getText());

        
        
		WebElement ele3 = driver.findElement(By.xpath("//div[@class='elementor-element elementor-element-2e22bda5 elementor-widget elementor-widget-counter']//div/span[2]"));
		WebElement ele4 = driver.findElement(By.xpath("//div[@class='elementor-element elementor-element-2e22bda5 elementor-widget elementor-widget-counter']//div/span[3]"));
		WebElement ele5 = driver.findElement(By.xpath("//div[@class='elementor-element elementor-element-2e22bda5 elementor-widget elementor-widget-counter']//div[2]"));

		System.out.println("1st text: "+ele3.getText() + ele4.getText());
        System.out.println("Last text: " + ele5.getText());
        
        WebElement ele6 = driver.findElement(By.xpath("//div[@class='elementor-element elementor-element-23052056 elementor-widget elementor-widget-counter']//div/span[2]"));
		WebElement ele7 = driver.findElement(By.xpath("//div[@class='elementor-element elementor-element-23052056 elementor-widget elementor-widget-counter']//div/span[3]"));
		WebElement ele8 = driver.findElement(By.xpath("//div[@class='elementor-element elementor-element-23052056 elementor-widget elementor-widget-counter']//div[2]"));

        System.out.println("1st text: "+ele6.getText() + ele7.getText());
        System.out.println("Last text: " + ele8.getText());

		driver.quit();	
	}
}
