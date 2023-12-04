package com.logical_programs;

import java.util.Scanner;

public class factorial {
	
	public static void main (String[] args) {
		
		int fact=1,n;
		System.out.println("Enter the number");
		Scanner r= new Scanner(System.in);
		n= r.nextInt();
		
		for (int i=1;i<=n;i++) {
			
			fact=fact*i;
		}
		
		System.out.println("The number is " +fact);
	}

}
