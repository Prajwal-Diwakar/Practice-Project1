package com.junit.learning;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import com.learning.junit.practice.calulatingAge;

public class repeatedTests {
	
	calulatingAge Calculator;


   @BeforeEach
	public void setUp() {
	   Calculator  = new calulatingAge();
		
	}

	@AfterEach
	public void cleanUp() {
		if(Calculator!=null)
			Calculator = null;
	}
	
	@RepeatedTest(3)
	
	@Test
	@DisplayName("Should return 0 age for +ve future year")
	public void test1() {
		assertEquals(0, Calculator.calculateAge1(2050));
	}
	
	@RepeatedTest(5)
	
	@Test
	@DisplayName("Should return valid age for +ve year")
	public void test2() {
		int eResult = 33;
		int aResult = Calculator.calculateAge1(1990);
		assertEquals(eResult, aResult);
		
	}
	
	@RepeatedTest(value = 3, name = "{displayName} - repetition - {currentRepetition} of {totalRepetitions} ")
	@Test
	@DisplayName("Calculate Test")
	public void test3() {
		assertEquals(33, Calculator.calculateAge1(1990));
		assertEquals(30, Calculator.calculateAge1(1993));
	}
	
	
	@RepeatedTest(value = 2, name = RepeatedTest.LONG_DISPLAY_NAME)
	@Test
	@DisplayName("Age Calculate LONG NAME")
	public void test4() {
		assertEquals(33, Calculator.calculateAge1(1990));
		assertEquals(30, Calculator.calculateAge1(1993));
	}
	
	@RepeatedTest(value = 2, name = RepeatedTest.SHORT_DISPLAY_NAME)
	@Test
	@DisplayName("Age Calculate SHORT NAME")
	public void test5() {
		assertEquals(33, Calculator.calculateAge1(1990));
		assertEquals(30, Calculator.calculateAge1(1993));
	}

}
