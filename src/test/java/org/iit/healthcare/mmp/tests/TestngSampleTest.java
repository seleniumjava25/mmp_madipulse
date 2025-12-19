package org.iit.healthcare.mmp.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngSampleTest {
	
	@BeforeMethod
	public void setup() {
		System.out.println("Setting up before each test method.");
	}
	@BeforeClass	
	public void beforeClassSetup() {
		System.out.println("Setting up before the test class.");
	}
	
	@Test
	public void sampleTest() {
		System.out.println("This is a sample TestNG test.");
	}
	@Test	
	public void anotherTest() {
		System.out.println("This is another TestNG test.");
	}

}
