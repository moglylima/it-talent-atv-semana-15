package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.example.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.WebSetUp;

public class LoginPageTestSteps {

    private LoginPage loginPage = new LoginPage(WebSetUp.setUp());

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        loginPage.openPage();
        assertEquals("The Internet", loginPage.getTitle());
        assertEquals("https://the-internet.herokuapp.com/login",
                loginPage.getCurrentUrl());
    }

    @When("I enter a valid username and password")
    public void i_enter_a_valid_username_and_password() {
        loginPage.enterUsername("tomsmith");
        loginPage.enterPassword("SuperSecretPassword!");
    }

    @When("I click the login button")
    public void i_click_the_login_button() {
        loginPage.clickLoginButton();
    }

    @Then("I should be redirected to the secure area")
    public void i_should_be_redirected_to_the_secure_area() {
        assertTrue(loginPage.getCurrentUrl().contains("secure"));
        loginPage.closedPage();
    }

}
