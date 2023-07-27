package selenium_lectures;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.CaptureScreenshots;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		String url = "https://jqueryui.com/";

		driver.get(url);

		driver.manage().window().maximize();

		WebElement drag = driver.findElement(By.xpath("//a[text()='Draggable']"));
		WebElement drop = driver.findElement(By.xpath("//a[text()='Droppable']"));
		Thread.sleep(3000);
		drop.click();

		WebElement frameElement = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));

		driver.switchTo().frame(frameElement);

		WebElement source = driver.findElement(By.id("draggable"));
		CaptureScreenshots.screenshots(driver);
		WebElement target = driver.findElement(By.id("droppable"));

		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).build().perform();

		driver.switchTo().parentFrame();
		// driver.switchTo().defaultContent();
		WebElement resize = driver.findElement(By.xpath("//a[text()='Resizable']"));
		resize.click();
		Thread.sleep(2000);
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		driver.switchTo().frame(frame2);
		Thread.sleep(3000);
		CaptureScreenshots.screenshots(driver);
		WebElement resizable = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		
		act.dragAndDropBy(resizable, 100, 100).build().perform();

	}

}
