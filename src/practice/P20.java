package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P20 {

	public static void main(String[] args) {
		
		ChromeDriver driver  = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		 WebElement table = driver.findElement(By.xpath("//legend[text()='Web Table Example']"));
		driver.executeScript("arguments[0].scrollIntoView(true);",table);
		
		 List<WebElement> price = driver.findElements(By.xpath("(//table[@id='product']/tbody)[1]/child::tr/child::td[3]"));
		 int i = 0;
		 for (WebElement Element : price) {
			
			int high = Integer.parseInt(Element.getText());
			
			if (high>i) {
				
				i = high;
			}	
		}
		 
		
		System.out.println(driver.findElement(By.xpath("(//table[@id='product']/tbody)[1]/child::tr/child::td[text()='"+i+"']/preceding::td[1]")).getText()) ;
	}
}
