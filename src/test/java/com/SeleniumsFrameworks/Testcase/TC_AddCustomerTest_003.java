package com.SeleniumsFrameworks.Testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SeleniumsFrameworks.Pageobject.AddCustomerPage_Pageobject;
import com.SeleniumsFrameworks.Pageobject.Login_Pageobject;

public class TC_AddCustomerTest_003 extends BaseClass {
	
	@Test
	public void addNewCustomer() throws InterruptedException, IOException
	{
		Login_Pageobject lp=new Login_Pageobject(driver);
		lp.UserName(username);
		LOGGER.info("User name is provided");
		lp.Password(password);
		LOGGER.info("Passsword is provided");
		lp.clicksubmit();
		
		Thread.sleep(3000);
		
		AddCustomerPage_Pageobject addcust=new AddCustomerPage_Pageobject(driver);
		
		addcust.clickAddNewCustomer();
		
		LOGGER.info("providing customer details....");
		
		
		addcust.custName("Pavan");
		addcust.custgender("male");
		addcust.custdob("10","15","1985");
		Thread.sleep(5000);
		addcust.custaddress("INDIA");
		addcust.custcity("HYD");
		addcust.custstate("AP");
		addcust.custpinno("5000074");
		addcust.custtelephoneno("987890091");
		
		String email=randomestring()+"@gmail.com";
		addcust.custemailid(email);
		addcust.custpassword("abcdef");
		addcust.custsubmit();
		
		Thread.sleep(3000);
		
		LOGGER.info("validation started....");
		
		boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			LOGGER.info("test case passed....");
			
		}
		else
		{
			LOGGER.info("test case failed....");
			captureScreen(driver,"addNewCustomer");
			Assert.assertTrue(false);
		}
			
	}
	
	
	
	

}
