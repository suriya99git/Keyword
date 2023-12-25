package Selenium_Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_Web_Elements {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		 List<WebElement> Radio_Button = driver.findElements(By.xpath("//input[@type='radio']"));
		 
		 for (int i = 0; i < Radio_Button.size(); i++) {
			Radio_Button.get(i).click();
			Thread.sleep(1000);
		}
		 
		 for (WebElement Element : Radio_Button) {
			Element.click();
			Thread.sleep(1000);
		}
		 
		 driver.close();
		 
	}
}
