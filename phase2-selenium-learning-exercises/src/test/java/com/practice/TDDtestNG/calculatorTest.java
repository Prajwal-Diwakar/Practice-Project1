package com.practice.TDDtestNG;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.testNG.calculator;

public class calculatorTest {
	
calculator Calculator;
	
	@BeforeMethod
	public void setUp() {
		Calculator = new calculator();
		
	}
	
	@AfterMethod
	public void cleanUp() {
		Calculator = null;
	}
	
	@Test(description= "Test +ve numbers")
	public void testmultiplication1() {
		
		int eResult=6;
		int aResult=Calculator.mul(3, 2);
		assertEquals(aResult, eResult);
	}
	
	@Test(description="Test -ve numbers")
        public void testmultiplication2() {
		
		int eResult=0;
		int aResult=Calculator.mul(-3, -2);
		assertEquals(aResult, eResult);
	}
	
	@Test(description = "Test +ve numbers")
	public void testAddition1() {
		int eResult = 100;
		int aResult = Calculator.add(50, 50);
		assertEquals(aResult, eResult);
	}
	
	@Test(description = "Test -ve numbers")
	public void testAddition2() {
		int eResult = 0;
		int aResult = Calculator.add(-50, -50);
		assertEquals(aResult, eResult);
	}
	
	@Test(description = "Test -ve and +ve numbers")
	public void testAddition3() {
		int eResult = 0;
		int aResult = Calculator.add(-20, 30);
		assertEquals(aResult, eResult);
	}


	@Test(description = "Test +ve and -ve numbers")
	public void testAddition4() {
		int eResult = 0;
		int aResult = Calculator.add(50, -50);
		assertEquals(aResult, eResult);
	}
	
	@Test(description = "Test0 and +ve numbers")
	public void testAddition5() {
		int eResult = 50;
		int aResult = Calculator.add(0, 50);
		assertEquals(aResult, eResult);
	}
	
	@Test(description = "Test0 and -ve numbers")
	public void testAddition6() {
		int eResult = 0;
		int aResult = Calculator.add(0, -50);
		assertEquals(aResult, eResult);
	}
	
	
	

}
