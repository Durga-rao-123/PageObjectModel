package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewClient_page 
{
	WebDriver driver;
	
	
	@FindBy(id = "fname")
	WebElement FirstName;
	
	@FindBy(id = "lname")
	WebElement LastNmae;
	
	@FindBy(id = "chknoemail")
	WebElement NoEmail;
	
	@FindBy(id = "sub_button")
	WebElement Submit;
	
	@FindBy(className = "btn-default")
	WebElement ClickOk;
	
	
	
	
	
	
	
	
	
	public AddNewClient_page(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void enterFirstName()
	{
		
		FirstName.sendKeys("sample1");
	}
	
	
	public void enterLastName()
	{
		
		LastNmae.sendKeys("Test");
	}
	
	
	public void clickNoEmaill()
	{
		NoEmail.click();
		
		
	}
	
	public void clickOnSubmit()
	{
		
		Submit.click();
	}
	
	
	public void warningMessage()
	{
		
		ClickOk.click();
		
	}
			

}
