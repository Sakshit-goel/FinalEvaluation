package com.Amazon.testcases;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Amazon.base.TestBase;
import com.Amazon.pages.AddToCart_Page;
import com.Amazon.pages.Product_DetailPage;

public class ProductDetailPageTest extends TestBase {
 
	public Product_DetailPage Productdetails;
	public AddToCart_Page addtocart;
	
	public ProductDetailPageTest() {
		super();	
	}
	@BeforeMethod
	public void go() {
		initialization();
		Productdetails = new Product_DetailPage();
		addtocart = new AddToCart_Page ();
		
	}
//	@Test
//	public void Product_TitleTest() {
//		String Title= Productdetails.Validate_product_titlepage();
//		Assert.assertEquals(Title, "Amazon.com. Spend less. Smile more.");
//	}
//	@Test
//	public void SearchButtonTest() {
//		   boolean CartButton= Productdetails.Validate_Add_To_Cart();
//	       Assert.assertTrue(CartButton);
//		   
//		}
//	@Test
//	public void PaymentPage() {
//		addtocart= Productdetails.cart();
//	}
	
	@AfterMethod 
	public void Teardown() {
		driver.quit();
	}
}