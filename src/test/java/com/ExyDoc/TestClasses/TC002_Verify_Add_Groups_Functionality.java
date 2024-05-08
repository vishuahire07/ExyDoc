package com.ExyDoc.TestClasses;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;

import org.testng.annotations.Test;

import com.ExyDoc.POMClasses.AddGroupPOM;
import com.ExyDoc.POMClasses.DashboardPOM;
import com.ExyDoc.POMClasses.GroupAddressPOM;
import com.ExyDoc.POMClasses.GroupInformationPOM;
import com.ExyDoc.UtilityClasses.DataProviders;
import com.ExyDoc.UtilityClasses.Screenshots;


public class TC002_Verify_Add_Groups_Functionality extends TestBase
{
	 @Test(dataProvider="GroupInformation",dataProviderClass = DataProviders.class )
		public void verify_Add_Groups_Informaton_Functionality(String GroupName, String TaxId, String LegalName, String DBAName, String EHRSystemName, String OpenDate , String ExpirationDate ) throws InterruptedException, IOException
		{   

//Add Group Info		
		DashboardPOM db = new DashboardPOM(driver);
		db.click_On_Groups();log.info("Clicked on Groups");
		db.click_On_Add_Groups();log.info("Clicked on Add Groups");
		
		AddGroupPOM ag = new AddGroupPOM(driver); 
		ag.enter_Group_Name(GroupName); log.info("Enterd Group Name");
		ag.select_Group_Status(); log.info("Select Group Status");
		ag.enter_Tax_Id(TaxId); log.info("Enter Tax ID");
		ag.enter_Legal_Name(LegalName); log.info("Enter Legal Name");
		ag.enter_DBA_Name(DBAName); log.info("Enter DBA Name");
		ag.enter_EHR_System_Name(EHRSystemName); log.info("Enter EHR System Name");
		ag.enter_Open_Date(OpenDate); log.info("Enter Open Date");
		ag.enter_Expiration_Date(ExpirationDate); log.info("Enter Expiration Date");
		ag.click_On_Save_Button(); log.info("Clicked on Save Button");
		Thread.sleep(1000); 

//Validation 
		GroupInformationPOM gi = new GroupInformationPOM(driver);
		String Actual_Text = gi.get_GroupName(); 
		
		if(Actual_Text.equals(GroupName))
		{
			log.info("Group Added Successfully");
			Screenshots.takeScreenShot(driver, "Group Information");
			Assert.assertTrue(true); log.info("TC002_Verify_Add_Groups_Functionality is Pass");
			
		}
		else
			
		{  
			Screenshots.takeScreenShot(driver, "Group Not Added");
			Assert.assertFalse(false); log.info("TC002_Verify_Add_Groups_Functionality is Fail");
		}
		 

	}

}
