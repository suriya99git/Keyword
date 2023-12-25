package Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_alert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
	//	driver.findElement(By.cssSelector(".button-1.search-box-button")).click();
		
		driver.findElement(By.cssSelector("input[class='button-1 search-box-button']")).click();
		
		 Alert a = driver.switchTo().alert();
		 
		 String alert_text = a.getText();
		 
		 a.accept();
		 
		 System.out.println(alert_text);
	}
}
