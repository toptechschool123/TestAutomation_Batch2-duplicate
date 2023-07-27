package selenium_lectures;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.CaptureScreenshots;

public class RegistrationForm {

	public static void main(String[] args) throws InterruptedException, IOException {


		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
	
		
		driver.get("https://testenvironment.toptechschool.us/");
		
		driver.manage().window().maximize();
		
		WebElement MyAccount = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]"));
		MyAccount.click();
		CaptureScreenshots.screenshots(driver);
		WebElement register =driver.findElement(By.xpath("(//a[text()='Register'])[1]"));
		register.click();
		
		WebElement firstName =driver.findElement(By.id("input-firstname"));
		firstName.sendKeys("Ali");
		WebElement lasttName =driver.findElement(By.id("input-lastname"));
		lasttName.sendKeys("Rahimi");
		Thread.sleep(3000);
		WebElement email =driver.findElement(By.id("input-email"));
		email.sendKeys("ali5@gamil.com");
		
		WebElement phone =driver.findElement(By.id("input-telephone"));
		phone.sendKeys("9999999");
		Thread.sleep(3000);
		CaptureScreenshots.screenshots(driver);
		WebElement country =driver.findElement(By.name("country"));
		country.click();
		
		Select s = new Select(country);
		
		s.selectByVisibleText("Albania");
		Thread.sleep(3000);
		
		WebElement password =driver.findElement(By.id("input-password"));
		password.sendKeys("123456");
		
		WebElement confirmpassword =driver.findElement(By.id("input-confirm"));
		confirmpassword.sendKeys("123456");
		Thread.sleep(3000);
		
		WebElement newsletter =driver.findElement(By.xpath("//input[@name='newsletter' and@value='1']"));
		System.out.println(newsletter.isSelected());
		newsletter.click();
		Thread.sleep(3000);
		
		WebElement checkbox =driver.findElement(By.xpath("//input[@name='agree']"));
		System.out.println(checkbox.isEnabled());
		checkbox.click();
		CaptureScreenshots.screenshots(driver);
		WebElement continueBttn =driver.findElement(By.id("signupbtn"));
		continueBttn.click();
		
		CaptureScreenshots.screenshots(driver);
	}

}
