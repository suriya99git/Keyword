package Wooden_Street;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment_5 {


	public static void main(String[] args) throws  AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","Driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.igp.com/");
		Thread.sleep(2000);
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		
		
		robot.keyPress(KeyEvent.VK_ENTER);
		
		
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}
}
