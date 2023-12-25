package Prathap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");
		
	
		WebDriver driver = new ChromeDriver();
		
		//open the browser
		
		driver.navigate().to("https://demowebshop.tricentis.com/");
	//	driver.na("https://demowebshop.tricentis.com/");
		
		String url = driver.getCurrentUrl();
		
		System.out.println(url);
		
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();
		
//		driver.get("https://www.facebook.com/");
//		
//		driver.navigate().back();
//		
//		driver.navigate().forward();
		
		System.out.println(driver.getPageSource());
		
	}
}
