package com.learning.junit.practice;

public class calulatingAge {
	
	// calculating the age
	

		public int calculateAge1(int yearOfBirth) {
			int crrentYear = 2023;
			if(yearOfBirth>0 && yearOfBirth<crrentYear)
				return crrentYear - yearOfBirth ;
			else
			    return 0;
		}
		
		// calculate retirement
		public boolean isRetired(int yearOfBirth) {
			int age  = calculateAge1(yearOfBirth);
			int retAge = 60;
			if(age> retAge) {
				return true;
			} else {
				return false;
			}
		}

}
