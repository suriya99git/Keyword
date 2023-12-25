package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select_class {

	static  WebElement sort_by;
	static Select select;
	public static void main(String[] args) throws InterruptedException {
		
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
		
		 sort_by = driver.findElement(By.xpath("//select[@id='products-orderby']"));
		 
		 select  = new Select(sort_by);
		 
		 for (int j = 0; j < 4; j++) {
			 sort_by = driver.findElement(By.xpath("//select[@id='products-orderby']"));
			 select  = new Select(sort_by);
			 select.selectByIndex(j);
			 
			 Thread.sleep(1000);
		}
	}
}
