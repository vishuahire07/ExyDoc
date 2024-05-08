package com.ExyDoc.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddGroupPOM {
	
	private WebDriver driver;

	//WebElements

	
//Group Name
	@FindBy(xpath="//*[@id=\"addGroupModal\"]/div/div/div[2]/div[3]/div[1]/input")
	private WebElement GroupName;
	public void enter_Group_Name(String GName)
	{
		GroupName.isDisplayed();
		GroupName.isEnabled();
		GroupName.sendKeys(GName);
	}
	
//Group Status 
	@FindBy(xpath="//*[@id=\"addGroupModal\"]/div/div/div[2]/div[3]/div[2]/select")
	private WebElement SelectGroupStatus;
	public void select_Group_Status()
	{
		Select obj = new Select(SelectGroupStatus);
		obj.selectByValue("1: Yes");  // 2: No
	}
	
	
//Tax Id 
	@FindBy(xpath="//*[@id=\"addGroupModal\"]/div/div/div[2]/div[4]/div/input")
	private WebElement TaxId;
    public void enter_Tax_Id(String id)
    {
    	TaxId.isDisplayed();
    	TaxId.isEnabled();
    	TaxId.sendKeys(id);   	
    }
	
//Legal Name 
    @FindBy(xpath="//*[@id=\"addGroupModal\"]/div/div/div[2]/div[5]/div[1]/input")
    private WebElement LegalName;
	public void enter_Legal_Name(String name)
	{
		LegalName.isDisplayed();
		LegalName.isEnabled();
		LegalName.sendKeys(name);
	}
	
//DBA Name
	@FindBy(xpath="//*[@id=\"addGroupModal\"]/div/div/div[2]/div[5]/div[2]/input")
    private WebElement DBAName;
	public void enter_DBA_Name(String name)
	{
		DBAName.isDisplayed();
		DBAName.isEnabled();
		DBAName.sendKeys(name);
	}

//EHR System Name	
	@FindBy(xpath="//*[@id=\"addGroupModal\"]/div/div/div[2]/div[6]/div/input")
    private WebElement EHRSystemName;
	public void enter_EHR_System_Name(String name)
	{
		EHRSystemName.isDisplayed();
		EHRSystemName.isEnabled();
		EHRSystemName.sendKeys(name);
	}
	
//Open Date
	
	@FindBy(xpath="//*[@id=\"addGroupModal\"]/div/div/div[2]/div[7]/div[1]/input")
    private WebElement OpenDate;
	public void enter_Open_Date(String date)
	{
		OpenDate.isDisplayed();
		OpenDate.isEnabled();
		OpenDate.sendKeys(date);
	}
	
//Expiration Date
	@FindBy(xpath="//*[@id=\"addGroupModal\"]/div/div/div[2]/div[7]/div[2]/input")
    private WebElement ExpirationDate;
	public void enter_Expiration_Date(String date)
	{
		ExpirationDate.isDisplayed();
		ExpirationDate.isEnabled();
		ExpirationDate.sendKeys(date);
	}
	
//Save Button
	
	@FindBy(xpath="//*[@id=\"addGroupModal\"]/div/div/div[3]/button[1]")
	private WebElement SaveButton;
	public void click_On_Save_Button()
	{
		SaveButton.isDisplayed();
		SaveButton.isEnabled();
		SaveButton.click();
	}
	
	
	
	
	//Constructor	
		public AddGroupPOM(WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		

}
