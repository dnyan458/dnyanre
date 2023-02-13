import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.Header;

	public class Get_test
	{
	
	@Test
	public void  test1()
	{
		given().
		get("https://reqres.in/api/users?page=1").
		then().
		statusCode(200).and().
		log().
		all();
	}
	@Test
	public void test2_get()
	{

		given().
	    header("content-type","application/jason").
		get("https://reqres.in/api/users?page=1").
		then().
		body("data.id[0]",equalTo(1)).
		body("data.first_name",hasItem("Janet")).
		body("data.email",hasItem("george.bluth@reqres.in")).
		statusCode(200).
		log().
		all();
	}
	@Test
	public void test3_post()
	{
		
	Map<String, Object> map = new HashMap<String, Object>();
	map.put("Dnyaneshwer", "chinde");
	map.put("Test", "Engineer");
	JSONObject request =new JSONObject(map);
	request.put("Dnyaneshwer", "chinde");
	request.put("Test", "Engineer");
	System.out.println(request);
	System.out.println(request.toJSONString());
	System.out.println(map);

		given().
	    body(request.toJSONString()).
	    when().
	   post("https://reqres.in/api/users").
	   then().statusCode(201).
	   log().all();
		
	}
	@Test
	public void test4_put()
	{
		JSONObject obj =new JSONObject();
		given().
	    body(obj.toJSONString());
	    when().
	   put("https://reqres.in/api/users/2").
	   then().statusCode(200).
	   log().all();
	
		
	}
	}
	

