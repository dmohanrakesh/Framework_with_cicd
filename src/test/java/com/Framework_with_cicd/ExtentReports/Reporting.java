package com.Framework_with_cicd.ExtentReports;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.model.ReportStats;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reporting{
		 
     public static ExtentReports extentReports;
     public static ExtentTest extentTest;
     public static ExtentSparkReporter sparkReporter;
     
     public static void setUpReporting() {
		
    	 String timeStamp = new SimpleDateFormat("yyyy.mm.dd.HH.mm.ss").format(new Date());
    	 String reportName = "Test_Report_"+timeStamp+".html";
    	 
    	 sparkReporter = new ExtentSparkReporter("target/Spark/"+reportName);
    	 sparkReporter.config().setDocumentTitle("Automation Test Report");
    	 sparkReporter.config().setReportName("DemoQA website testing report");
    	 sparkReporter.config().setTheme(Theme.DARK);
    	 extentReports = new ExtentReports();
    	 
    	 extentReports.attachReporter(sparkReporter);
    	 
    	 extentReports.setSystemInfo("Project Name","Framework_with_cicd for DemoQa website");
    	 extentReports.setSystemInfo("Tester","Mohan");
    	 extentReports.setSystemInfo("Browser","Google Chrome");
    	 extentReports.setSystemInfo("OS","Windows 11");
    	     	 
	}
     
     
     public static void finishReporting() {
    	 extentReports.flush();
    	 
     }
     
    
    	 
     

}
