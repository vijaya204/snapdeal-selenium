package Search;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Pom_Login.Tc_Login_1;
import Pom_Search.Tc_Search_1;

public class Tc_Search_007 {
	static { 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\renuvijaya\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.snapdeal.com/");
	Tc_Search_1 s1 =new Tc_Search_1(driver);
	s1.searchbar();
	s1.sendKeys();
	s1.search();
	s1.product();
	Thread.sleep(2000);
	String PID=driver.getWindowHandle();
	System.out.println(PID);
	
	Set <String> allwindows=driver.getWindowHandles();
	System.out.println(allwindows);
	for (String i : allwindows) {
		if (!i.equals(PID)) {
			driver.switchTo().window(i);
			
		}
		
	}
	Thread.sleep(3000);
	WebElement addtocart = driver.findElement(By.xpath("//div[@catalog=\'642748421711\']"));
	addtocart.click();
	Thread.sleep(2000);
	s1.proceed();
	Thread.sleep(2000);
	s1.email();
	s1.cont();
	Thread.sleep(2000);
	s1.password();
	s1.login();
	Thread.sleep(2000);
	s1.addaddress();
	Thread.sleep(2000);
	s1.pincode();
	s1.name();
	s1.address();
	s1.home();
	Thread.sleep(2000);
	s1.save();
	Thread.sleep(2000);
	s1.payment();
	Thread.sleep(2000);
	s1.cod();
	driver.close();

}

}