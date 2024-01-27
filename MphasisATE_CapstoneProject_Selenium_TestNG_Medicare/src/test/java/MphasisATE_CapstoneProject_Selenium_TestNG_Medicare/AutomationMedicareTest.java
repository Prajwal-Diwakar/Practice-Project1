package MphasisATE_CapstoneProject_Selenium_TestNG_Medicare;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AutomationMedicareTest {
	
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
			
			@Test(priority = 1, description = "Test Medicare Login Page ")
			public void testLoginPage() throws InterruptedException {
				WebElement searchbox1 = driver.findElement(By.id("email"));
				searchbox1.sendKeys("john@example.com");
				
				WebElement searchbox2 = driver.findElement(By.id("password"));
				searchbox2.sendKeys("john123");
				
				WebElement login = driver.findElement(By.xpath("/html/body/div[2]/form/button"));
				login.click();
				
				// add delay
				Thread.sleep(5000);
				
				WebElement logout = driver.findElement(By.xpath("//*[@id=\"mynavbar\"]/ul/li[4]/a"));
				logout.click();
				
				String expectedTitle  = "";
				String actualTitle  = driver.getTitle();
				assertEquals(actualTitle, expectedTitle);
			}
			
			@Test(priority = 2, description = "Test Medicare Register Page ")
			
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

				String expectedTitle = "";
				String actualTitle = driver.getTitle();
				assertEquals(actualTitle, expectedTitle);
			}
			
			@Test(priority = 3, description= "Add product to cart page Test")
			public void testCartPage() throws InterruptedException {
				
				// add delay
				Thread.sleep(2000);
		     
		        
		        WebElement addcart1 = driver.findElement(By.xpath("//*[@id=\"cart101\"]"));
		        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addcart1);
		        
		     // add delay
				Thread.sleep(2000);
				
		        addcart1.click();
		        
		     // add delay
				Thread.sleep(2000);
		        
		        driver.findElement(By.xpath("//*[@id=\"mynavbar\"]/ul/li[1]/a")).click();
		     // add delay
				Thread.sleep(2000);
		        
		        WebElement addcart2 = driver.findElement(By.xpath("//*[@id=\"cart102\"]"));
		        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addcart2);
		        
			     // add delay
					Thread.sleep(2000);
					
		        addcart2.click();
		        
		     // add delay
				Thread.sleep(2000);
		        
		       
			}
			
			@Test(priority = 4, description= "Place order for the product in the cart")
			public void PlaceOrder() throws InterruptedException {
				
				driver.findElement(By.xpath("//*[@id=\"mynavbar\"]/ul/li[1]/a")).click();  //home
				// add delay
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//*[@id=\"mynavbar\"]/ul/li[1]/a")).click();  //cart
				
				// add delay
				Thread.sleep(2000);     
				
		        WebElement placeorder= driver.findElement(By.id("place-order"));  //place order
		        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", placeorder);
		        
		        // add delay
				Thread.sleep(2000); 
		        placeorder.click();
			}
			
			@Test(priority = 5, description= "Search the product in the search bar")
			
			public void Searchtheproduct() throws InterruptedException {
				// add delay
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//*[@id=\"mynavbar\"]/ul/li[1]/a")).click();  //home
				// add delay
				Thread.sleep(2000);
				
				driver.findElement(By.id("search-product")).sendKeys("Limcee Chewable Tablet Orange");
				// add delay
				Thread.sleep(2000);
				
				driver.findElement(By.id("search-product-button")).click();
				
			}
			
			@Test(priority = 6, description= "Filter the products")
			public void Filtertheproduct() throws InterruptedException {
			// add delay
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//*[@id=\"mynavbar\"]/ul/li[1]/a")).click();  //home
				// add delay
				Thread.sleep(2000);
				
				
				WebElement filter1 = driver.findElement(By.id("filter-button"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", filter1);
				// add delay
				Thread.sleep(2000);
				
				filter1.click();
				// add delay
				Thread.sleep(2000);
				
				driver.findElement(By.id("lth")).click();
			    // add delay
				Thread.sleep(2000);
			
				driver.findElement(By.xpath("//*[@id=\"mynavbar\"]/ul/li[1]/a")).click();  //home
				// add delay
				Thread.sleep(2000);
				
				WebElement filter2 = driver.findElement(By.id("filter-button"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", filter2);
				// add delay
				Thread.sleep(2000);
				
				filter2.click();
				// add delay
				Thread.sleep(2000);
				
				driver.findElement(By.id("htl")).click();
				
			}
			
}
