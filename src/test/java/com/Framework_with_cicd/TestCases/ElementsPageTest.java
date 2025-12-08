package com.Framework_with_cicd.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Framework_with_cicd.PageObjects.ElementsPage;
import com.Framework_with_cicd.PageObjects.HomePage;
import com.Framework_with_cicd.Utilities.XLUtils;

public class ElementsPageTest extends BaseClass{

	
	@Test
	public void TC01_VerifyNavigationToElementsPage() throws IOException {
		// TODO Auto-generated method stub

//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get(baseUrl);
//		driver.manage().window().maximize();
		
//		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
//		
//		jsExecutor.executeScript("window.scrollTo(0,1000);");
		
//		driver.switchTo().frame(0);
		String testName = "TC01_VerifyNavigationToElementsPage";
		log.info("Started "+testName+"......");
//		ScreenshotUtils ssUtils = new ScreenshotUtils();
		HomePage homePage = new HomePage(driver);
		log.info("Currently on the Home page");
		log.info("Scrolling down to the Elements label on the Elements card");
		homePage.scrollToElementsCard();
		log.info("Clicking the Elements card");
		homePage.clickElementsCard();
		log.info("Elements card is clicked!");
		ElementsPage elementsPage = new ElementsPage(driver);
		log.info("Clicking the 'Text Box' option on the Elements page");
		
		log.info(getXlData().toString());
		
//		
		if (elementsPage.isElementsDropDownPresent()) {
			//captureScreenshot(driver, testName);
			log.info("Navigated to the Elements page successfully!!");
			Assert.assertTrue(true);
		}
		else {
			
			//captureScreenshot(driver, testName);
			log.fatal("Navigation to the Elements page failed!!");
			Assert.assertTrue(false);
//			ssUtils.captureScreenshot(driver, testName);
		}
		
		
	}
	
	
	@Test
	public void TC02_ValidateTextBoxOptionOpensTextBoxPage() {
		// TODO Auto-generated method stub

//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get(baseUrl);
//		driver.manage().window().maximize();
		
//		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
//		
//		jsExecutor.executeScript("window.scrollTo(0,1000);");
		
//		driver.switchTo().frame(0);
		
		String testName = "TC02_ValidateTextBoxOptionOpensTextBoxPage";
		log.info("Started "+testName+"......");
		HomePage homePage = new HomePage(driver);
		log.info("Currently on the Home page");
		log.info("Scrolling down to the Elements label on the Elements card");
		homePage.scrollToElementsCard();
		log.info("Clicking the Elements card");
		homePage.clickElementsCard();
		log.info("Elements card is clicked!");
		ElementsPage elementsPage = new ElementsPage(driver);
		log.info("Clicking the 'Text Box' option on the Elements page");
		elementsPage.clickTextBoxOption();
		
//		
		if (elementsPage.isTextBoxHeadingPresent()) {
			//captureScreenshot(driver, testName);
			log.info("Text Box heading validation is done successfully!");
			Assert.assertTrue(true);
		}
		else {
			//captureScreenshot(driver, testName);
			log.error("Text Box heading validation failed");
			Assert.assertTrue(false);
		}		
	}
	
	@Test
	public void TC03_ValidateTextBoxOptionOpensTextBoxPage() {
		// TODO Auto-generated method stub

//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get(baseUrl);
//		driver.manage().window().maximize();
		
//		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
//		
//		jsExecutor.executeScript("window.scrollTo(0,1000);");
		
//		driver.switchTo().frame(0);
		
		String testName = "TC03_ValidateTextBoxOptionOpensTextBoxPage";
		log.info("Started "+testName+"......");
		HomePage homePage = new HomePage(driver);
		log.info("Currently on the Home page");
		log.info("Scrolling down to the Elements label on the Elements card");
		homePage.scrollToElementsCard();
		log.info("Clicking the Elements card");
		homePage.clickElementsCard();
		log.info("Elements card is clicked!");
		ElementsPage elementsPage = new ElementsPage(driver);
		log.info("Clicking the 'Text Box' option on the Elements page");
		elementsPage.clickTextBoxOption();
		
//		
		if (elementsPage.isTextBoxHeadingPresent()) {
			//captureScreenshot(driver, testName);
			log.info("Text Box heading validation is done successfully!");
			
			elementsPage.enterFullName(fullName);
			log.info("Entered the Full Name");
			elementsPage.enterEmail(email);
			log.info("Entered the Email");
			elementsPage.enterCurrentAddress(currentAddress);
			log.info("Entered the Current Address");
			elementsPage.enterPermanentAddress(permanentAddress);
			log.info("Entered the Permanent Address");
			elementsPage.clickSubmitButton();
			log.info("Clicked the SUBMIT button");
			
			if (elementsPage.isOutputPresent()) {
				log.info("Output banner is present!");
				log.info(elementsPage.getOutput());
				
				log.info("Output is displayed Successfully!!!");
				Assert.assertTrue(true);
			}
		}
		else {
			//captureScreenshot(driver, testName);
			log.error("Text Box heading validation failed");
			Assert.assertTrue(false);
		}		
	}

	
	@Test(dataProvider = "getExcelData")
	public void TC04_XlDataProviderValidation(String fullName, String email, String currentAddress, String permanentAddress ) {
		// TODO Auto-generated method stub

//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get(baseUrl);
//		driver.manage().window().maximize();
		
//		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
//		
//		jsExecutor.executeScript("window.scrollTo(0,1000);");
		
//		driver.switchTo().frame(0);
		
		String testName = "TC04_XlDataProviderValidation";
		log.info("Started "+testName+"......");
		HomePage homePage = new HomePage(driver);
		log.info("Currently on the Home page");
		log.info("Scrolling down to the Elements label on the Elements card");
		homePage.scrollToElementsCard();
		log.info("Clicking the Elements card");
		homePage.clickElementsCard();
		log.info("Elements card is clicked!");
		ElementsPage elementsPage = new ElementsPage(driver);
		log.info("Clicking the 'Text Box' option on the Elements page");
		elementsPage.clickTextBoxOption();
		
//		
		if (elementsPage.isTextBoxHeadingPresent()) {
			//captureScreenshot(driver, testName);
			log.info("Text Box heading validation is done successfully!");
			
			elementsPage.enterFullName(fullName);
			log.info("Entered the Full Name");
			elementsPage.enterEmail(email);
			log.info("Entered the Email");
			elementsPage.enterCurrentAddress(currentAddress);
			log.info("Entered the Current Address");
			elementsPage.enterPermanentAddress(permanentAddress);
			log.info("Entered the Permanent Address");
			elementsPage.clickSubmitButton();
			log.info("Clicked the SUBMIT button");
			
			
			if (elementsPage.isOutputPresent()) {
				log.info("Output banner is present!");
				log.info(elementsPage.getOutput());
				
				log.info("Output is displayed Successfully!!!");
				Assert.assertTrue(true);
			}
		}
		else {
			//captureScreenshot(driver, testName);
			log.error("Text Box heading validation failed");
			Assert.assertTrue(false);
		}		
	}
	
	
	@DataProvider(name = "getExcelData")
	public static Object[][] getXlData() {
		
		String xlfilepath = BaseClass.xlfilePath;
		String sheetName = BaseClass.xlSheetName;
		int rows = XLUtils.getRowCount(xlfilepath,  sheetName);
		int columns = XLUtils.getColumnCount(xlfilepath, sheetName);
		
		String data[][] = new String[rows-1][columns];
		
		for(int i = 2; i<=rows; i++ ) {
			for(int j=1; j<=columns; j++) {
				data[i-1][j]= XLUtils.getCellData(xlfilepath, sheetName,i,j);
			}
		}
		
		return data;
		
	}


}
