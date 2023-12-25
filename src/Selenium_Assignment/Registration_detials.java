package Selenium_Assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration_detials {

	static String  gender;
	static String  First_Name;
	static String  Last_Name;
	static String   Mail_Id;
	static String  Password ;
	static String  Conform_password;
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","Driver//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demowebshop.tricentis.com/");

		driver.findElement(By.xpath("//a[@class='ico-register']")).click();

		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		boolean Click= driver.findElement(By.xpath("//input[@id='gender-male']")).isSelected();

		if(Click) {
			System.out.println("radio Button is Clickable");
			gender =driver.findElement(By.xpath("//input[@id='gender-male']")).getAttribute("value");
		}
		boolean First_Name_Enable=	driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();

		if(First_Name_Enable) {

			System.out.println("First Name Text Field is Enable");
			driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Suriya");

			First_Name =driver.findElement(By.xpath("//input[@id='FirstName']")).getAttribute("value");
		}

		boolean Last_Name_Enable=driver.findElement(By.xpath("//input[@id='LastName']")).isEnabled();
		if(Last_Name_Enable) {
			System.out.println("Last Name Text Field is Enable");
			driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Johnson");

			Last_Name = driver.findElement(By.xpath("//input[@id='LastName']")).getAttribute("value");
		}

		boolean Email_Enable=driver.findElement(By.xpath("//input[@id='Email']")).isEnabled();
		if(Email_Enable) {
			System.out.println("Email_ID  Text Field is Enable");
			driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("suriya79@gmail.com");

			Mail_Id	= driver.findElement(By.xpath("//input[@id='Email']")).getAttribute("value");
		}

		boolean Password_Enable=driver.findElement(By.xpath("//input[@id='Password']")).isEnabled();
		if(Password_Enable) {
			System.out.println("Password Text Field is Enable");
			driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Suriya@120");

			Password = driver.findElement(By.xpath("//input[@id='Password']")).getAttribute("value");
		}

		boolean Conform_Password_Enable=	driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).isEnabled();
		if(Conform_Password_Enable) {
			System.out.println("Conform Password Text Field is Enable");
			driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys(Password);

			Conform_password =driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).getAttribute("value");
		}

		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		String Result = driver.findElement(By.xpath("//div[@class='result']")).getText();
		System.out.println();
		System.out.println("***Customer Detial***");

		System.out.println("Gender :"+ gender);
		System.out.println("First_Name :" + First_Name);
		System.out.println("Last_Name :" + Last_Name);
		System.out.println("Mail_Id :"+ Mail_Id);
		System.out.println("Password :"+ Password);
		System.out.println("Conform_Password :"+Conform_password);
		System.out.println();
		System.out.println(Result);
		System.out.println();
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		String	LogOut=	driver.findElement(By.xpath("//a[@class='ico-register']")).getText();
		if(LogOut.equals("Register")) {
			System.out.println("***Login Out Succesfully***");
		}
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(Mail_Id);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(Password);
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();

		String	check_valid_user =driver.findElement(By.xpath("(//a[@class='account'])[1]")).getText();

		if(check_valid_user.equals(Mail_Id)) {
			System.out.println("***Login Sucessfull***");
		}
	}
}
