package Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class working_with_webelement_method {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","Driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		//Is Enabled
		System.out.println(driver.findElement(By.xpath("//a[text()='Register']")).isEnabled());
		
		//IS DISPLAYED
		System.out.println(driver.findElement(By.xpath("//input[@id='small-searchterms']")).isDisplayed());
		
		//IS SELECTED
		System.out.println(driver.findElement(By.xpath("//input[@id='pollanswers-1']")).isSelected());
		
		//CLICK ON THE BUTTON
		driver.findElement(By.xpath("//input[@id='pollanswers-1']")).click();
		
		//IS SELECTED
		System.out.println(driver.findElement(By.xpath("//input[@id='pollanswers-1']")).isSelected());
		
		//GET TEXT
		String whishlist_textString =driver.findElement(By.xpath("(//span[@class='cart-label'])[1]")).getText();
		
		System.out.println(whishlist_textString);
		
		String Cart_iteam =driver.findElement(By.xpath("(//span[@class='cart-label'])[1]/following-sibling::span")).getText();
		
		System.out.println(Cart_iteam);
		
		//GET ATTRIBUTES
		String Shopping_Cart_link = driver.findElement(By.xpath("(//span[@class='cart-label'])[1]/parent::a")).getAttribute("href");
		
		System.out.println(Shopping_Cart_link);
		
		//GET CSS VALUES
		String css_padding_left = driver.findElement(By.xpath("//a[@class='ico-register']")).getCssValue("padding-left");
		
		System.out.println(css_padding_left);
		
		//GET TEXT IN SEARCH FIELD BEFORE ENTERING
		String before_text  =driver.findElement(By.xpath("//input[@id='small-searchterms']")).getAttribute("value");
		System.out.println(before_text);
		
		////GET TEXT IN SEARCH FIELD AFTER ENTERING
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("mobiles");
		String After_text  =driver.findElement(By.xpath("//input[@id='small-searchterms']")).getAttribute("value");
		System.out.println(After_text);
	}
}
