package practice;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class p11 {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","Driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		 LocalDateTime system_date = LocalDateTime.now();
		
		 String screenshotdate = system_date.toString().replace(':', '-');
		 
		 TakesScreenshot tScreenshot  = (TakesScreenshot) driver;
		 
		 File from = tScreenshot.getScreenshotAs(OutputType.FILE);
		 
		 File to = new File("Screenshot//"+screenshotdate+"filename.png");
		 
		org.openqa.selenium.io.FileHandler.copy(from, to);
		
		 WebElement register = driver.findElement(By.xpath("//a[@class='ico-register']"));
		 
		File from1 = register.getScreenshotAs(OutputType.FILE);
		
		File to1 = new File("Screenshot//"+screenshotdate+"element.png");
		
		FileHandler.copy(from1, to1);
		 
	}
}
