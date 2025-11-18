package com.Framework_with_cicd.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
	Properties p = new Properties();
	public ReadConfig(){
	
	File f = new File("./Configuration files/config.properties");
	
	FileInputStream fis;
	try {
		fis = new FileInputStream(f);
		p.load(fis);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	}
	
	public String getUrl() {
		
		 return p.getProperty("baseUrl");
	}
	
	public String getFullName() {
		
		 return p.getProperty("fullName");
	}
	
	public String getEmail() {
		
		 return p.getProperty("email");
	}
	
	public String getCurrentAddress() {
		
		 return p.getProperty("currentAddress");
	}
	
	public String getPermanentAddress() {
		
		 return p.getProperty("permanentAddress");
	}
	

}
