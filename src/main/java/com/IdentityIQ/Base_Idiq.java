package com.IdentityIQ;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Base_Idiq {
	
	@Test
	public void identityIq()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qa.creditrepaircloud.com/");
		
//		Login Page
		Login_Idiq_Page log = new Login_Idiq_Page(driver);
		
		log.login_user_name();
		
		log.login_password();
		
		log.signIn();
		
		
//		Home Page
		Home_Idiq_Page home = new Home_Idiq_Page(driver);
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		home.clickon_Addnew_client();

		
//		Add NewClient Page
		AddNewClient_Idiq_Page add = new AddNewClient_Idiq_Page(driver);
		
		add.enter_first_name();
		
		add.enter_last_name();
		
		add.check_box();
		
		add.click_submit();
		
		add.warning_message();
		
		
//		Client DashBoard Page
		
		ClientDashboard_Idiq_page dashboard = new ClientDashboard_Idiq_page(driver);
		
		dashboard.clickImportAndAudit();
		
		
//		Credit Monitoring Access Details page
		
		CreditMonitoringAccessDetails_Idiq_page credit = new CreditMonitoringAccessDetails_Idiq_page(driver);
		
		credit.drop_down();
		
		credit.enter_Report_username();
		
		credit.enter_Report_password();
		
		credit.enter_security_word();
		
		credit.import_report_And_runSimple_Audit();
		
			
		
	}

}
