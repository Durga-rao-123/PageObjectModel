package com.MyFreeScoreNow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreditMonitoringAccess_Myfree_page 
{
	WebDriver driver;
	
	@FindBy(id = "auto_selprovider")
	WebElement selectDropdown;
	
	@FindBy(id = "auto_vcr_username")
	WebElement enterReportUsername;
	
	@FindBy(id = "auto_vcr_password")
	WebElement enterReportPasswrod;
	
	
	@FindBy(id = "auto_btnsubmit_with_pending")
	WebElement clickOnImportReportAndRunSimpleAudit;
	
	
	
	
	

	public CreditMonitoringAccess_Myfree_page(WebDriver driver)
	{
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void drop_down()
	{
		Select dropdown = new Select(selectDropdown);
		dropdown.selectByValue("myfreescorenow");
	}
	
	public void enter_Report_username()
	{
		enterReportUsername.sendKeys("dr@creditrepaircloud.com");
	}
	
	public void enter_Report_password()
	{
		enterReportPasswrod.sendKeys("flatop63");
	}
	
		
	public void import_report_And_runSimple_Audit()
	{
		clickOnImportReportAndRunSimpleAudit.click();
	}
}
