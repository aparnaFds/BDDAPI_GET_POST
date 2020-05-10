package stepDefinitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import commonSteps.CommonAPIMethods_HTTPClient;
import io.cucumber.core.internal.gherkin.deps.com.google.gson.JsonIOException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class FlightSearch_HTTPClient {
	
private String classname;

public FlightSearch_HTTPClient() {
		
		classname = this.getClass().getName();
		System.out.println("Class name = "+classname);
	}

	/*
	 * @Given("I have a request URL {string}") public void
	 * i_have_a_request_URL(String addURI) { System.out.println("Add URL :" +
	 * addURI); // System.out.println(CommonAPIMethods_HTTPClient.classname);
	 * 
	 * }
	 * 
	 * @When("I send request {string}") public void i_send_request(String url)
	 * throws JsonIOException, IOException {
	 * commonSteps.CommonAPIMethods_HTTPClient.executeGETRequest(url, classname);
	 * 
	 * }
	 * 
	 * @Then("I see response code {int}") public void i_see_response_code(Integer
	 * responsecode) {
	 * commonSteps.CommonAPIMethods_HTTPClient.verifyResponseCode(responsecode);
	 * 
	 * }
	 * 
	 * @Then("I get the response") public void i_get_the_response() {
	 * commonSteps.CommonAPIMethods_HTTPClient.printResponse();
	 * 
	 * }
	 * 
	 * @Then("I verify the value at {string} is {string}") public void
	 * i_verify_the_value_at_is(String value, String location) {
	 * commonSteps.CommonAPIMethods_HTTPClient.verifyAttribute(value, location);
	 * 
	 * }
	 */
}
