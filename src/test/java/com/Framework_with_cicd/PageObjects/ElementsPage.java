package com.Framework_with_cicd.PageObjects;

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
	
	
	public boolean isOutputPresent() {
		
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
		
		fullNameTextbox.sendKeys(email);
	}
public void enterCurrentAddress(String currentAddress) {
	
	fullNameTextbox.sendKeys(currentAddress);
}
public void enterPermanentAddress(String permanentAddress) {
	
	fullNameTextbox.sendKeys(permanentAddress);
}
public void clickSubmitButton() {
	
	submitButton.click();
}

public String getOutput() {
	
	return outputBox.getText();
	
}
	
}
