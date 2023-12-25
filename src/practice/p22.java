package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class p22 {

	public static void main(String[] args) throws AWTException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.scientecheasy.com/2019/04/testng-tutorial.html/");
		
		WebElement target = driver.findElement(By.xpath("//strong[text()='TestNG']"));
		
		Actions actions = new Actions(driver);
		
		actions.doubleClick(target).keyDown(Keys.SHIFT).keyDown(Keys.ARROW_RIGHT).perform();
		
		for (int i = 0; i < 100; i++) {
			actions.keyDown(Keys.SHIFT).keyDown(Keys.ARROW_RIGHT).perform();
		}
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_C);
		
	}
}
