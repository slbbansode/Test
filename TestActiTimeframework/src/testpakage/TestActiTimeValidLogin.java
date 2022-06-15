package testpakage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import generic.BaseTest;
import generic.Flib;
import generic.WebDriverCommonLib;
import pagepackage.HomePage;
import pagepackage.LoginPage;

public class TestActiTimeValidLogin extends BaseTest{
	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt=new BaseTest();
		bt.openBrowser();
		Flib flib=new Flib();
		String username = flib.readPropertyFile(Prop_Path, "username");
		String password = flib.readPropertyFile(Prop_Path, "password");
		LoginPage lg=new LoginPage(driver);
		lg.validLogin(username,password);
		HomePage hm=new HomePage(driver);
		Thread.sleep(4000);
		WebDriverCommonLib wb=new WebDriverCommonLib();
		WebElement target = driver.findElement(By.xpath("//div[text()='Settings']"));
	    wb.doubleClick(target);
	    WebElement drop1 = hm.getDrop1();
	    wb.getAllOptionOfDropdown(drop1);
	    
	    WebElement drop2 = hm.getDrop2();
	    wb.getAllOptionOfDropdown(drop2);
	    
	    WebElement drop3 = hm.getDrop3();
	    wb.getAllOptionOfDropdown(drop3);
		
		
		
	}
	
	
	

}
