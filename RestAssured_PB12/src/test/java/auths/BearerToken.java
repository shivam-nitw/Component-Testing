package auths;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class BearerToken {

	@Test
	public void getBearerToken() {
		
	 baseURI = "https://api.github.com";
	 String bearertoken = "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";
	 given()
	 .accept("application/json")
	 .contentType(ContentType.JSON)
	 .headers("Authorization","Bearer "+bearertoken)
	 .when()
	 .get("/user/repos")
	 .then()
	 .statusCode(200)
	 .log().all();

}
	
}
