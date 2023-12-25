package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p12 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","Driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("file:///C:/Users/suriy/Downloads/iframe.html");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame("frame2");
		
		
		driver.findElement(By.xpath("(//img[@class='img-fluid search-icon'])[3]")).click();
	}
}
