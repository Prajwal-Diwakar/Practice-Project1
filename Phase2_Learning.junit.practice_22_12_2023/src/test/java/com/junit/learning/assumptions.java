package com.junit.learning;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.learning.junit.practice.calulatingAge;

import static org.junit.jupiter.api.Assumptions.assumingThat;

public class assumptions {
	
	calulatingAge Calculator ;
	
	@Test
		
		public void testonIDE(){
			System.setProperty("ENV", "IDE");
			Assumptions.assumeTrue("IDE".equals(System.getProperty("ENV")));
			
		}
	
	@Test
	
	public void testonRAM(){
		System.setProperty("ENV", "RAM");
		Assumptions.assumeFalse("IDE".equals(System.getProperty("ENV")));
		
	}
	
	@Test
	public void testOnProd() {
		// set an system property as ENV key.
		System.setProperty("ENV", "SYS");
		// validation test with assumption that env is dev.
		Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")), assumptions::message);
		// test will be aborted because  the assumption failed.
	}

	@Test
	public void testInAllEnvs() {
		             // setting an system property as ENV key.
		System.setProperty("HII", "HELLO");
		
		assumingThat("HELLO".equals(System.getProperty("HII")), ()-> {
			            // perform these assertions only on the DEV 
			assertEquals(32, Calculator.calculateAge1(1992));
		});
		
		                      // perform these assertions in all environments
		assertEquals(29, Calculator.calculateAge1(1994));
	}

	private static String message() {
		return ":: Test Assumption Failed :: ";
	}

	

}
