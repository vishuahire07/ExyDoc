package com.ExyDoc.UtilityClasses;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots {
	
	 public static void takeScreenShot(WebDriver driver, String name ) throws IOException
	   {
		  Date d = new Date();
		  SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyy HH-mm-ss");
	      
		  TakesScreenshot ts = (TakesScreenshot)driver;
		  File srcfile = ts.getScreenshotAs(OutputType.FILE);
		  File dstfile = new File("./Screenshots/"+name+sdf.format(d)+".png"); 
		  FileHandler.copy(srcfile, dstfile);	  
	   }

}
