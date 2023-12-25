package File_Upload;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class naukri_resume_upload {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");		
		WebElement scroll = driver.findElement(By.xpath("//label[text()='Work status']"));
		
		driver.executeScript("arguments[0].scrollIntoView(false);",scroll);
		
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\suriy\\OneDrive\\Documents\\suriya resume (4).docx");
		
		
	}
}
