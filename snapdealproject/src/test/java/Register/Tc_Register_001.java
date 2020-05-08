package Register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pom_Register.Tc_Register_1;

public class Tc_Register_001 {
	static { 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\renuvijaya\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.snapdeal.com/");
	Tc_Register_1 r1 = new Tc_Register_1(driver);
	r1.signin();
	r1.register();
	driver.switchTo().frame(0);
	r1.usernameOrEmailField();
	r1.contin();
	r1.mobilenumber();
	r1.name();
	r1.password();
	r1.signup();
}
}
