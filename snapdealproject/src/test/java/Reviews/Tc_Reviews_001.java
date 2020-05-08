package Reviews;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Pom_Login.Tc_Login_1;
import Pom_Search.Tc_Search_1;

public class Tc_Reviews_001 {
	static { 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\renuvijaya\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	//Entering the url
	driver.get("https://www.snapdeal.com/");	
	//Maximizing the window
	driver.manage().window().maximize();
	//Creating the object for page object model
	Tc_Search_1 s1 =new Tc_Search_1(driver);
	//Clicking on search bar
	s1.searchbar();
	//sending product to search bar
	s1.sendKeys();
	//Clicking on search button
	s1.search();
	//Selecting the product
	s1.product();
	Thread.sleep(2000);
	//Handling the windows
	String PID=driver.getWindowHandle();
	System.out.println(PID);
	
	Set <String> allwindows=driver.getWindowHandles();
	System.out.println(allwindows);
	for (String i : allwindows) {
		if (!i.equals(PID)) {
			driver.switchTo().window(i);
			
		}
		
	}
	//Scrolling the window to down
	JavascriptExecutor j = (JavascriptExecutor)driver;
	j.executeScript("window.scrollBy(0,500)");
	Thread.sleep(2000);
	//Clicking on reviews
	driver.findElement(By.xpath("//a[@class=\"view-all-reviews\"]")).click();
    

}
}
