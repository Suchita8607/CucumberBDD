package com.visionit.automation.stepdefs;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class loginstepDefination {

	WebDriver driver;

@Given("user is already on Login Page")
public void user_is_already_on_login_page() {
	
	System.setProperty("webdriver.chrome.driver"," C:/Users/Dilip/eclipse-workspace/CucumberBDD/chromedriver.exe");
driver  = new ChromeDriver();

driver.get("https://www.freecrm.com/index.html");
	
}

@When("title of login page is Free CRM")
public void title_of_login_page_is_free_crm() {
	String title = driver.getTitle();
 System.out.println(title);
	 Assert.assertEquals("#1 Free CRM for Any Business: Online Customer Relationship Software", title);
 } 


@Then("user enters {string} and {string}")
public void user_enters_and(String username, String password) {
   
 driver.findElement(By.name("email")).sendKeys(username);
 driver.findElement(By.name("password")).sendKeys(password);

}

@Then("user clicks on login button")
public void user_clicks_on_login_button() {
	
	WebElement loginBtn =driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));  
	JavascriptExecutor js = (JavascriptExecutor)driver;
 js.executeScript("arguments[0].click();", loginBtn);

}


@Then("user is on home page")
public void user_is_on_home_page() {
	String title = driver.getTitle();
 System.out.println("Home Page title ::"+ title);
 Assert.assertEquals("CRMPRO", title);  
}

@Then("Close the browser")
public void close_the_browser() {
	 driver.quit();
}
	
}
