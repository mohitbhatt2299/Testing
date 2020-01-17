package Trivagopackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Trivago {
	  @Test
	  public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\Java T2\\Assignments\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.trivago.in/");
			
			driver.findElement(By.cssSelector("#js_navigation > div > div.pos-relative.has-popover > button > span")).click();
			driver.findElement(By.id("check_email")).sendKeys("mohit002bhatt@gmail.com");

		
			driver.findElement(By.id("login_email_submit")).click();
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.id("login_password")).sendKeys("mohit@123");
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.id("login_submit")).click();
			

			}
	  }

