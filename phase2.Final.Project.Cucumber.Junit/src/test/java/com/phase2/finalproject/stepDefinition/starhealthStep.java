package com.phase2.finalproject.stepDefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertEquals;

import phase2.Final.Project.buyNow.buyNow;
import phase2.Final.Project.homePage.homePage;
import phase2.Final.Project.BaseTest.BaseTest;

public class starhealthStep {
	

	
	public static String ph_no;
	homePage HomePage = new homePage((BaseTest.driver));
	buyNow  BuyNowPage = new buyNow((BaseTest.driver));
	
	
	@Given("^User launches the Star Health application with \"([^\"]*)\"$")
	public void user_launches_the_star_health_application_with(String URL) throws InterruptedException {
		
		BaseTest.driver.manage().window().maximize();
		BaseTest.driver.get(URL);
		Thread.sleep(2000);
	}

	@Then("User waits for the Welcome to Star Health pop-up and closes it")
	public void user_waits_for_the_welcome_to_star_health_pop_up_and_closes_it()  {
	    
	}

	@Then("User validates the Star Health home page title using a JUnit assertion")
	public void user_validates_the_star_health_home_page_title_using_a_j_unit_assertion() throws InterruptedException {
		Thread.sleep(2000);
	
		assertEquals("Star Health Insurance: Medical, Accident and Travel insurance policies", BaseTest.driver.getTitle());
	}
	
	

	@When("User clicks on the Buy Now button")
	public void user_clicks_on_the_buy_now_button() throws InterruptedException {
		Thread.sleep(2000);
		homePage.clicks_BuyNow();

	}
	
	@Then("^User types Name as \"([^\"]*)\"$")
	public void user_types_name_as(String FullName) throws InterruptedException {
		BuyNowPage.input_name(FullName);
	}

	@Then("^User types Phone as \"([^\"]*)\"$")
	public void user_types_phone_as(String PhNo) throws InterruptedException {
	    BuyNowPage.input_phno(PhNo);
	}
	
	@Then("^user types the email address as \"([^\"]*)\"$")
	public void user_types_the_email_address_as(String Email) throws InterruptedException {
		 BuyNowPage.input_email(Email);
	}
	

	@Then("^User types the PIN as \"([^\"]*)\"$")
	public void user_types_the_pin_as(String PIN) throws InterruptedException {
		 BuyNowPage.input_pin(PIN);
	}
	
	@Given("^User is again launches the Star Health application with \"([^\"]*)\"$")
	public void User_is_again_launches_the_star_health_application(String siteURL) throws InterruptedException {
		
		BaseTest.driver.manage().window().maximize();
		BaseTest.driver.get(siteURL);
		Thread.sleep(2000);
	}
	
	
	@Then("User clicks on I need health insurance from the dropdown menu")
	public void user_clicks_on_i_need_health_insurance_from_the_dropdown_menu() throws InterruptedException {
		BaseTest.driver.findElement(By.xpath("/html/body/div[1]/div/div/header/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/span/span/img")).click();
		Thread.sleep(3000);
	}
	
	
	@When("User selects the option")
	public void User_selects_the_option() throws InterruptedException {
		
		String mainWindowHandle = BaseTest.driver.getWindowHandle();
		// Switch to the new window (assuming the pop-up opened a new window)
		for (String windowHandle : BaseTest.driver.getWindowHandles()) {
		    if (!windowHandle.equals(mainWindowHandle)) {
		    	BaseTest.driver.switchTo().window(windowHandle);
		        // Perform actions in the new window
		        // ...
		    	BaseTest.driver.findElement(By.xpath("/html/body/div[1]/div/div/header/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div/div/div/div[2]/div/div/div[1]/div[1]/div[3]/a")).click();
				Thread.sleep(3000);
//		    	BaseTest.driver.close(); // Close the new window
//		        break;
		    }
		}
		
			}
	

	@Then("User sees the Plan for My Family page")
	public void user_sees_the_plan_for_my_family_page() {
	    
	}

	

	@Then("User clicks on the Star Health logo")
	public void user_clicks_on_the_star_health_logo() throws InterruptedException {
	    buyNow.click_logo();
	}

	@Then("The Application should redirect to the home page")
	public void the_application_should_redirect_to_the_home_page() {
	    
	}

	@When("User closes the child tab")
	public void user_closes_the_child_tab() {
	    
	}

	@Then("User navigates back to the parent tab")
	public void user_navigates_back_to_the_parent_tab() {
	    
	}


}
