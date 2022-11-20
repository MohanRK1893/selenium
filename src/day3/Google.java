package day3;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\manik\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
			
					//open the browser
					WebDriver driver = new ChromeDriver();
					
					//enter url
					driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
					
					driver.manage().window().maximize();
					
					WebElement txtfname = driver.findElement(By.id("firstName"));
					txtfname.sendKeys("mohan");
					
					WebElement txtlstname = driver.findElement(By.id("lastName"));
					txtlstname.sendKeys("ravi");
					
					WebElement txtuser = driver.findElement(By.id("username"));
					txtuser.sendKeys("mohanashu");
					
					WebElement txtpass = driver.findElement(By.name("Passwd"));
					txtpass.sendKeys("ashu@1893");
					
					WebElement txtconf = driver.findElement(By.name("ConfirmPasswd"));
					txtconf.sendKeys("ashu@1893");
				
					WebElement btb = driver.findElement(By.xpath("(//span[@jsname='V67aGc'])[2]"));
					btb.click();
					
					Thread.sleep(3000);
					
					driver.quit();

}}
