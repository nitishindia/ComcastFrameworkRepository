package Report_Extent;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class SampleReportTest {

	
	@Test
	public void createTest() {
		
		// Spark Report config
		ExtentSparkReporter spark = new ExtentSparkReporter("./AdvanceReport/report.html");
		spark.config().setDocumentTitle("CRM Test Suite Result");
		spark.config().setReportName("CRM Report");
		spark.config().setTheme(Theme.DARK);
		
		// Add Environment & Create test
		ExtentReports report = new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("OS", "Window-10");
		report.setSystemInfo("BROWSER", "CHROME-100");
		ExtentTest test = report.createTest("createTest");
		
		test.log(Status.INFO, "log in app");
		
		
		test.log(Status.INFO, "login to app");
		test.log(Status.INFO, "naviagte to contact app");
		test.log(Status.INFO, "create contact");
		if("HDFC".equals("HDFC")) {
			test.log(Status.PASS, "contact is created");
		}
		else {
			test.log(Status.FAIL, "contact is not created");
		}
		report.flush();
		test.log(Status.INFO, "login to App");
	}
}
