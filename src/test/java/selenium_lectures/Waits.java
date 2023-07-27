package selenium_lectures;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		// types of wait: implicit wait, explicitwait, and fluent wait
		

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://testenvironment.toptechschool.us/");

		
		// implicit wait :Global wait 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		
		driver.manage().window().maximize();

	
		
		WebElement MyAccount = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]"));
		
		
		//explict wait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		 
		wait.until(ExpectedConditions.elementToBeClickable(MyAccount));
		//wait.until(ExpectedConditions.elementToBeSelected(MyAccount));
	
		MyAccount.click();
		
		
		
	

		WebElement login = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a"));
		login.click();

		WebElement email = driver.findElement(By.xpath("//input[@id=\"input-email\"]"));
		email.sendKeys("sadatsayedibrahim@gmail.com");

		// WebElement email = driver.findElement(By.cssSelector("input[name='email'"));

		WebElement password = driver.findElement(By.xpath("(//input[@class='form-control'])[2]  "));
		password.sendKeys("test123");

		WebElement loginBttn = driver.findElement(By.xpath("//input[@id='signinbtn']"));
		loginBttn.click();

		Thread.sleep(3000);

		
		

		WebElement logout = driver.findElement(By.xpath("//*[@id=\"column-right\"]/div/a[2]"));
		
		// fluent wait: 
		Wait<WebDriver> fwait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		
		fwait.until(ExpectedConditions.elementToBeClickable(logout));
		
		logout.click();
		       

	}

}
