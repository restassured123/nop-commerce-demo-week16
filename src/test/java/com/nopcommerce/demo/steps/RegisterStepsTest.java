package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepsTest {
    @Given("User is on home page")
    public void userIsOnHomePage() {

    }

    @When("User click on register link")
    public void userClickOnRegisterLink() {
        new HomePage().clickOnRegister();
    }

    @Then("I should navigate to Register page successfully and verify text Register")
    public void iShouldNavigateToRegisterPageSuccessfullyAndVerifyTextRegister() {
        new RegisterPage().getRegisterText();
    }

    @And("User click on register button without entering mandatory details")
    public void userClickOnRegisterButtonWithoutEnteringMandatoryDetails() {
        new RegisterPage().clickOnRegister();
    }

    @Then("User should get the error message")
    public void userShouldGetTheErrorMessage() {
       new RegisterPage().getErrorFNameText();
       new RegisterPage().getErrorLNameText();
       new RegisterPage().getEmailErrorText();
       new RegisterPage().getErrorPasswordText();
       new RegisterPage().getConfirmPasswordText();
    }

    @And("User select gender {string}")
    public void userSelectGender(String gender) {
        new RegisterPage().selectGender(gender);
    }

    @And("User enter first name {string}")
    public void userEnterFirstName(String firstName) {
        new RegisterPage().setFirstNameField(firstName);

    }

    @And("User enter last name {string}")
    public void userEnterLastName(String lastName) {
        new RegisterPage().setLastNameField(lastName);
    }

    @And("User select date of birth {string},{string},{string}")
    public void userSelectDateOfBirth(String date, String month, String year) {
        new RegisterPage().selectDateOfBirth(date, month, year);
    }

    @And("User enter email {string}")
    public void userEnterEmail(String email) {
        new RegisterPage().enterEmail(email);
    }

    @And("User enter password {string}")
    public void userEnterPassword(String password) {
        new RegisterPage().enterPassword(password);
    }

    @And("User enter confirm password {string}")
    public void userEnterConfirmPassword(String confirmPassword) {
        new RegisterPage().enterConfirmPassword(confirmPassword);
    }

    @And("User click on register button")
    public void userClickOnRegisterButton() {
        new RegisterPage().clickOnRegister();
    }


    @Then("Then user receives message {string}")
    public void thenUserReceivesMessage(String arg0) {
        new RegisterPage().getRegistrationCompletedMsg();
    }
}
