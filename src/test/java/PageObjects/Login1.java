package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login1 {
	@FindBy(xpath = "//span[text()=\"Sign In\"]")
	 private WebElement signin;
	 
	 @FindBy(xpath="//a[@href=\"https://www.snapdeal.com/login\"]")
	 private WebElement login;
	 
	 @FindBy(name="username")
	 private WebElement usernameOrEmail;
	 
	 @FindBy(id="checkUser")
	 private WebElement cont;
	 
	 @FindBy(id="j_password_login_uc")
	 private WebElement password;
	 
	 @FindBy(id="submitLoginUC")
	 private WebElement login1;
	 
	 public Login1(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
	 public void signin() {
		 signin.click();
	 }
	 public void login() throws InterruptedException {
		 login.click();
		 Thread.sleep(2000);
	 }
	 public void usernameOrEmailField () throws InterruptedException {
			usernameOrEmail.sendKeys("vijayagolla204@gmail.com");
	 }
	  public void contin() {
		 cont.click();
	 }
	  public void password() {
		 password.sendKeys("vijaya2016");
	 }
	  public void invalid() {
		  password.sendKeys("vijaya204");
	  }
	  
	 public void login1() {
		 login1.click();
	 }
}
