import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class put_local_DB 
{
@Test
public void test2_Posttest()
{
//Map<String, Object> map = new HashMap<String, Object>();
//map.put("Dnyaneshwer", "chinde");
//map.put("Test", "Engineer");
JSONObject request =new JSONObject();
request.put("Name","akshay");
request.put("LastName","kumar");
request.put("id",7);
//System.out.println(request);
System.out.println(request.toJSONString());
//System.out.println();

	given().
	contentType(ContentType.JSON).
	accept(ContentType.JSON).
	header("Content-Type","application/json").
  body(request.toJSONString()).
  when().
 put("http://localhost:3000/users/7").
 then().statusCode(200).
 log().all();
}

}
