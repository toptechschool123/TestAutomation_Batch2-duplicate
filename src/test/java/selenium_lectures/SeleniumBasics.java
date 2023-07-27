package selenium_lectures;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBasics {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// get();
		
		driver.get("https://testenvironment.toptechschool.us/");
		
		driver.manage().window().fullscreen();
		
		//driver.getTitle();
		
		// getTitle();
		System.out.println(driver.getTitle());
		
		
		//getcurrenturl();
		String currentUrl =driver.getCurrentUrl();
		
		System.out.println(currentUrl);
		
		// navigation: 
		
		driver.navigate().to("https://www.google.com");
	
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		driver.close();
// 1000
	}

}
