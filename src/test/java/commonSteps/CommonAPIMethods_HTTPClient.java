package commonSteps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.http.ParseException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Assert;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class CommonAPIMethods_HTTPClient {

	public static String addURI;
	public static CloseableHttpResponse response;
	public static String responseString;
	public static String classname;


	public static void executeGETRequest(String Baseurl, String classname) throws IOException {
//		String Baseurl = getPropertyValue("url");
		System.out.println("Method name = " + Thread.currentThread().getStackTrace()[1].getMethodName());
		CloseableHttpClient client = HttpClients.createDefault();

		HttpGet request = new HttpGet(Baseurl);

		try {
			response = client.execute(request);
		} catch (IOException e) {

			e.printStackTrace();
		}
//		Gson gson = new Gson();
//		gson.toJson(responseString, new FileWriter("C:\\Users\\Dell\\Documents\\Workspaces\\NewLearnng\\zzBDDAPIProject_post\\src\\main\\java\\Response\\"+classname+".json"));
		FileOutputStream outstream = null;
		byte[] filecontent  = responseString.getBytes();
		outstream = new FileOutputStream("C:\\Users\\Dell\\Documents\\Workspaces\\NewLearnng\\zzBDDAPIProject_post\\src\\main\\java\\Response\\"+classname+".json");
		outstream.write(filecontent);
	}

	public static void verifyResponseCode(int responsecode) {
		int code = response.getStatusLine().getStatusCode();
//		System.out.println("response code = " + code);
		Assert.assertEquals(responsecode, code);

	}

	public static void verifyAttribute(String location, String value) {
		JsonPath jsonpath = null;
		jsonpath = new JsonPath(responseString);
		String attribute = jsonpath.getString(location);
		System.out.println("Attribute = " + attribute + "\nvalue = " + value);
		Assert.assertEquals(value, attribute);
	}

	public static void printResponse() {
		try {
			responseString = EntityUtils.toString(response.getEntity(), "UTF-8");
			System.out.println("Response is " + responseString);
		} catch (ParseException | IOException e) {
			System.out.println("error in printing response");
			e.printStackTrace();
		}

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
