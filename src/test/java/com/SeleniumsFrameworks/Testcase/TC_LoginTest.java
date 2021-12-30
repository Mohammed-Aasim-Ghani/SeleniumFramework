package com.SeleniumsFrameworks.Testcase;



import java.io.IOException;

import org.apache.logging.log4j.core.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.SeleniumsFrameworks.Pageobject.Login_Pageobject;





public class TC_LoginTest extends BaseClass {

	@Test
	public void logintest() throws IOException
	{
		LOGGER.info("URL is opened");
		//System.out.println(baseurl+" "+username+" "+password);
		Login_Pageobject lp = new Login_Pageobject(driver);
		lp.UserName(username);
		LOGGER.info("Enter Username");
		lp.Password(password);
		LOGGER.info("Enter Password");
		lp.clicksubmit();
		LOGGER.info("Clicked Submit Button");
		
		
		if(driver.getTitle().equals("Guru99 Bank Manager Homepage123"))
		{
			Assert.assertTrue(true);
			LOGGER.info("Login Test Passed");
		}
		else
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			LOGGER.info("Login test failed");
		}
		
		
	}
	
	
	
}
