package Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Alerttask {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		String email = "suriya456@gmail.com";
		String password = "123456";
		driver.get("https://demowebshop.tricentis.com/");

		driver.findElement(By.linkText("Log in")).click();

		driver.findElement(By.id("Email")).sendKeys(email);

		driver.findElement(By.id("Password")).sendKeys(password);

		driver.findElement(By.className("login-button")).click();

		String user = driver.findElement(By.linkText("suriya456@gmail.com")).getText();

		if (email.contains(user)) {

			System.out.println("TestCases Pass");
		}

		else {
			System.out.println("TestCase Fail");
		}
	}
}
