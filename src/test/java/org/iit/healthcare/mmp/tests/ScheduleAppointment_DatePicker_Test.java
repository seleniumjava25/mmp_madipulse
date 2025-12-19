package org.iit.healthcare.mmp.tests;

import java.util.HashMap;

import org.iit.healthcare.mmp.BaseClass;
import org.iit.healthcare.mmp.HomePage;
import org.iit.healthcare.mmp.LoginPage;
import org.iit.healthcare.mmp.ScheduleAppointmentPage;
import org.iit.healthcare.mmp.ScreenshotUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

public class ScheduleAppointment_DatePicker_Test extends BaseClass {

	//static attribute values getDomAttribute  - id attribute
	//dynamic attribute values getDomProperty -value attribute
	

	@Test
	public void testScheduleAppointment() throws Exception {
 
		ExtentTest test = extent.createTest("testScheduleAppointment");
		
		
		LoginPage lp = new LoginPage(driver,test);
		String username = prop.getProperty("patientusername");
		String password = prop.getProperty("patientpassword");
		lp.login(username, password);
		test.info("Login to the application with username: " + username + " and password: " + password);
		ScreenshotUtil screenshotUtil = new ScreenshotUtil();
		String screenshotPath = screenshotUtil.captureScreenshot("PatientLogin", driver);
		test.addScreenCaptureFromPath(screenshotPath, "Patient Login Screenshot");
		
		HomePage hp = new HomePage(driver);
		hp.navigateToAModule("Schedule Appointment");
		test.info("Navigated to Schedule Appointment module");

		ScheduleAppointmentPage scheduleAppointmentPage = new ScheduleAppointmentPage(driver);
		HashMap<String,String> expectedHMap= (HashMap<String, String>) scheduleAppointmentPage.bookAppointment();//select date,time,
		test.info("Booked appointment with details: " + expectedHMap);
		HashMap<String,String> actualHMap= (HashMap<String, String>) hp.fetchPatientPortalTable();  //
		System.out.println("Expected HashMap: " + expectedHMap);
		test.info("Expected Appointment Details: " + expectedHMap);
		System.out.println("Actual HashMap: " + actualHMap);
		test.info("Actual Appointment Details from Patient Portal: " + actualHMap);
		Assert.assertEquals(actualHMap.get("doctor"), expectedHMap.get("doctor"));


	}
	@Test
	public void testScheduleAppointment1() {
 
		ExtentTest test = extent.createTest("testScheduleAppointment1");
		LoginPage lp = new LoginPage(driver,test);
		String username = "iitworkforce";
		String password = "IITWorkforce1!";
		lp.login(username, password);

		HomePage hp = new HomePage(driver);
		hp.navigateToAModule("Schedule Appointment");

		ScheduleAppointmentPage scheduleAppointmentPage = new ScheduleAppointmentPage(driver);
		HashMap<String,String> expectedHMap= (HashMap<String, String>) scheduleAppointmentPage.bookAppointment();//select date,time,
		HashMap<String,String> actualHMap= (HashMap<String, String>) hp.fetchPatientPortalTable();  //
		System.out.println("Expected HashMap: " + expectedHMap);
		System.out.println("Actual HashMap: " + actualHMap);
		Assert.assertEquals(actualHMap.get("doctor"), expectedHMap.get("doctor"));


	}
}