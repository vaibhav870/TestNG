package ui;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {

	@Test(priority=2,description="This is LoginTest")
	public void LoginTest() {
		System.out.println("Login Test is Successful");
	}
	
	@Test(priority=1,description="This is LogoutTest")
	public void LogoutTest() {
		System.out.println("Logout Test is Successful");
	}
	
	
	@BeforeTest
	public void LoginToApplication() {
		System.out.println("Loggin...");
	}
	
	
	@AfterTest
	public void LogoutToApplication() {
		System.out.println("Loggout...");
	}
	
	@BeforeMethod
	public void startTest() {
		System.out.println("Starting Test....");
	}
	
	@AfterMethod
	public void stopTest() {
		System.out.println("Stopping Test...");
	}
	
	
	
}
