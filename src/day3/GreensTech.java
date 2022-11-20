package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTech {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manik\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		//open the browser
				WebDriver driver = new ChromeDriver();
				
				//enter url
				driver.get("http://greenstech.in/selenium-course-content.html");
				
				driver.manage().window().maximize();
				
				WebElement btb1 = driver.findElement(By.id("heading20"));
				Thread.sleep(3000);
				btb1.click();
				
				Thread.sleep(3000);
				
				
				//doubt in find the locator using xpath
				WebElement btncts = driver.findElement(By.xpath("(//a [@title='Interview Questions'])[6]"));
				btncts.click();
				
				Thread.sleep(3000);
				
				//driver.quit();
				
	
}



}
