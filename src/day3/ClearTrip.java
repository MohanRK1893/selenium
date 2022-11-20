package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTrip {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manik\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		        //To open the browser
				WebDriver driver = new ChromeDriver();
				
				//To enter url
				driver.get("https://www.cleartrip.com/trains");
				
				driver.manage().window().maximize();
				
				WebElement txtfrom = driver.findElement(By.id("from_station"));
				txtfrom.sendKeys("central");

				WebElement txtto = driver.findElement(By.id("to_station"));
				txtto.sendKeys("ranchi");
				Thread.sleep(3000);
				
				WebElement trip = driver.findElement(By.id("trainFormButton"));
				trip.click();
				
				Thread.sleep(3000);
				driver.quit();
}}
