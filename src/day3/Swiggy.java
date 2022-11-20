package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manik\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		//open the browser
				WebDriver driver = new ChromeDriver();
				
				//enter url
				driver.get("https://www.swiggy.com/");
				
				driver.manage().window().maximize();
				WebElement btb1 = driver.findElement(By.className("r2iyh"));
				btb1.click();

				WebElement txtmob = driver.findElement(By.id("mobile"));
				txtmob.sendKeys("123456");
				
				WebElement txtname = driver.findElement(By.id("name"));
				txtname.sendKeys("deepak");
				
				WebElement txtpass = driver.findElement(By.id("email"));
				txtpass.sendKeys("@gmail");
				
				WebElement btb2 = driver.findElement(By.className("a-ayg"));
				btb2.click();
				Thread.sleep(4000);
				driver.quit();

}}
