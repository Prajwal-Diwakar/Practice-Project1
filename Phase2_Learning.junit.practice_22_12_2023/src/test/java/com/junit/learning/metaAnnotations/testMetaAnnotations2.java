package com.junit.learning.metaAnnotations;

import com.learning.junit.practice.calulatingAge;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class testMetaAnnotations2 {
	
	calulatingAge ageCalculator = new calulatingAge();
	
	@Test
	@DisplayName("Should return valid age for +ve year")
	@positive
	public void test1() {
		int eResult = 33;
		int aResult = ageCalculator.calculateAge1(1990);
		assertEquals(eResult, aResult);
		// assertEquals(28, ageCalculator.calculateAge(1995));
	}
	
	@Test
	@DisplayName("Should return 0 age for -ve year")
	@Negative
	public void test2() {
		 assertEquals(0, ageCalculator.calculateAge1(-1995));
	}
	
	@Test
	@DisplayName("Should return 0 age for 0 year")
	@Negative
	public void test3() {
		 assertEquals(0, ageCalculator.calculateAge1(0));
	}
	
	@Test
	@DisplayName("Should return 0 age for +ve future year")
	@Tag("negative")
	@positiveAndNegative
	public void test4() {
		assertEquals(0, ageCalculator.calculateAge1(2050));
	}
	
	@Test
	@DisplayName("Should return valid age for +ve year")
	@positive
	public void test5() {
		int eResult = 32;
		int aResult = ageCalculator.calculateAge1(1991);
		assertEquals(eResult, aResult);
		// assertEquals(28, ageCalculator.calculateAge(1995));
	}

}
