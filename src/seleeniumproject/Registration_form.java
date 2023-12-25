package seleeniumproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration_form {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","Driver//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");

		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Suriya");

		driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Johnson");

		driver.findElement(By.xpath("//input[@id='user_email']")).sendKeys("Suriyajohn@gmail.com");

		driver.findElement(By.xpath("//input[@id='radio_1665627729_Male']")).click();

		driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("Suriya@120599`");

		driver.findElement(By.xpath("//input[@id='input_box_1665629217']")).sendKeys("Indian");

		driver.findElement(By.xpath("//input[@id='phone_1665627880']")).sendKeys("9566111335");

		WebElement country = driver.findElement(By.xpath("//select[@id='country_1665629257']"));

		Select s = new Select(country);

		s.selectByVisibleText("India");

		driver.findElement(By.xpath("//input[@id='phone_1665627865']")).sendKeys("9884491120");

		driver.findElement(By.xpath("//input[@id='number_box_1665629930']")).sendKeys("3");

		driver.findElement(By.xpath("//input[@id='input_box_1665630010']")).sendKeys("2 & 101");

		driver.findElement(By.xpath("//textarea[@id='textarea_1665630078']")).sendKeys("Working as software engineer in Chennai");

		driver.findElement(By.xpath("//input[@id='radio_1665627931_Yes']")).click();

		driver.findElement(By.xpath("//input[@id='radio_1665627997_Single Room']")).click();

		driver.findElement(By.xpath("//input[@id='radio_1665628131_None']")).click();

		WebElement activity = driver.findElement(By.xpath("//select[@id='select_1665628361']"));

		Select s1 = new Select(activity);

		s1.selectByIndex(1);

		driver.findElement(By.xpath("//input[@id='privacy_policy_1665633140']")).click();

		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}
