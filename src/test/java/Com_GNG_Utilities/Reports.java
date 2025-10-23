package Com_GNG_Utilities;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


import Com_BaseClass.Base_Class;




public class Reports implements ITestListener {	
	public ExtentSparkReporter reporter;

	public ExtentReports extentR;
	public ExtentTest test;

	public void onStart(ITestContext it) {

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
		String timestamp = dateFormat.format(new Date());
		String path = "Groc_User_" + timestamp + ".html";
		String reportPath = "./Groc_user_module_Repo/" + path;
		reporter = new ExtentSparkReporter(reportPath);
		reporter.config().setDocumentTitle("Groc_User_Application Open");
		reporter.config().setTheme(Theme.STANDARD);

		extentR = new ExtentReports();

		extentR.attachReporter(reporter);
		extentR.setSystemInfo("UserName", "NooR");
		extentR.setSystemInfo("HostName", "Local host");
		extentR.setSystemInfo("OS", "Windows10");
		extentR.setSystemInfo("Browser", "Chrome");
		extentR.setSystemInfo("Environment", "Qa");


	}
	public void onTestSuccess(ITestResult tr) {
		test = extentR.createTest(tr.getName());
		test.log(Status.PASS, MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN));
		try {
			Base_Class bClass = new Base_Class();
			bClass.CaptureScreenshot(tr.getName().toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void onTestFailure(ITestResult tr) {
		test = extentR.createTest(tr.getName());
		test.log(Status.FAIL, MarkupHelper.createLabel(tr.getName(), ExtentColor.RED));
	}
	public void onTestSkipped(ITestResult tr) {
		test = extentR.createTest(tr.getName());
		test.log(Status.SKIP, MarkupHelper.createLabel(tr.getName(), ExtentColor.ORANGE));



	}
	public void onFinish(ITestContext con) {
		extentR.flush();

	}

}
