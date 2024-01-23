package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.cucumber.java.en.Then;

public class deleteSteps {
	
	private Response response;
	private RequestSpecification request;
	private ValidatableResponse json;
	
	private String base_url= "https://reqres.in/api";
	
	@Given("a user api should exist for delete")
	public void a_user_api_should_exist_for_delete() {
		request=RestAssured.given().baseUri(base_url);   
	}

	@When("a user deleted by userid {int}")
	public void a_user_deleted_by_userid(Integer userID) {
		response=request.pathParam("userID", userID).when().delete("/users/{userID}");
	    
	}

	@Then("validate delete request outcomes status code is {int}")
	public void validate_delete_request_outcomes_status_code_is(Integer statusCode) {
		json=response.then().statusCode(statusCode);
	}



}
