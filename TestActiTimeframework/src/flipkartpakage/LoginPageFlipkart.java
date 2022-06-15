package flipkartpakage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

public class LoginPageFlipkart {
	
	@FindBy(xpath="//div[text()='Mobiles']") private WebElement mobile;
	@FindBy(xpath="//h1[text()='Mobile Phones End of Season Sale']") private WebElement mobilepage;
	@FindBy(xpath="//a[@class='_3SkBxJ']") private WebElement cart;
	
	
	
	
	//decleration
	
	public LoginPageFlipkart(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	
	
	
	
	//utilization
	
	public WebElement getMobile() {
		return mobile;
	}
	
	public WebElement getMobilepage() {
		return mobilepage;
	}
	public WebElement getCart() {
		return cart;
	}
	
}
