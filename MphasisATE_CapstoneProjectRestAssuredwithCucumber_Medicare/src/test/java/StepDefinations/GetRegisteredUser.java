package StepDefinations;

import static org.hamcrest.CoreMatchers.equalTo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class GetRegisteredUser {
	
	private RequestSpecification request;
	private Response response;
	private ValidatableResponse json;
	

	private String BASE_URL = "http://localhost:9010";
	
	@Given("user wants to get the list of all regsitered users")
	public void user_wants_to_get_the_list_of_all_regsitered_users() {
		request = RestAssured.given().baseUri(BASE_URL);
	}

	@When("User executes the endpoint url of the get user page")
	public void user_executes_the_endpoint_url_of_the_get_user_page() {
		response=request.when().get("/get-users");
	}

	@Then("user gets the all the registered users.")
	public void user_gets_the_all_the_registered_users() {
		int code=101;
		String message="4 Users Fetched Successfully.";
		
		json= response.then()
				.and().assertThat()
				.body("code", equalTo(code)).and()
				.body("message", equalTo(message));
	}

	@Then("validate the outcomes status code is {int}")
	public void validate_the_outcomes_status_code_is(Integer statusCode) {
		response.then().statusCode(statusCode);
	}

}
