package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p28 {

	static WebDriver driver;
	static JavascriptExecutor jsExecutor;
	public static void main(String[] args) {

		 driver = new ChromeDriver();

		driver.get("https://demowebshop.tricentis.com/");

		//scrollBy(0, 1000);
		//scrollTo(0, 1000);
		scrollIntoView(true);
	}


	public static void typecast() {

		jsExecutor = (JavascriptExecutor) driver;

	}

	public static void scrollBy(int x,int y) {

		typecast();
		jsExecutor.executeScript("window.scrollBy("+x+","+y+");");
	}
	public static void scrollTo(int x,int y) {

		typecast();
		jsExecutor.executeScript("window.scrollTo("+x+","+y+");");
	}
	public static void scrollIntoView(boolean b) {

		typecast();
		jsExecutor.executeScript("arguments[0].scrollIntoView("+b+")",driver.findElement(By.xpath("(//input[@value='Add to cart'])[6]")));	
		
	}
	
	

//	jsExecutor.executeScript("window.scrollBy(0,1000);");
//
//	jsExecutor.executeScript("window.scrollTo(0,1000);");
//
//	jsExecutor.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("(//input[@value='Add to cart'])[6]")));
//
//	jsExecutor.executeScript("arguments[0].scrollIntoView(false);",driver.findElement(By.xpath("(//input[@value='Add to cart'])[6]")));


}
