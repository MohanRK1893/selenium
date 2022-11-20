package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal 
{
	public static void main(String[] args) 
	{
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\manik\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	  
	  //To Launch /browser
	  WebDriver sd=new ChromeDriver();
	  
	  //To Load URL
	  sd.get("https://www.snapdeal.com/login");
	  
	  //To maximize
	  sd.manage().window().maximize();
	  
	  //To get the title
	  String title=sd.getTitle();
	  System.out.println(title);
	  
	  //to get the current title URL
	  String currentUrl = sd.getCurrentUrl();
	  System.out.println(currentUrl);
	  
	  WebElement txtUserName = sd.findElement(By.id("userName"));
	  txtUserName.sendKeys("917618190");	  
	  
	  //to exit the browser
	 // sd.quit();	  	
	
	}

}
