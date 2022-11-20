package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manik\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		// to launch browser
		WebDriver driver =new ChromeDriver();	
		
		// to give url
		driver.get("https://www.amazon.in/");
		
		//maximize
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		WebElement source = driver.findElement(By.id("nav-link-amazonprime"));
		
		Actions  drag = new Actions (driver);
		drag.moveToElement(source).perform();
		
		Thread.sleep(4000);
		
		WebElement source2 = driver.findElement(By.id("multiasins-img-link"));
		source2.click();
		Thread.sleep(4000);
		driver.quit();
	}	


}
