package requesttypes;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PutTest {
	@Test
	public void getTestPut() {
		
	 baseURI = "https://reqres.in";
	 JSONObject jo =new JSONObject();
	 jo.put("name", "John Smith");
	 jo.put("job","Tester");
	 System.out.println(jo.toJSONString());
	 given()
	 .accept("application/json")
	 .contentType(ContentType.JSON)
	 .body(jo.toJSONString())
	 .when()
	 .put("/api/users/2")
	 .then()
	 .statusCode(200)
	 .log().all();
	}

}
