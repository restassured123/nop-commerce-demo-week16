package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;

import com.nopcommerce.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Register']")
    WebElement registerTextElement;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement dateOfBirthdayDropdown;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement monthOfBirthdayDropdown;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement yearOfBirthdayDropdown;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstNameField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastNameField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement passwordField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmPassword;
    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;
    @CacheLookup
    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement errorFNameTextElement;
    @CacheLookup
    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement errorLNameTextElement;
    @CacheLookup
    @FindBy(xpath = "//span[@data-valmsg-for='Email']")
    WebElement errorEmailTextElement;
    @CacheLookup
    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement errorPasswordTextElement;
    @CacheLookup
    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement errorConfirmPasswordTextElement;
    @CacheLookup
    @FindBy(xpath = "//div[@class='result']")
    WebElement registrationCompletedMsg;

    public String getRegisterText() {
        log.info("Get register text" + registerTextElement.toString());
        return getTextFromElement(registerTextElement);
    }

    public void selectGender(String gender) {
        log.info("Select gender");
        clickOnElement(By.xpath("//div[@id='gender']/descendant::label[text()='" + gender + "']"));
    }

    public void selectDateOfBirth(String date, String month, String year) {
        log.info("Select date" + dateOfBirthdayDropdown.toString());
        log.info("Select month" + monthOfBirthdayDropdown.toString());
        log.info("Select year" + yearOfBirthdayDropdown.toString());
        selectByVisibleTextFromDropDown(dateOfBirthdayDropdown, date);
        selectByVisibleTextFromDropDown(monthOfBirthdayDropdown, month);
        selectByVisibleTextFromDropDown(yearOfBirthdayDropdown, year);
    }

    public void enterEmail(String email) {
        log.info("Enter email" + emailField.toString());
        sendTextToElement(emailField, email);
    }

    public void setFirstNameField(String firstName) {
        log.info("Enter First name" + firstNameField.toString());
        sendTextToElement(firstNameField, firstName);
    }

    public void setLastNameField(String lastName) {
        sendTextToElement(lastNameField, lastName);
    }

    public void enterPassword(String password) {
        log.info("Enter password" + passwordField.toString());
        sendTextToElement(passwordField, password);
    }

    public void enterConfirmPassword(String cfrmPassword) {
        sendTextToElement(confirmPassword, cfrmPassword);
    }

    public void clickOnRegister() {
        clickOnElement(registerButton);
    }

    public String getErrorFNameText() {
        return getTextFromElement(errorFNameTextElement);
    }

    public String getErrorLNameText() {
        return getTextFromElement(errorLNameTextElement);
    }

    public String getEmailErrorText() {
        return getTextFromElement(errorEmailTextElement);
    }

    public String getErrorPasswordText() {
        return getTextFromElement(errorPasswordTextElement);
    }

    public String getConfirmPasswordText() {
        return getTextFromElement(errorConfirmPasswordTextElement);
    }

    public String getRegistrationCompletedMsg() {
        return getTextFromElement(registrationCompletedMsg);
    }
}
