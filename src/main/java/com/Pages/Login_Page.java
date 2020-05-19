package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login_Page {
	
	WebDriver driver;
	
	@FindBy(name="username")
	WebElement loginusername;
	
	@FindBy(name="password")
	WebElement loginpassword;
	
	@FindBy(id="signin")
	WebElement submitbutton;



	public Login_Page(WebDriver driver)
	{
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	public  void typeUserName() 
	{
		
		loginusername.sendKeys("debuglog@creditrepaircloud.com");
	}
	
	public  void typePassWord()
	{
		loginpassword.sendKeys("123456");
		
	}
	
	
	public  void clickOnSignin() {
		
		submitbutton.click();
		
	}

	
	
	}
	
