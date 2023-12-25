package Working_with_Action;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_With_Action {

	public static void main(String[] args) throws AWTException {

		//System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium webdriver\\\\Selenium\\\\Driver\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement search_button = driver.findElement(By.xpath("//input[@class='button-1 search-box-button']"));
//		WebElement Search_context = driver.findElement(By.id("small-searchterms"));
//		
		Actions a = new Actions(driver);
		
	//	a.moveToElement(Search_context).click().sendKeys("mobiles").build().perform();
		
	//	a.moveToElement(Search_context).click().keyDown(Keys.SHIFT).sendKeys("mob").keyUp(Keys.SHIFT).sendKeys("iles").build().perform();
		
		a.moveToElement(search_button).click().build().perform();
		
//		 Robot robot = new Robot();// 
//		 robot.keyPress(KeyEvent.VK_A);
//		 robot.keyRelease(KeyEvent.VK_A);
		
		 
	}

}
