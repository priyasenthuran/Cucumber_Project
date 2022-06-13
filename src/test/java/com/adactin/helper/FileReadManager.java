package com.adactin.helper;

import java.io.IOException;

public class FileReadManager {
	
	public FileReadManager() {
		//to restrict  other to create a frm in any other class for later understanding 
		}

	public static FileReadManager getinstance()
	{
		FileReadManager frm = new FileReadManager();
		return frm;
	}
	
	public ConfigurationReader getconfigureclass() throws IOException
	{
		ConfigurationReader cr = new  ConfigurationReader();
				return cr;
	}
}
