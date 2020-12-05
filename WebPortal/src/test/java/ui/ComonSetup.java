package ui;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class ComonSetup {

	
	@BeforeSuite
	public void dbSetp() {
		System.out.println("Starting Setup");
	}
	
	@AfterSuite
	public void cleanup() {
		System.out.println("Clean Up Completed....");
	}
}
