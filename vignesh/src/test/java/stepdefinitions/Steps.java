package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class Steps {
	
	public WebDriver driver;
	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		
		driver=new ChromeDriver();
	    
	}

	@When("User opens URL {string}")
	public void user_opens_url(String string) {
		
		driver.get(string);
	   
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String string, String string1) {
		
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.id("input-email")).sendKeys(string);
		driver.findElement(By.id("input-password")).sendKeys(string1);
		
	   
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@SuppressWarnings("deprecation")
	@Then("user navigated to homepage")
	public void user_navigated_to_homepage() {
		
		String ss=driver.getTitle();
		Assert.assertEquals(ss, "My Account");
	    
	}

	@Then("user clicks on logout")
	public void user_clicks_on_logout() {
		
	 driver.findElement(By.xpath("//div[@class='list-group']//a[text()='Logout']")).click();
	    
	}
	
	@When("user enters the {string} and {string}")
	public void user_enters_the_and(String string1, String string2) {
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.id("input-email")).sendKeys(string1);
		driver.findElement(By.id("input-password")).sendKeys(string2);
	   
	}




}
