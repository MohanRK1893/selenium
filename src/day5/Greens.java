package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Greens {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manik\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		// to launch browser
		WebDriver driver =new ChromeDriver();	
		
		// to give url
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		WebElement source = driver.findElement(By.className("header-browse-greens"));
		
		Actions  drag = new Actions (driver);
		drag.moveToElement(source).perform();
		
		Thread.sleep(4000);
		
		WebElement source2 = driver.findElement(By.xpath("//span[text()='Software Testing (12)']"));
		drag.moveToElement(source2).perform();
		WebElement source3 = driver.findElement(By.xpath("//span[text()='Selenium Certification Training']"));
		source3.click();
		Thread.sleep(4000);
		driver.quit();
	}
}
