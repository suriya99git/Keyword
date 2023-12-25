package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class p4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","Driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		
		Actions actions = new Actions(driver);
		
		actions.moveToElement(driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]"))).click().perform();
		
		WebElement sort_by = driver.findElement(By.xpath("//select[@id='products-orderby']"));
		Select s = new Select(sort_by);
		s.selectByVisibleText("Price: Low to High");
	
		actions.moveToElement(driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]"))).click().perform();
		
		actions.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Shopping cart')]"))).click().perform();
		
		actions.moveToElement(driver.findElement(By.xpath("//input[@id='termsofservice']"))).click().perform();
		
		actions.moveToElement(driver.findElement(By.xpath("//button[@id='checkout']"))).click().perform();
	}
}
