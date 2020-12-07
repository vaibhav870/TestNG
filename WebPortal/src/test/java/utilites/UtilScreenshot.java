package utilites;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import common.BaseTest;

public class UtilScreenshot extends BaseTest {

	public void getScreenshot() throws IOException {
		Date currentDate = new Date();
		String filename = currentDate.toString().replace(" ", "-").replace(":", "-");
		File screenshotfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotfile, new File(".//screenshot/screen" + filename + ".png"));

	}

}
