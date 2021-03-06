package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pom_Login.Tc_Login_1;

public class Tc_Login_001 {
	//driver location
	static { 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\renuvijaya\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	//Entering url
	driver.get("https://www.snapdeal.com/");
	//creating object for login page object model class
	Tc_Login_1 r2 = new Tc_Login_1(driver);
	//click on signin button
	r2.signin();
	//click on login button 
	r2.login();
	driver.switchTo().frame(0);
	//entering valid username
	r2.usernameOrEmailField();
	//clickin continue button
	r2.contin();
	//entering valid password
	r2.password();
	//clicking login button
	r2.login1();
	//Closing the browser
    driver.close();
}
}
