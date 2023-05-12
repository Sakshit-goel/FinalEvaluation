package com.Amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Amazon.base.TestBase;

public class AddToCart_Page extends TestBase {
	@FindBy(id="sw-subtotal-item-count")
	WebElement Cart_Subtotal;
	
	@FindBy(xpath="//span[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']")
	WebElement Added_to_Cart_Heading;
	
	@FindBy(name="proceedToRetailCheckout")
	WebElement Proceed_To_Checkout;
	
	@FindBy(xpath="//a[@href='/cart?ref_=sw_gtc']")
	WebElement Go_To_Cart;
	
	public AddToCart_Page() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	
	public String Validate_AddToCart_Page() {
		return driver.getTitle();
	}
	
	public boolean Validate_Proceed_To_Checkout() {
		return Proceed_To_Checkout.isDisplayed();
	}
	
	public boolean Validate_Cart_Subtotal() {
		return Cart_Subtotal.isDisplayed();
	}
	//Inputs Provided
	public void  ProceedToCheckout() {
		Proceed_To_Checkout.click();
		
		
	}
}
