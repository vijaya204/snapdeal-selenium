package Stepdefinitions;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import PageObjects.Search;
import Pom_Trendingproducts.Tc_Trending_1;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Tc_Search_1 {
	static { 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\renuvijaya\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	}
	WebDriver driver;
	public Search s;
	public Tc_Trending_1 t;
	
	@Given("^User open the Chrome browser  and enter URL as \"([^\"]*)\"$")
	public void user_open_the_Chrome_browser_and_enter_URL_as(String URL) throws Throwable {
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	  driver.get(URL);
		
	}

	@Then("^Click on searchicon$")
	public void click_on_searchicon() throws Throwable {
	s = new Search(driver);	
	s.searchbar();
	}

	@Then("^enter  \"([^\"]*)\" for Search$")
	public void enter_for_Search(String arg1) throws Throwable {
	   s.sendKeys(); 
	}
    
	@Then("^Click on Search button$")
	public void click_on_Search_button() throws Throwable {
	    s.search();
		
	}
	@Then("^Select a product$")
	public void select_a_product() throws Throwable {
	  s.product();
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
	}
	@Then("^that product add to cart$")
	public void that_product_add_to_cart() throws Throwable {
		WebElement addtocart = driver.findElement(By.xpath("//div[@catalog=\'642748421711\']"));
		addtocart.click();
		
	}	
	@Then("^Click on proceed to payment$")
	public void click_on_proceed_to_payment() throws Throwable {
		Thread.sleep(2000);
		s=new Search(driver);
	   s.proceed(); 
	}

	@Then("^enter username,password and click on continue$")
	public void enter_username_password_and_click_on_continue() throws Throwable {
		Thread.sleep(2000);
	    s.email();
	    s.cont();
	    Thread.sleep(2000);
	    s.password();
	    s.login();
		
	}

	@Then("^enter delivery address$")
	public void enter_delivery_address() throws Throwable {
		Thread.sleep(2000);
	   s.addaddress();
	   s.pincode();
	   s.name();
	   s.address();
	   s.mobile();
	   s.home();
	   s.save();
		
	}

	@Then("^click on proceed payment$")
	public void click_on_proceed_payment() throws Throwable {
		Thread.sleep(2000);
	    s.payment();
	}

	@Then("^click on cash on delivery$")
	public void click_on_cash_on_delivery() throws Throwable {
		Thread.sleep(2000);
	   s.cod();
	   driver.quit();
	}


	//Trending products
	@Then("^Click on product from trending products$")
	public void click_on_product_from_trending_products() throws Throwable {
	    t = new Tc_Trending_1(driver);
	    t.product();
	}

	@Then("^select the product$")
	public void select_the_product() throws Throwable {
	   t.laptop(); 
		
	}

	@Then("^product add to cart$")
	public void product_add_to_cart() throws Throwable {
		String w=driver.getWindowHandle();
		System.out.println(w);
		
		Set <String> allwindows=driver.getWindowHandles();
		System.out.println(allwindows);
		for (String i : allwindows) {
			if (!i.equals(w)) {
				driver.switchTo().window(i);
				
			}
			
		}
		Thread.sleep(3000);
		WebElement addtocart = driver.findElement(By.xpath("//div[@catalog=\'626456086637\']"));
		addtocart.click();
	}

	@Then("^click on net banking$")
	public void click_on_net_banking() throws Throwable {
		Thread.sleep(2000);
	   t.netbanking();
	}

	@Then("^select card type$")
	public void select_card_type() throws Throwable {
	   t.icici();
	   driver.quit();
		
	}


	
	
	
	//Reviews
	@Then("^Click on View all Reviews$")
	public void click_on_View_all_Reviews() throws Throwable {
	    Thread.sleep(2000);
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class=\"view-all-reviews\"]")).click();
	}

	
}
