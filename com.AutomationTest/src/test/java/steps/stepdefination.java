package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.GOOGLESEARH;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class stepdefination {
	private static	WebDriver driver = null;
	
	
	@Given("^the user enters in with username$")
	public void the_user_enters_in_with_username() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C://Users//abhishek.bakshi//git//auto//com.AutomationTest//drivers//Chrome//chromedriver.exe");
		driver = new ChromeDriver();   
		
	}

	@When("^the user enter in with password$")
	public void the_user_enter_in_with_password() throws Throwable {
		driver.get("https://www.google.com");
	}
	   
	

	@Then("^the user click on submit button$")
	public void the_user_click_on_submit_button() throws Throwable {
		GOOGLESEARH.textbox_search(driver).sendKeys("automation test1234");
	  
	}

	@Given("^the user is on Location Page$")
	public void the_user_is_on_Location_Page() throws Throwable {
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	    
}}
