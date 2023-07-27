package utils;

import org.bouncycastle.crypto.tls.SSL3Mac;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DriverUtils {

	
	public static void selectByVisibleText(WebElement ele , String text) {
		
		Select s = new Select(ele);
		s.selectByVisibleText(text);
		s.selectByIndex(0);


	}
	
	public static void selectByValue(WebElement ele , String value) {
		
		Select s = new Select (ele);
		s.selectByValue(value);
		
	}
	
	public static void selectByIndex(WebElement ele, int index) {
		
		Select s = new Select(ele);
		s.selectByIndex(index);
		
	}
	
	public static void clickElement(WebElement ele)	{
		
		ele.click();
	}
	
	

}
