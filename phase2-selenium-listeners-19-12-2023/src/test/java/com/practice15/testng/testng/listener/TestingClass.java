package com.practice15.testng.testng.listener;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



@Listeners(TestNG_listeners.class)

public class TestingClass {
	@Test
	public void testOne() {
		assertTrue(true);
	}
	
	@Test
	public void testTwo() {
		assertTrue(false);
	}
	
	

}
