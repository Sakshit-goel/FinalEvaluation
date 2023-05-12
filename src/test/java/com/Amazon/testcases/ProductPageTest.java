package com.Amazon.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Amazon.base.TestBase;
import com.Amazon.pages.ProductPage;
import com.Amazon.pages.Product_DetailPage;

public class ProductPageTest extends TestBase {
        public ProductPage productpage;
        public Product_DetailPage productdetail;
       
        public ProductPageTest() {
    		super();
    	}
       
        @BeforeMethod
    	public void go() {
    		initialization();
    		productpage= new ProductPage();
    		productdetail= new Product_DetailPage();
    	}
//        @Test
//       public void validateresults() {
//    	  boolean result= productpage.Validate_Results();
//    	  Assert.assertTrue(result);
//       }
//        @Test
//        public void productimage() {
//        	boolean flag=productpage.Validate_Product_Image();
//        	Assert.assertTrue(flag);
//        }
//        
//        public void click_product() {
//        	productdetail = productpage.Product_Search();
//        }
//       
        @AfterMethod
        public void Teardown() {
    		driver.quit();
    	}
        
        
}
