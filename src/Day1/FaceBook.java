package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook 
{
	public static void main(String[] args) 
	{
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\manik\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	  
	  //To Launch /browser
	  WebDriver driver=new ChromeDriver();
	  
	  //To Load URL
	  driver.get("https://www.facebook.com/");
	  
	  //To maximize
	  driver.manage().window().maximize();
	  
	  //To get the title
	  String title=driver.getTitle();
	  System.out.println(title);
	  
	  //to get the current title URL
	  String currentUrl = driver.getCurrentUrl();
	  System.out.println(currentUrl);
	  
	  WebElement txtUserName = driver.findElement(By.id("email"));
	  txtUserName.sendKeys("Greens");
	  
	  WebElement txtPassword = driver.findElement(By.id("pass"));
	  txtPassword.sendKeys("9171632483");
	  
	  //to exit the browser
	 // driver.quit();
	  	
	
	}

}

