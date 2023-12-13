package com.app.TestPages;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class ITestListeners {
	
Logger log = LogManager.getLogger();

	public void onTestStart(ITestResult result) {

		log.info(result.getMethod().getMethodName() +" Started");
		log.info(result.getMethod().getDescription());	
	}

	public void onTestSuccess(ITestResult result) {

		log.info(result.getMethod().getMethodName() +" Passed");	
	}

	public void onTestFailure(ITestResult result) {
		
		log.info("Failed because of -"+result.getThrowable());
	}

	public void onTestSkipped(ITestResult result) {
		
		log.info("Skipped because of -"+result.getThrowable());
	}

	public void onStart(ITestContext context) {

		log.info("============onStart:- " + context.getName() +"=============================");
	}

	public void onFinish(ITestContext context) {
		
		log.info("============onFinish:- " + context.getName() +"=============================");
	}
}
