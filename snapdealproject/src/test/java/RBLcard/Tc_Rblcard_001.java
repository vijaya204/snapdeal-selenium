package RBLcard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Pom_RBLcard.Tc_Rblcard_1;


public class Tc_Rblcard_001 {
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
//    Actions a= new Actions(driver);
//    Thread.sleep(2000);
//    a.moveToElement(ele).perform();
    //Clicking the Rbl popcorn credit card
    Thread.sleep(2000);
    ele.findElement(By.xpath("//div[@index=\'1\']")).click();
    //Creating the object for page object model
    Tc_Rblcard_1 t1 = new Tc_Rblcard_1(driver);
    //Entering the firstname
    t1.fname();
    //Entering the lastname
    t1.lname();
    //Entering the gender
    t1.gender();
    //Entering the date of birth
    t1.dob();
    //Entering the mobile number
    t1.mobile();
    //Entering the email
    t1.email();
    //Entering the doornumber
    t1.address();
    //Entering the lane 
    t1.lane();
    //Entering the city
    t1.city();
    //Entering the pincode
    t1.pincode();
    //Entering the income 
    t1.income();
    //Entering the employee name in the company 
    t1.employee();
    //Entering the grossincome 
    t1.grossincome();
    //Entering the pancard number
    t1.pancard();
    //Clicking on submit button
    t1.submit();
    //Closing the browser
    driver.close();
}
}
