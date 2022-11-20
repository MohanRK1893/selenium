package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manik\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		//to open the browser
		WebDriver driver = new ChromeDriver();
		
		//To enter the URL
		driver.get("https://www.amazon.in/");
		
		WebElement txt = driver.findElement(By.xpath("//a[contains(text(), 'Conditions')]"));
		String text = txt.getText();
		System.out.println(text);
		Thread.sleep(2000);
		driver.quit();
	}

}
