package com.exceptionhandling;

public class exception_handling {

	public static void main(String[] args) {
		
		System.out.println("--- Program started ! ---");
		try {
			
			int accountBalance = 5000;
			int intrestPer = 0 ;
			
			int totalIntrest = ( accountBalance / intrestPer ) * 100;
			
			System.out.println("Total Amount "+ totalIntrest);
			
		} catch (ArithmeticException e) {
			System.err.println("Exception Occured and handled ::  "+e.getClass());
			System.out.println("Exception Message :: "+e.getMessage());
			
		}  finally {
			System.out.println("Always executing block : cleanup");
		}
		
		
		System.out.println("--- Program ended ! ---");
	}
}