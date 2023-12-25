package seleeniumproject;

import org.openqa.selenium.chrome.ChromeDriver;

public class basic {

	public static void main(String[] args) {
		
		String key = "webdriver.chrome.driver";
		String value = "C:\\Selenium webdriver\\Selenium\\Driver\\chromedriver.exe";
		System.setProperty(key, value);
	
		ChromeDriver driver = new ChromeDriver();
		
	}
}
