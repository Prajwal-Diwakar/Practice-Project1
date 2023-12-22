package com.practice15.testng.testng.listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNG_listeners implements ITestListener {
	
	public void onTestStart(ITestResult result) {
		System.out.println("Test Started: " + result.getName());
	}

	

	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed: " + result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped: " + result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Passed: " + result.getName());
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Test Failed within Success percentage: " + result.getName());
	}

	public void onStart(ITestContext context) {
		System.out.println("Test Start: " + context.getName());
	}

	public void onFinish(ITestContext context) {
		System.out.println("Test Finish: " + context.getName());
	}

}
