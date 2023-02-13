import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;

public class Jason_Test_POST 
{
public void test3_post()
{
	
//Map<String, Object> map = new HashMap<String, Object>();
//map.put("Dnyaneshwer", "chinde");
//map.put("Test", "Engineer");
JSONObject request =new JSONObject();
request.put("FirstName", "kulkarni");
request.put("LastName", "Gouri");
request.put("id",3);
System.out.println(request);
System.out.println(request.toJSONString());
//System.out.println();

	given().
    body(request.toJSONString()).
    when().
   post("http://localhost:3000/users").
   then().statusCode(201).
   log().all();

}
}
