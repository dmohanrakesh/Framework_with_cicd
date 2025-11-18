package com.Framework_with_cicd.Utilities;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtils {

	public void captureScreenshot(WebDriver driver, String tcname) {
		
		LocalDateTime localDateTime= LocalDateTime.now();
		String dateAndTime = localDateTime.toString();
		
		TakesScreenshot tsScreenshot = (TakesScreenshot)driver;
		File src= tsScreenshot.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/"+tcname+dateAndTime+".png");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
