package ui;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TitleTest extends ComonSetup {

	
	@Test
	public void verifyTitleTest() {
		
		String actualTitle="Google";
		String recivedTitle=null;
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		recivedTitle=driver.getTitle();
		driver.close(); 
		Assert.assertEquals(actualTitle, recivedTitle);
		}
}
