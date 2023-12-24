package com.phase2projectRedBusTicket.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigatingRedBusPage {
	
	WebDriver driver;
	public NavigatingRedBusPage(WebDriver driver) {
		this.driver = driver;
	}
	By base = By.id("src");
	By destination= By.id("dest");
	By search = By.id("search_butn");
	
	
	public WebElement from() {
		return driver.findElement(base);
	}
	
	public WebElement to() {
		return driver.findElement(destination);
	}
	
	
	
	
	
	public WebElement submit() {
		return driver.findElement(search);
	}

}
