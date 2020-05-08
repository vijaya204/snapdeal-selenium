package Pom_RBLcard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tc_Rblcard_1 {

	@FindBy(id="fname")
	private WebElement fname;
	@FindBy(id="lname")
	private WebElement lname;
	@FindBy(id="gender_2")
	private WebElement gender;
	@FindBy(id="dateOfBirth")
	private WebElement dob;
	@FindBy(id="mobile")
	private WebElement mobile;
	@FindBy(id="emailid")
	private WebElement email;
	@FindBy(id="addressL1")
	private WebElement address;
	@FindBy(id="addressL2")
	private WebElement lane;
	@FindBy(id="cities")
	private WebElement city;
	@FindBy(id="pincode")
	private WebElement pincode;
	@FindBy(id="employmentType")
	private WebElement income;
	@FindBy(id="grossincome")
	private WebElement grossincome;
	@FindBy(id="panCard")
	private WebElement pancard;
	@FindBy(id="first_page_submit")
	private WebElement submit;
	@FindBy(id="employer")
	private WebElement employee;
	public Tc_Rblcard_1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void fname() {
		fname.sendKeys("vijaya");
	}
	public void lname() {
		lname.sendKeys("Golla");
	}
	public void gender() {
		gender.click();
	}
	public void dob() {
		dob.sendKeys("29-10-1998");
	}
	public void mobile() {
		mobile.sendKeys("8008789565");
	}
	public void email() {
		email.sendKeys("vijayagolla204@gmail.com");
	}
	public void address() {
		address.sendKeys("7_11_66");
	}
	public void lane() {
		lane.sendKeys("Donkaroad 4th lane");
	}
	public void city() {
		city.sendKeys("Guntur");
		
	}
	public void pincode() {
		pincode.sendKeys("522002");
	}
	public void income() {
		income.sendKeys("student");
	}
	public void employee() {
		employee.sendKeys("Renuka");
	}
	public void grossincome() {
		grossincome.sendKeys("10000");
	}
	public void pancard() {
		pancard.sendKeys("CAFPG7110N");
	}
	public void submit() {
		submit.click();
	}
	
}
