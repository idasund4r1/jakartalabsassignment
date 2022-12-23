package task.qatesting.october.ida;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;
import static io.restassured.RestAssured.given;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import task.qatesting.october.ida.utils.DataUtility;


public class BaseApiTestSignup {
	RequestSpecification commonJsonSpec = new RequestSpecBuilder()
			.setBaseUri("https://api-staging-builder.engineer.ai")
			.setContentType(ContentType.JSON)
			.build().log().all();
	RequestSpecification loginJsonSpec;
	
	String token;
	
	@BeforeMethod
	public void loginAPI() {
		String payload = DataUtility.getDataFromExcel("requestbody", "signinbody");
		Response responseLogin = given().spec(commonJsonSpec)
				.body(payload)
				.when().post("/users/sign_in");
		assertEquals(responseLogin.statusCode(),200);
		token = responseLogin.jsonPath().get("user.authtoken");
		
		loginJsonSpec = new RequestSpecBuilder()
				.setBaseUri("https://api-staging-builder.engineer.ai")
				.setContentType(ContentType.JSON)
				.addHeader("authtoken", token)
				.build().log().all();
	}

}
