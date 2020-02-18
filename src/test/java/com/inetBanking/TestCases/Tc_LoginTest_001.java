package com.inetBanking.TestCases;


import org.testng.Assert;

import org.testng.annotations.Test;

import com.inetBanking.PageObjects.LoginPage;

public class Tc_LoginTest_001 extends BaseClass
{
	@Test
	public void LoginTest()
	{
		driver.get(url);
		logger.info("url is opened");
		LoginPage lp=new LoginPage(driver);
		
		logger.info("entered username");
		lp.setUserName(username);
		
		logger.info("entered password");
		lp.setPasssword(password);
		
		logger.info("login is clicked");
		
		lp.clickLogin();
		
		
		if(driver.getTitle().equals("Guru99 Bnak Manager HomePage"))
		{
		Assert.assertTrue(true);
		logger.info("Login test passed");
		
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
		
	}
}
