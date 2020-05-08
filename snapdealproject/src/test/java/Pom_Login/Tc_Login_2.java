package Pom_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tc_Login_2 {
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
 
 public Tc_Login_2(WebDriver driver) {
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
	 password.sendKeys("vijji");
 }
 public void login1() {
	 login1.click();
 }
}
