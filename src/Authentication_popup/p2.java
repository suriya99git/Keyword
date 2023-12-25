
package Authentication_popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p2 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
				Robot r = new Robot();
				r.keyPress(KeyEvent.VK_TAB);
				Thread.sleep(500);
				r.keyPress(KeyEvent.VK_TAB);
				Thread.sleep(500);
				r.keyPress(KeyEvent.VK_TAB);
				Thread.sleep(500);
				r.keyPress(KeyEvent.VK_ENTER);
				
				
				r.keyRelease(KeyEvent.VK_TAB);
				r.keyRelease(KeyEvent.VK_ENTER);
	}
}
