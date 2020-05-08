package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pom_Login.Tc_Login_3;

public class Tc_Login_003 {
	static { 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\renuvijaya\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	
	//Entering the url
	driver.get("https://www.snapdeal.com/");

	//Creating object for page object model
	Tc_Login_3 r3 = new Tc_Login_3(driver);
	
	//Clicking on signin
	r3.signin();
	
	//Clicking on login 
	r3.login();
	
	//Switching to frame
	driver.switchTo().frame(0);
	
	//Without username 
	r3.usernameOrEmailField();
	
	//Clicking on continue button
	r3.contin();
	
	//Closing the browser
	driver.close();
}
}
