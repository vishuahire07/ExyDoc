package com.ExyDoc.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPOM {
	
	private WebDriver driver;
	
	
//WebElements and Actions

//Logout 
	@FindBy(xpath="//*[@id=\"kc-logout\"]")
	private WebElement Logout;
	public void click_On_Logout()
	{
		Logout.isDisplayed();
		Logout.isEnabled();
		Logout.click();
	}
	
	
	
	
	
//Constructor
	public LogoutPOM(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
