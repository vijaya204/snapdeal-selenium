package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tc_Register_1 {
 @FindBy(xpath = "//span[text()=\"Sign In\"]")
 private WebElement signin;
 
 @FindBy(xpath="//span[@class=\"newUserRegister\"]")
 private WebElement register;
 
 @FindBy(name="username")
 private WebElement usernameOrEmail;
 
 @FindBy(id="userName")
 private WebElement email;
 
 @FindBy(id="checkUser")
 private WebElement cont;
 
 @FindBy(id="j_number")
 private WebElement mobileno;
 
 @FindBy(id="j_name")
 private WebElement name;
 
 @FindBy(id="j_password")
 private WebElement password;
 
 @FindBy(id="userSignup")
 private WebElement signup;
 
 public Tc_Register_1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
 public void signin() {
	 signin.click();
 }
 public void register() throws InterruptedException {
	 register.click();
	 Thread.sleep(2000);
 }
 public void usernameOrEmailField () throws InterruptedException {
		usernameOrEmail.sendKeys("vijayagolla324@gmail.com");
 }
  public void contin() {
	 cont.click();
 }
 public void mobilenumber() {
	 mobileno.sendKeys("8008789565");
 }
 public void name() {
	 name.sendKeys("Vijaya Lakshmi Golla");
 }
 public void password(String j_password) {
	 password.sendKeys(j_password);
 }
 public void signup() {
	 signup.click();
 }
}
