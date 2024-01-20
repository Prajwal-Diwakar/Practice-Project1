package Phase3.Practice8_RestAssured.Log4j;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class TestLog4j {
	
static final Logger logger = Logger.getLogger(TestLog4j.class);
	
	@Test
	public void testInfoLogs() {
		logger.info("This is info logs.");
	}
	
	@Test
	public void testWarnLogs() {
		logger.warn("This is warn logs.");
	}
	
	@Test
	public void testDebugLogs() {
		logger.debug("This is debug logs.");
	}
	
	@Test
	public void testErrorLogs() {
		logger.error("This is error logs.");
	}

}
