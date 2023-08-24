package requesttypes;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PostTest {
	
	@Test
	public void getTestPost() {
		
	 baseURI = "https://reqres.in";
	 JSONObject jo =new JSONObject();
	 jo.put("name", "John");
	 jo.put("job","Developer");
	 System.out.println(jo.toJSONString());
	 given()
	 .accept("application/json")
	 .contentType(ContentType.JSON)
	 .body(jo.toJSONString())
	 .when()
	 .post("/api/users")
	 .then()
	 .statusCode(201)
	 .log().all();
	}
	

}
