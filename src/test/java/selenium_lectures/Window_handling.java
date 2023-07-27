package selenium_lectures;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.CaptureScreenshots;

public class Window_handling {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		String url = "https://ksrtc.in/oprs-web/";

		driver.get(url);

		driver.manage().window().maximize();
		
	WebElement searchBttn =	driver.findElement(By.xpath("//button[@type='button' and @class='btn btn-primary btn-lg btn-block btn-booking']"));
	searchBttn.click();
	
	Alert a =driver.switchTo().alert();  // accpet(); dismiss(), getText(); sendkeys();

	System.out.println("it is alert message text : " + a.getText());
	
	a.accept();
	
	WebElement CRM_Bttn = driver.findElement(By.xpath("/html/body/header/div/div/div[2]/div[2]/div/ul/li[3]/a/p"));
	CRM_Bttn.click();
	System.out.println("it is perant window " + driver.getTitle());
	CaptureScreenshots.screenshots(driver);
	Set <String> handles =driver.getWindowHandles();
	
	Iterator <String > it = handles.iterator();
	String parentWindow =it.next();
	String childWindow= it.next();
	// Iterator
	
	driver.switchTo().window(childWindow);
	//WebElement loginBttn =driver.findElement(By.xpath("/html/body/header/div/nav/b[1]/a/b"));
	System.out.println("it is child window "+ driver.getTitle());
	CaptureScreenshots.screenshots(driver);
	driver.findElement(By.xpath("/html/body/header/div/nav/b[1]/a/b")).click();
	driver.findElement(By.id("user_session_email")).sendKeys("sayed@gmail.com");
	driver.findElement(By.id("user_session_password")).sendKeys("123");
	driver.findElement(By.id("user_session_remember_me")).isSelected();
	
	driver.switchTo().window(parentWindow);
	CaptureScreenshots.screenshots(driver);
	
	String handle = driver.getWindowHandle();
	System.out.println(handle);
	
	// selenium version 2, 3, 4, 
	
	driver.switchTo().newWindow(WindowType.TAB);
	
	}

}
