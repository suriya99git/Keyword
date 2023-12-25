package Notification_popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class my_gov {

	public static void main(String[] args) throws AWTException, InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.mygov.in/");
			
			Robot r = new Robot();
			
			r.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			r.keyRelease(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			r.keyRelease(KeyEvent.VK_ENTER);
	}
}
