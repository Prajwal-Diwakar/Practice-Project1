package phase2.Final.Project.buyNow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class buyNow {
	

	
	@FindBy(id = "fullname")
	public static WebElement name;
	 
	@FindBy(id = "mobile")
	public static WebElement contactNo;
	
	@FindBy(id ="email")
	public static WebElement email;
	
	@FindBy(id = "zipcode")
	public static WebElement pinCode;
	
	
	
	
	
	@FindBy(xpath = "//input[@id='contact_no']")
	public static WebElement contactNumberVerify;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/header/div[2]/div[1]/span/span/img")
	public static WebElement logo;
	
	public buyNow(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	

	public void input_name(String fullname) throws InterruptedException {
	Thread.sleep(2000);
	name.sendKeys(fullname);
	}
	
	public void input_phno(String phno) throws InterruptedException {
	Thread.sleep(2000);
	contactNo.sendKeys(phno);
	}
	
	public void input_email(String Email) throws InterruptedException {
		Thread.sleep(2000);
		email.sendKeys(Email);
	}
	public void input_pin(String pin) throws InterruptedException {
	Thread.sleep(2000);
	pinCode.sendKeys(pin);
	}
	
	
	
	public static String ContactNo_verify() throws InterruptedException {
	Thread.sleep(2000);

	String verification =contactNumberVerify.getAttribute("value");
	return verification;
	}
	
	public static void click_logo() throws InterruptedException {
	Thread.sleep(2000);
	logo.click();
	}
}
	
