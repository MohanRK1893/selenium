package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException 
{
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\manik\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	  
	  //To Launch /browser
	  WebDriver driver=new ChromeDriver();
	  
	  //To Load URL
	  driver.get("https://www.facebook.com/");
	  	 
	  
	  WebElement txtUserName = driver.findElement(By.xpath("//a[@rel='async']"));
	  txtUserName.click();
	  Thread.sleep(3000);
	  
	  WebElement fname = driver.findElement(By.name("firstname"));
      fname.sendKeys("mohan");
      
      WebElement lname = driver.findElement(By.name("lastname"));
      lname.sendKeys("ashu");
      
      WebElement email = driver.findElement(By.name("reg_email__"));
      email.sendKeys("mohanashu@gmail.com");
      
      WebElement confirmemail = driver.findElement(By.name("reg_email_confirmation__"));
      confirmemail.sendKeys("mohanashu@gmail.com");
      
             
      WebElement npass = driver.findElement(By.id("password_step_input"));
      npass.sendKeys("mohanashu@1893");
      
      	  Thread.sleep(3000);
	  //to exit the browser
	  driver.quit();

}}
