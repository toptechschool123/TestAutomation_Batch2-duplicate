package utils;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtil {

	public static WebDriver driver;

	public static void implicitWait() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
	}

	public static void explicitWait(WebElement ele) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}

	public static void fluentWait(WebElement ele) {

		Wait<WebDriver> fwait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);

		fwait.until(ExpectedConditions.elementToBeClickable(ele));
	}
	
	static void selectByVisibleText(WebElement ele, String text) {

		Select select = new Select(ele);
		select.selectByVisibleText(text);

}
}