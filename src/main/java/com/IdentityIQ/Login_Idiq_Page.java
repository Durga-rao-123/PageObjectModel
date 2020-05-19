package com.IdentityIQ;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Idiq_Page
{
	
	
	WebDriver driver;
	
	@FindBy(id = "username")
	WebElement LoginUsername;
	
	@FindBy(id = "password")
	WebElement LoginPassword;
	
	@FindBy(id = "signin")
	WebElement SignIn;
	
	
	
	
	public Login_Idiq_Page(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
			
	}
	
	
	public void login_user_name()
	{
		LoginUsername.sendKeys("debuglog@creditrepaircloud.com");
		
	}
	
	
	public void login_password()
	{
		LoginPassword.sendKeys("123456");
		
	}
	
	public void signIn()
	{
		SignIn.click();
		
	}
	

}
