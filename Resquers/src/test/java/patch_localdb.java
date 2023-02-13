import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class patch_localdb
{
 @Test
 public void test_patch()
 {
	//Map<String, Object> map = new HashMap<String, Object>();
	//map.put("Dnyaneshwer", "chinde");
	//map.put("Test", "Engineer");
	JSONObject request =new JSONObject();
	request.put("FirstName","Sunil");
	request.put("LastName","Shetty");
	request.put("CutomerId",7);
	//System.out.println(request);
	System.out.println(request.toJSONString());
	//System.out.println();

		given().
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		header("Content-Type","application/json").
	  body(request.toJSONString()).
	  when().
	 patch("http://localhost:3000/users/7").
	 then().statusCode(200).
	 log().all();
	}

	}



