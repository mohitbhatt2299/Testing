package DeloitteDemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGTestCasePriority {
  
 
  WebDriver driver ;
		  // Method 1: Open Browser say chrome		
	    @Test	(priority=1)	
	    public void openBrowser() {			
	    	  System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\Java T2\\Assignments\\chromedriver.exe");
	    	
	        driver = new ChromeDriver();	
	    	driver.manage().window().maximize();
	    }		

	    // Method 2: Launch 		
	    @Test		(priority=2)
	    public void launchLinkedIn() {				
	        driver.get("http://linkedin.com");						
	    }		
        
	    // Method 3: Perform a search using "linkedin"			
	    @Test	(priority=3)	
	    public void peformSeachAndClick1stLink() {				
	        driver.findElement(By.cssSelector(".nav__button-secondary")).click();	
	        
	    }		

	   			
	    @Test		(priority=4)
	    public void LinkedInPageTitleVerification() throws Exception {				
	    	
	        driver.findElement(By.name("session_key")).sendKeys("bhattmohit612@gmail.com");						
	        Thread.sleep(3000);	
	        driver.findElement(By.name("session_password")).sendKeys("bhattmohit612@gmail.com");	
	        driver.findElement(By.cssSelector(".login__form button	")).submit();
	        		
	    }		
 
	  
  
}
