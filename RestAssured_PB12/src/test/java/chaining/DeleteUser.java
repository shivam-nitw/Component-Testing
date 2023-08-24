package chaining;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class DeleteUser {
	@SuppressWarnings("unchecked")
	@Parameters({"appBaseURI","token"})
	@Test
	public void getTestDigestAuth(String appURI,String bearertoken) {
		
	baseURI = appURI;
	//String bearertoken = "bc31eb35d10c69e889894c3559cd70bcd0e610325b4d8d11f490e861dfa042a2";
	given()
		 .contentType("application/json")
		 .headers("Authorization","Bearer "+bearertoken)
	 .when()
	 .delete("/public/v2/users/4691581")
	 .then()
	 .statusCode(204)
	 .log().all();
}

}
