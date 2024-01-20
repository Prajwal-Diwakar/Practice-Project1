package Phase3.Practice11_LogFileGeneratorWithLog4j;

import java.util.logging.Logger;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class LogFile_SSLAuthentication {
	
	
private static final String base_url= "https://dummyjson.com/auth";
	
	private static final String BASE_URL2 = "http://www.bupa.com.au";
	
	static final Logger logger= Logger.getLogger("LogFile_SSLAuthentication.class");
	
	@Test( description="SSL Authentication test 1")
	
	public void TestSSLAuthentication1(){
		
		logger.info("Start :: Test SSL Certificate for HTTPs");
		logger.info("POST : URL " + base_url + "/login");
		
		RestAssured.given()
		.baseUri(base_url)
		.relaxedHTTPSValidation()     // SSLPeerValidation
		.when().get("/login")
		.then().statusCode(403);
		
		logger.info("End :: Test SSL Certificate for HTTPs");
	}
	
@Test( description="SSL Authentication test 2")
	
	public void TestSSLAuthentication2(){
		
	logger.info("Start :: Test SSL Certificate for HTTPs");
	logger.info("POST : URL " + BASE_URL2 + "/login");
		RestAssured.given()
		.baseUri(BASE_URL2)
		.relaxedHTTPSValidation()
		.when().get("/")
		.then().statusCode(200);
		
		logger.info("End :: Test SSL Certificate for HTTPs");
	}

}

