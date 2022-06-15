package testpakage;

import java.io.IOException;

import generic.BaseTest;
import generic.Flib;
import pagepackage.HomePage;
import pagepackage.LoginPage;

public class TestActiTimeLogout extends BaseTest {
	
 public static void main(String[] args) throws IOException, InterruptedException {
	
	 BaseTest bt=new BaseTest();
	 bt.openBrowser();
	 
	 Flib flib=new Flib();
	 String username=flib.readPropertyFile(Prop_Path, "username");
	 String password=flib.readPropertyFile(Prop_Path, "password");
	 
	 LoginPage lg=new LoginPage(driver);
	 lg.validLogin(username, password);
	 Thread.sleep(4000);
	 HomePage hg=new HomePage(driver);
	 hg.clickcreate();
	 String title=driver.getTitle();
	 System.out.println(title);
	 bt.close();
	
}

}
