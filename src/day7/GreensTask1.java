package day7;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;	
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTask1 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manik\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.greenstechnologys.com/");
		
		TakesScreenshot screen =(TakesScreenshot)driver;
		
		File source = screen.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("C:\\Users\\manik\\OneDrive\\Pictures\\Camera Roll\\greens.png\\");
		
		FileUtils.copyFile(source, destination);
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
