package Wooden_Street;


import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment4 {

	static JavascriptExecutor js;
	public static void main(String[] args)  {
		
	
	System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.get("https://www.woodenstreet.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//	driver.findElement(By.id("loginclose1")).click();
	Actions a = new Actions(driver);
	a.moveToElement(driver.findElement(By.xpath("//a[text()='Sofas']"))).perform();
	
	 List<WebElement> sofa_list = driver.findElements(By.xpath("//a[text()='Sofas']/following-sibling::ul/child::li/child::article[1]/a"));
	
	  int all_list= sofa_list.size();
	  
	 for (int i = 0; i < all_list ; i++) {
		
//		sofa_list.get(i).click();
//		js.executeScript("windows.scrollBy(0,500);");
		 
		System.out.println(sofa_list.get(i).getText());
		 
		
	}
	}
}

////a[text()='Sofas']/following-sibling::ul/child::li/child::article[1]/a