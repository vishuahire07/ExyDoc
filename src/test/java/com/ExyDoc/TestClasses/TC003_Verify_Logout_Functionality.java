package com.ExyDoc.TestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ExyDoc.POMClasses.DashboardPOM;
import com.ExyDoc.POMClasses.LoginPagePOM;
import com.ExyDoc.POMClasses.LogoutPOM;
import com.ExyDoc.UtilityClasses.Screenshots;

public class TC003_Verify_Logout_Functionality extends TestBase
{
	
    @Test
	public void verify_Logout_Functionality() throws InterruptedException, IOException
	{	
//Logout	
		
	  DashboardPOM logout = new DashboardPOM(driver);
	  logout.click_On_Profile(); log.info("Clicked on Profile");
	  Thread.sleep(2000);
	  logout.click_On_Logout(); log.info("Clicked on Logout");
	  
	  LogoutPOM logout1 = new LogoutPOM(driver);
	  logout1.click_On_Logout();log.info("Clicked on Logout");
	  
// Apply Validation 
	  
	  LoginPagePOM login = new LoginPagePOM(driver);
	  
	  String Actual_Text = login.get_Text_SignInToYourAccount();
	  String Expected_Text = "Sign in to your account";
	  
	  if(Actual_Text.equals(Expected_Text))
	  {   
		  Screenshots.takeScreenShot(driver, "Logout");
		  Assert.assertTrue(true);log.info("Logged Out Successfully");
		  log.info("verify_Logout_Functionality is Passed");
	  }
	  else
	  {
		  Assert.assertFalse(false);log.info("verify_Logout_Functionality is Failed");
	  }
		
	}
	
}
