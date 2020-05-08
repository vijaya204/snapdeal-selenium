package Pom_Search;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tc_Search_1 {
	@FindBy(xpath="//input[@name='keyword'][1]")
	private WebElement searchbar;
	
	@FindBy(partialLinkText="Search")
	private WebElement search;
   
	@FindBy(xpath="//div[@class=\"cardProd_name marT10 fnt-rm\"]")
	private WebElement product;
	
	@FindBy(xpath="//a[@class=\"btn marR5\"]")
	private WebElement proceed;
	
	@FindBy(id="username")
	private WebElement usernameOrEmail;
	
	@FindBy(id="login-continue")
	private WebElement contin;
	@FindBy(id="w_password")
	private WebElement password;
	@FindBy(id="login-done")
	private WebElement login;
	@FindBy(xpath="//button[@class=\'rippleGrey btn btn-theme-secondary btn-line\']")
	private WebElement add;
	@FindBy(id="zip")
	private WebElement pin;
	@FindBy(id="fullName")
	private WebElement name;
	@FindBy(id="address")
	private WebElement address;

	@FindBy(xpath="//div[@class=\'radio medium radio-black col-xs-12 pad-lt-0\']")
	private WebElement home;
	
	@FindBy(xpath="//span[@class=\'button-text\']")
	private WebElement save;
	
	@FindBy(id="make-payment")
	private WebElement payment;
	
	@FindBy(xpath="//div[@data-paymentmode=\"cd\"]")
	private WebElement cod;
	
   public Tc_Search_1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
   public void searchbar() {
		searchbar.click();
	}
	public void sendKeys() {
		searchbar.sendKeys("Home&Kitchen");
	}
	public void search() {
		search.click();
	}
	public void product() throws InterruptedException {
		product.click();
		Thread.sleep(2000);
	}
	public void proceed() {
		proceed.click();
	}
	public void email() {
		usernameOrEmail.sendKeys("vijayagolla204@gmail.com");
	}
	public void cont() {
		contin.click();
	}
	public void password() {
		password.sendKeys("vijaya2016");
	}
	public void login() {
		login.click();
	}
	public void addaddress() {
		add.click();
	}
	public void pincode() {
		pin.sendKeys("787052");
	}
	public void name() {
		name.sendKeys("vijaya Golla");
	}
	public void address() {
		address.sendKeys("Ahomoni post office, Lakshmipur");
	}
	
	public void home() {
		home.click();
	}
	public void save() {
		save.click();
	}
	public void payment() {
		payment.click();
	}
	public void cod() {
		cod.click();
	}

}
