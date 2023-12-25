package Working_with_disable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_disablebutton {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.oracle.com/in/java/technologies/downloads/");
		
		driver.findElement(By.linkText("jdk-8u381-linux-i586.tar.gz")).click();
		
		Thread.sleep(3000);
		
		 WebElement disable_button = driver.findElement(By.linkText("Download jdk-8u381-linux-i586.tar.gz"));
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 
		 js.executeScript("arguments[0].click();", disable_button);
}
}
