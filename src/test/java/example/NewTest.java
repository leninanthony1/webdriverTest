package example;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;		
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class NewTest {		
	    private WebDriver driver;
	    String strChromedriverpath="C://Selenium//chromedriver.exe";
	   
		@Test				
		public void openGoogle() {	
			driver.get("https://www.google.com/");  
			String title = driver.getTitle();				 
			Assert.assertTrue(title.contains("Google")); 		
			String url = driver.getCurrentUrl();	
			System.out.println(url);
			Assert.assertTrue(title.contains("Google")); 		
		}	
		
		@BeforeTest
		public void beforeTest() {	
			 System.setProperty("webdriver.chrome.driver", strChromedriverpath);
				driver = new ChromeDriver(); 
		}		
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}

}
