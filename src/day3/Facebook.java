package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manik\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		        
		        //To open the browser
				WebDriver driver = new ChromeDriver();
				
				//To enter url
				driver.get("https://www.facebook.com/");
				
				//To maximize the window
				driver.manage().window().maximize();
				
				WebElement txtusername = driver.findElement(By.xpath("//input[@id=\"email\"]"));
				txtusername.sendKeys("mohan");
				
				WebElement txtpassword = driver.findElement(By.xpath("//input[@id=\"pass\"]"));
				txtpassword.sendKeys("180693");
				
				WebElement btnlogin = driver.findElement(By.xpath("//button[@value='1']"));
				btnlogin.click();
									
				Thread.sleep(10000);
				driver.quit();
	}
}
