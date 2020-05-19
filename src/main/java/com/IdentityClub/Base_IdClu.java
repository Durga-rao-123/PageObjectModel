package com.IdentityClub;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Base_IdClu 
{
	@Test
	public void identityClub() {
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("http://qa.creditrepaircloud.com/");
		
//		Login page
		Login_IdClub_Page login = new Login_IdClub_Page(driver);
		
        login.enter_login_username();
		
		login.enter_login_password();
		
		login.clickon_submit();
		
//		Home Page
		HomePage_Idclub_page home = new HomePage_Idclub_page(driver);
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

		home.click_Addnew_client();
		
		
		
//		Add NewClient Page 
		
		AddNewClient_idclub_page newclient = new AddNewClient_idclub_page(driver);
		
		newclient.enter_Firstname();
		
		newclient.enter_Lastname();
		
		newclient.check_Box();
		
		newclient.click_submit();
		
		newclient.warning_Message();
		
		
		
//		Client DashBoard Page
		
		ClientDashboard_idclub_page dashboard = new ClientDashboard_idclub_page(driver);
		
		dashboard.clickImportAndAudit();
		
		
//		Credit Monitoring Access Details Page
		
		CreditMonitoringAccessDetails_idclub_page credit = new CreditMonitoringAccessDetails_idclub_page(driver);
		credit.select_Dropdown();
		
		credit.enter_Report_username();
		
		credit.enter_Report_password();
		
		credit.import_report_And_runSimple_Audit();

}
}