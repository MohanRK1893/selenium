package karthick;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manik\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		// to launch browser
		WebDriver driver =new ChromeDriver();	
		
		//maximize
		driver.manage().window().maximize();
		// to give url
		
		driver.get("https://www.amazon.in/");
		
		//WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("iphone");
		Robot acc = new Robot();
		acc.keyPress(KeyEvent.VK_ENTER);
		acc.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		
		// screenshot
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		// source capturing the screenshot
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		
		// destination
		File destination = new File("C:\\Users\\manik\\OneDrive\\Desktop\\Mohan\\iphone.jpg");
		
		// helps to copy from source 
		FileUtils.copyFile(screenshotAs, destination);
		Thread.sleep(4000);
		
		JavascriptExecutor scroll = (JavascriptExecutor)driver;
		WebElement next = driver.findElement(By.xpath("//span[text()='Apple iPhone 12 (64GB) - Purple']"));
		
		scroll.executeScript("arguments[0].scrollIntoView(true)", next);
		Thread.sleep(4000);
		
		File screenshotAs2 = ts.getScreenshotAs(OutputType.FILE);
		
		File destination2 = new File("C:\\\\Users\\\\manik\\\\OneDrive\\\\Desktop\\\\Mohan\\\\iphone1.jpg");
		
		FileUtils.copyFile(screenshotAs2, destination2);
		
		Thread.sleep(2000);
		
		WebElement next2 = driver.findElement(By.xpath("(//span[text()='Apple iPhone 12 (128GB) - Blue'])[3]"));
		
		scroll.executeScript("arguments[0].scrollI2ntoView(true)", next2);
		Thread.sleep(4000);
		
		File screenshotAs3 = ts.getScreenshotAs(OutputType.FILE);
		File destination3 = new File("C:\\Users\\manik\\OneDrive\\Desktop\\Mohan\\iphone3.jpg");
		
		FileUtils.copyFile(screenshotAs3, destination3);
		
		
		
		
		

}}
