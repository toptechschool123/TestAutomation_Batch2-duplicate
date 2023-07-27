package selenium_lectures;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.CaptureScreenshots;

public class Window_handling2 {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		String url = "https://toptechschool.us/index.php";

		driver.get(url);

		driver.manage().window().maximize();
		CaptureScreenshots.screenshots(driver);
		driver.switchTo().newWindow(WindowType.TAB);
		//driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.navigate().to("https://testenvironment.toptechschool.us/");
		CaptureScreenshots.screenshots(driver);
		driver.navigate().to("https://toptechschool.us/index.php");
		
		/*
		 * Set <String> handles = driver.getWindowHandles();
		 * 
		 * Iterator<String > it = handles.iterator();
		 * 
		 * String parentTab =it.next(); String childTab = it.next();
		 * 
		 * 
		 * driver.switchTo().window(parentTab);
		 */
		//driver.quit();
	}

}
