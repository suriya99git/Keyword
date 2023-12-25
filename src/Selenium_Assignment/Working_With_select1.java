package Selenium_Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Working_With_select1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","Driver//chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
		
		driver.get("file:///C:/Users/suriy/Downloads/demo.html");
		
		WebElement car = driver.findElement(By.xpath("(//select)[1]"));
		
		Select s = new Select(car);
		
		s.selectByIndex(1);
		Thread.sleep(1000);
		s.selectByValue("jgr");
		Thread.sleep(1000);
		s.selectByVisibleText("Volvo");
	
		driver.quit();
	}
}
