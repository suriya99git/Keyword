package javascript_executer;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_scrollpage_genric {

	static JavascriptExecutor js;
	static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");
			
			driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.zomato.com/india");
//			scrollbyjs("0","2000");
//			scrolltojs("0","3000");
//			
			WebElement ireland = driver.findElement(By.xpath("//h5[text()='Ireland']"));
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript("arguments[0].scrollIntoView(false);",ireland);
			scrollintoViewjs(true, ireland);
					
	}
		
		public static void typecastingjs() {
			js = (JavascriptExecutor)driver;
		}
		
		public static void scrollbyjs(String x,String y) {
			
			typecastingjs();
			js.executeScript("window.scrollBy("+x+","+y+");");
		}
		
		public  static void scrolltojs(String x,String y) {
			typecastingjs();
			js.executeScript("window.scrollTo("+x+","+y+");");
		}
		
		public static void scrollintoViewjs(boolean view,WebElement element) {
			typecastingjs();
			js.executeScript("arguments[0].scrollIntoView("+view+");",element);
		}
}
