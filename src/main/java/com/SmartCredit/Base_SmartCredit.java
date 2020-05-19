package com.SmartCredit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Base_SmartCredit
{
	
	@Test
	public void SmartCredit()
	{
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qa.creditrepaircloud.com/");
		
		
//		Login Page
		LoginPage_Smartcredit_page login = new LoginPage_Smartcredit_page(driver);
		
		login.enter_Login_username();
		
		login.enter_Login_password();
		
		login.click_submit();
		
		
//		Home Page
		HomePage_SmartCredit_page home = new HomePage_SmartCredit_page(driver);
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		home.clickon_AddnewClient();
		
		
		
//		Add NewClient Page
		AddNewClientPage_Smart_page add = new AddNewClientPage_Smart_page(driver);
		
		add.enter_Firstname();
		
		add.enter_Lastname();
		
		add.check_Box();
		
		add.click_Submit();
		
		add.warning_Message();
		
		
//		Client DashBoard Page
		ClientDashBoardPage_Smart_page client = new ClientDashBoardPage_Smart_page(driver);
		
		client.clickon_Import_And_Audit();
		
		
		
//		Credit Monitoring Access Details Page
		CreditMonitoringAccess_Smart_page credit = new CreditMonitoringAccess_Smart_page(driver);
		
		credit.drop_down();
		
		credit.enter_Report_username();
		
		credit.enter_Report_password();
		
		credit.import_report_And_runSimple_Audit();
		
		
	}

}
