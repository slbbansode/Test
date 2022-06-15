package generic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommonLib extends BaseTest 
{
	
	public String getTitleOfTheWebPage()
	{
		String titleOfTheWebPage = driver.getTitle();
		return titleOfTheWebPage;
		
	}
	
	public void verifyPageTitle(String PageName,String expectedTitle)
	{
		String ActualTitle=driver.getTitle();
		if(expectedTitle.equalsIgnoreCase(ActualTitle))
		{
			System.out.println(PageName+"is verified");
		}
		else 
		{
			System.out.println(PageName+"is not verified");
		}
		
		
	}
	//action method
	public void mouseHover(WebElement target)
	{
		Actions act=new Actions(driver);
		act.moveToElement(target).perform();
	}
	
	public void rightClick(WebElement target)
	{
		Actions act=new Actions(driver);
		act.contextClick(target).perform();
	}
	
	public void doubleClick(WebElement target)
	{
		Actions act=new Actions(driver);
		act.doubleClick(target).perform();
	}
	
	//handle the frame
	public void switchToFrame(int index)
	{
		driver.switchTo().frame(index);
	}
	public void switchToFrame(String nameorld)
	{
		driver.switchTo().frame(nameorld);
	}
	
	public void switchToFrame(WebElement framelement)
	{
		driver.switchTo().frame(framelement);
	}
	
	//handling the dropdown
	
	public void selectTheOption(WebElement element,int index)
	{
		Select sel=new Select(element);
		sel.selectByIndex(index);
		
    }
	
	public void selectTheOption(WebElement element,String value)
	{
		Select sel=new Select(element);
		sel.selectByValue(value);
	}
	
	
	public void selectTheOption(String text,WebElement element)
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	}
	
	
	public void getAllOptionOfDropdown(WebElement element)
	{
		Select sel=new Select(element);
		List<WebElement> ops = sel.getOptions();
		for(WebElement opn:ops)
		{
			String text=opn.getText();
			System.out.println(text);
		}
		
		
	}
	
	public void explicitlyWait()
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(40));
		
	}
	
	public void refreshBrowser()
	{
		
		driver.navigate().refresh();
	}
	
	public void getWindowHandle()
	{
		
		Set<String>handles=driver.getWindowHandles();
		for(String h:handles)
		{
		   System.out.println(h);
		}
	}
	public void robotCalss() throws AWTException
	{
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_P);
		rb.keyRelease(KeyEvent.VK_P);
	}
	
	
	

}
