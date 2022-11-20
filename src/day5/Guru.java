package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Guru {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manik\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		// to lanch browser
		WebDriver driver =new ChromeDriver();	
		
		// to give url
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(4000);
		
		WebElement source = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement target = driver.findElement(By.id("bank"));
		
		//syntax : Actions obj=new Actions(webdriver ref);
		//obj.moveToElement(webelement ref).perform();		
		
		Actions  drag = new Actions (driver);
		drag.dragAndDrop(source, target).perform();
		
		WebElement source1 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement target1 = driver.findElement(By.id("amt7"));
		
		drag.dragAndDrop(source1, target1).perform();
		
		WebElement source2 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement target2 = driver.findElement(By.id("loan"));
		
		drag.dragAndDrop(source2, target2).perform();
		WebElement source3 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		
		WebElement target3 = driver.findElement(By.id("amt8"));
		drag.dragAndDrop(source3, target3).perform();
		Thread.sleep(4000);
		
		driver.quit();
	}

}
