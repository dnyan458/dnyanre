package TestNGpractice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multiplay 
{
	 @Test
	  @Parameters({"val1","val2"})
	  public void mul(int v1,int v2) 
	  {
		 int finalmul =v1*v2;
		 System.out.println(finalmul);
		  
	  }

}
