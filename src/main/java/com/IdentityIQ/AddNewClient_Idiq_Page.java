package com.IdentityIQ;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewClient_Idiq_Page
{
	WebDriver driver;
	
	
	
	@FindBy(id = "fname")
	WebElement enterFirstname;
	
	@FindBy(id = "lname")
	WebElement enterLastname;
	
	@FindBy(id = "chknoemail")
	WebElement checkBox;
	
	@FindBy(id = "sub_button")
	WebElement clickSubmit;
	
	@FindBy(xpath = "//button[contains(text(),'OK')]")
	WebElement warningMessage;
	
	
	
	
	

	
	public AddNewClient_Idiq_Page(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enter_first_name()
	{
		enterFirstname.sendKeys("IdentityIq POM");
	}
	
	public void enter_last_name()
	{
		enterLastname.sendKeys("Test");
	}
	
	public void check_box()
	{
		checkBox.click();
	}
	
	public void click_submit()
	{
		clickSubmit.click();
	}
	
	public void warning_message()
	{
		warningMessage.click();		
	}
	

}
