package auths;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class APIKeyAuth {

	
	@Test
	public void getBearerToken() {
		
	 baseURI = "https://api.openweathermap.org";
	 String aPIKeytoken = "67359ac3eaa5da1a5af53c5012a07a8a";
	 given()
	 .accept("application/json")
	 .contentType(ContentType.JSON)
	 .queryParam("lat","44.34")
	 .queryParam("lon","10.99")
	 .queryParam("cnt","2")
	 .queryParam("appid",aPIKeytoken)
	 .when()
	 .get("/data/2.5/forecast/daily")
	 .then()
	 .statusCode(200)
	 .log().all();
}
}
