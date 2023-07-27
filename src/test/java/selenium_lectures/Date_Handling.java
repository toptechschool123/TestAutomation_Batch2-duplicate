package selenium_lectures;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.JavaScriptExecutor;

public class Date_Handling extends JavaScriptExecutor {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ksrtc.in/oprs-web/");
		
		
		WebElement dateDeparture =driver.findElement(By.xpath("//input[@id='txtJourneyDate']"));
		
		WebElement dateReturn =driver.findElement(By.xpath("//input[@id='txtReturnJourneyDate']"));
		
		
		WebElement searchBus = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block btn-booking']"));
		
		String deptDate = "7/23/2023";
		String retDate = "8/27/2023";
		
		//dateDeparture.sendKeys(deptDate);
		//dateReturn.sendKeys(retDate);
		
		JavaScriptExecutor.selectCalendarDateWithJS(driver, deptDate, dateDeparture);
		JavaScriptExecutor.selectCalendarDateWithJS(driver, retDate, dateReturn);
		
		
		JavaScriptExecutor.clickElementWithJS(searchBus, driver);
		
		
		//searchBus.click();
		
		
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("arguments[0].click();", searchBus);
		 
		//dateDeparture.click();
		  
		  driver.switchTo().alert().accept();
		  JavaScriptExecutor.getTitle(driver);
		  
	}

}
