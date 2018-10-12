package Testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.GOOGLESEARH;
import Pages.GoogleSearchPageObjects;


public class TestNG_Demo2 {
	private static	WebDriver driver = null;
	@BeforeTest
	public void setupTest() {
	
	
System.setProperty("webdriver.chrome.driver","C://Users//abhishek.bakshi//workspace//com.AutomationTest//drivers//Chrome//chromedriver.exe");
driver = new ChromeDriver();


	}
	@Test
	public void googlesearch(){

driver.get("https://www.google.com");
//driver.findElement(By.name("q")).sendKeys("automation");
GOOGLESEARH.textbox_search(driver).sendKeys("automation test");

//driver.findElement(By.name("btnK")).click();
driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);

	}
	@AfterTest
	public void teardown(){
		driver.close();
	}
	
	
}
