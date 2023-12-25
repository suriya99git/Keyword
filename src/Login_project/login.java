package Login_project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class login {


	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","Driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://shoppersstack.com/");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(55));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("loginBtn")));
		driver.findElement(By.id("loginBtn")).click();
		
		driver.findElement(By.xpath("//button[text()='Admin Login']")).click();
		
		driver.findElement(By.id("Email")).sendKeys("suriyajohnson088@gmail.com");
		
		driver.findElement(By.id("Password")).sendKeys("Suriya@shopper1");
		
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		
		boolean login = driver.findElement(By.xpath("//div[text()='S']")).isDisplayed();
		
		if (login) {
			System.out.println("Login is sucessful");
		}
		else {
			System.out.println("login is not sucessful");
		}
		driver.quit();
	}
	
}
