package phase2.junit5.gradle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class assertionsPractice {
	
	
	
		
		String username="Rolex";
		int age =39;
		String mail=null;
		
		Object actual = new Object();
		Object reference = actual;
		
	
		
		
	
		@Test
		@DisplayName("Should match expected and actual results")
		public void test1(){
		assertEquals(username, "Rolex");
		assertEquals(age, 39);
		}
		
		@Test
		@DisplayName("Testing the age should be true")
		public void test2() {
			
		assertTrue(age>30);
		}
		
		@Test
		@DisplayName("Testing the age should be false")
		public void test3() {
			
		assertFalse(age<30);
		
		
	}
		@Test
		@DisplayName("Should be null")
		void test4() {
			assertNull(mail);
		}
		
		@Test
		@DisplayName("Testing that Should be not null")
		void test5() {
			assertNotNull(age);
		}
		
		@Test
		@DisplayName("Should throw the correct exception")
		void shouldThrowCorrectException() {

			assertThrows(NullPointerException.class, () -> {
				throw new NullPointerException();
			});
		}
		
		@Test
		@DisplayName("Should not throw an exception")
		void shouldNotThrowException() {
			assertDoesNotThrow(()-> {
				// any logic -> should not throw exception
			});
		}
		
		@Test
		@DisplayName("Should assert multiple Assertions")
		public void lambdaExpressionTest3() {
			int[] numbers = { 0, 70, 20, 3, 50 };
			assertAll("Numbers", () -> assertEquals(numbers[0], 0));
			assertAll("Numbers", () -> assertEquals(numbers[2], 20));
			assertAll("Numbers", () -> assertEquals(numbers[2], 20), () -> assertEquals(numbers[4], 50));
			assertAll("Numbers", () -> assertEquals(numbers[2], 20), () -> assertEquals(numbers[4], 50),
					() -> assertEquals(numbers[3], 3));
			assertAll("Numbers", ()-> assertEquals(numbers[3],3), ()-> assertEquals(numbers[1], 70), 
					()-> assertEquals(numbers[2],20 ));
		}		

}
