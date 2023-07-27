package selenium_lectures;

import java.io.IOException;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.CaptureScreenshots;

public class LinkText {

	public static void main(String[] args) throws InterruptedException, IOException {

	//	Logger logger = Logger.getLogger("Linktext");
	 //	PropertyConfigurator.configure("Log4j.properties");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		
//	WebElement forgotPassword=	driver.findElement(By.linkText("Forgot password?"));
	WebElement forgotPassword=	driver.findElement(By.partialLinkText("Forgot"));
	forgotPassword.click();
	Thread.sleep(3000);
	CaptureScreenshots.screenshots(driver);
	
	driver.close();

	}

}
