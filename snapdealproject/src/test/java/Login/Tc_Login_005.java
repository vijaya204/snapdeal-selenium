package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pom_Login.Tc_Login_2;
import Pom_Login.Tc_Login_4;
import Pom_Login.Tc_Login_5;

public class Tc_Login_005 {
	static { 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\renuvijaya\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	
	//Entering the url
	driver.get("https://www.snapdeal.com/");
	
	//Creating the object for page object model
	Tc_Login_5 r5 = new Tc_Login_5(driver);
	
	//Clicking on signin
	r5.signin();
	
	//Clicking on login
	r5.login();
	
	//Switching to frame
	driver.switchTo().frame(0);
	
	//Clicking on username
	r5.usernameOrEmailField();
	
	//Clicking on continue button
	r5.contin();
	
	//Closing the browser
	driver.close();
	
}
}
 