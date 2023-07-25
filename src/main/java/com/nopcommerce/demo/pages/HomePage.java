package com.nopcommerce.demo.pages;


import com.nopcommerce.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    @FindBy(xpath = "//a[@class='ico-login']")
    WebElement loginLink;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Register']")
    WebElement registerLink;
    @CacheLookup
    @FindBy(xpath = "//img[@alt='nopCommerce demo store']")
    WebElement nopcommerceLogo;
    @CacheLookup
    @FindBy(xpath = "//a[@class='ico-account']")
    WebElement myAccountLink;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log out']")
    WebElement logOutLink;

    @CacheLookup
    @FindBy(xpath = ("(//a[normalize-space()='Computers'])[1]"))
    WebElement computerLink;

    public void clickTopMenuElement(String menu) {


        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='" + menu + "']"));
    }

    public void clickOnLogIn() {


        clickOnElement(loginLink);
    }

    public void clickOnRegister() {
        log.info("Click on Register" + registerLink.toString());
        clickOnElement(registerLink);
    }

    public void clickOnComputerLink(){
        clickOnElement(computerLink);
    }

    public void clickOnMyAccountLink() {
        log.info("Click on My account" + myAccountLink.toString());
        clickOnElement(myAccountLink);
    }

    public void clickOnLogOut() {
        log.info("Click on Logout" + logOutLink.toString());
        clickOnElement(logOutLink);
    }

    public boolean logoutLinkDisplayed() {
        log.info("Verify logout link element" + logOutLink.toString());
        return logOutLink.isDisplayed();
    }

    public boolean loginLinkDisplayed() throws InterruptedException {
        Thread.sleep(1000);
        return loginLink.isDisplayed();
    }
}
