package Trendingproducts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Pom_Search.Tc_Search_1;
import Pom_Trendingproducts.Tc_Trending_1;

public class TC_Trending_001 {
	static { 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\renuvijaya\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	//Entering the url
	driver.get("https://www.snapdeal.com/");
    WebElement ele = driver.findElement(By.xpath("//div[@class=\"banner-item active\"]"));
    Actions a = new Actions(driver);
    Thread.sleep(2000);
    a.moveToElement(ele).perform();
    //Maximizing the window
    driver.manage().window().maximize();
    //Clicking the Rbl popcorn credit card
    driver.findElement(By.xpath("//div[@supc=\'SDL913167285\']")).click();
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
	WebElement addtocart = driver.findElement(By.xpath("//div[@catalog=\'672718971100\']"));
	addtocart.click();
	Tc_Trending_1 s1 = new Tc_Trending_1(driver);
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
	s1.netbanking();
	Thread.sleep(2000);
	s1.icici();

}
    
}
