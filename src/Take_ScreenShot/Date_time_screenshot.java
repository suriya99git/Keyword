package Take_ScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Date_time_screenshot {

	static WebDriver driver;
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");


		webpagescreenshot("testcase1");

	}
	public static void webpagescreenshot(String filename) {

		LocalDateTime dateTime = LocalDateTime.now();

		String  date= dateTime.toString().replaceAll(":","-");
		System.out.println(date);

		TakesScreenshot s  = (TakesScreenshot) driver;

		File temp = s.getScreenshotAs(OutputType.FILE);

		File dest = new File("./screenshot/"+filename+date+".png");

		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
