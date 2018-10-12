	package Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.GoogleSearchPageObjects;
import java.util.concurrent.TimeUnit;


public class GoogleSearchPageTest {

private static WebDriver driver = null;
	
	public static void main(String[] args) {
		
//}
	
	//public static void googleSearchTest() {
		//String projectPath = System.getProperty("user,dir");
	
		//System.setProperty("webdriver.chrome.driver",projectPath+"drivers//Chrome//chromedriver.exe");
		//driver = new ChromeDriver();

		System.setProperty("webdriver.chrome.driver","C://Users//abhishek.bakshi//git//auto//com.AutomationTest//drivers//Chrome//chromedriver.exe");
		driver = new ChromeDriver();


GoogleSearchPageObjects SearchPagesObj = new GoogleSearchPageObjects(driver);

driver.get("https://www.google.com");
SearchPagesObj.settextinsearch("automation is the key");
SearchPagesObj.clicksearch();
SearchPagesObj.clicksearch();







	}
}
