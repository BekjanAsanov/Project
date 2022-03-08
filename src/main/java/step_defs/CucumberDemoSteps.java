package step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberDemoSteps {

    @Given("User is logged to https:\\/\\/www.facebook.com\\/")
    public void user_is_logged_to_https_www_facebook_com() {
        System.out.println("User is on facebook.com");
        
        
    }
    @When("User enter test@test.com to email field")
    public void user_enter_test_test_com_to_email_field() {
        System.out.println("User entered test@test.com to email input field");
        
        
    }
    @When("User should enter Hello1234 in password input field")
    public void user_should_enter_hello1234_in_password_input_field() {
        System.out.println("User entered Hello1234 in password input field");
        
    }
    @When("User should click on Log in button")
    public void user_should_click_on_log_in_button() {
        System.out.println("Clicked log in button");
        
    }
    @Then("User should successfully logged into to the Facebook")
    public void user_should_successfully_logged_into_to_the_facebook() {
        System.out.println("user successfully log in fc");
        
    }



}
