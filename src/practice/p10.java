package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p10 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","Driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		
		jsExecutor.executeScript("window.scrollBy(0,2000);");
		
		jsExecutor.executeScript("window.scrollTo(0,-1000);");
		
		jsExecutor.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//input[@id='vote-poll-1']")));
		
		
	}
}
