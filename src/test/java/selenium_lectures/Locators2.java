package selenium_lectures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		
		//WebDriver driver = new ChromeDriver();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://testenvironment.toptechschool.us/");
		
		driver.manage().window().maximize();
		
		System.out.print(driver.getTitle());
		WebElement MyAccount = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]"));
		MyAccount.click();
		System.out.print(driver.getTitle());
		
		
		WebElement login = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a"));
		login.click();
		
		
		WebElement email =driver.findElement(By.id("input-email"));
		email.sendKeys("sadatsayedibrahim@gmail.com");
		
		
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("test123");
		
		WebElement loginBttn =driver.findElement(By.id("signinbtn"));
		loginBttn.click();
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		
		WebElement items = driver.findElement(By.xpath("//*[@id=\"cart-total\"]"));
		items.click();
		
	
		
		
	
		System.out.println(driver.getTitle());
		//driver.close();
	}

}
