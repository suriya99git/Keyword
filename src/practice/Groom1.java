package practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Groom1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement capital = driver.findElement(By.id("box1"));
		WebElement country = driver.findElement(By.id("box101"));
		
		Actions a = new Actions(driver);
		
		a.dragAndDrop(capital,country).build().perform();
		
	}
}
