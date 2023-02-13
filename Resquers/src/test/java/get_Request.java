import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class get_Request
{
@Test
public void get_request1()
{
    RestAssured res =new RestAssured();
     Response response=res.get("https://reqres.in/api/users?page=2");
   // System.out.println(response.getStatusCode());
    //System.out.println(response.getStatusLine());
   // System.out.println(response.getSessionId());
   // System.out.println(response.getTime());
    //System.out.println(response.getContentType());
   // System.out.println(response.getBody().asString());
   // System.out.println(response.getHeader("content-type"));
    //System.out.println(response.asString());
    int statuscode =response.getStatusCode();
    Assert.assertEquals(200, statuscode);



   
}
}