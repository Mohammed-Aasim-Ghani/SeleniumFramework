package com.SeleniumsFrameworks.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	
	Properties pro;
	
	public ReadConfig()
	{
		File src = new File("./Configuration/config.properties");
	
	
	
	try {
		FileInputStream fis = new FileInputStream(src);
		pro= new Properties();
		try {
			pro.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
	
	}
	
	public String getApplicationurl()
	{
		String url=pro.getProperty("baseurl");
		//System.out.println(url);
		return url;
	}
	
	public String getusername()
	{
		String username=pro.getProperty("username");
		//System.out.println(username);
		return username;
	}
	
	public String getpassword()
	{
		String password=pro.getProperty("password");
		//System.out.println(password);
		return password;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
