package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus 
{
public static void main(String[] args)
{
	 System.setProperty("webdriver.chrome.driver", 
			 "C:\\Users\\manik\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	 
	 WebDriver r=new ChromeDriver();
	 
	 r.get("https://www.redbus.in/");
	 
	 String title=r.getTitle();
	 System.out.println(title);
	 
	 String currentUrl = r.getCurrentUrl();
	 System.out.println(currentUrl);
	 
	 WebElement txtFrom = r.findElement(By.id("src"));
	 txtFrom.sendKeys("Chennai");
	 
	 WebElement txtTo = r.findElement(By.id("dest"));
	 txtTo.sendKeys("Pondy");
	 
	 r.quit();
		
}
}
