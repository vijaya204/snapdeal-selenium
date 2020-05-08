package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pom_Login.Tc_Login_2;
import Pom_Login.Tc_Login_4;

public class Tc_Login_004 {
	static { 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\renuvijaya\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	
	//Entering the url
	driver.get("https://www.snapdeal.com/");
	
	//Creating the object of page object model
	Tc_Login_4 r4 = new Tc_Login_4(driver);
	
	//Clicking on signin button
	r4.signin();
	
	//Clicking on login button
	r4.login();
	
	//Switching to frame
	driver.switchTo().frame(0);
	
	//Entering username
	r4.usernameOrEmailField();
	
	//Clicking on continue 
	r4.contin();
	
	//Without password
	r4.password();
	
	//Clicking on continue button
	r4.login1();
}
}
