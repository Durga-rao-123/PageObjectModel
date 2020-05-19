package com.SmartCredit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreditMonitoringAccess_Smart_page 
{
	WebDriver driver;
	
	@FindBy(id = "auto_selprovider")
	WebElement drop_down;
	
	@FindBy(id = "auto_vcr_username")
	WebElement enterReportUsername;
	
	@FindBy(id = "auto_vcr_password")
	WebElement enterReportPasswrod;
	
	@FindBy(id = "auto_btnsubmit_with_pending")
	WebElement clickOnImportReportAndRunSimpleAudit;
	
	
	
	public CreditMonitoringAccess_Smart_page(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void drop_down()
	{	
		Select dropdown = new Select(drop_down);
		dropdown.selectByValue("smartcredit");
	}
	
	public void enter_Report_username()
	{
		enterReportUsername.sendKeys("daniel@credit-aid.com");
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
