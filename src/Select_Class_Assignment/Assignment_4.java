package Select_Class_Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_4 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","Driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
		
		 WebElement sort_by = driver.findElement(By.xpath("//select[@id='products-orderby']"));
		 
		 Select s = new Select(sort_by);
		 
          	 List<WebElement> all_iteam = s.getOptions();
		 
		 for (int i = 0; i < all_iteam.size(); i++) {
			 WebElement sort_by_1 = driver.findElement(By.xpath("//select[@id='products-orderby']"));
			 
			 Select s1 = new Select(sort_by_1);
			 
			s1.selectByIndex(i);
		}
	}
}
