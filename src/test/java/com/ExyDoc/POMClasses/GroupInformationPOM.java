package com.ExyDoc.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GroupInformationPOM {
	
	private WebDriver driver;
	
	
//WebEkements and Actions
	
	@FindBy(xpath="//*[@id=\"v-pills-tabContent\"]/div/div/div[1]/div/h2")
	private WebElement GroupName;
	public String get_GroupName()
	{
		String ActualText = GroupName.getText();
		return ActualText;
	}

	
	
//Constructor 
	public GroupInformationPOM(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
}
