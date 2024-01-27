package MphasisATE_CapstoneProject_Selenium_TestNG_Medicare;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MedicareLoginPage {
	
	// step1: formulate a test domain url & driver path
				String siteUrl = "http://localhost:9010";
				String driverPath = "drivers/windows/chromedriver.exe";
				WebDriver driver;

				@BeforeClass
				public void setUp() throws InterruptedException {

					// step2: set system properties for selenium dirver
					System.setProperty("webdriver.chromedriver.driver", driverPath);

					// step3: instantiate selenium webdriver
					driver = new ChromeDriver();

					// step4: launch browser
					driver.get(siteUrl);
					
					Thread.sleep(2000);
				}

				@AfterClass
				public void cleanUp() {
					driver.quit();  // the quit() method closes all browser windows and ends the WebDriver session.
					// driver.close(); // the close() closes only the current window on which Selenium is running automated tests.The WebDriver session, however, remains active. 
				}
				
		@Test(description = "Test Medicare Login Page ")
		public void testLoginPage() throws InterruptedException {
			
			WebElement searchbox1 = driver.findElement(By.id("email"));
			searchbox1.sendKeys("john@example.com");
			
			WebElement searchbox2 = driver.findElement(By.id("password"));
			searchbox2.sendKeys("john123");
			
			WebElement login = driver.findElement(By.xpath("/html/body/div[2]/form/button"));
			login.click();
			
			// add delay
			Thread.sleep(5000);
			
			String url= driver.getCurrentUrl();
			assertEquals("http://localhost:9010/login", url);
		}
}
