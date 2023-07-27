package selenium_lectures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClass {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
	
		
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
		
		Thread.sleep(3000);
		WebElement cameras =driver.findElement(By.xpath("//a[text()='Cameras']"));
		WebElement sonyItem = driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/div/div/ul/li[4]/a"));

		Actions act = new Actions(driver);
		
		
		Thread.sleep(3000);
		act.moveToElement(cameras).build().perform();
		Thread.sleep(3000);
		act.moveToElement(sonyItem).click().build().perform();
		Thread.sleep(3000);
		
		WebElement addToCart =driver.findElement(By.xpath("//*[@id=\"shopdata\"]/div[3]/div/div[2]/div[2]/button[1]/span"));
		addToCart.click();
		
		Thread.sleep(3000);
		WebElement myAccount2= driver.findElement(By.xpath("(//a[text()='My Account'])[2]"));
		myAccount2.click(); 
		
		Thread.sleep(3000);
		WebElement logout = driver.findElement(By.xpath("//a[text()='logout']"));
		logout.click();
		
		

	}

}
