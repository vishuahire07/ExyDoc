package com.ExyDoc.TestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ExyDoc.POMClasses.LoginPagePOM;
import com.ExyDoc.UtilityClasses.Screenshots;

public class TC001_VerifyLoginFunctionality extends TestBase
{

    @Test
	public void verify_Login_Functionality() throws IOException, InterruptedException
	{
		
// Validation 
		log.info("Apply the Validation");
		LoginPagePOM login = new LoginPagePOM(driver);	
		String Expected_Text= "Dashboard";
		String Actual_Text = login.getText_OnSignedIn();
	    	    
	    if(Actual_Text.equals(Expected_Text))
	    {
	      Screenshots.takeScreenShot(driver, "Signed In Pass");
	      Assert.assertTrue(true); log.info("verify_Login_Functionality is Pass");
	      
	    }	   
	    else 
	    {
	      Screenshots.takeScreenShot(driver, "Signed In Fail");
	      Assert.assertFalse(false); log.info("verify_Login_Functionality is Fail");		      
	    }
	    				
	}
	
	
}
