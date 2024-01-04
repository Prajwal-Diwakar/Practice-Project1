package phase2.Final.Project.homePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import phase2.Final.Project.BaseTest.BaseTest;

public class homePage {
	
		
		@FindBy(xpath = "//span[text()='Buy Now']")
		
		public static WebElement buyNow;
		
	
		public homePage(WebDriver driver) {
			
		PageFactory.initElements(driver, this);
		// driver can now work with your elements and methods of this class
		}
		public static String homepage_title() throws InterruptedException {
			String title = BaseTest.driver.getTitle();
			return title;
		}
		
		public static void clicks_BuyNow() throws InterruptedException
		{
			Thread.sleep(2000);
			buyNow.click();
		}
}



