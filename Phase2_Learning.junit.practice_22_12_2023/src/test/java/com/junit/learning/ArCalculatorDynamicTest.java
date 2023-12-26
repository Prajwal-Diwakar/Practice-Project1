package com.junit.learning;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

import com.learning.junit.practice.ArCalculator;

public class ArCalculatorDynamicTest {
	
	private ArCalculator arCalculator=new ArCalculator(); //instantiate
	
	double [][] testCases1= {{10, 2, 5}, {12, 3, 4}, {8, 4, 2}, {56, 7, 8}};  // objects created
	int [][]    testCases2= {{2, 6, 12} , {4, 3, 12}, {5,7, 35}};
	
	int [][]    testCases3= {{2, 6, 8} , {4, 3, 7}, {5,7, 12}};
	
	int [][]    testCases4= {{2, 6, -4} , {4, 3, 1}, {5,7, -2}};
	
	@TestFactory
	
	public DynamicTest testDivision() {        // method
		
		return DynamicTest.dynamicTest("Test divide", ()->{
			
			double aResult =arCalculator.divide(100,2);
			
			double eResult =50.0;
			assertEquals(aResult, eResult);
		});
	}
	
	@TestFactory
	public Collection<DynamicTest> testDivision2() {
		 return Arrays.asList(testCases1).stream().map(testCase1 ->
			 DynamicTest.dynamicTest("Test divide(" + testCase1[0] + ", " + testCase1[1] + ")", 
					()->{
					double aResult = arCalculator.divide(testCase1[0], testCase1[1]);
					double eResult = testCase1[2];
					assertEquals(aResult, eResult);
					}))
		.toList();
	}
	
	@TestFactory
	
	public DynamicTest testMultiplication() {  // method to test the multiplication
		
		return DynamicTest.dynamicTest("Test multiply", ()->{
				
			int aresult =arCalculator.multiply(4, 8);
			int eresult =32;
			
			assertEquals(aresult, eresult);
		}
		);
		
	}
	
	@TestFactory
	
	public Collection<DynamicTest> testMultiplication2() {
		return Arrays.asList(testCases2).stream().map(testcase2 ->
		
			DynamicTest. dynamicTest(" Test multiply (" + testcase2[0] + ", " + testcase2[1] + ")",
					
					()->{
						
						int Aresult= arCalculator.multiply(testcase2[0] , testcase2[1] );
						int Eresult= testcase2[0];
					}))
				.toList();
					
			}
		
@TestFactory
	
	public DynamicTest testAddition() {  // method to test the multiplication
		
		return DynamicTest.dynamicTest("Test addition", ()->{
				
			int aresult =arCalculator.add(4, 8);
			int eresult =12;
			
			assertEquals(aresult, eresult);
		}
		);
		
	}
	
	@TestFactory
	
	public Collection<DynamicTest> testAddition2() {
		return Arrays.asList(testCases3).stream().map(testcase3 ->
		
			DynamicTest. dynamicTest(" Test addition (" + testcase3[0] + ", " + testcase3[1] + ")",
					
					()->{
						
						int Aresult= arCalculator.add(testcase3[0] , testcase3[1] );
						int Eresult= testcase3[0];
					}))
				.toList();
					
			}
	
	
@TestFactory
	
	public DynamicTest testSubstraction() {  // method to test the multiplication
		
		return DynamicTest.dynamicTest("Test substraction", ()->{
				
			int aresult =arCalculator.sub(4, 8);
			int eresult =-4;
			
			assertEquals(aresult, eresult);
		}
		);
		
	}
	
	@TestFactory
	
	public Collection<DynamicTest> testSubstraction2() {
		return Arrays.asList(testCases4).stream().map(testcase4 ->
		
			DynamicTest. dynamicTest(" Test substraction (" + testcase4[0] + ", " + testcase4[1] + ")",
					
					()->{
						
						int Aresult= arCalculator.sub(testcase4[0] , testcase4[1] );
						int Eresult= testcase4[0];
					}))
				.toList();
					
			}
	
	
	
				
		
}
	
	
	

