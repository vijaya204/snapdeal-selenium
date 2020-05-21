package Stepdefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.Tc_Register_1;
import cucumber.api.DataTable;
import cucumber.api.java.en.*;

public class Tc_Register {
	WebDriver driver;
	public Tc_Register_1 r;
	static { 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\renuvijaya\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	}
	@Given("^user open Chromebrowser and enter url  \"([^\"]*)\"$")
	public void user_open_Chromebrowser_and_enter_url(String url) throws Throwable {
		driver = new ChromeDriver();
		r = new Tc_Register_1(driver);
	   driver.manage().window().maximize();
	   driver.get(url);
	}

	@Then("^Click on Signin$")
	public void click_on_Signin() throws Throwable {
	    r.signin();
	}

	@Then("^click on Register$")
	public void click_on_Register() throws Throwable {
	    r.register();
	}

	@Then("^enter \"([^\"]*)\"$")
	public void enter(String arg1) throws Throwable {
		driver.switchTo().frame(0);
	    r.usernameOrEmailField();
	}
	@Then("^Clicks on Continue$")
	public void clicks_on_Continue() throws Throwable {
	    r.contin();
		
	}
	@Then("^User enters \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String arg1, String arg2, String arg3) throws Throwable {
	   r.mobilenumber();
	   r.name();
	   r.password(arg3);
	}

	@Then("^User clicks on Continue$")
	public void user_clicks_on_Continue() throws Throwable {
	    r.signup();
	    driver.quit();
	}
	@Then("^User enters \"([^\"]*)\", \"([^\"]*)\"$")
	public void user_enters(String arg1, String arg2) throws Throwable {
	    r.mobilenumber();
	    r.name();
	}



//	@Then("^enter mobilenumber/email$")
//	public void enter_mobilenumber_email(DataTable credential) throws Throwable {
//		driver.switchTo().frame(0);
//	    List<List<String>>data = credential.raw();
//	    driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(data.get(1).get(0));
//	}
//
//
//	@Then("^User enters mobilenumber, Name and password$")
//	public void user_enters_mobilenumber_Name_and_password(DataTable credentials) throws Throwable {
//		List<List<String>>data = credentials.raw();
//	    driver.findElement(By.xpath("//input[@id=\"j_number\"]")).sendKeys(data.get(1).get(0));
//	    driver.findElement(By.xpath("//input[@id=\"j_name\"]")).sendKeys(data.get(1).get(1));
//	    driver.findElement(By.xpath("//input[@id=\"j_password\"]")).sendKeys(data.get(1).get(2));
//		
//	}

}
