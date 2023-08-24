package auths;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;


import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class OAuth2 {
	
	@Test
	public void getTestDigestAuth() {
		
	 baseURI = "https://api.github.com";
	 String token = "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";
	 given()
	 .accept("application/json")
	 .contentType(ContentType.JSON)
	 .auth().oauth2(token)
	 .when()
	 .get("/user/repos")
	 .then()
	 .statusCode(200)
	 .log().all();

}

}
