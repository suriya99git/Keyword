package practice;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('small-searchterms').value='mobiles';");

	}

}
