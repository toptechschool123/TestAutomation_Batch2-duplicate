package utils;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshots {
	
	
	
	public static void screenshots(WebDriver driver) throws IOException {
		

		Date currentDate = new Date();
		String screenshotFileName =currentDate.toString().replace(" ", "-").replace(":", "-");
		
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile,new File(".//screenshots//" +screenshotFileName + ".png"));
       
        
		// takesScreenshot  interface 
		// getScreenshotAs
		
		
		
	}

}
