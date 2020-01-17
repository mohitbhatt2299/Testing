package DeloitteDemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SettingSystemProperty {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\Java T2\\Assignments\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com");
		driver.findElement(By.cssSelector(".makeFlex")).click();
		driver.findElement(By.id("username")).sendKeys("bhattmohit612@gmail.com");

		driver.findElement(By.cssSelector(".modalLogin")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("password")).sendKeys("Mohit@123");

		driver.findElement(By.cssSelector("button")).click();
	}
}
