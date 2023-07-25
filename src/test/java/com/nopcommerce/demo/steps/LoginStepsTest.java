package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepsTest {
    @Given("I am on homepage")
    public void iAmOnHomepage() {

    }
    @When("I click on login button")
    public void iClickOnLoginButton() {
        new HomePage().clickOnLogIn();
    }

    @And("I enter email {string}")
    public void iEnterEmail(String email) {
    new LoginPage().enterEmail(email);
    }

    @And("I enter password {string}")
    public void iEnterPassword(String password) {
        new LoginPage().enterPassword(password);
    }
    @And("I click on the login button")
    public void iClickOnTheLoginButton() {
        new LoginPage().clickOnLoginBtn();
    }

    @Then("I should be able to see Logout link displayed")
    public void iShouldBeAbleToSeeLogoutLinkDisplayed() {
        new LoginPage().logOutButtonIsDisplayed();
    }


    @Then("I should be able to see error message")
    public void iShouldBeAbleToSeeErrorMessage() {
        new LoginPage(). getUnsuccessfulErrorMessage();
    }
}
