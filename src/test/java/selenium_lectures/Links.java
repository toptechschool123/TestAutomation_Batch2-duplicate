package selenium_lectures;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testenvironment.toptechschool.us/");

		List<WebElement> all_links = driver.findElements(By.tagName("a"));
		System.out.println(all_links.size()); //372
		
		for(int i = 0; i<all_links.size(); i++) {
			System.out.println(all_links.get(i).getAttribute("href"));
		}
		
		
		driver.close();
	}

}
