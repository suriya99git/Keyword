package Selenium_Assignment;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Working_With_select3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","Driver//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demowebshop.tricentis.com/");

		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();

		WebElement position = driver.findElement(By.xpath("//select[@id='products-orderby']"));

		Select s = new Select(position);

		s.selectByVisibleText("Price: Low to High")	;

		WebElement display = driver.findElement(By.xpath("//select[@id='products-pagesize']"));

		Select s1 = new Select(display);

		s1.selectByVisibleText("12");

		WebElement view = driver.findElement(By.xpath("//select[@id='products-viewmode']"));

		Select s2 = new Select(view);

		s2.selectByVisibleText("List");
		
//		 WebElement display1 = driver.findElement(By.xpath("//select[@id='products-pagesize']"));
//		 
//		 Select s3 = new Select(display1);
//		 
//		 s3.selectByValue("https://demowebshop.tricentis.com/books?pagesize=4")

	}
}
