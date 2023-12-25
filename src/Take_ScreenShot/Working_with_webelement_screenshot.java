package Take_ScreenShot;

import java.io.File;

import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Working_with_webelement_screenshot {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demowebshop.tricentis.com/");

		WebElement search_button = driver.findElement(By.xpath("//input[@type='submit']"));
		
	

		
//		File temp = search_button.getScreenshotAs(OutputType.FILE);
//
//		File dest = new File("./screenshot/element.png");

		elementscreenshot(search_button);
//		try {
//			FileHandler.copy(temp, dest);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		driver.quit();

	}
	
	public static void elementscreenshot(WebElement element) {
		
		File temp = element.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/element.png");
		
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
