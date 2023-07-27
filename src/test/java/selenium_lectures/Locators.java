package selenium_lectures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Locators {


	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testenvironment.toptechschool.us/");
		
		driver.manage().window().maximize();
		
		WebElement MyAccount = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]"));
		MyAccount.click();
		
		WebElement Login =driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a"));
		Login.click();
		
		String title0 = driver.getTitle();
		System.out.println(title0);
		
		WebElement email =driver.findElement(By.id("input-email"));
		email.sendKeys("sadatsayedibrahim@gmail.com");
		
		WebElement password =driver.findElement(By.id("input-password"));
		password.sendKeys("test123");
		
		WebElement loginBttn = driver.findElement(By.id("signinbtn"));
		loginBttn.click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		Thread.sleep(3000);
		
		WebElement items = driver.findElement(By.xpath("//button[@type='button' and @class='btn btn-inverse btn-block btn-lg ']"));
		items.click();
		//WebElement logout = driver.findElement(By.xpath("//*[@id=\"column-right\"]/div/a[2]"));
		//logout.click();
		
		String title2 =driver.getTitle();
		System.out.println(title2);
		
		
	}

}
