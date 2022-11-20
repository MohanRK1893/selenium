package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manik\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
				//open the browser
				WebDriver driver = new ChromeDriver();
				
				//enter url
				driver.get("https://www.snapdeal.com/");
				
				driver.manage().window().maximize();
				WebElement btn1 = driver.findElement(By.className("accountInner"));
				btn1.click();
				
				WebElement btn2 = driver.findElement(By.className("newUserRegister"));
				btn2.click();
				
				WebElement txtuser = driver.findElement(By.id("userName"));
				txtuser.sendKeys("12345678");
				
				WebElement btn3 = driver.findElement(By.id("checkUser"));
				btn3.click();
				
				Thread.sleep(3000);
				driver.quit();

}}
