package DeloitteDemoPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
	public String baseUrl ="http://google.com";
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\Java T2\\Assignments\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
       driver.get(baseUrl);
       String expectedTitle="Google";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
        driver.close();
  }
}
