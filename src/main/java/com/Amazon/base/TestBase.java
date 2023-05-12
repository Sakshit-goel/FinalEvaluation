package com.Amazon.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Amazon.util.Testutil;

public class TestBase {

	 public static WebDriver driver;
	 static Properties prop; 
	 
	 
	 public TestBase() {
		 try {
				prop = new Properties();
				FileInputStream ip = new FileInputStream("C:\\Users\\Prashant.Yadav\\NewWorkspac\\com.Amazon\\src\\main\\java\\com\\Amazon\\Config\\Config_Properties");
				prop.load(ip);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
				}
			}
		
		 public static void initialization(){
				String browserName = prop.getProperty("browser");
			
				if(browserName.equals("chrome")){
									
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prashant.Yadav\\Documents\\chromedriver.exe");	
				driver = new ChromeDriver();
				}
 
				driver.manage().window().maximize();
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Testutil.Page_Load_timeout));
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Testutil.Implicitly_Wait));
				driver.get(prop.getProperty("url"));
				
	 }
	 
	 
	 
	 
	 
	 
	
	
	
}
