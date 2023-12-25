package harsha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator_css {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		//xpath by attributes
		driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		//xpath by index
		driver.findElement(By.xpath("(//a[@href='/books'])[3]")).click();
		//xpath by textFuction
		driver.findElement(By.xpath("//a[text()='Register']"));
		//xpath by contains
		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[2]"));
		//xpath by independent
		
	}
}
