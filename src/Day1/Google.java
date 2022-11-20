package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google 
{
public static void main(String[] args)
{
	 System.setProperty("webdriver.chrome.driver", 
			 "C:\\Users\\manik\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	 
	 WebDriver g=new ChromeDriver();
	 
	 g.get("https://www.google.com/");
	 
	 String title=g.getTitle();
	 System.out.println(title);
	 
	 String currentUrl = g.getCurrentUrl();
	 System.out.println(currentUrl);
	 
	 WebElement txtFrom = g.findElement(By.name("q"));
	 txtFrom.sendKeys("Greens Technology");
	 
	 
	 
	 //g.quit();
		
}
}
