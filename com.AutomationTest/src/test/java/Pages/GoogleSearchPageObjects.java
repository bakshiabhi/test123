package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class GoogleSearchPageObjects {
	
	WebDriver driver = null;
	
	By testbox_search = By.id("lst-ib");
	By button_search = By.name("btnK");
	
	
	public GoogleSearchPageObjects(WebDriver driver) {
	this.driver = driver;
	}

	
	public void settextinsearch(String text) {
		driver.findElement(testbox_search).sendKeys(text);
	}		
		public void clicksearch() {
			driver.findElement(button_search).sendKeys(Keys.RETURN);
		
		
	}
	

}
