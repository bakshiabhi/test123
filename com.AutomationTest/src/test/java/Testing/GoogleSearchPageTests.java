package Testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.GOOGLESEARH;
import Pages.GoogleSearchPageObjects;


public class GoogleSearchPageTests {
	
private static	WebDriver driver = null;
 public static void main(String[] args) {
 
 //}
	
	// public class googleSearchTest {
	 
System.setProperty("webdriver.chrome.driver","C://Users//abhishek.bakshi//workspace//com.AutomationTest//drivers//Chrome//chromedriver.exe");
driver = new ChromeDriver();


driver.get("https://www.google.com");
//driver.findElement(By.name("q")).sendKeys("automation");
GOOGLESEARH.textbox_search(driver).sendKeys("automation test");

driver.findElement(By.name("btnK")).click();
driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);

	}
	
}
