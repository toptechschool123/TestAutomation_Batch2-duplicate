package selenium_lectures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Uploading_file {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		String url="https://xndev.com/display-image/";
		
		driver.get(url);

		driver.manage().window().maximize();
		
		String filePath = "C://Users//T540p//Desktop//UpdatedBrochure.jpeg";
		
		
		WebElement uploadFile = driver.findElement(By.xpath("//*[@id=\"post-2554\"]/div/input"));
	
		uploadFile.sendKeys(filePath);

	}

}
