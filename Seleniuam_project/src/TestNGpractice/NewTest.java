package TestNGpractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

  public class NewTest
  {
  @Test
  public void w() 
  {
	  System.out.println("First method");
  }   
	  @Test
  public void z() 
  {
	 System.out.println("second method");
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("before method execute before each test method");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("after method execute after each test method");
  }

  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("before class execute before first method");
  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("after class execute after last method");
  }

  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("before test execute before test method");
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("after test execute before after all test method");
  }

  @BeforeSuite
  public void beforeSuite() 
  {
	  System.out.println("before suite execute before all method");
  }

  @AfterSuite
  public void afterSuite() 
  {
	  System.out.println("after suite execute after all method");
  }
  
}
