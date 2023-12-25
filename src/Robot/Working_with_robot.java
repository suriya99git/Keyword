package Robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_robot {


public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.easemytrip.com/");
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(3000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
}
}
