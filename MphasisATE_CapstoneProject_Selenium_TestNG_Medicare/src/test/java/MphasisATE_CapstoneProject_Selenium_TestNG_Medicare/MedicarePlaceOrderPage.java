package MphasisATE_CapstoneProject_Selenium_TestNG_Medicare;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MedicarePlaceOrderPage {
	
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
					
					@Test(priority = 1, description = "Test Medicare Register Page ")
					
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

						String url= driver.getCurrentUrl();
						assertEquals("http://localhost:9010/register-user", url);
					}
	
					@Test(priority = 2, description= "Add product to cart page Test")
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
					
					@Test(priority = 3, description= "Place order for the product in the cart")
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
				        
				        String url= driver.getCurrentUrl();
						assertEquals("http://localhost:9010/place-order", url);
					}		
}
