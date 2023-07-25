@regression
Feature: ComputerPage Test

  As a user I want to verify ComputerPage functionality of Nop-Commerce website

  @sanity
  Scenario: Verify User Should Navigate to Computer Page Successfully.
    Given I am on home page
    When I Click on Computer tab
    Then I verify text "Computers"

  @sanity
  Scenario: Verify User Should Navigate To Desktops Page Successfully.
    Given I am on home page
    When I Click on Computer tab
    And I Click on Desktops link


  @smoke
  Scenario Outline: Verify That User Should Build Own Computer And Add Them To Cart Successfully.
    Given I am on home page
    When I Click on Computer tab
    And I Click on Desktops link
    And I Click on product name "Build your own computer"
    And I Select processor "<Processor>"
    And I Select RAM "<RAM>"
    And I Select HDD "<HDD>"
    And I Select OS "<os>"
    And I Select Software "<software>"
    And I Click on add to cart "ADD TO CART"
    Then I Verify product added message "The product has been added to your shopping cart"

    Examples:
      | Processor                                       | RAM           | HDD               | os                      | software                   |
      | 2.2 GHz Intel Pentium Dual-Core E2200           | 2 GB          | 320 GB            | Vista Home [+$50.00]    | Microsoft Office [+$50.00] |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Vista Premium [+$60.00] | Acrobat Reader [+$10.00]   |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB            | Vista Home [+$50.00]    | Total Commander [+$5.00]   |