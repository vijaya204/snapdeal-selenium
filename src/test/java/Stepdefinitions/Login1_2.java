package Stepdefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.Login1;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class Login1_2 {
	WebDriver driver;
	public Login1 l;
	static { 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\renuvijaya\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	}
	@Given("^user opens Chromebrowser and enter url as \"([^\"]*)\"$")
	public void user_opens_Chromebrowser_and_enter_url_as(String url) throws Throwable {
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get(url);
	}

	@Then("^Click on signin$")
	public void click_on_signin() throws Throwable {
	    l = new Login1(driver);
	    l.signin();
	}

	@Then("^Click on Login$")
	public void click_on_Login() throws Throwable {
	    l.login();
	}
	@Then("^enter mobilenumber/email as \"([^\"]*)\"$")
	public void enter_mobilenumber_email_as(String email) throws Throwable {
		driver.switchTo().frame(0);
	   l.usernameOrEmailField();
	}

	@Then("^Click on Continue$")
	public void click_on_Continue() throws Throwable {	    
		l.contin();
	}
	@Then("^enters Username and password as \"([^\"]*)\"$")
	public void enters_Username_and_password_as(String password) throws Throwable {
		Thread.sleep(2000);
	  l.password();
	}
	@Then("^clicks on Login button$")
	public void clicks_on_Login_button() throws Throwable {
	    l.login1();
	    driver.quit();
	}
	@Then("^enters Username and  invalid password as \"([^\"]*)\"$")
	public void enters_Username_and_invalid_password_as(String arg1) throws Throwable {
	   l.invalid();
	}




}
