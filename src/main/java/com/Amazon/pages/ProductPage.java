package com.Amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Amazon.base.TestBase;

public class ProductPage extends TestBase {
	//checks the Commands
		@FindBy(xpath="//span[normalize-space()='Results']")
		WebElement Results;
		
		@FindBy(xpath="//span[normalize-space()='Brands']")
		WebElement Brands;
		
		@FindBy(xpath="//span[normalize-space()='Skylight Frame: 10 inch WiFi Digital Picture Frame, Email Photos from Anywhere, Touch Screen Digital Photo Frame Display - Gift for Friends and Family']")
		WebElement Product_Selected;
		
		@FindBy(xpath="//img[@alt='Sponsored Ad - Amazon Basics Photo Picture Frame - 4\" x 6\", Nickel - Pack of 2']")
		WebElement Product_Image;
		
		public ProductPage() {
			PageFactory.initElements(driver, this);
			
		}
		
		//Actions
		
		public String Validate_Product_Title_Page() {
			return driver.getTitle();
		}
		
		public boolean Validate_Results() {
			return Results.isDisplayed();
		}
		
		public boolean Validate_Product_Image() {
			return Product_Image.isDisplayed();
		}
		//Inputs Provided
		
		public  Product_DetailPage Product_Search() {
			Product_Selected.click();
			return new Product_DetailPage();
		}
}
