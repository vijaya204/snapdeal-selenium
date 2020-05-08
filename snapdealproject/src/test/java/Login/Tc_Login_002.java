package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pom_Login.Tc_Login_2;

public class Tc_Login_002 {
	static { 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\renuvijaya\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	//Entering the url
	driver.get("https://www.snapdeal.com/");
	
	//Creating object for page object model
	Tc_Login_2 r2 = new Tc_Login_2(driver);
	
	//Clicking on signin
	r2.signin();
	
	//Clicking on login
	r2.login();
	//switching to frame
	driver.switchTo().frame(0);
	
	//Entering valid username
	r2.usernameOrEmailField();
	
	//Clicking on continue button
	r2.contin();
	
	//Entering the invalid password
	r2.password();
	
	//Clicking on continue button
	r2.login1();
}
}
