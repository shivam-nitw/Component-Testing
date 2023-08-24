package chaining;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.ITestContext;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class GetUser {
	@SuppressWarnings("unchecked")
	@Parameters({"appBaseURI","token"})
	
	@Test
	public void getTestDigestAuth(String appURI,String bearertoken,ITestContext context) {
		//int id = (int) context.getAttribute("user_id");
	 baseURI = appURI;
	 //String bearertoken = "bc31eb35d10c69e889894c3559cd70bcd0e610325b4d8d11f490e861dfa042a2";
	 given()
	   .contentType("application/json")
	   .headers("Authorization","Bearer "+bearertoken)
	   .pathParam("id",4691581)
	 .when()
	   .get("/public/v2/users/4691098")
	 .then()
	 .statusCode(200)
	 .log().all();

}


}
