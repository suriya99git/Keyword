package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action_class {

	public static void main(String[] args) {
		

		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement search = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
	
		Actions actions  = new Actions(driver);
		
		actions.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("mob").keyUp(Keys.SHIFT).sendKeys("iles").build().perform();
		
	}
	
}
