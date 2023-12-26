package com.learning.junit.practice;

public class ArCalculator {
	
	public double divide(double dividend, double divisor) {
		
		if(divisor==0) {
			
			throw new IllegalArgumentException("cannot divide by zero");
		}
		
		return dividend/ divisor;
			
		}
	
	public int multiply(int num1, int num2) {
		
		return num1*num2;
	}
	
	
	public int add(int num1, int num2) {
		
		return num1+num2;
	}
	
	public int sub(int num1, int num2) {
		
		return num1-num2;
	}


	

}
