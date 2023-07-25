Feature: Login Test
  As user I want to login into nop commerce website
  @regression
  Scenario: User should login successfully with valid credentials
    Given I am on homepage
    When I click on login button
    And I enter email "prime123@gmail.com"
    And I enter password "prime123"
    And I click on the login button
    Then I should be able to see Logout link displayed

  @regression
  Scenario: User should see error message with invalid credentials
    Given I am on homepage
    When I click on login button
    And I enter email "prime123@gmail.com"
    And I enter password "prime1"
    And I click on the login button
    Then I should be able to see error message
