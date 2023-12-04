package com.exceptionhandling;

public class exception_demo2 {
	
	public static void main(String[] args) {
		
	
	try {
		
		int result= divide(10,0); 
		
		
		System.out.println("The result is=" +result);
			
		}
	catch (ArithmeticException e) {
		System.out.println("Exception Occured and handled ::  "+e.getClass());
		System.out.println("The error is=" +e.getMessage());
	}
	}
	
	static int divide(int a, int b) {          //method
		return a/b;
	}



}
