package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	

	@FindBy(name="username") private WebElement usn;
	@FindBy(name="pwd") private WebElement pass;
	@FindBy(id="loginButton") private WebElement lobutton;
	@FindBy(xpath="//a[text()='Logout']") private WebElement logout;
	



   //decleration
	
	

	  public LoginPage(WebDriver driver) {
		  PageFactory.initElements(driver, this);
		  
		  
	  }





 




//utilization
  public WebElement getUsn() {
	return usn;
  }
 
public WebElement getPass() {
	return pass;
 }
  public WebElement getLobutton() {
	return lobutton;
  }
  
  public WebElement getLogout() {
		return logout;
	}
  
 public void validLogin(String username,String password)
 {
	 usn.sendKeys(username);
	 pass.sendKeys(password);
	 lobutton.click();
 }
 public void ActiTimeInvalidLogin(String invalidusername,String invalidpassword)
	{
		usn.sendKeys(invalidusername);
		pass.sendKeys(invalidpassword);
		lobutton.click();
	}
	public void clearusername()
	{
		usn.clear();
	}
	
	public void clicklogout()
	{
		logout.click();
	}
	
	
}
