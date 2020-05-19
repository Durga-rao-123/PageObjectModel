package com.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;




public class BaseClass
{
	@Test
	public void ValidLogin()
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qa.creditrepaircloud.com/");
		
//		Login Page
		Login_Page login = new Login_Page(driver);
	
		
		login.typeUserName();
		
		login.typePassWord();
		
		login.clickOnSignin();
		
		
//		Home Page
		HomePage home = new HomePage(driver);
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		home.add_new_client();
		
//		Adding New Client
		AddNewClient_page adding = new AddNewClient_page(driver);
		
		adding.enterFirstName();
		
		adding.enterLastName();
		
		adding.clickNoEmaill();
		
		adding.clickOnSubmit();
		
		adding.warningMessage();
		
		
//		Client DashBoard page
		ClientDashBoardPage dashboard = new ClientDashBoardPage(driver);
		
		dashboard.clientDashboard_validation();
		
		dashboard.One_click_Import();
		
		
//		Enter Credit Monitoring Access Details Page
	    EnterCreditMonitoringAccessDetails access = new EnterCreditMonitoringAccessDetails(driver);
	    
	    access.select_dropdown();
	    
	    access.click_import_audit_buton();
	     
		
		
		
	}
	

}
