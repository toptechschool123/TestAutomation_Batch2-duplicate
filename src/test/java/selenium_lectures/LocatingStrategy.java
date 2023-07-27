package selenium_lectures;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatingStrategy {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://testenvironment.toptechschool.us/");

		driver.manage().window().fullscreen();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));

		WebElement MyAccount = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]"));
		MyAccount.click();
		WebElement Login = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a"));
		Login.click();

		WebElement enterEmail = driver.findElement(By.id("input-email"));
		enterEmail.sendKeys("sadatsayedibrahim@gmail.com");
		//input-password
		WebElement enterPass = driver.findElement(By.id("input-password"));
		enterPass.sendKeys("test123");
		
		WebElement SigninBtt =driver.findElement(By.id("signinbtn"));
		SigninBtt.click();
		
	// stage 2	
		
		WebElement SearchBar = driver.findElement(By.name("search"));
		SearchBar.sendKeys("camera");
		
		
		WebElement clickSearchBar =driver.findElement(By.xpath("//*[@id=\"search\"]/div/span/button"));
		clickSearchBar.click();
		// *[@id="top-links"]/ul/li[2]/a/span[1]

	}

}
