package com.junit.learning;

import org.junit.jupiter.api.Test;

import com.learning.junit.practice.ArithmaticCalculatorTestInterfaceDefault;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmaticCalculatorTestInterfaceDefaultTest {
	
	@Test 
	void testMultiply1() {
		
		ArithmaticCalculatorTestInterfaceDefault arithmaticCalculator =new ArithmaticCalculatorTestInterfaceDefault() {
			
			@Override
			public int add(int num1, int num2) {
				return num1+ num2;
			}
		};
		
		int aResult = arithmaticCalculator.multiply(2, 200);
		int eResult = 400;
		
		assertEquals(eResult, aResult , "Multiplication of 2X20 should be 400");
	
		
	}
	
	@Test
	void testMultiply2() {
		
		ArithmaticCalculatorTestInterfaceDefault arithmaticCalculator =new ArithmaticCalculatorTestInterfaceDefault() {

		@Override                    // in order to do the default methods overriding the abstract method
		public int add(int num1, int num2) {
			return num1 +num2;
		}
		};
		
		int aResult = arithmaticCalculator.multiply(20, 200);
		int eResult = 4000;
		
		assertEquals(eResult, aResult , "Multiplication of 20X200 should be 4000");
		
	}

}
