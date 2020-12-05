package ui;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GroupDemoTest extends ComonSetup {

	@BeforeGroups(value="Main")
	public void beforgrp() {
		System.out.println("before Group of Main");
	}

	@BeforeGroups(value="Second")
	public void beforgrp2() {
		System.out.println("before Group of Second");
	}
	
	
	@Test(priority=2,groups="Main")
	public void LoginTest() {
		System.out.println("Login Test is Successful");
	}
	
	@Test(priority=1,groups="Second")
	public void LogoutTest() {
		System.out.println("Logout Test is Successful");
	}
	
	@Test(groups="Second")
	public void startTest() {
		System.out.println("Starting Test....");
	}
	
	@Test(groups="Main")
	public void stopTest() {
		System.out.println("Stopping Test...");
	}
	
}
