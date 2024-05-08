package com.ExyDoc.TestClasses;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.ExyDoc.POMClasses.DashboardPOM;
import com.ExyDoc.POMClasses.GroupAddressPOM;
import com.ExyDoc.UtilityClasses.Screenshots;

public class TC004_Verify_Add_Group_Address_Functionality extends TestBase
{

	  
	 @Test
	 public void verify_Add_Group_Address_Functionality() throws InterruptedException, IOException
	    { 
		    DashboardPOM db = new DashboardPOM(driver);
		    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			db.click_On_Groups();log.info("Clicked on Groups");	
			db.click_On_GroupName();log.info("Clicked on Group Nmae");
			 	 
			//Add Group Address	 		
			 GroupAddressPOM ga = new GroupAddressPOM(driver);
			 ga.click_On_GroupAddress();
			 ga.click_On_AddAddress();
			 ga.enter_Address_In_Line1("NetWin Info Systems pvt. ltd.");
			 ga.enter_Address_In_Line2("Ambad MIDC");
			 ga.enter_Suite_Apt_Floor("NetWin Tower, 1st Floor");
			 ga.enter_City("Nashik");
			 Thread.sleep(2000);
			 ga.select_State();
			 ga.enter_ZipCode("42330");
			 ga.select_County();
			 ga.select_Country();
			 ga.select_AddressType();
			 ga.select_CyrrentAddress();
			 ga.enter_EffectiveDate("04/28/2024");
			 ga.enter_ExpirationDate("04/28/2024");
			 Screenshots.takeScreenShot(driver, "Group Address");
			 log.info("Group Address Entered");
			 ga.scrollDown();	 
			 ga.click_On_SaveButton(); log.info("clicked on Save Button");
		 
		 
		 
//Validation 		
		  
	    }
		
	
	
}
