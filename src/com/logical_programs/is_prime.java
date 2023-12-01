package com.logical_programs;

import java.util.Scanner;

public class is_prime {  //  creating the class
	
        public static void main(String[] args) {
        	 
        	Scanner scanner= new Scanner(System.in);  //method
        	
        	System.out.print("Enter a number: ");
            int num = scanner.nextInt();
        	
        	if(isprime(num)) {
        		 System.out.println("Prime");
        	}
        	else {
        		System.out.println("Not Prime");
        	}
        	
        	 scanner.close();
        }
        
        static boolean isprime(int num) {
            if (num <= 1) {
                return false;
            }

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }

            return true;
        }
        
        
        
}
