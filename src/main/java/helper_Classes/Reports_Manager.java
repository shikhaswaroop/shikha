package helper_Classes;

import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class Reports_Manager {

	public static ExtentReports extent;

	public static ExtentReports getReportObject(){
		
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		
		
		
		extent  = new ExtentReports();
		
		
		
		return extent;
		
	}
}
