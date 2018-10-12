package SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Testchromeongrid {
	
	
@Test
	public void test1() throws MalformedURLException
	{
	DesiredCapabilities cap = DesiredCapabilities.chrome();
	cap.setPlatform(Platform.WINDOWS);
	
	
	
	
URL url=new URL ("http://localhost:4444/wd/hub");
	WebDriver driver = new RemoteWebDriver(url, cap);
	
	driver.get("https://www.google.com");
	System.out.println("seleniumgrid"+driver.getTitle());
	}

}
