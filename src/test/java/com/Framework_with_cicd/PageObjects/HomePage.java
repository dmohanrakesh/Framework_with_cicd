package com.Framework_with_cicd.PageObjects;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
	
		this.driver = driver;
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath = "//img[@src='/images/Toolsqa.jpg']")
	WebElement toolsQaImage;
	
	
//	@FindBy(xpath = "//img[@alt='Selenium Online Training']")
//	@FindBy(css = "img[alt='Selenium Online Training']")
//	@FindBy(xpath = "banner-image")
	@FindBy(xpath = "//div//div//div//div//a//img")
	WebElement seleniumTrainingImage;
	
	@FindBy(xpath = "//h5[contains(text(), 'Elements')]")
	WebElement elementsLabel;
		
//	@FindBy(xpath = "//h5[contains(text(), 'Elements')]")
	@FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div")
	WebElement elementsCard;
	
	
	public void scrollToElementsCard() {
		Point point = elementsLabel.getLocation();
		int yCoordinate = point.getY();
		JavascriptExecutor jsExecutor= (JavascriptExecutor)driver;
		jsExecutor.executeScript("window.scrollTo(0,"+yCoordinate+")");
	}
	
	
	public void clickElementsCard() {
		
		elementsCard.click();
	}
	

}
