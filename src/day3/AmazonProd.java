package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonProd {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manik\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
				//open the browser
				WebDriver driver = new ChromeDriver();
				
				//enter url
				driver.get("https://www.amazon.in/");
				
				driver.manage().window().maximize();
				
				WebElement product = driver.findElement(By.xpath("//img[@alt='TVs']"));
				product.click();
				
				Thread.sleep(5000);
				
			//	driver.quit();
				
	}
}
