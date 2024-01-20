package Phase3.RestAssuredAuthenticationPractice;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Practice7_SSLauthentication {
	
	private static final String base_url= "https://dummyjson.com/auth";
	
	private static final String BASE_URL2 = "http://www.bupa.com.au";
	
	@Test( description="SSL Authentication test 1")
	
	public void TestSSLAuthentication1(){
		
		RestAssured.given()
		.baseUri(base_url)
		.relaxedHTTPSValidation()     // SSLPeerValidation
		.when().get("/login")
		.then().statusCode(403);
		
		
	}
	
@Test( description="SSL Authentication test 2")
	
	public void TestSSLAuthentication2(){
		
		RestAssured.given()
		.baseUri(BASE_URL2)
		.relaxedHTTPSValidation()
		.when().get("/")
		.then().statusCode(200);
		
		
	}

}
