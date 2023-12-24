package com.junit.learning;

import com.learning.junit.practice.calulatingAge;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RetirementCalculator {
	
	
calulatingAge ageCalculator;
	
	@BeforeEach
	public void setUp() {
		ageCalculator  = new calulatingAge();
	}

	@AfterEach
	public void cleanUp() {
		if(ageCalculator!=null)
			ageCalculator = null;
	}
	
	@Test
	@DisplayName("Should return true for retirement if age >60")
	public void test1() {
		
	
		assertEquals(true, ageCalculator.isRetired(1950));
		
	}
	
	@Test
	@DisplayName("Should return false for retirement if age <60")
	public void test2() {
		
		assertEquals(false,  ageCalculator.isRetired(1997));
		
	}
	
	@Test
	@DisplayName("Should return false for retirement if year is negative ")
	public void test3() {
		
		assertEquals(false,  ageCalculator.isRetired(-1997));
		
	}
	
	@Test
	@DisplayName("Should return false for retirement if year is 0 ")
	public void test4() {
		
		assertEquals(false,  ageCalculator.isRetired(0));
		
	}
	
	

}
