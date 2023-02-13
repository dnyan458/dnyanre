package TestNGpractice;

import java.util.List;
import java.util.Map;

import org.apache.batik.css.engine.value.css2.SrcManager;
import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.xml.XmlSuite;

public class Reporterlister implements IReporter
{

	@Override
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) 
	{
		for(ISuite suite : suites )
		{
			String Suitename =suite.getName();
			Map<String,ISuiteResult>suiteresults=suite.getResults();
			for(ISuiteResult sr : suiteresults.values())
			{
				ITestContext tc = sr.getTestContext();
				System.out.println("passed tests for suite "+Suitename+" is:"+tc.getPassedTests().getAllResults().size());
				System.out.println("failed tests for suite "+Suitename+" is:"+tc.getFailedTests().getAllResults().size());
				System.out.println("skipped tests for suite "+Suitename+" is:"+tc.getSkippedTests().getAllResults().size());

			}
		}
	}

}
