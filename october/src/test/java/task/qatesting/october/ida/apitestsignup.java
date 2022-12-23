package task.qatesting.october.ida;

import static org.testng.Assert.assertEquals;


import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class apitestsignup {
	
	
	@Test
	public void SignupAPI() {
		RestAssured.baseURI = "https://staging.engineer.ai";
		String payload = 
				"{first_name: \"Miss Keren\", last_name: \"Fisher\", email: \"billy.gulgowski@gmail.com\"}";
	Response responseSignup = RestAssured.given().contentType("application/json") 
			.body(payload).when().post("/users");
		assertEquals(responseSignup.statusCode(),404);
		System.out.println(responseSignup.body().asPrettyString());
		
	}
	@Test
	public void name() {
		  Faker faker = new Faker();
		  System.out.println(faker.name().name());
	}
	@Test
	public void phonenumber() {
		  Faker faker = new Faker();
		  System.out.println(faker.phoneNumber().phoneNumber());
	}
	@Test
	public void email() {
		  Faker faker = new Faker();
		  System.out.println(faker.internet().emailAddress());
	}
	
}
	
