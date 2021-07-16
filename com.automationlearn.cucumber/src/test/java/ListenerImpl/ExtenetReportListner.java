package ListenerImpl;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtenetReportListner {
	public static ExtentHtmlReporter report =null;
	public static ExtentReports extent =null;
	public static ExtentTest test =null;		

	public static ExtentReports setUp() {
	
		String reportLocation = "./Reports/Extent_Report4.html";
		report=new ExtentHtmlReporter(reportLocation);
		report.config().setDocumentTitle("Automation Test Report");
		report.config().setReportName("Account Creation in Demo site");
		report.config().setTheme(Theme.STANDARD);
		System.out.println("Extent Report location Initialized");
		report.start();
		extent = new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("Application", "Automation practice site");
		extent.setSystemInfo("Operating System ", System.getProperty("os.name"));
		extent.setSystemInfo("User Name ", System.getProperty("user.name"));
		return extent;
	}
	public static void testStepHandle(String teststatus,WebDriver driver,ExtentTest extenttest,Throwable  throwable) {
			
		if (teststatus.equalsIgnoreCase("FAIL"))
		{
			extenttest.fail(MarkupHelper.createLabel("Test case is Failed ;",
			 ExtentColor.RED));
			extenttest.error(throwable.fillInStackTrace());
			extent.flush();
			driver.close();
			Assert.fail(throwable.getMessage());
			 if (driver != null) 
			 { driver.quit(); 
			 }
					 
		}
		else if(teststatus.equalsIgnoreCase("PASS")) 
		{
			extenttest.pass(MarkupHelper.createLabel("Test Case is Passed :", ExtentColor.GREEN));
		 
		}
	}
}
