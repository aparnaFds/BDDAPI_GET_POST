package commonSteps;

import static io.restassured.RestAssured.given;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.json.JSONObject;
import org.junit.Assert;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class CommonAPIMethods {

//	public static String addURI;
	public static Response response;

	public static void executeGETRequest(String Baseurl, String endpoint, String classname) throws IOException {
		// String Baseurl = getPropertyValue("url");
//		response = RestAssured.get(Baseurl);
		RestAssured.baseURI = Baseurl;
		response = given().contentType("application/json").when().get(endpoint).then().and().extract().response();
		System.out.println("Response = "+response.prettyPrint());
		FileOutputStream outstream=null;
		byte[] filecontent = response.prettyPrint().getBytes();
		DateFormat df = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss");
		Date dateobj = new Date();
		String date = df.format(dateobj);
		outstream = new FileOutputStream(
				System.getProperty("user.dir")+"\\src\\main\\java\\Response\\"
						+ classname + "_" + date + ".json");
		outstream.write(filecontent);

	}

	public static void executePOSTRequest(String Baseurl, String bodyFileName, String classname) throws IOException {
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir")+"\\src\\main\\java\\RequestBody\\"
						+ bodyFileName + ".json");
		RestAssured.baseURI = Baseurl;
		response = given().header("Content-type", "application/json").body(fis).when().post().then().statusCode(201)
				.log().all().and().extract().response();
		FileOutputStream outstream = null;
		byte[] filecontent = response.prettyPrint().getBytes();
		DateFormat df = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss");
		Date dateobj = new Date();
		String date = df.format(dateobj);
		outstream = new FileOutputStream(
				System.getProperty("user.dir")+"\\src\\main\\java\\Response\\"
						+ classname + "_" + date + ".json");
		outstream.write(filecontent);

	}

	public static void verifyResponseCode(int responsecode) {
		int code = response.getStatusCode();
		Assert.assertEquals(responsecode, code);

	}

	public static void verifyAttribute(String location, String value) {
		JsonPath jsonpath = new JsonPath(response.asString()); /// xpathfind.get("data.r.n[0]");
		System.out.println("Attribute = " + jsonpath.get(location) + "value = " + value);
		Assert.assertEquals(value, jsonpath.get(location));
	}

	public static void printResponse() {
		response.prettyPrint();
		System.out.println("RESPONSE TIME = " + response.getTimeIn(TimeUnit.SECONDS));

	}

	public static String getPropertyValue(String PropertyName) {
		String propertyValue;
		try {
			FileReader reader = new FileReader("Input.properties");
			Properties properties = new Properties();
			properties.load(reader);
			propertyValue = properties.getProperty(PropertyName);
		} catch (Exception e) {
			propertyValue = "";
			// log.error(e);
		}
		return propertyValue;
	}

}
