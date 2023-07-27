package selenium_lectures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {

// webdriver manager is used to manage....
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
		
		
		WebElement email =driver.findElement(By.xpath("//input[@id=\"input-email\"]"));
		email.sendKeys("sadatsayedibrahim@gmail.com");
		
		//WebElement email = driver.findElement(By.cssSelector("input[name='email'"));
		
		
		WebElement password = driver.findElement(By.xpath("(//input[@class='form-control'])[2]  "));
		password.sendKeys("test123");
		
		WebElement loginBttn =driver.findElement(By.xpath("//input[@id='signinbtn']"));
		loginBttn.click();
		
		
		
		
	}

}
