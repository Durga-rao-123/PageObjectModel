package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientDashBoardPage
{

	WebDriver driver;
	
	@FindBy(xpath = "//div[@class='client']//div[1]//div[1]//div[2]")
	WebElement clientDashvalidation;
	
	@FindBy(xpath = "//div[@class='client']//div[1]//div[1]//div[2]")
	WebElement OneClickImport;
	
	
	
		
	
	public ClientDashBoardPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
				
	}
	
	
	public void clientDashboard_validation()
	{
		
		clientDashvalidation.isDisplayed();
	}
	
	public void One_click_Import()
	{
		
		OneClickImport.click();
		
	}
	
	
}
