package com.PrivacyGuard;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Base_PrivacyGuard
{
	
	@Test
	public void privacyGuard()
	{
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qa.creditrepaircloud.com/");
		
//		Login Page
		LoginPage_Privacy_page login = new LoginPage_Privacy_page(driver);
		
		login.enter_loginUsername();
		
		login.enter_Loginpassword();
		
		login.click_Submit();
		
//		Home Page
		HomePage_Privacy_page home = new HomePage_Privacy_page(driver);
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

		home.clickon_Addnew_Client();
		
		
//		Add NewClient Page
		AddNewClient_Privacy_page add = new AddNewClient_Privacy_page(driver);
		
		add.enter_Firstname();
		
		add.enter_Lastname();
		
		add.check_Box();
		
		add.click_Submit();
		
		add.warning_Message();
		
		
//		Client DashBoard Page
		ClientDashBoard_Privacy_page dashboard = new ClientDashBoard_Privacy_page(driver);
		
		dashboard.clickon_Import_And_Audit();
		
		
//		Credit Monitoring Access Details Page
		CreditMonitoringAccess_Privacy_page credit = new CreditMonitoringAccess_Privacy_page(driver);
		
		
		credit.select_Dropdown();
		
		credit.enter_Report_Username();
		
		credit.enter_Report_password();
		
		credit.enter_Security_word();
		
		credit.import_report_And_runSimple_Audit();
		
	}

}
