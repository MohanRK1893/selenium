package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolSQA {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manik\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
	        	//open the browser
				WebDriver driver = new ChromeDriver();				
				//enter url
				driver.get("https://toolsqa.com/selenium-training?q=banner#enroll-form");				
				driver.manage().window().maximize();
				
				WebElement txtname = driver.findElement(By.id("first-name"));
				txtname.sendKeys("mohan");
				
				WebElement txtlastname = driver.findElement(By.id("last-name"));
				txtlastname.sendKeys("ravi");
				
				WebElement txtemail = driver.findElement(By.id("email"));
				txtemail.sendKeys("mohanravi1118@gmail.com");
				
				WebElement txtmobile = driver.findElement(By.id("mobile"));
				txtmobile.sendKeys("8778818110");
				
				WebElement txtcity = driver.findElement(By.id("city"));
				txtcity.sendKeys("chennai");
				
				WebElement txtmess = driver.findElement(By.id("message"));
				txtmess.sendKeys("welcome to toolsqa");
				
				//tagname[@attributename='attributevalue]
				WebElement clicksend = driver.findElement(By.xpath("//button[@class='btn btn-block btn-primary']"));
				clicksend.click();			
			
				Thread.sleep(3000);				
			//	driver.quit();

				
		
	}

}
