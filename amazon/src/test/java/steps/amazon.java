package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class amazon {

	WebDriver driver;
	//@Given("I open the chrome browser")
	//public void i_open_the_chrome_browser() {
		
	//}

	@When("I enter Amazon mypage URL")
	public void i_enter_amazon_mypage_url() {
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
	}

	@Then("I capture the title of the page")
	public void i_capture_the_title_of_the_page() {
		
		System.out.println(driver.getTitle());
	}

	@When("I click on signin button")
	public void i_click_on_signin_button() {
	   
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span")).click();
	}

	@Then("I enter email as {string} on the page")
	public void i_enter_email_as_on_the_page(String Email) {
	    
		 driver.findElement(By.id("ap_email")).sendKeys(Email);
	}

	@Then("click on continue button")
	public void click_on_continue_button() {
		
		driver.findElement(By.id("continue")).click();
	}

	@Then("i enter password as {string} on the page")
	public void i_enter_password_as_on_the_page(String Password) {
	   
		 driver.findElement(By.id("ap_password")).sendKeys(Password);
		 driver.findElement(By.id("signInSubmit")).click();
		 
	}

	@When("i give the input to search box as {string} on the home page")
	public void i_give_the_input_to_search_box_as_on_the_home_page(String SearchBox) {
		
		WebElement e1 =  driver.findElement(By.id("searchDropdownBox"));
		  e1.click();
		  Select dd = new Select(e1);
		  dd.selectByVisibleText("Amazon Devices");
		  
		  driver.findElement(By.id("twotabsearchtextbox")).sendKeys(SearchBox);
		   WebElement e2 = driver.findElement(By.id("nav-search-submit-button"));
		   e2.click();
	}

	
	

	@Then("choose the product")
	public void choose_the_product() {
		 driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
	}

	@Then("Add to wishlist")
	public void add_to_wishlist() {
	    
		driver.findElement(By.id("add-to-wishlist-button-submit")).click();
	}

	@Then("close the driver")
	public void close_the_driver() {
	    
		driver.quit();
	}
}
