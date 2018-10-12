package com.AutomationTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {
	public static void main(String[] args) throws InterruptedException { 
		
		String projectpath = System.getProperty("user.dir");
				System.out.println("projectpath :"+projectpath);
		System.setProperty("webdriver.chrome.driver","C://Users//abhishek.bakshi//workspace//com.AutomationTest//drivers//Chrome//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	//System.setProperty("webdriver.gecko.driver","C://Users//abhishek.bakshi//workspace//com.AutomationTest//drivers//gecko//geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
	
		driver.get("https://www.gmail.com");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		Thread.sleep(3500);
	}

}
