package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EnterCreditMonitoringAccessDetails
{

	WebDriver driver;
	
	@FindBy(id = "auto_selprovider")
	WebElement selectDropdown;
	
	@FindBy(id = "auto_btnsubmit_with_pending")
	WebElement clickOnImportAndAudit;
	
	
	
	
	public EnterCreditMonitoringAccessDetails(WebDriver driver)
	{
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void select_dropdown()
	{
		Select dropdown = new Select(selectDropdown);
				dropdown.selectByVisibleText("Sample Report");
		
	}
	
	
	public void click_import_audit_buton()
	{
		clickOnImportAndAudit.click();
		
	}
	
	
}
