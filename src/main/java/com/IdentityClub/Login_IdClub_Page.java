package com.IdentityClub;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_IdClub_Page 
{

	WebDriver driver;
	
	@FindBy(id = "username")
	WebElement enterLoginUsername;
	
	@FindBy(id = "password")
	WebElement enterLoginpassword;
	
	@FindBy(id = "signin")
	WebElement clickOnSubmit;
	
	
	
	
	public Login_IdClub_Page(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void enter_login_username()
	{
		enterLoginUsername.sendKeys("debuglog@creditrepaircloud.com");
	}
	
	public void enter_login_password()
	{
		enterLoginpassword.sendKeys("123456");
	}
	
	public void clickon_submit()
	{
		clickOnSubmit.click();
	}
	
	
	
}
