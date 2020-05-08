package RBLcard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tc_Rblcard_002 {
	static { 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\renuvijaya\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	//Entering the url
	driver.get("https://www.snapdeal.com/");
	//Maximizing the window
	driver.manage().window().maximize();
	//Moving to RBLpopcorn credit card
    WebElement ele = driver.findElement(By.xpath("//a[@class=\'dp-widget-link\']"));
    //Clicking the Rbl popcorn credit card
    ele.findElement(By.xpath("//div[@index=\'1\']")).click();
    //Clicking on more cards
    driver.findElement(By.xpath("//a[@href=\"/credit-card\"]")).click();
    //closing the browser
    driver.close();
    
}
}
