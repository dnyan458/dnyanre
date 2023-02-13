import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class get_local_Global_DB
{
@Test
public void test1_Get()
{
	given().
   get("http://localhost:3000").
   then().
   statusCode(200).
   log().all();
}
@Test
public void test2_Posttest()
{
//Map<String, Object> map = new HashMap<String, Object>();
//map.put("Dnyaneshwer", "chinde");
//map.put("Test", "Engineer");
JSONObject request =new JSONObject();
request.put("Name","ewer");
request.put("LastName","ajja");
request.put("id",10);
//System.out.println(request);
System.out.println(request.toJSONString());
//System.out.println();

	given().
	contentType(ContentType.JSON).
	accept(ContentType.JSON).
	header("Content-Type","application/json").
  body(request.toJSONString()).
  when().
 post("http://localhost:3000/users").
 then().statusCode(201).
 log().all();
}
@Test
public void test3_get()
{
JSONObject request =new JSONObject();
request.put("Branch","civil enggneering");
request.put("postId",223);
request.put("id",5);
//System.out.println(request);
System.out.println(request.toJSONString());
//System.out.println();

	given().
	contentType(ContentType.JSON).
	accept(ContentType.JSON).
	header("Content-Type","application/json").
  body(request.toJSONString()).
  when().
 post("http://localhost:3000/subject").
 then().statusCode(201).
 log().all();
}
}
