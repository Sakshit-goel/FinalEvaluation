package com.Amazon.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Amazon.base.TestBase;
import com.Amazon.pages.AddToCart_Page;
import com.Amazon.pages.AmazonHomePage;
import com.Amazon.pages.ProductPage;
import com.Amazon.pages.Product_DetailPage;

public class HomePageTest extends TestBase {

	public AmazonHomePage homePage;
	public ProductPage productpage;

	public Product_DetailPage productdetail;
	public AddToCart_Page addtocart;

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void go() {
		initialization();
		homePage = new AmazonHomePage();
		productpage= new ProductPage();
	
	  productdetail= new Product_DetailPage();
	  
	  addtocart = new AddToCart_Page ();
	

	}

	@Test
	public void HomePageTitleTest() {
		String Title = homePage.Validate_HomePageTitle();
		Assert.assertEquals(Title, "Amazon.com. Spend less. Smile more.");
		 boolean search= homePage.Validate_Search_Button();
	        Assert.assertTrue(search);
	        boolean logoTest = homePage.Validate_Logo();
			Assert.assertTrue(logoTest);
			productpage = homePage.Search_Product();
//			 boolean result= productpage.Validate_Results();
//	    	  Assert.assertTrue(result);
//	    	  boolean flag=productpage.Validate_Product_Image();
//	        	Assert.assertTrue(flag);
	        	productdetail = productpage.Product_Search();
//	        	 boolean CartButton= Productdetails.Validate_Add_To_Cart();
//	  	       Assert.assertTrue(CartButton);
	  	     addtocart = productdetail.cart();
	        
	}

//	@Test
//	public void SearchButtonTest() {
//        boolean search= homePage.Validate_Search_Button();
//        Assert.assertTrue(search);
//       
//	}
//
//	@Test
//	public void LogoSearch() {
//	   
//		boolean logoTest = homePage.Validate_Logo();
//		Assert.assertTrue(logoTest);
//
//	}
//	
//	@Test
//	public  void Login_Home(){
//		productpage = homePage.Search_Product();
//		
//	}

	@AfterMethod
	public void Teardown() {
		driver.manage().window().minimize();
	}
}
