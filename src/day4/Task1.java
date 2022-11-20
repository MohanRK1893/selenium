package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manik\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		//open the browser
				WebDriver driver = new ChromeDriver();
				
				//enter url
				driver.get("https://www.adactinhotelapp.com/");
				
				driver.manage().window().maximize();
				
				WebElement txtlogin = driver.findElement(By.xpath("//p(contains (text(), 'Adactin')]"));
				String text=txtlogin.getText();
				System.out.println(text);
				Thread.sleep(2000);
				
				driver.quit();	
				
	
}}