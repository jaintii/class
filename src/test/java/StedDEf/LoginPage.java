package StedDEf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
WebDriver driver;

@Given("launch the browser")
public void launch_the_browser() {
}
@Given("open the facebook application")
public void open_the_facebook_application() {
driver.get("https://www.facebook.com/");
}

@When("enter the username and password")
public void enter_the_username_and_password() {
 driver.findElement(By.id("email")).sendKeys("ajay")   ;
 driver.findElement(By.id("pass")).sendKeys("siddhu");
}

@When("click the login button")
public void click_the_login_button() {
	driver.findElement(By.name("login")).click();
 
}

@Then("validate the message")
public void validate_the_message() {
	System.out.println("message");
	}

@Then("close the browser")
public void close_the_browser() {
	driver.close();
}




}
