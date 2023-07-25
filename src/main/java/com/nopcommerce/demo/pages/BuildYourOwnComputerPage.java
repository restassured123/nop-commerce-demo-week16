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

public class BuildYourOwnComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(BuildYourOwnComputerPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Build your own computer']")
    WebElement buildYourOwnComputerTextElement;
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement processorDropDown;
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement ramDropDown;
    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCartButton;
    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement addedToCartMessageElement;

    public String getBuildYourOwnComputerText() {
        log.info("Getting Build you own computer text" + buildYourOwnComputerTextElement.toString());
        return getTextFromElement(buildYourOwnComputerTextElement);
    }

    public void selectProcessor(String processor) {
        log.info("Select Processor" + processorDropDown.toString());
        selectByVisibleTextFromDropDown(processorDropDown, processor);
    }

    public void selectRam(String ram) {
        log.info("Select ram" + ramDropDown.toString());
        selectByVisibleTextFromDropDown(ramDropDown, ram);
    }

    public void selectHDD(String hdd) {
        log.info("Select HDD");
        clickOnElement(By.xpath("//input[@name='product_attribute_3']/following-sibling::label[text()='" + hdd + "']"));
    }

    public void selectOs(String os) {
        log.info("Select OS");
        clickOnElement(By.xpath("//input[@name='product_attribute_4']/following-sibling::label[contains(text(),'" + os + "')]"));
    }

    public void selectSoftware(String software) {
        log.info("Select Software");
        clickOnElement(By.xpath("//input[@name='product_attribute_5']/following-sibling::label[contains(text(),'" + software + "')]"));
    }

    public void clickOnAddToCartButton() {
        log.info("CLick on add to card" + addToCartButton.toString());
        clickOnElement(addToCartButton);
    }

    public String getAddedToCartText() {
        log.info("Get add to cart text" + addedToCartMessageElement.toString());
        return getTextFromElement(addedToCartMessageElement);
    }

}
