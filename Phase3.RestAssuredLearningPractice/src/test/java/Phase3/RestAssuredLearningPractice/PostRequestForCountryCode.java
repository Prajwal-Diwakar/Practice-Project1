package Phase3.RestAssuredLearningPractice;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import io.restassured.path.xml.XmlPath;

public class PostRequestForCountryCode {
	
	private static final String BASE_URL = "http://www.oorsprong.org";
	
	@Test(description="Post method to get the country name with code")
	
	public void TestPostMethod() {
		
	String soapRequest  ="<?xml version=\"1.0\" encoding=\"utf-8\"?>\r\n"
			+ "<soap12:Envelope xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope>\r\n"
			+ "<soap12:Body>\r\n"
			+ "<ListOfCountryNamesByName xmlns=\"http://www.oorsprong.org/websamples.countryinfo>\r\n"
			+ "</ListOfCountryNamesByName>\r\n"
			+ "</soap12:Body>\r\n"
			+ "</soap12:Envelope>";
	
	// create post call	
	
	RestAssured.given().baseUri(BASE_URL).when()
	.contentType("text/xml; charset=utf-8")
	.body(soapRequest)
	.post("/websamples.countryinfo/CountryInfoService.wso")
	
	.then().assertThat().statusCode(200);
	
	
//	String response= RestAssured.given().baseUri(BASE_URL)
//			.when().contentType("text/xml; charset=utf-8")
//			.body(soapRequest)
//			.post("/websamples.countryinfo/CountryInfoService.wso")
//			.getBody().asString();
	
	
	}
	
	

}
