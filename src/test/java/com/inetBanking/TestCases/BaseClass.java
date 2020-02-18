package com.inetBanking.TestCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass
{
 
	public static String url="http://demo.guru99.com/v3/index.php";

	public String username="mngr243960";

	public static String password="tunAqem";

	public WebDriver driver;
	
	public static Logger logger;

//guru99 username and passwordd is only valid for  20 days so u need to create new pass again


	@BeforeClass
	public void setup()
	
	
      {
		
		
		//System.setProperty("webDriver.chrome.driver","D:\\Neon_workspace\\inetBankingV1\\Drivers\\chromedriver.exe");
		//System.setProperty("webDriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver" , "D:\\selenium drivers\\chromedriver\\chromedriver.exe");
	
	
		driver=new ChromeDriver();
	
		 logger=Logger.getLogger("ebanking");
		PropertyConfigurator.configure("log4j.properties");
	

		}

	@AfterClass
	public void tearDown()
	{
	driver.quit();
	}
}


