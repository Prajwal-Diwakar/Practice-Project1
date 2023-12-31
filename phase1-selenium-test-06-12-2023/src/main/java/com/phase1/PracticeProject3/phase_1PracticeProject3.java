package com.phase1.PracticeProject3;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.sql.*;

public class phase_1PracticeProject3 {
	
		static WebDriver driver;
		static WebDriverWait wait;
	
	
			public static void main(String[] args) throws InterruptedException, IOException, ClassNotFoundException, SQLException {
				
				 //setUp();   //Open the browser
				 
				 Thread.sleep(5000);
				 //handling();  /* class represents to locate the web elements using Locators and to handle web elements*/ 
	               
				Thread.sleep(5000);
				
				//PageObjectModel();   // page object design pattern class to store the web elements of a webpage.
				
				Thread.sleep(5000);
				
				//autoIT(); // script to select the file from the desktop. 
				//doc();  
				
				Thread.sleep(5000);
				//testCustomPopup();  //handle external elements. 
				
				Thread.sleep(5000);
				
				JDBC();     //DB connection class to initiate a JDBC connection. 
			
				
	}
			
			public static void setUp() {

				// step1: formulate a test domain url & driver path
				String siteUrl = "https://www.makemytrip.com/ ";
				String driverPath = "drivers/windows/chromedriver.exe";

				// step2: set system properties for selenium dirver
				System.setProperty("webdriver.chrome.driver", driverPath);

				// step3: instantiate selenium webdriver
				driver = new ChromeDriver();

				// step4: add explicit wait (Conditional Delay)
				wait = new WebDriverWait(driver, Duration.ofSeconds(40));

				// step5: launch browser
				driver.get(siteUrl);
				
				
			}
			
			public static void handling() throws InterruptedException {
				
		// enter input string in text box
			
					WebElement path2=driver.findElement(By.id("fromCity"));
					path2.sendKeys("Bangalore");
					
					Thread.sleep(5000);
					// capture element form the list
					WebElement path3=	driver.findElement(By.cssSelector("#react-autowhatever-1-section-0-item-0 > div > div.calc60 > p.font12.greyText.appendBottom3"));
					path3.click();
					
					
					takeScreenShot("makemytrip.png");
					// destination
					WebElement path5=driver.findElement(By.id("toCity"));
					path5.sendKeys("Mumbai");
					
					WebElement path7=	driver.findElement(By.cssSelector("#react-autowhatever-1-section-0-item-0 > div > div.calc60 > p.font14.appendBottom5.blackText"));
					path7.click();
			
			
					WebElement path6=driver.findElement(By.cssSelector("#root > div > div.minContainer > div > div > div > div.fsw > p > a"));
					path6.click();
				
			//calander
			
			Thread.sleep(3000);
			
			WebElement path8=driver.findElement(By.id("date-box"));
			path7.click();
			
			Thread.sleep(5000);
			
			
			
			//Select date
			
			WebElement path9=driver.findElement(By.xpath("//div[@class='DatePicker__CalendarContainer-sc-1x9sb82-0 bkhtIz']/descendant::span[41]"));
			path8.click();
			
			Thread.sleep(5000);	
					   
			//click on search button
			WebElement path10=driver.findElement(By.id("search_butn"));
			path9.click();
	
			}
			
			
			public static void autoIT() {

				// step1: formulate a test domain url & driver path
				String siteUrl = "https://www.ilovepdf.com/word_to_pdf";
				String driverPath = "drivers/windows/chromedriver.exe";

				// step2: set system properties for selenium dirver
				System.setProperty("webdriver.chrome.driver", driverPath);

				// step3: instantiate selenium webdriver
				driver = new ChromeDriver();

				// step4: add explicit wait (Conditional Delay)
				wait = new WebDriverWait(driver, Duration.ofSeconds(40));

				// step5: launch browser
				driver.get(siteUrl);

			}
			
			
			
			public static void doc() throws IOException, InterruptedException {
				
				WebElement doc= driver.findElement(By.id("pickfiles"));
				doc.click();
				
				Thread.sleep(3000);
				
				Runtime.getRuntime().exec("autoIT\\upload.exe");
				Thread.sleep(3000);
				
				WebElement doc2=driver.findElement(By.id("processTask"));
				doc2.click();
			}
			
			public static void takeScreenShot(String fileName) {
				// 1. type cast driver instance too take screen shot
				TakesScreenshot tsc = (TakesScreenshot) driver ;
				
				// 2. call take screen shot method with file type
				File src = tsc.getScreenshotAs(OutputType.FILE);
				
				// 3. create  file  with screen shot
				try {
					FileHandler.copy(src, new File("outputscreenshots\\"+fileName));
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
			
			public static void testCustomPopup() throws InterruptedException {
				
				// find location popup and click
				driver.findElement(By.cssSelector("#showBizUpgradePopup > div > p.font10.whiteText")).click();
				
				Thread.sleep(3000);
				
				// find current window
				String mainWindow = driver.getWindowHandle();
				
				// list of external popups
				Set<String> windows = driver.getWindowHandles();
				
				Iterator<String> itr = windows.iterator();
				while (itr.hasNext()) {
					String childWindow = itr.next();
					
					// Switch to child window
					driver.switchTo().window(childWindow);
					
					
					
					driver.findElement(By.cssSelector("#SW > div.landingContainer.eng > div.headerOuter > div.modal.displayBlock.dynHeight.modalLogin.myBiz.bizlogin.bizSignup.switcher > div > section > div.appendBottom25 > div > div > span")).click();
					
				}
				
				driver.switchTo().window(mainWindow);
				Thread.sleep(3000);
				
			}
			
			

		

			public static void  JDBC() throws SQLException, ClassNotFoundException {
				
				
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root", "1234");
					
					Statement st= con.createStatement();
					ResultSet rs=st.executeQuery("select * from eproduct");
					
					while (rs.next()) 
					{
						int ID= rs.getInt("ID");
						String name =rs.getString("Name");
						int price=rs.getInt("Price");
						Date date_added=rs.getDate("Date_added");
						System.out.println(ID+"  "+name+"   "+price+"    "+ date_added);
					}
					st.close();
					con.close();
				}

			
			public static void PageObjectModel(){
				driver.findElement(By.cssSelector("li[data-cy=\"account\"]")).click();
				
				WebElement input= driver.findElement(By.id("username"));
				
				input.click();
				input.sendKeys("abcd@gmail.com");
				
				driver.findElement(By.cssSelector("#SW > div.landingContainer.eng > div.headerOuter > div.imageSliderModal.modal.displayBlock.modalLogin.dynHeight.personal > div > section > span")).click();
				
				
			}
}

