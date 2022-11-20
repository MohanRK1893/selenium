package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensModelResume {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manik\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		        
				//open the browser
				WebDriver driver = new ChromeDriver();
				
				//enter url
				driver.get("http://greenstech.in/selenium-course-content.html");
				
				driver.manage().window().maximize();
				
				WebElement btn1 = driver.findElement(By.id("heading201"));
				
				Thread.sleep(3000);
				
				btn1.click();
				Thread.sleep(3000);
				
				WebElement btnzoho = driver.findElement(By.xpath("(//a[@title='Model Resume training in chennai'])[1]"));
				
				Thread.sleep(4000);
				
				btnzoho.click();
				
				Thread.sleep(3000);
				
				driver.quit();
	}

}
