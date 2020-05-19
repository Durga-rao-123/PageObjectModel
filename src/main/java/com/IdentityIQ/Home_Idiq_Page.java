package com.IdentityIQ;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Idiq_Page 
{

	WebDriver driver;
	
	
	@FindBy(xpath = "//span[contains(text(),'Add a New Client')]")
	WebElement clickOnAddnewClient;
	
	
	
	
	public Home_Idiq_Page(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickon_Addnew_client()
	{
		clickOnAddnewClient.click();
	}
	
	
}
