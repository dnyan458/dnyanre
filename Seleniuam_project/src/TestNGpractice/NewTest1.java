package TestNGpractice;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest1 
{
  @Test(priority=1,groups="sanity")
   public void f()
   {
    Reporter.log("This is my first log",true);
  
	  System.out.println("this is my first testNG ");
  }
  @Test(priority=2,groups = "sanity")
  public void s()
  {
  Reporter.log("This is my first log",true);

  
	System.out.println("this is my second program");  
  }
  //@Test(priority=3,groups = "regression")
  @Test(enabled =false,groups = "regression")

  public void failedtest()
  {
	  Assert.assertEquals(false, true);
  }
 // @Test (priority=4,groups = "regression")
  @Test (groups = "regression")

  public void a()
  {
	  System.out.println("dnyaneshwer mahade");
  }
  
}
