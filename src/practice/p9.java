package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v114.input.Input;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class p9 {

	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		//for click operation
		//actions.click(driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]"))).build().perform();
		//for right click
	//	actions.contextClick(driver.findElement(By.xpath("//input[@id='pollanswers-1']"))).build().perform();
		//for doubleclick
		//actions.doubleClick(driver.findElement(By.id("products-orderby"))).build().perform();
		//actions.moveToElement(driver.findElemenactions.mo(951,321).build().perform();
		//actions.scrollToElement(driver.findElement(By.xpath("//h3[text()='My account']"))).build().perform();
		//actions.scrollByAmount(1050,650).build().perform();
		//actions.sendKeys(driver.findElement(By.id("small-searchterms")),"mobiles" ).build().perform();
	
		//actions.keyDown(Keys.valueOf("mobiles"));
		//Select select = new Select(driver.findElement(By.id("products-orderby")));
		//Alert alert = driver.switchTo().alert();
	
	//	Robot robot = new Robot();
//		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//		robot.mouseMove(1050, 650);
		
	}
}
