package com.junit.learning;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.function.BooleanSupplier;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class parameterizedTestEx {
	
	@ParameterizedTest(name = "Test - {index} ::  {0} is odd")
	@ValueSource(ints = { 1, 3, 5 , 9})
	void testTrueForOddNumber(int number) {
		assertTrue(number%2 ==01, "Odd Number");
	}


	@ParameterizedTest(name = "Test - {index} ::  {0} is even")
	@ValueSource(ints = { 2, 4, 10 , 12})
	void testTrueForEvenNumber(int number) {
		assertTrue(number%2 ==0 , "Even Number");
	}
	
	@ParameterizedTest(name = "Test - {index} :: {0} is a palindrome")
	@ValueSource(strings = { "LEVEL", "12321", "MOM", "MINIM"})
	void testPalindrome(String word) {
		assertTrue(isPalindrome(word));
	}
	

	private  boolean isPalindrome(String word) {
		if(word==null)
			return false;
		else
			return StringUtils.reverse(word).equals(word);
	}
	
	            // @CsvSource allows us to express argument lists as comma-separated values via the attribute.
		@ParameterizedTest(name = "Test - {index} :: {0} is valid name and {1} is valid age")
		@CsvSource(value = { "Manja, 35", "Podi Dhamu, 29", "Adaikallam, 20"}, ignoreLeadingAndTrailingWhitespace = true)
		void testWithCsvSource(String name, int age) {
			assertNotNull(name);
			assertTrue(age > 0);
		}
		

		
		
}	


