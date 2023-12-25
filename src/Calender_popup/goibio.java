package Calender_popup;

import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class goibio {

	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now().plusDays(1).plusYears(1);
	
		int date = ldt.getDayOfMonth();
		int year = ldt.getYear();
		String month = ldt.getMonth().getDisplayName(TextStyle.SHORT,Locale.ENGLISH);
		System.out.println(date);
		System.out.println(year);
		System.out.println(month);
		System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		driver.findElement(By.xpath("(//div[@class='sc-12foipm-16 wRKJm fswFld '])[3]")).click();
		
		
		driver.findElement(By.xpath("//p[@class='sc-jlwm9r-1 ewETUe']")).click();
		String day = (date <= 9) ? ("0" +date) : ("" +date);
		for (; ;) {
			try {
				driver.findElement(By.xpath("//div[contains(@aria-label,'"+ month + " "+ day + " "+ year + "')]")).click();
				break;
			} catch (org.openqa.selenium.NoSuchElementException e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
		
		driver.findElement(By.xpath("//div[contains(@aria-label,'Oct 15 2023')]"));
		driver.findElement(By.xpath("//div[contains(@aria-label,'"+month +" "+ day+" " +year+" ')]")).click();
		
	}
}
