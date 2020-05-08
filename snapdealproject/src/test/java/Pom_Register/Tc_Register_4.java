package Pom_Register;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tc_Register_4 {
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
 
 public Tc_Register_4(WebDriver driver) {
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
		usernameOrEmail.sendKeys("");
 }
  public void contin() {
	 cont.click();
 }
 
}
