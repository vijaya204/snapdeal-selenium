package Register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pom_Register.Tc_Register_1;
import Pom_Register.Tc_Register_4;

public class Tc_Register_004 {
	static { 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\renuvijaya\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.snapdeal.com/");
	Tc_Register_4 r4 = new Tc_Register_4(driver);
	r4.signin();
	r4.register();
	driver.switchTo().frame(0);
	r4.usernameOrEmailField();
	r4.contin();
	
}
}
