package ui;

import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SkipTestDemo {

	Boolean setup = false;

	@BeforeClass
	public void setup() {
		System.out.println("Setup Running");
		setup=true;
	}
	
	@AfterClass
	public void complete() {
		System.out.println("Completing all Tests");
		setup=false;
	}
	@Test(enabled = false)
	public void skipTest() {
		System.out.println("Skipping Test as not Enable");
	}

	@Test
	public void skipTest2() {
		System.out.println("Skipping test using Exceptions");
		throw new SkipException("Skip the Test by Exception");
	}

	@Test
	public void skipTest3() {
		System.out.println("Skipping Test using Conditions");

		if (setup == true) {
			System.out.println("Execute this test");
		} else {
			System.out.println("SetUp Not Complete Skipp Test");
			throw new SkipException("skiiping due to setup ");
		}
	}

}
