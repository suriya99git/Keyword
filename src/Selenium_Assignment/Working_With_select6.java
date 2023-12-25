package Selenium_Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Working_With_select6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","Driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		 WebElement date = driver.findElement(By.xpath("//select[@id='day']"));
		 
		 Select s = new Select(date);
		 
		 s.selectByVisibleText("12");
		 
		 WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		 
		 Select s1 = new Select(month);
		 
		 s1.selectByIndex(4);
		 
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		
		Select s2 = new Select(year);
		
		s2.selectByValue("1999");
		 
	}
}
