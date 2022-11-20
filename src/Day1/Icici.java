package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Icici 
{
	public static void main(String[] args) 
	{
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\manik\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	  
	  //To Launch /browser
	  WebDriver i=new ChromeDriver();
	  
	  //To Load URL
	  i.get("https://infinity.icicibank.com/corp/Login.jsp");
	  
	  //To maximize
	  i.manage().window().maximize();
	  
	  //To get the title
	  String title=i.getTitle();
	  System.out.println(title);
	  
	  //to get the current title URL
	  String currentUrl = i.getCurrentUrl();
	  System.out.println(currentUrl);
	  
	  WebElement txtUserID = i.findElement(By.name("DUMMY1"));
	  txtUserID.sendKeys("Mohan");
	  
	 	  
	  //to exit the browser
	//  i.quit();
	  	
	
	}

}