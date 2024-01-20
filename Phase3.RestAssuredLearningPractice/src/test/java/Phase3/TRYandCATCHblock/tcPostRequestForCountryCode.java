package Phase3.TRYandCATCHblock;

import static org.testng.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

import io.restassured.path.xml.XmlPath;

public class tcPostRequestForCountryCode {
	
	private static final String BASE_URL = "http://www.oorsprong.org";
	
	static final Logger logger= Logger.getLogger("tcPostRequestForCountryCode.class");
	
	@Test(description="Post method to get the country name with code")
	
	public void TestPostMethod() {
		
		logger.info("START:: POST method to get the country name and code");
		
	try {
		String soapRequest  ="<?xml version=\"1.0\" encoding=\"utf-8\"?>\r\n"
				+ "<soap12:Envelope xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope/\">\r\n"
					+ " <soap12:Body>\r\n"
						+ "<ListOfCountryNamesByName xmlns=\"http://www.oorsprong.org/websamples.countryinfo/\">\r\n"
							+ "  </ListOfCountryNamesByName>\r\n"
								+ " </soap12:Body>\r\n"
									+ "</soap12:Envelope>";
		
		// create post call	
		
		RestAssured.given().baseUri(BASE_URL)
		.when().contentType("text/xml; charset=utf-8")
		.body(soapRequest)
		.post("/websamples.countryinfo/CountryInfoService.wso")
		
		.then().assertThat().statusCode(200);

	} catch (Exception e) {
		logger.error("Exception Object :: " + e.toString());
		logger.error("End Exception :: "+e.getLocalizedMessage());
	}
	
	
	
	
//	String response= RestAssured.given().baseUri(BASE_URL)
//			.when().contentType("text/xml; charset=utf-8")
//			.body(soapRequest)
//			.post("/websamples.countryinfo/CountryInfoService.wso")
//			.getBody().asString();
	
	
	}
	
	

}
