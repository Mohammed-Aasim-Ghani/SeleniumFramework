package com.SeleniumsFrameworks.Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Pageobject {

	
	
WebDriver localdriver;
	
	public Login_Pageobject(WebDriver driver)
	{
		localdriver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name="uid")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(name="btnLogin")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")
	@CacheLookup
	WebElement lnkLogout;
	
	public void UserName(String uname)
	{ 
		txtUserName.sendKeys(uname);
	}
	
	public void Password(String pwd)
	{ 
		txtPassword.sendKeys(pwd);
	}
	
	public void clicksubmit()
	{ 
		btnLogin.click();
	}

	public void clickLogout() {
		// TODO Auto-generated method stub
		lnkLogout.click();
	}
	
	
	
	
}
