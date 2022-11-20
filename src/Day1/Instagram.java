package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram 
{
	public static void main(String[] args) throws InterruptedException 
	{
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\manik\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	  
	  //To Launch /browser
	  WebDriver i=new ChromeDriver();
	  
	  //To Load URL
	  i.get("https://www.instagram.com/accounts/login/?hl=en)%20login%20page");
	  
	  //To maximize
	  i.manage().window().maximize();
	  
	  //To get the title
	  //String title=i.getTitle();
	  //System.out.println(title);
	  	  
	  //to get the current title URL
	  //String currentUrl = i.getCurrentUrl();	  
	  // System.out.println(currentUrl);
	  
	  Thread.sleep(5000);
	  WebElement txtUserName = i.findElement(By.name("username"));
	  
	  txtUserName.sendKeys("Mohan");
	  
	  WebElement txtPassword = i.findElement(By.name("password"));
	  txtPassword.sendKeys("Mohan@123");
	  WebElement btblogin = i.findElement(By.xpath("//button[@type='submit']"));
	  btblogin.click();
	  Thread.sleep(5000);
	  
	  //to exit the browser
	  i.quit();
	  	
	
	}

}

