package com.Framework_with_cicd.PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElementsPage {

	WebDriver driver;
	
	public ElementsPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(css = "path[d='M3 19h18v2H3v-2zM13 5.828V17h-2V5.828L4.929 11.9l-1.414-1.414L12 2l8.485 8.485-1.414 1.414L13 5.83z']")
	WebElement elementsDropdownButton;
	
	@FindBy(xpath = "//span[contains(text(),'Text Box')]")
	WebElement testBoxOption;
	
	@FindBy(xpath = "//h1[contains(text(),'Text Box')]")
	WebElement testBoxHeading;
	
	@FindBy(id = "userName")
	WebElement fullNameTextbox;
	
	@FindBy(id = "userEmail")
	WebElement emailTextbox;
	
	@FindBy(id = "currentAddress")
	WebElement currentAddressTextbox;
	
	@FindBy(id = "permanentAddress")
	WebElement permanentAddressTextbox;
	
	@FindBy(id = "submit")
	WebElement submitButton;
	
	@FindBy(id = "output")
	WebElement outputBox;
	
	@FindBy(css = "p#name")
	WebElement outputFullName;
	
	@FindBy(css = "p#email")
	WebElement outputEmail;
	
	@FindBy(css = "p#currentAddress")
	WebElement outputCurrentAddress;
	
	@FindBy(css = "p#permanentAddress")
	WebElement outputPermanentAddress;
	
	
	public boolean isOutputPresent() {
		scrollToOutputBox();
		if(outputBox.isDisplayed()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public boolean isElementsDropDownPresent() {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(path[d='M3 19h18v2H3v-2zM13 5.828V17h-2V5.828L4.929 11.9l-1.414-1.414L12 2l8.485 8.485-1.414 1.414L13 5.83z'])));
//		
		if(elementsDropdownButton.isDisplayed()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void clickTextBoxOption() {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(path[d='M3 19h18v2H3v-2zM13 5.828V17h-2V5.828L4.929 11.9l-1.414-1.414L12 2l8.485 8.485-1.414 1.414L13 5.83z'])));
//		
		testBoxOption.click();
	}
	
	public boolean isTextBoxHeadingPresent() {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(path[d='M3 19h18v2H3v-2zM13 5.828V17h-2V5.828L4.929 11.9l-1.414-1.414L12 2l8.485 8.485-1.414 1.414L13 5.83z'])));
//		
		if(testBoxHeading.isDisplayed()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void enterFullName(String fullName) {
		
		fullNameTextbox.sendKeys(fullName);
	}
	
public void enterEmail(String email) {
		
	emailTextbox.sendKeys(email);
	}
public void enterCurrentAddress(String currentAddress) {
	
	currentAddressTextbox.sendKeys(currentAddress);
}
public void enterPermanentAddress(String permanentAddress) {
	
	permanentAddressTextbox.sendKeys(permanentAddress);
}
public void clickSubmitButton() {
	scrollToSubmitButton();
	submitButton.click();
}

public String getOutput() {
	
	return outputBox.getText();
	
}

public boolean validateOutput(String fn,String email, String cAddress, String pAddress) {
	boolean flag = false;
	scrollToOutputBox();
	if (outputFullName.getText().contains(fn) && outputEmail.getText().contains(email)) {
		if(outputCurrentAddress.getText().contains(cAddress) && outputPermanentAddress.getText().contains(pAddress))
			flag = true;
	}
	else {
		flag = false;
	}
	
	return flag;
}

public void scrollToSubmitButton() {
	Point point = submitButton.getLocation();
	int yCoordinate = point.getY();
	JavascriptExecutor jsExecutor= (JavascriptExecutor)driver;
	jsExecutor.executeScript("window.scrollTo(0,"+yCoordinate+")");
}

public void scrollToOutputBox() {
	Point point = outputBox.getLocation();
	int yCoordinate = point.getY();
	JavascriptExecutor jsExecutor= (JavascriptExecutor)driver;
	jsExecutor.executeScript("window.scrollTo(0,"+yCoordinate+")");
}
	
}
