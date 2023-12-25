package Take_ScreenShot;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Working_with_scrennshot {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
	   TakesScreenshot t = (TakesScreenshot) driver;
	   
	 File temp =  t.getScreenshotAs(OutputType.FILE);
	 
	 File dest = new File("./screenshot/filename.png");
	 
	  try {
		FileHandler.copy(temp, dest);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	  driver.close();
	}
}
