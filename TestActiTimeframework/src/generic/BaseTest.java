package generic;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IAutoConstant {
	protected static  WebDriver driver;
	public void openBrowser() throws IOException
	{
		Flib flib1=new Flib();
		String browserValue=flib1.readPropertyFile(Prop_Path,"browser");
		String url=flib1.readPropertyFile(Prop_Path,"url");
		
		
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty(CHROME_KEY, CHROME_VALUE);
		    driver=new ChromeDriver();
		     driver.get(url);
		     driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		    
		}
		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty(GEOKO_KEY, GECKO_VALUE);
		     driver=new FirefoxDriver();
		     driver.get(url);
		     driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		    
			
		}
		
		
		else {
			System.out.println("enter the correct choice");
		}
		
	}
	public void close()
	{
		driver.quit();
	}

}

