package TestNGpractice;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Testlistner.class)
public class iTestlistner 
{
int i=0;
@Test
public void testMethod1()
{
	System.out.println("this method will pass and wil invoke the  onTestsucces method of iTestlistner");
	int i=10;
	Assert.assertEquals(i,10);
}
  
@Test(retryAnalyzer =retryAnaylzer.class )
public void testMethod2()
{
	System.out.println("this method will fail and wil invoke the  onTestFailure method of iTestlistner");
	int i=10;
	Assert.assertEquals(i,11);
}
@Test
public void testMethod3()
{
	System.out.println("this method will skip and wil invoke the  onTestskipped method of iTestlistner");
	throw new  SkipException("skipping the test case.");
}
@Test(successPercentage =50,invocationCount = 5 )
public void testMethod4()
{
	i++;
	System.out.println("this method will failed but withn success percentage test method of iTestlistner invocation count:"+i);;
    if(i==1 ||i==2)
    {
    	System.out.println("this will be failed");
    	Assert.assertEquals(i,100);
    }
}
}
