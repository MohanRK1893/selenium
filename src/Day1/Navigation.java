package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
	
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\manik\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	//To max the window
	driver.manage().window().maximize();
	
	//Launching browser by using navigation
	driver.navigate().to("https://www.facebook.com/");
	
	//Thread.sleep(3000);
	//to move backward
	driver.navigate().back();
	
	Thread.sleep(3000);
	
	//to move forward
	driver.navigate().forward();	
	Thread.sleep(3000);	
	//to refresh
	driver.navigate().refresh();
	
	WebElement txtUserName = driver.findElement(By.id("email"));
    txtUserName.sendKeys("Greens");
	  
    WebElement txtPassword = driver.findElement(By.id("pass"));
    txtPassword.sendKeys("9171632483");
	}	

}
