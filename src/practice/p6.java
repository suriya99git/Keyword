package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p6 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://in.search.yahoo.com/search?fr=mcafee&type=E210IN714G0&p=dependent+and+independent+xpath+notes");
		
		driver.close();
	}
}
