package com.inetBanking.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;


	public LoginPage(WebDriver driver)
	{

	this.driver=driver;
	
	PageFactory.initElements(driver,this);
}
	
	@FindBy(name="uid")
	WebElement txtUsername;
	
	@FindBy(name="password")
	WebElement Upassword;
	
	@FindBy(name="btnLogin")
	
	WebElement login;
	

	public void setUserName(String un)
	{
		txtUsername.sendKeys(un);
	}
		
		public void setPasssword(String upass)
		{
		
		Upassword.sendKeys(upass);
		}
		
		public void clickLogin()
		{
		login.click();
		}
}
