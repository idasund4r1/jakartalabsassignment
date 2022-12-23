package task.qatesting.october.ida;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class test {
	String authtoken = "token not found";
	
	long currentTimestamp = System.currentTimeMillis();
	String randomEmail = "emailtest+" + String.valueOf(currentTimestamp) + "@gmail.com";
	
	@Test(priority = 1)
	public void signUpAPI() {

		String SignUpPayload = "{\"user\":{\"first_name\":\"rere\",\"last_name\":\"\",\"email\":\"buayademox12321@gmail.com\",\"password\":\"builder123\",\"phone_number\":\"+62-87788991313\",\"user_type\":\"User\",\"organisation\":\"noise\",\"signup_stage\":\"\"}}";

		RestAssured.baseURI = "https://api-staging-builder.engineer.ai";
		Response signUpResponse = RestAssured.given().log().all().contentType("application/json").body(SignUpPayload).when()
				.post("/users");

		System.out.println("status code :" + signUpResponse.getStatusCode());
		assertEquals(signUpResponse.getStatusCode(), 200);
		
		JsonPath jsonPath = signUpResponse.jsonPath();

		authtoken = jsonPath.get("user.authtoken");
		System.out.println("authtoken = " + authtoken);

		String Email = jsonPath.get("user.email");
		System.out.println("email = " + Email);
		assertEquals(Email, "buayademox12321@gmail.com");		

	}
}