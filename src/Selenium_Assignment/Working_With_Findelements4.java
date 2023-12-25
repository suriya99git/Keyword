package Selenium_Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Findelements4 {
	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","Driver//chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
		
		driver.get("file:///C:/Users/suriy/Downloads/demo.html");
		
		 List<WebElement> name = driver.findElements(By.xpath("(//table[@name='companies'])[3]/child::tbody/child::tr/child::td[1]"));
		 
		 for (WebElement Element : name) {
			System.out.println(Element.getText());
		}
	}
}
