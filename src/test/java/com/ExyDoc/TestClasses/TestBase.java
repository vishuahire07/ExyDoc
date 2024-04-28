package com.ExyDoc.TestClasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.ExyDoc.POMClasses.DashboardPOM;
import com.ExyDoc.POMClasses.LoginPagePOM;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
    WebDriver driver;
	Properties prop;
	Logger log = Logger.getLogger("ExyDoc");
  
	
  @BeforeClass
  public void setUp() throws IOException, InterruptedException
  {
// Load the Config File	  
	  prop = new Properties();
	  FileInputStream file = new FileInputStream("./configuration/config.properties");
	  prop.load(file);	 
	  
// Logs 
	  PropertyConfigurator.configure("log4j.properties");

// Open the browser 	  
	  WebDriverManager.chromedriver().setup();  
	  driver = new ChromeDriver();   log.info("Browser Open");
	  driver.manage().window().maximize();log.info("Browser Maximize");
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  driver.get(prop.getProperty("baseURL"));log.info("URL Open --> Went on Sign In Page");

//Login	  
	  LoginPagePOM login = new LoginPagePOM(driver);		
	  login.enterUsername(prop.getProperty("userName")); log.info("User Name Entered"); 
	  login.enterUserPassword(prop.getProperty("userPassword")); log.info("User Password Entered");
	  login.click_On_RememberMe_CheckBox();log.info("Tick on Remember Me Check Box");
	  login.clickOnSignInBtn(); log.info("Clicked on Sign In Button");
	  Thread.sleep(1000);
		  
  }
  
  @AfterClass
  public void tearDown() throws InterruptedException 
  { 
	  Thread.sleep(3000);
	  driver.quit(); log.info("Browser Closed");
	  log.info("***************Test End***************");
  }
	
}
