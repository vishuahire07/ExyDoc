package com.ExyDoc.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPOM {

	private WebDriver driver;
	
// Web Elements and Actions 
	
// Groups	
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul/li[2]")
	private WebElement Groups;
	public void click_On_Groups()
	{
		Groups.isDisplayed();
		Groups.isEnabled();
		Groups.click();
	}
	
//Add Groups
	@FindBy(xpath="/html/body/app-root/div/app-group-list/section/div/div/div[1]/a")
	private WebElement AddGroups;
	public void click_On_Add_Groups()
	{
		AddGroups.isDisplayed();
		AddGroups.isEnabled();
		AddGroups.click();
	}
	
//Profile button 
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/div/button")
	private WebElement Profile;
	public void click_On_Profile()
	{
		Profile.isDisplayed();
		Profile.isEnabled();
		Profile.click();
	}
	
//LogOut 
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/div/div/div[2]/a")
	private WebElement Logout;
	public void click_On_Logout()
	{
		Logout.isDisplayed();
		Logout.isEnabled();
		Logout.click();
	}
	
	
//Group Name
	@FindBy(xpath="//*[@id=\"group-list-tab\"]/div/div[2]/div/div/div[2]/div[2]/a")
	private WebElement GroupName;
	public void click_On_GroupName()
	{
		GroupName.click();
	}
	
	
	
	
	
	
	
// Constructor	
	public DashboardPOM(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
}
