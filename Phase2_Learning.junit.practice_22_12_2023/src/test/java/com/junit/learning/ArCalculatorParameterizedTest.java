package com.junit.learning;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.learning.junit.practice.ArCalculator;

public class ArCalculatorParameterizedTest {
	
	private ArCalculator arCalculator=new  ArCalculator(); // instantiate
	
	
	
	// @CsvSource allows us to express argument lists as comma-separated values via the attributes.
		@ParameterizedTest(name = "Test Division - {index} :: {0} / {1}  = {2}")
		@CsvSource(value = { "10, 2 , 5" ,  "56, 7, 8" , "7, 7, 1", "700, 70, 10"}, ignoreLeadingAndTrailingWhitespace = true)
		void testDivisionWithParameters(double dividend, double divisor , double aResult) {
			assertEquals(aResult, arCalculator.divide(dividend, divisor));
		}
		
		
		@ParameterizedTest(name = "Test multiplication - {index} :: {0} * {1}  = {2}")
		@CsvSource(value = { "10, 2 , 20" ,  "6, 7, 42" , "7, 7, 49", "3, 7, 21"}, ignoreLeadingAndTrailingWhitespace = true)
		void testMultipliactionWithParameters(int num1, int num2 , int aResult) {
			assertEquals(aResult, arCalculator.multiply(num1, num2));
		}
		
		@ParameterizedTest(name = "Test addition - {index} :: {0} + {1}  = {2}")
		@CsvSource(value = { "10, 2 , 12" ,  "6, 7, 13" , "7, 7, 14", "3, 7, 10"}, ignoreLeadingAndTrailingWhitespace = true)
		void testAdditionWithParameters(int num1, int num2 , int aResult) {
			assertEquals(aResult, arCalculator.add(num1, num2));
		}
		
		@ParameterizedTest(name = "Test substraction - {index} :: {0} - {1}  = {2}")
		@CsvSource(value = { "10, 2 , 8" ,  "6, 7, -1" , "7, 7, 0", "3, 7, -4"}, ignoreLeadingAndTrailingWhitespace = true)
		void substractionWithParameters(int num1, int num2 , int aResult) {
			assertEquals(aResult, arCalculator.sub(num1, num2));
		}	
		
		@ParameterizedTest(name = "Test Division2 - {index} :: {0} / {1}  = {2}")
		@CsvSource(value = { "10, 0 , 5"}, ignoreLeadingAndTrailingWhitespace = true)
		void testDivision2WithParameters(double dividend, double divisor) {
			
			assertThrows(IllegalArgumentException.class, () ->{ // to cover the full coverage in the 
				                                                // ArCalculator java class
				
			arCalculator.divide(dividend, divisor);
			});
			
		}

}
