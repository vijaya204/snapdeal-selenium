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

public class Tc_Search_003 {
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

}

}