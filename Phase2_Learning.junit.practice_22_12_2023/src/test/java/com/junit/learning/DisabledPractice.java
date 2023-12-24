package com.junit.learning;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

@DisplayName(" Practice of the Disabled")

public class DisabledPractice {
	
	
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
		System.out.println(" After all is executed");
		
	}
	
	
	@Test
	
	@DisplayName("test case one")
	public void testone() {
		System.out.println(" TEST one is executed");
	}
	
	@Test
	@DisplayName("test case two")
	public void testtwo() {
		System.out.println(" test case two is executed");
	}
	
	@Test
	@DisabledOnOs(value = OS.WINDOWS)
	@DisplayName("test case three")
	public void test3() {
		System.out.println("test case three is executed");
	}
	
	@Test
	@DisabledOnJre(value = JRE.JAVA_17)
	@DisplayName("test case 4")
	public void test4() {
		System.out.println("test case 4 is executed");
	}
	
	@Test
	@DisabledOnJre({JRE.JAVA_17, JRE.JAVA_8})
	@DisplayName("test case 5")
	public void test5() {
		System.out.println("test case 5 is executed");
	}
	

}
