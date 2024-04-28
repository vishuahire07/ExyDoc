package com.ExyDoc.POMClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class GroupAddressPOM {
	
private WebDriver driver;
private Select s;
private JavascriptExecutor js;
// WebElements

// Group Address 
 @FindBy(xpath="//*[@id=\"v-pills-tab\"]/a[2]")
 private WebElement GroupAddress;
 public void click_On_GroupAddress()
 {
	 GroupAddress.isDisplayed();
	 GroupAddress.isEnabled();
	 GroupAddress.click();
 }
 
//Add Address 
 @FindBy(xpath="//*[@id=\"v-pills-tabContent\"]/div[2]/app-group-address-list/div[1]/a")
 private WebElement AddAdress;
 public void click_On_AddAddress()
 {
	 AddAdress.isDisplayed();
	 AddAdress.isEnabled();
	 AddAdress.click();
 }
 
//AddressLine1
 @FindBy(xpath="//*[@id=\"addAddressModal\"]/div/div/div[2]/div[2]/div/input")
 private WebElement AddressLine1;
 public void enter_Address_In_Line1(String address1)
 {
	 AddressLine1.isDisplayed();
	 AddressLine1.isEnabled();
	 AddressLine1.sendKeys(address1);
 }
 
//AddressLIne2 
 @FindBy(xpath="//*[@id=\"addAddressModal\"]/div/div/div[2]/div[3]/div/input")
 private WebElement AddressLine2;
 public void enter_Address_In_Line2(String address2)
 {
	 AddressLine2.isDisplayed();
	 AddressLine2.isEnabled();
	 AddressLine2.sendKeys(address2);
 
 }
 
//Suite, Apt., Floor
 @FindBy(xpath="//*[@id=\"addAddressModal\"]/div/div/div[2]/div[4]/div[1]/input")
 private WebElement Suite_Apt_Floor;
 public void enter_Suite_Apt_Floor(String address3)
 {
	 Suite_Apt_Floor.isDisplayed();
	 Suite_Apt_Floor.isEnabled();
	 Suite_Apt_Floor.sendKeys(address3);
 }
 
// City
 @FindBy(xpath="//*[@id=\"addAddressModal\"]/div/div/div[2]/div[4]/div[2]/input")
 private WebElement City;
 public void enter_City(String city)
 {
	 City.isDisplayed();
	 City.isEnabled();
	 City.sendKeys(city);	
 }

// State 
 @FindBy(xpath="//*[@id=\"addAddressModal\"]/div/div/div[2]/div[5]/div[1]/select")
 private WebElement State;
 public void select_State()
 {
	s = new Select(State);
	s.selectByVisibleText("MA");
 }
 
//Zip code
 @FindBy(xpath="//*[@id=\"addAddressModal\"]/div/div/div[2]/div[5]/div[2]/input")
 private WebElement ZipCode;
 public void enter_ZipCode(String zip)
 {
	 ZipCode.isDisplayed();
	 ZipCode.isEnabled();
	 ZipCode.sendKeys(zip);
 }
 
 
// county
 @FindBy(xpath="//*[@id=\"addAddressModal\"]/div/div/div[2]/div[6]/div[1]/select")
 private WebElement County;
 public void select_County()
 {
	 s = new Select(County);
	 s.selectByVisibleText("Middlesex County");
 }
 
//Country 
 @FindBy(xpath="//*[@id=\"addAddressModal\"]/div/div/div[2]/div[6]/div[2]/select")
 private WebElement Country;
 public void select_Country()
 {
	 s = new Select(Country);
	 s.selectByVisibleText("United States of America");
 }
 
//Address Type
 @FindBy(xpath="//*[@id=\"addAddressModal\"]/div/div/div[2]/div[7]/div[1]/select")
 private WebElement AddressType;
 public void select_AddressType()
 {
	 s = new Select(AddressType);
	 s.selectByVisibleText("Mailing and Billing Address");;
 }
 
//Current Address
 @FindBy(xpath="//*[@id=\"addAddressModal\"]/div/div/div[2]/div[7]/div[2]/select")
 private WebElement CyrrentAddress;
 public void select_CyrrentAddress()
 {
	 s = new Select(CyrrentAddress);
	 s.selectByValue("1: Yes"); //2: No
 }

// Effective Date
 @FindBy(xpath="//*[@id=\"addAddressModal\"]/div/div/div[2]/div[9]/div[1]/input")
 private WebElement EffectiveDate;
 public void enter_EffectiveDate(String EfDate)
 {
	 EffectiveDate.isDisplayed();
	 EffectiveDate.isEnabled();
	 EffectiveDate.sendKeys(EfDate);
 }
 
// Expiration Date
 
 @FindBy(xpath="//*[@id=\"addAddressModal\"]/div/div/div[2]/div[9]/div[2]/input")
 private WebElement ExpirationDate;
 public void enter_ExpirationDate(String ExDate)
 {
	 EffectiveDate.isDisplayed();
	 EffectiveDate.isEnabled();
	 EffectiveDate.sendKeys(ExDate);
 }
 
// Scroll Down 
 @FindBy(xpath="//*[@id=\"addAddressModal\"]/div/div/div[3]")
 private WebElement ScrollDown;
 public void scrollDown()
 {
	js.executeScript("arguments[0].scrollIntoView();", ScrollDown) ;
 }
 
// Save Button 
 @FindBy(xpath="//*[@id=\"addAddressModal\"]/div/div/div[3]/button[1]")
 private WebElement SaveButton;
 public void click_On_SaveButton()
 {
	 SaveButton.isDisplayed();
	 SaveButton.isEnabled();
	 SaveButton.click();
 }
 
// Constructor
 
 public GroupAddressPOM(WebDriver driver)
 {
	 this.driver = driver;
	 PageFactory.initElements(driver, this);
	 js =(JavascriptExecutor)driver;
	 
 }

}
