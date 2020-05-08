package Register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pom_Register.Tc_Register_2;

public class Tc_Register_002 {
	static { 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\renuvijaya\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	//Entering url
	driver.get("https://www.snapdeal.com/");
	//Creating object for page object model
	Tc_Register_2 r2 = new Tc_Register_2(driver);
	//Clicking signin
	r2.signin();
	//Clicking register
	r2.register();
	//Switching to frame
	driver.switchTo().frame(0);
	//Enter valid username
	r2.usernameOrEmailField();
	//Click on continue button
	r2.contin();
	//Enter mobilenumber
	r2.mobilenumber();
	//Enter name
	r2.name();
	//Enter invalid password
	r2.password();
	//Clicking on continue button
	r2.signup();
}
}
