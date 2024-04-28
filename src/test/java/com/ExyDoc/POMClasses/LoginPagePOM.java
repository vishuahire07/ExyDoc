package com.ExyDoc.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOM {
	
	private WebDriver driver;
	
// User Name 
	
	@FindBy(xpath="//*[@id=\"username\"]")
	private WebElement UserName;
	
	public void enterUsername(String UName)
	{   UserName.isDisplayed();
	    UserName.isEnabled();
		UserName.sendKeys(UName);
	}
	
//	User Password 
	@FindBy(xpath="//*[@id=\"password\"]")
	private WebElement UserPassword;
	
	public void enterUserPassword(String UPass)
	{   UserPassword.isDisplayed();
	    UserPassword.isEnabled();
		UserPassword.sendKeys(UPass);
	}
	
//	Click on Login Button 
	
	@FindBy(xpath="//*[@id=\"kc-login\"]")
	private WebElement SignInBtn;
	
	public void clickOnSignInBtn()
	{   
		SignInBtn.isDisplayed();
		SignInBtn.isEnabled();
		SignInBtn.click();
	}
	      

//	Get Text After Signed In
	@FindBy(xpath="/html/body/app-root/div/app-dashboard/section/div[1]/h1")
	private WebElement Text_SignedIN;
    public String getText_OnSignedIn()
    {
    	String Actual_Text = Text_SignedIN.getText();
    	return Actual_Text;
    }
	
    
//  Check Box
    @FindBy(xpath="//*[@id=\"rememberMe\"]")
    private WebElement RememberMeCheckBox;
    public void click_On_RememberMe_CheckBox()
    {
    	RememberMeCheckBox.click();
    }
    
    
//Sign in page 
    @FindBy(xpath="//*[@id=\"kc-page-title\"]")
    private WebElement SignInToYourAccount;
    public String get_Text_SignInToYourAccount()
    {
       String Actual_Text = SignInToYourAccount.getText();
       return Actual_Text;
    }
   
//Constructor	
	public LoginPagePOM(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

}
