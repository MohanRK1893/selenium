package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manik\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		//open the browser
		WebDriver driver = new ChromeDriver();
		
		//enter url
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement txtsearch = driver.findElement(By.id("twotabsearchtextbox"));
		txtsearch.sendKeys("iphone");
		
		WebElement button = driver.findElement(By.id("nav-search-submit-button"));
		button.click();
		
		Thread.sleep(3000);
		
		driver.quit();
	
	}
	
}
