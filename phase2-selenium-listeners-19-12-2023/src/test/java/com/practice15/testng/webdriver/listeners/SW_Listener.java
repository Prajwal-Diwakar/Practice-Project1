package com.practice15.testng.webdriver.listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class SW_Listener implements WebDriverEventListener {



		public void beforeAlertAccept(WebDriver driver) {
			// TODO Auto-generated method stub
			
		}

		public void afterAlertAccept(WebDriver driver) {
			// TODO Auto-generated method stub
			
		}

		public void afterAlertDismiss(WebDriver driver) {
			// TODO Auto-generated method stub
			
		}

		public void beforeAlertDismiss(WebDriver driver) {
			// TODO Auto-generated method stub
			
		}

		public void beforeNavigateTo(String url, WebDriver driver) {
			System.out.println("Navigating to :: ' "+ url + " '");
		}

		public void afterNavigateTo(String url, WebDriver driver) {
			System.out.println("Navigated to :: ' "+ url + " '");
		}

		public void beforeNavigateBack(WebDriver driver) {
			System.out.println("Navigating Back to previous page");
		}

		public void afterNavigateBack(WebDriver driver) {
			System.out.println("Navigated Back to previous page");
		}

		public void beforeNavigateForward(WebDriver driver) {
			System.out.println("Navigating to next page");
		}

		public void afterNavigateForward(WebDriver driver) {
			System.out.println("Navigated to next page");
		}

		public void beforeNavigateRefresh(WebDriver driver) {
			// TODO Auto-generated method stub
			
		}

		public void afterNavigateRefresh(WebDriver driver) {
			// TODO Auto-generated method stub
			
		}

		public void beforeFindBy(By by, WebElement element, WebDriver driver) {
			// TODO Auto-generated method stub
			
		}

		public void afterFindBy(By by, WebElement element, WebDriver driver) {
			// TODO Auto-generated method stub
			
		}

		public void beforeClickOn(WebElement element, WebDriver driver) {
			System.out.println("Trying to click on :: ' "+ element.toString() + " '");
		}

		public void afterClickOn(WebElement element, WebDriver driver) {
			System.out.println("Clicked on :: ' "+ element.toString() + " '");
		}

		public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
			// TODO Auto-generated method stub
			
		}

		public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
			// TODO Auto-generated method stub
			
		}

		public void beforeScript(String script, WebDriver driver) {
			// TODO Auto-generated method stub
			
		}

		public void afterScript(String script, WebDriver driver) {
			// TODO Auto-generated method stub
			
		}

		public void beforeSwitchToWindow(String windowName, WebDriver driver) {
			// TODO Auto-generated method stub
			
		}

		public void afterSwitchToWindow(String windowName, WebDriver driver) {
			// TODO Auto-generated method stub
			
		}

		public void onException(Throwable throwable, WebDriver driver) {
			System.out.println("Exception Occured :: "+throwable.toString());
			
		}

		public <X> void beforeGetScreenshotAs(OutputType<X> target) {
			
		}

		public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
			// TODO Auto-generated method stub
			
		}

		public void beforeGetText(WebElement element, WebDriver driver) {
			// TODO Auto-generated method stub
			
		}

		public void afterGetText(WebElement element, WebDriver driver, String text) {
			// TODO Auto-generated method stub
			
		}

	}
