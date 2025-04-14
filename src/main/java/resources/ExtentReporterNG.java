package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;



public class ExtentReporterNG {
public static ExtentReports extent;
	public static ExtentReports getReporterObject()
	{
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
ExtentSparkReporter reporter = new ExtentSparkReporter(path);
reporter.config().setDocumentTitle("Extent report results");
reporter.config().setReportName("TestResults");
extent = new ExtentReports();
extent.attachReporter(reporter);
extent.setSystemInfo("Tester", "Kavita h");
return extent;




	}

}
	