package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdfc 
{
	public static void main(String[] args) 
	{
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\manik\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	  
	  //To Launch /browser
	  WebDriver h=new ChromeDriver();
	  
	  //To Load URL
	  h.get("https://netbanking.hdfcbank.com/ ");
	  
	  //To maximize
	  h.manage().window().maximize();
	  
	  //To get the title
	  String title=h.getTitle();
	  System.out.println(title);
	  
	  //to get the current title URL
	  String currentUrl = h.getCurrentUrl();
	  System.out.println(currentUrl);
	  
	  WebElement txtUserId = h.findElement(By.id("fldLoginUserId"));
	  txtUserId.sendKeys("73145678");
	  
	  	  
	  //to exit the browser
	  //h.quit();
	  	
	
	}

}
