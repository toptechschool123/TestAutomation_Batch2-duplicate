package selenium_lectures;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {

	
		public static String username = "admin";
		public static String password = "admin";

		public static void main(String[] args) throws InterruptedException {

			WebDriver driver = new ChromeDriver();

			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();

			https: // the-internet.herokuapp.com/basic_auth

			// or we can make it dynamic instead of hard coding it as follows:
			driver.get("https://" + username + ":" + password + "@the-internet.herokuapp.com/basic_auth");
				
			driver.manage().window().fullscreen();
			

	}

}
