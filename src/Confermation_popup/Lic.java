package Confermation_popup;


import java.time.Duration;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Lic {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://licindia.in/policy-loan-options");
		driver.manage().window().maximize();
		String current_window = driver.getWindowHandle();
		driver.findElement(By.xpath("//b[text()='Pay Direct (Without login)']")).click();
		Alert a = driver.switchTo().alert();
		Thread.sleep(1000);
		a.accept();
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		Set<String> Window = driver.getWindowHandles();
		Window.remove(current_window);
		for (String s : Window) {
			driver.switchTo().window(s);
		}
		driver.findElement(By.xpath("//span[text()='Back to Home']")).click();

	}
}
