package harsha;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) throws AWTException {
		
		WebDriver Driver = new ChromeDriver();
			
		Driver.get("https://demowebshop.tricentis.com/");
		
		WebElement search = Driver.findElement(By.id("small-searchterms"));
		
		Actions actions = new Actions(Driver);
		
		actions.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("sur").keyUp(Keys.SHIFT).sendKeys("iya").perform();
		
	}
}
