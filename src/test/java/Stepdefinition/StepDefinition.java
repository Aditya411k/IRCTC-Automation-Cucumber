package Stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
public class StepDefinition {
 
WebDriver drivers; 
@Given("I open the IRCTC login page")
public void i_open_the_irctc_login_page() {
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.irctc.co.in/nget/profile/login");
    driver.manage().window().maximize();
    //throw new io.cucumber.java.PendingException();
} 

@When("I enter valid username and password")
public void i_enter_valid_username_and_password() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}

@Then("I should be logged in successfully")
public void i_should_be_logged_in_successfully() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
	//driver.quit();
}

}
