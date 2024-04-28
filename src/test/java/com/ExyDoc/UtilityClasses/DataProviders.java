package com.ExyDoc.UtilityClasses;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders 
{
    @DataProvider(name="GroupInformation")
	public String[][] getData() throws IOException 
	{
      ReadExcel excel = new ReadExcel();
      int totalrows = excel.getRowCount("GroupInformation");
      int totalcells = excel.getCellCount("GroupInformation", 1);
      
      String GroupInfo[][]= new String [totalrows][totalcells];
      
      for(int r=1; r<=totalrows; r++)
      {
    	  for(int c=0; c<totalcells; c++)
    	  {
    		  GroupInfo[r-1][c] = excel.getCellDate("GroupInformation" , r, c);
    	  }
      }
    		  
	  return GroupInfo;	
	}	
		
}
