package com.IdentityClub;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreditMonitoringAccessDetails_idclub_page
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
	
	
	
		
	
	
	public CreditMonitoringAccessDetails_idclub_page(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void select_Dropdown()
	{
//		selectDropdown.click();
		Select dropdown = new Select(selectDropdown);
		dropdown.selectByValue("identityclub");
	}
	
	public void enter_Report_username()
	{
		enterReportUsername.sendKeys("Kevin@reddibuy.com");
	}
	
	public void enter_Report_password()
	{
		enterReportPasswrod.sendKeys("Kevin891");
	}
	
	public void import_report_And_runSimple_Audit()
	{
		clickOnImportReportAndRunSimpleAudit.click();
	}

}
