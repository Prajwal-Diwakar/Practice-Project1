package com.selenium.testNG;

public class calculator {
	
	// addition operation  should never return -ve values. Need to return postive value or zero
	
		public int add(int num1 , int num2) {
			if(num1>=0 & num2>=0)
				return num1 + num2;
			else 
				return 0;
		}
		
		
		public int mul(int num1 , int num2) {
			if(num1>=0 & num2>=0)
				return num1 * num2;
			else 
				return 0;
		}
		

}
