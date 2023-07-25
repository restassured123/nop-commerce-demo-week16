Feature: RegisterPageTest


  Scenario: User should navigate to register page successfully
    Given User is on home page
    When User click on register link
    Then I should navigate to Register page successfully and verify text Register

  Scenario: Verify the Firstname, Lastname, Email, Password and Confirm password fields are Mandatory
    Given User is on home page
    When User click on register link
    And User click on register button without entering mandatory details
    Then User should get the error message

  Scenario: User Should create account successfully
    Given User is on home page
    When User click on register link
    And User select gender "Male"
    And User enter first name "prime"
    And User enter last name "testing"
    And User select date of birth "15","April","1985"
    And User enter email "prime123@gmail.com"
    And User enter password "prime123"
    And User enter confirm password "prime123"
    And User click on register button
    Then Then user receives message "Your registration completed"