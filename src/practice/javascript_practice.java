package practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascript_practice {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		
		jsExecutor.executeScript("window.scrollBy(0,1500);");
	}
}
