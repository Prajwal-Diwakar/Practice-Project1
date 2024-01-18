package Phase3.RestAssuredLearningPractice;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static org.hamcrest.CoreMatchers.equalTo;

public class practice3_PostRequestAndResponse {

private static final String BASE_URL = "https://reqres.in/api";
	
	@Test(description = "Test for executing POST request using rest assured")
	public void postRequestTest() { 
		// create user post data
		PostData postData = new PostData("Adaikallam" ,"Gangster");
		
		RestAssured.given().baseUri(BASE_URL).when()
		.contentType(ContentType.JSON)
		.body(postData)
		.post("/users").then()
		.assertThat().statusCode(201).and()
		.assertThat().body ("name", equalTo (postData.name)).and()
		.assertThat().body ("job", equalTo (postData.job));
		
		String response = RestAssured.given().baseUri(BASE_URL).when()
		.contentType(ContentType.JSON)
		.body(postData)
		.post("/users").getBody().asPrettyString();
		
		System.out.println(response);
	}
	
	@Test(description = "Test for executing POST request using rest assured")
	public void postRequestTest2() { 
		// create user post data
		PostData postData = new PostData("Rolex" ,"GangLeader");
		
		RestAssured.given().baseUri(BASE_URL).when()
		.contentType(ContentType.JSON)
		.body(postData)
		.post("/users").then()
		.assertThat().statusCode(201).and()
		.assertThat().body ("name", equalTo (postData.name)).and()
		.assertThat().body ("job", equalTo (postData.job));
		
		String response = RestAssured.given().baseUri(BASE_URL).when()
		.contentType(ContentType.JSON)
		.body(postData)
		.post("/users").getBody().asPrettyString();
		
		System.out.println(response);
	}
}


class PostData {
	public final String name;
    public final String job;
    
	public PostData(String name, String job) {
		super();
		this.name = name;
		this.job = job;
	}
}
