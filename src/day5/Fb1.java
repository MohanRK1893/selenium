package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manik\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		// to launch browser
		WebDriver driver =new ChromeDriver();
		
		//to maximize the window 
		//a.manage().window().maximize();	
		
		// to give url
		driver.get("https://www.facebook.com/");
		
		WebElement btbcreate = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		btbcreate.click();
		Thread.sleep(4000);
		
		WebElement txtname = driver.findElement(By.name("firstname"));
		txtname.sendKeys("Mohan");
		
		Thread.sleep(300);
		
		WebElement txtlastnme = driver.findElement(By.name("lastname"));
		txtlastnme.sendKeys("Ashu");
		
		Thread.sleep(300);
		
		WebElement txtnum = driver.findElement(By.name("reg_email__"));
		txtnum.sendKeys("mohanashu@gmail.com");
		
		Thread.sleep(2000);
		
		 WebElement confirmemail = driver.findElement(By.name("reg_email_confirmation__"));
	     confirmemail.sendKeys("mohanashu@gmail.com");
		
		Thread.sleep(300);
		
		WebElement txtpass = driver.findElement(By.id("password_step_input"));
		txtpass.sendKeys("9171632483");
		
		Thread.sleep(300);
		
		WebElement txtdy = driver.findElement(By.id("day"));
		txtdy.sendKeys("18");
		
		Thread.sleep(300);
		
		WebElement txtmon = driver.findElement(By.id("month"));
		txtmon.sendKeys("jun");
		
		Thread.sleep(300);
		
		WebElement txtyear = driver.findElement(By.id("year"));
		txtyear.sendKeys("1993");
		
		Thread.sleep(300);
		
		WebElement btbgender = driver.findElement(By.name("sex"));
		btbgender.click();
		
		Thread.sleep(5000);
		WebElement btblogin = driver.findElement(By.name("websubmit"));
		btblogin.click();
		driver.quit();
				
		
		
		

}

}
