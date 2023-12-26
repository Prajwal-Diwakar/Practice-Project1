package com.junit.learning.metaAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.learning.junit.practice.calulatingAge;

public class testMetaAnnotations {
	
	calulatingAge calculator = new calulatingAge();
	
	@Test
	@DisplayName("Should return valid age for +ve year")
	@Tag("positive")
	public void test1() {
		int eResult = 33;
		int aResult = calculator.calculateAge1(1990);
		assertEquals(eResult, aResult);
		// assertEquals(28, ageCalculator.calculateAge(1995));
	}
	
	@Test
	@DisplayName("Should return 0 age for -ve year")
	@Tag("negative")
	public void test2() {
		 assertEquals(0, calculator.calculateAge1(-1995));
	}
	
	@Test
	@DisplayName("Should return 0 age for 0 year")
	@Tag("negative")
	public void test3() {
		 assertEquals(0, calculator.calculateAge1(0));
	}
	
	@Test
	@DisplayName("Should return 0 age for +ve future year")
	@Tag("negative")
	@Tag("positive")
	public void test4() {
		assertEquals(0, calculator.calculateAge1(2050));
	}
	
	@Test
	@DisplayName("Should return valid age for +ve year")
	@Tag("positive")
	public void test5() {
		int eResult = 32;
		int aResult = calculator.calculateAge1(1991);
		assertEquals(eResult, aResult);
		// assertEquals(28, ageCalculator.calculateAge(1995));
	}
	
}


