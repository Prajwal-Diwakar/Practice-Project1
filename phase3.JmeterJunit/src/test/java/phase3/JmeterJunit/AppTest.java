package phase3.JmeterJunit;

import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * Prajwal Diwakar
 * 
 */

public class AppTest {
	

    @Test
    public void passedTest() {
    	System.out.println("This is the Passed test execution");
	
}
    
    @Test
    public void failedTest() {
    	
    	System.out.println("This is the Failed test execution");
    	fail();
    }
}
