package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports {
	
	public static ExtentReports configureReports() {
		
		ExtentSparkReporter extentSparkReporter=new ExtentSparkReporter("extentReports.html");
		ExtentReports extentReports=new ExtentReports();
		extentReports.attachReporter(extentSparkReporter);
		extentReports.setSystemInfo("TestType","Regression");
		extentReports.setSystemInfo("Application","Naaptol");
		extentReports.setSystemInfo("Author","Trupti");
		return extentReports;
		
	}
	
	

}
