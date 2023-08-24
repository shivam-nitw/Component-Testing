package auths;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class DigestAuth {
	@Test
	public void getTestDigestAuth() {
		
	 baseURI = "https://postman-echo.com";
	 given()
	 .auth().digest("postman", "password")
	 .accept("application/json")
	 .contentType(ContentType.JSON)
	 .when()
	 .get("/basic-auth")
	 .then()
	 .statusCode(200)
	 .body("authenticated",equalTo(true))
	 .log().all();

}
}
