import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class delet_localdb 
{
@Test
public void test2_Posttest()
{
	given().
 delete("http://localhost:3000/users/3").
 then().
 statusCode(200).  //(without content get code)
 //then().statusCode(200).
 log().all();
	
	Response response = given().
	get("http://localhost:3000/users/3");
	  int statuscode =response.getStatusCode();
    Assert.assertEquals(statuscode,404);


}

}



