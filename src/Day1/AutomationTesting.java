package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTesting 
{
	public static void main(String[] args) 
	{
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\manik\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	  
	  //To Launch /browser
	  WebDriver at=new ChromeDriver();
	  
	  //To Load URL
	  at.get("https://demo.automationtesting.in/Register.html");
	  
	  //To maximize
	  at.manage().window().maximize();
	  
	  //To get the title
	  String title=at.getTitle();
	  System.out.println(title);
	  
	  //to get the current title URL
	  String currentUrl = at.getCurrentUrl();
	  System.out.println(currentUrl);
	  
	  WebElement txtFirstName = at.findElement(By.id("First Name"));
	  txtFirstName.sendKeys("Mohan");
	  
	  WebElement txtLastName = at.findElement(By.id("Last Name"));
	  txtLastName.sendKeys("Ravikumar");
	  
	  //to exit the browser
	  at.quit();
	  	
	
	}

}

