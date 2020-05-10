package stepDefinitions;

import static io.restassured.RestAssured.given;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.json.JSONObject;
import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class POSTCall {

	private String classname;

	public POSTCall() {

		classname = this.getClass().getSimpleName();
		System.out.println("Class name = " + classname);
	}

	@When("I send POST request {string}")
	public void i_send_POST_request(String url) throws IOException {		
		commonSteps.CommonAPIMethods.executePOSTRequest(url, classname, classname);
	}

}
