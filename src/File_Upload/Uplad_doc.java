package File_Upload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uplad_doc {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\suriy\\Downloads\\Resume-2023.docx");
	}
}
