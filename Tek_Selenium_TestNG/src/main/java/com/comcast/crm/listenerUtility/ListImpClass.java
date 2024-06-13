package com.comcast.crm.listenerUtility;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.crm.Generic.BaseUtility.BaseClass;

public class ListImpClass implements ITestListener , ISuiteListener{

	
	
	public void onStart(ISuite suite) {
		System.out.println("Report configuration");
	}
	
	
	public void onFinish(ISuite suite) {
		System.out.println("Report backup");
	}
	
	
	public void onTestStart(ITestResult result) {
		System.out.println("========>"+result.getMethod().getMethodName()+"=====stat=====");
	}
	
	
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("========>"+result.getMethod().getMethodName()+"=====end=====");
	}
	
	
	public void onTestFailure(ITestResult result) {
		
			String testName= result.getMethod().getMethodName();
			
			
			String time = new Date().toString().replace(" ", "_").replace(":", "_");
		
		TakesScreenshot ts = (TakesScreenshot)BaseClass.sdriver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File src = new File("./Errorshot/"+testName+"+"+time+".jpg");
		try {
			org.openqa.selenium.io.FileHandler.copy(temp, src);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("========>"+result.getMethod().getMethodName()+"=====skip=====");
	}
	
	
	
	
}
