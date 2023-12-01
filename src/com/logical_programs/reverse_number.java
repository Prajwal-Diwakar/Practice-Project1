package com.logical_programs;

import java.util.Scanner;

public class reverse_number {
	
	public static void main(String[] args) {
   	 
    	Scanner scanner= new Scanner(System.in);  //method
    	
    	System.out.print("Enter a number: ");
        int num = scanner.nextInt();
      
        
        int reversednumber=rev (num);
        
        System.out.println("The reversed number is" + reversednumber);
        
       
	}
	
	static int rev(int num) {
		
	int rem=0;
	int r =0;
	
	while(num>0) {
	
	 rem=num %10;
	 r=r*10+ rem;
	num=num/10;
	}
	
	return r;
	
}
	
	
        

}
