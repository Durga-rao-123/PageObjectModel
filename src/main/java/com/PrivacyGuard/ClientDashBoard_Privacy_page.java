package com.PrivacyGuard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientDashBoard_Privacy_page
{
	WebDriver driver;
	
	@FindBy(xpath = "//div[@class='client']//div[1]//div[1]//div[2]")
	WebElement clickImportAndAudit;
	
	
	
	public ClientDashBoard_Privacy_page(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickon_Import_And_Audit()
	{
		clickImportAndAudit.click();
	}

}
