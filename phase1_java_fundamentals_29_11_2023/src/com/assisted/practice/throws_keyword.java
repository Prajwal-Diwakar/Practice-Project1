package com.assisted.practice;

public class throws_keyword {
	

		static void validate(int age){  
			if(age<18)  
			throw new ArithmeticException("not valid");  
			else
			System.out.println("welcome to vote");  
			   }  
			public static void main(String args[]){  
			validate(15);  
			System.out.println("rest of the code...");  
			  }  

	}



