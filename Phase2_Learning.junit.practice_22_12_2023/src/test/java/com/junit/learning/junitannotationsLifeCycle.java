package com.junit.learning;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Annotations of JUNIT")

public class junitannotationsLifeCycle {
	
	
	//JUNIT Fixture
	
	@BeforeEach
	public void setup() {
		System.out.println(" Before each is executed");
	}
	@AfterEach
	
	public void cleaup() {
		System.out.println(" After each is executed");
	}
	
	@BeforeAll
	public static void setupAll(){
		System.out.println(" Before all is executed");
		
	}
	
	@AfterAll
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
