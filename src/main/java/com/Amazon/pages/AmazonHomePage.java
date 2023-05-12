package com.Amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Amazon.base.TestBase;

public class AmazonHomePage extends TestBase{
    
	//checks the Commands
	@FindBy(id="twotabsearchtextbox")
	WebElement SearchBox;
	
	@FindBy(xpath="//a[@id='nav-logo-sprites']")
	WebElement Logo;
	
	
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	WebElement Search_Button;
	
	public AmazonHomePage() {
		PageFactory.initElements(driver, this);
		
	}
	
	//Actions
	
	public String Validate_HomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean Validate_Search_Button() {
		return Search_Button.isDisplayed();
	}
	
	public boolean Validate_Logo() {
		return Logo.isDisplayed();
	}
	//Inputs Provided
	public ProductPage Search_Product() {
		SearchBox.sendKeys("Photo Frame");
		Search_Button.click();
		return  new ProductPage();
	}
	
	
	
}
