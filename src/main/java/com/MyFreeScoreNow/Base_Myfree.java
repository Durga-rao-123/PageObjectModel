package com.MyFreeScoreNow;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Base_Myfree
{
	@Test
	public void myFreeScoreNow()
	{
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qa.creditrepaircloud.com/");
		
		 
//		Login Page
		Login_MyFreeScore_Page login = new Login_MyFreeScore_Page(driver);
		
		login.enter_Login_username();
		
		login.enter_Login_password();
		
		login.click_Submit();
		
		
//		Home Page
		Home_MyFree_page home = new Home_MyFree_page(driver);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		home.clickon_AddNew_Client();
		
		
//		Add NewClient Page
		AddNewClients_MyFree_page add = new AddNewClients_MyFree_page(driver);
		
		add.enter_First_name();
		
		add.enter_Last_name();
		
		add.check_Box();
		
		add.click_Submit();
		
		add.warning_message();
		
//		Client DashBoard Page
		ClientDashBoard_MyFree_page client = new ClientDashBoard_MyFree_page(driver);
		
		client.clickImportAndAudit();
				
//		Credit Monitoring Access Details page
		CreditMonitoringAccess_Myfree_page credit = new CreditMonitoringAccess_Myfree_page(driver);
		
		credit.drop_down();
		
		credit.enter_Report_username();
		
		credit.enter_Report_password();
		
		credit.import_report_And_runSimple_Audit();
		
		
	}
		

}
