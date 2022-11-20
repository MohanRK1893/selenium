package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Flipkart {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manik\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		// to launch browser
		WebDriver driver =new ChromeDriver();	
		
		// to give url
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Actions drag = new Actions (driver);
		
		Thread.sleep(4000);
		WebElement source = driver.findElement(By.className("_2KpZ6l _2doB4z"));
		drag.moveToElement(source);
		drag.click();
		
		
		WebElement source1 = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
		
		
		drag.moveToElement(source1).perform();
		Thread.sleep(4000);
		
		WebElement source2 = driver.findElement(By.xpath("(//a[text()='Bath Towels'])[1]"));
		source2.click();
		Thread.sleep(4000);
		
		WebElement txt = driver.findElement(By.xpath("(//a[text()='STAMIO Cotton 425 GSM Bath Towel'])[1]"));
		String attribute = txt.getAttribute("text");
		System.out.println(attribute);
		Thread.sleep(4000);
		driver.quit();
	}
	

}
