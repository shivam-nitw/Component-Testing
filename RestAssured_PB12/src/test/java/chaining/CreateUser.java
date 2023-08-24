package chaining;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.restassured.http.ContentType;

public class CreateUser {

	@SuppressWarnings("unchecked")
	@Parameters({"appBaseURI","token"})
	
	@Test
	public void getTestDigestAuth(String appURI,String bearertoken,ITestContext context) {
	 baseURI = appURI;
	 JSONObject jo =new JSONObject();
	 Faker faker = new Faker();
	 jo.put("name", faker.name().fullName());
	 jo.put("gender","male");
	 jo.put("email",faker.internet().emailAddress());
	 jo.put("status","inactive");
	 System.out.println(jo.toJSONString());
	 //String bearertoken = "bc31eb35d10c69e889894c3559cd70bcd0e610325b4d8d11f490e861dfa042a2";
	 int id=given()
	 .accept("application/json")
	 .contentType(ContentType.JSON)
	 .headers("Authorization","Bearer "+bearertoken)
	 .body(jo.toJSONString())
	 .when()
	 .post("/public/v2/users")
	 .then()
	 .statusCode(201)
	 .log()
	 .all()
	 .extract().jsonPath().getInt("id");
	
	 context.setAttribute("user_id", id);


}

}
