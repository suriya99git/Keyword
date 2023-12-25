package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class harsha_assign {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","Driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://flowcv.com/");
		driver.manage().window().maximize();
		//234,369
		Actions actions = new Actions(driver);
		actions.scrollByAmount(234, 369);
		driver.findElement(By.xpath("//p[text()='Resume Builder']")).click();
		driver.findElement(By.xpath("(//a[text()='Get started'])[1]")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
	}
}
