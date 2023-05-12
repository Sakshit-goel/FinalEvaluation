package com.Amazon.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Amazon.base.TestBase;
import com.Amazon.pages.AddToCart_Page;
import com.Amazon.pages.AmazonHomePage;

public class CartTest extends TestBase {
	public AddToCart_Page cart_test;

	public CartTest() {
		super();
	}
	
	@BeforeMethod
	public void go() {
		initialization();
		cart_test = new AddToCart_Page();

	}
//	@Test
//	public void PageTitleTest() {
//		String Title = cart_test.Validate_AddToCart_Page();
//		Assert.assertEquals(Title, "Amazon.com. Spend less. Smile more.");
//	}
//	@Test
//	public void ProceedToCheckout() {
//		   
//		boolean Checkout = cart_test.Validate_Proceed_To_Checkout();
//		Assert.assertTrue(Checkout);
//
//	}
//	
//	@Test
//     public void PaymentPage() {
//    	 cart_test.ProceedToCheckout();
//     }

	@AfterMethod
	public void termination() {
		driver.quit();
	}
	
	
	
	
}
