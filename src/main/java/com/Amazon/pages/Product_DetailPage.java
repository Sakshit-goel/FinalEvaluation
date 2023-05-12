package com.Amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Amazon.base.TestBase;

public class Product_DetailPage extends TestBase {

	 //checks the Commands
		@FindBy(id="productTitle")
		WebElement ProductTitle;
		
		
		@FindBy(xpath="//span[normalize-space()='Color:']")
		WebElement Colour;
		
		@FindBy(xpath="//input[@id='add-to-cart-button']")
		WebElement Add_To_Cart;
		
		public Product_DetailPage() {
			PageFactory.initElements(driver, this);
		}
		
		//Actions
		
		public String Validate_product_titlepage() {
			return driver.getTitle();
		}
		
		public boolean Validate_Add_To_Cart() {
			return Add_To_Cart.isDisplayed();
		}
		
		
		//Inputs Provided
		public AddToCart_Page cart() {
			Add_To_Cart.click();
			return new AddToCart_Page();
		}
}
