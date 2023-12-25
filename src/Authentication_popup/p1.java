package Authentication_popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p1 {

	public static void main(String[] args) throws AWTException {
		
			System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");
					
					WebDriver driver = new ChromeDriver();
					
					driver.get("https://the-internet.herokuapp.com/basic_auth");
					
					Robot r = new Robot();
					r.keyPress(KeyEvent.VK_A);
					r.keyPress(KeyEvent.VK_D);
					r.keyPress(KeyEvent.VK_M);
					r.keyPress(KeyEvent.VK_I);
					r.keyPress(KeyEvent.VK_N);
					r.keyPress(KeyEvent.VK_TAB);
					r.keyPress(KeyEvent.VK_A);
					r.keyPress(KeyEvent.VK_D);
					r.keyPress(KeyEvent.VK_M);
					r.keyPress(KeyEvent.VK_I);
					r.keyPress(KeyEvent.VK_N);
					r.keyPress(KeyEvent.VK_TAB);
					r.keyPress(KeyEvent.VK_ENTER);
					
					r.keyRelease(KeyEvent.VK_TAB);
					r.keyRelease(KeyEvent.VK_ENTER);
					r.keyRelease(KeyEvent.VK_A);
					r.keyRelease(KeyEvent.VK_D);
					r.keyRelease(KeyEvent.VK_M);
					r.keyRelease(KeyEvent.VK_I);
					r.keyRelease(KeyEvent.VK_N);
					
	}
}
