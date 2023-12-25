package Notification_popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ease_My_Trip {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.easemytrip.com/");
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
}
