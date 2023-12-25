package Select_Class_Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","Driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
		WebElement sort_by = driver.findElement(By.xpath("//select[@id='products-orderby']"));
		
		Select s = new Select(sort_by);
		
		s.selectByValue("https://demowebshop.tricentis.com/books?orderby=6");
		
		WebElement sort_by_1 = driver.findElement(By.xpath("//select[@id='products-orderby']"));
		
		Select s1 = new Select(sort_by_1);
		s1.selectByIndex(3);
		WebElement sort_by_3 = driver.findElement(By.xpath("//select[@id='products-orderby']"));
		Select s3 = new Select(sort_by_3);
		s3.selectByValue("https://demowebshop.tricentis.com/books?orderby=5");
		WebElement sort_by_2 = driver.findElement(By.xpath("//select[@id='products-orderby']"));
		
		Select s2 = new Select(sort_by_2);
		
		s2.selectByValue("https://demowebshop.tricentis.com/books?orderby=15");
		
		
	}
}
