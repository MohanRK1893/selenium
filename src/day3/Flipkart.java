package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manik\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
				//To open the browser
				WebDriver driver = new ChromeDriver();
				
				//To enter url
				driver.get("https://www.flipkart.com/");
				
				driver.manage().window().maximize();
				
				//need to ask why used click.click
				//WebElement click1 = driver.findElement(By.className("_1_3w1N"));
				//click1.click();
				
				WebElement txtnum = driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]"));
				txtnum.sendKeys("123456789");
				
				WebElement txtpass = driver.findElement(By.xpath("(//input[@autocomplete='off'])[3]"));
				txtpass.sendKeys("123456789");
				
				Thread.sleep(10000);
				driver.quit();
	}
}
