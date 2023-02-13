package TestNGpractice;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;
import org.testng.annotations.Test;

public class Testlistner implements ITestListener,IAnnotationTransformer
{

	@Override
	public void onTestStart(ITestResult result) 
	{
		System.out.println("method started"+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("method passed"+result.getName());

	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		System.out.println("method failure"+result.getName());

	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("method skipped"+result.getName());

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		System.out.println("method failed with certain success percentage"+result.getName());

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) 
	{
		System.out.println("method failedwithtimeout"+result.getName());
		System.out.println("method failed due to timeout"+result.getName());

	}

	@Override
	public void onStart(ITestContext context) 
	{
		System.out.println(" on started method");

	}

	@Override
	public void onFinish(ITestContext context) 
	{
		System.out.println("onfinish method finished");

	}
	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) 
	{
		annotation.setRetryAnalyzer(retryAnaylzer.class);
	}

}
