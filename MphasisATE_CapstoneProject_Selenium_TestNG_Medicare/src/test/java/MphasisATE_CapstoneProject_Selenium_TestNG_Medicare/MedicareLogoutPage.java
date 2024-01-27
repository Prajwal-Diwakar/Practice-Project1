package MphasisATE_CapstoneProject_Selenium_TestNG_Medicare;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MedicareLogoutPage {
	
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
				
				@Test(description = "Test Medicare Logout")
				
				public void testRegisterPage() throws InterruptedException {
					
					WebElement link = driver.findElement(By.xpath("/html/body/div[2]/form/a"));

					link.click();
					WebElement searchbox1 = driver.findElement(By.id("name"));
					searchbox1.sendKeys("Prajwal.Diwakar");
					
					WebElement searchbox2 = driver.findElement(By.id("email"));
					searchbox2.sendKeys("prajwal.diwakar@mphasis.com");
					
					WebElement searchbox3 = driver.findElement(By.id("password"));
					searchbox3.sendKeys("prajwal@123");
					
					WebElement register = driver.findElement(By.xpath("/html/body/div[2]/form/button"));
					register.submit();

					// add delay
					Thread.sleep(2000);
					
					WebElement logout = driver.findElement(By.xpath("//*[@id=\"mynavbar\"]/ul/li[4]/a"));
					logout.click();
					
					 String url= driver.getCurrentUrl();
					assertEquals("http://localhost:9010/logout", url);
				}
}
