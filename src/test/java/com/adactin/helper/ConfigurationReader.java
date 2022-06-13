package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	
	public static Properties ps;

	public ConfigurationReader() throws IOException
	{
		File login = new File("src\\test\\java\\com\\adactin\\helper\\Adactin.property");
		FileInputStream fis = new FileInputStream(login);
	    ps = new Properties();
		ps.load(fis);
		
		
	}
	
	public String getBrowser()
	{
		String username = ps.getProperty("Browser");
		return username;
		
	}
	
	public String geturl()
	{
		String url = ps.getProperty("url");
		return url;
	}
}
