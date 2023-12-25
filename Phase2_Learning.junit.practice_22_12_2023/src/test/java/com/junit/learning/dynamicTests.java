package com.junit.learning;

import org.junit.jupiter.api.TestFactory;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.api.DynamicNode;
import org.junit.jupiter.api.DynamicTest;
public class dynamicTests {
	

	
	@TestFactory
	public DynamicTest  dynamicTestWithDynamicTest() {
		return DynamicTest.dynamicTest("Addition Test", () ->{
			
			assertEquals(600, Math.addExact(100, 500));
		});
		
		
		
	}
	
	@TestFactory
	public Collection<DynamicTest> dynamicTestWithCollection() {
		return Arrays.asList(
				DynamicTest.dynamicTest("Addition Test of the +ve numbers", () ->{
					
					assertEquals(600, Math.addExact(100, 500)); // returns multiple values.
					
				}),
						DynamicTest.dynamicTest("Addition Test of the -ve number", () ->{
						
						assertEquals(-900, Math.addExact(-400, -500)
					);
				}),
						
						DynamicTest.dynamicTest("Addition Test of -ve and +ve numbers", () ->{
							
							assertEquals(-300, Math.addExact(200, -500));
						
				}),
						
						DynamicTest.dynamicTest(" Addition of the 0 and -ve number", () ->{
							
							assertEquals(-650, Math.addExact(0, -650)
									);
							
						})
						);
		
		
	}
	

	@TestFactory
	public Iterable<DynamicTest> dynamicTestWithIterable() {
		return Arrays.asList(                                  // returns multiple values
				
				DynamicTest.dynamicTest("Addition Test" , () ->{
					
					assertEquals(300, Math.addExact(250, 50));
						
				}),
					
					DynamicTest.dynamicTest("Multiplication Test", () ->{
						
						assertEquals(200, Math.multiplyExact(100, 2));
					
					
				})
				);
	}
				
	@TestFactory
	public Stream<DynamicTest> dynamicTestWithStream() {
		return IntStream.iterate(0, n -> n+2).limit(10)
				.mapToObj(n -> 
				DynamicTest.dynamicTest("Test Divisible by 2 :: " + n, () -> {
					assertTrue(n%2 ==0);
				})
			);
	}
	
	
	

}
