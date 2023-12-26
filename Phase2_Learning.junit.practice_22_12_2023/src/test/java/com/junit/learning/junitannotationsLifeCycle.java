package com.junit.learning;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Annotations of JUNIT")

public class junitannotationsLifeCycle {
	
	
	         //JUNIT Fixtures and its operations
	
	@BeforeEach           // executed before every method
	public void setup() {
		System.out.println(" Before each is executed");
	}
	@AfterEach                 // executed after every method
	
	public void cleaup() {
		System.out.println(" After each is executed");
	}
	
	@BeforeAll                // executed before once all method executed
	public static void setupAll(){
		System.out.println(" Before all is executed");
		
	}
	
	@AfterAll                  // executed after  once all method executed
	public static void cleanAll(){
		System.out.println(" Before all is executed");
		
	}
	
	
	@Test
	@DisplayName("test case one")
	public void testone() {
		System.out.println(" TEST one is executed");
	}
	
	@Test
	@DisplayName("test case two")
	public void testtwo() {
		System.out.println("  I am learning JUNIT");
	}
	

}
