package com.MyFreeScoreNow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_MyFreeScore_Page 
{
	WebDriver driver;
	
	@FindBy(id = "username")
	WebElement enterLoginUsername;
	
	@FindBy(id = "password")
	WebElement enterLoginPassword;
	
	@FindBy(id = "signin")
	WebElement clickSubmit;
	
	
	
	
	public Login_MyFreeScore_Page(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enter_Login_username()
	{
		enterLoginUsername.sendKeys("debuglog@creditrepaircloud.com");
	}
	
	public void enter_Login_password()
	{
		enterLoginPassword.sendKeys("123456");
	}
	
	public void click_Submit()
	{
		clickSubmit.click();
	}
	

}
