package selenium_lectures;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_And_PopsUp {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	
	//driver.manage().window().fullscreen();
	Thread.sleep(2000);
	
	WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
	WebElement copyBttn= driver.findElement(By.xpath("//span[text()='Copy']"));
	
	Thread.sleep(2000);
	Actions act = new Actions(driver);
	
	act.moveToElement(rightClick).contextClick().build().perform();
	Thread.sleep(2000);
	act.moveToElement(copyBttn).click().build().perform();
	
	Alert a = driver.switchTo().alert();
	// Alert is an interface and has the following methods: getText(); Accept(), Dismiss(), SendKeys();
	System.out.println(a.getText());
	a.accept();
	
	}

}
