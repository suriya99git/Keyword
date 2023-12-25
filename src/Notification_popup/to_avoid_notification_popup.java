package Notification_popup;

import java.awt.AWTException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class to_avoid_notification_popup {

	
		public static void main(String[] args) throws InterruptedException, AWTException {
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--disable-notifications");
			
			System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://www.hdfcbank.com/");
	}
}
