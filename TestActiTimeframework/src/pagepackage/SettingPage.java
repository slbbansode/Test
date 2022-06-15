package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingPage {
	
	@FindBy(xpath="div[text()='Settings']") private WebElement setting;
	@FindBy(id="firstCustomHierarchyLevel") private WebElement drop1 ;
	@FindBy(id="secondCustomHierarchyLevel") private WebElement drop2;
	@FindBy(id="thirdCustomHierarchyLevel") private WebElement drop3;
	
	
	//delcleration
	
	
	public SettingPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
	}
	
	
	
	
	
	
	//utilization
	public WebElement getSetting() {
		return setting;
	}
	public WebElement getDrop1() {
		return drop1;
	}
	public WebElement getDrop2() {
		return drop2;
	}
	public WebElement getDrop3() {
		return drop3;
	}
	
	public void clicksett()
	{
		setting.click();
	}
	
	public void clickdrop1()
	{
		drop1.click();
	}
	public void clickdrop2()
	{
		drop2.click();
	}

}
