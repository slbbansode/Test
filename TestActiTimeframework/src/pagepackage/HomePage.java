package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

public class HomePage {
	//initialization
	@FindBy(xpath="//a[text()='Create new tasks']") private WebElement createtask;
	@FindBy(xpath="//div[text()='Reports']") private WebElement reports;
	@FindBy(xpath="//div[text()='Tasks']") private  WebElement task;
	@FindBy(xpath="//div[.='Settings']") private WebElement setting;
	@FindBy(name="firstHierarchyLevelCode") private WebElement drop1;
	@FindBy(id="secondCustomHierarchyLevel") private WebElement drop2;
	@FindBy(id="thirdCustomHierarchyLevel") private WebElement drop3;
	

	
	
	//decleration
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	
	
	
	
	//utilization
	
	public WebElement getDrop2() {
		return drop2;
	}





	public WebElement getDrop3() {
		return drop3;
	}





	public WebElement getCreatetask() {
		return createtask;
	}
	
	public WebElement getDrop1() {
		return drop1;
	}





	public WebElement getSetting() {
		return setting;
	}





	public WebElement getReports() {
		return reports;
	}
	public WebElement getTask() {
		return task;
	}
	
	public void clickcreate()
	{
		createtask.click();
	}
	public void clickreports()
	{
		reports.click();
	}
	public void clicksett()
	{
		setting.click();
	}
	public void getdrop2()
	{
		
	}
	
}
