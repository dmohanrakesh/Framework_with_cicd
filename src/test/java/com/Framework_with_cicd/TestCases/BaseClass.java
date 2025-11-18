package com.Framework_with_cicd.TestCases;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.Framework_with_cicd.Utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

//	public static String baseUrl= "https://demoqa.com/";
//	
//	public static String fullName= "asdf";
//	public static String email= "asdf@demoqa.com";
//	public static String currentAddress= "asdf";
//	public static String permanentAddress= "asdf";
//	
	
	static ReadConfig readConfig= new ReadConfig();
	
	
	public static String baseUrl= readConfig.getUrl();
	public static String fullName= readConfig.getFullName();
	public static String email= readConfig.getEmail();
	public static String currentAddress= readConfig.getCurrentAddress();
	public static String permanentAddress= readConfig.getPermanentAddress();
	
	
//	
//	
//	WebDriverManager.chromedriver().setup();
	WebDriver driver;
	Logger log;
	
	@BeforeMethod
	public void setUp() {
		
	
//		String testname = method.getName();
		log = LogManager.getLogger(BaseClass.class);
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		
	}
	
	@AfterMethod
	public void tearDown() {
		
		
		driver.quit();
	}
	
	
public void captureScreenshot(WebDriver driver, String tname) throws IOException {
		
		LocalDateTime localDateTime= LocalDateTime.now();
		String dateAndTime = localDateTime.toString();
		
		TakesScreenshot tsScreenshot = (TakesScreenshot)driver;
		File src= tsScreenshot.getScreenshotAs(OutputType.FILE);
		File dest = new File("/Framework_with_cicd/Screenshots/"+tname+dateAndTime+"screenshot.png");
//		try {
//			FileUtils.copyFile(src, dest);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		FileUtils.copyFile(src, dest);
}
	
}
