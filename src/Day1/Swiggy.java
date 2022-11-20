package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy 
{
	public static void main(String[] args) 
	{
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\manik\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	  
	  //To Launch /browser
	  WebDriver s=new ChromeDriver();
	  
	  //To Load URL
	  s.get("https://www.swiggy.com/");
	  
	  //To maximize
	  s.manage().window().maximize();
	  
	  //To get the title
	  String title=s.getTitle();
	  System.out.println(title);
	  
	  //to get the current title URL
	  String currentUrl = s.getCurrentUrl();
	  System.out.println(currentUrl);
	  
	  WebElement txtUserName = s.findElement(By.id("location"));
	  txtUserName.sendKeys("OMR");	  
	  
	  //to exit the browser
	  s.quit();	  	
	
	}

}


