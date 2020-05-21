package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Review {
	
	@FindBy(xpath="//a[@href=\"http://www.snapdeal.com/product/philips-led-bulb-7w-pack/686196812284\"]")
	private WebElement product;

	@FindBy(xpath="//a[@class=\"view-all-reviews\"]")
	private WebElement view;
	
	public Review(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void product() throws InterruptedException {
		Thread.sleep(2000);
		product.click();
	}
	public void review() {
		view.click();
	}
}
