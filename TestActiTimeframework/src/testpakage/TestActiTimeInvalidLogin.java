package testpakage;

import java.io.IOException;

import generic.BaseTest;
import generic.Flib;
import pagepackage.HomePage;
import pagepackage.LoginPage;

public class TestActiTimeInvalidLogin extends BaseTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt=new BaseTest();
		bt.openBrowser();
		Flib flib=new Flib();
		LoginPage lg=new LoginPage(driver);
		
		int rc = flib.getRowCount(EXCEL_Path, "InvalidCreads");
		for(int i=1;i<=rc;i++)
		{
			String username = flib.readExcelData(EXCEL_Path, "InvalidCreads", i, 0);
			String password = flib.readExcelData(EXCEL_Path, "InvalidCreads", i, 1);
			lg.ActiTimeInvalidLogin(username, password);
			 Thread.sleep(1000);
			 lg.clearusername();
			
		}
		
		
		HomePage hm=new HomePage(driver);
		hm.clickcreate();
		
		
		
		
		
	}
	
}
