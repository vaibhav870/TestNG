package ui;

import org.testng.Assert;
import org.testng.annotations.Test;

import common.BaseTest;
import common.Retry;

public class ListenerDemoTest extends BaseTest {

	@Test()
	public void launchTest() {
		driver.get("https://www.ebay.com");
		Assert.assertTrue(false);
	}
	
}
 