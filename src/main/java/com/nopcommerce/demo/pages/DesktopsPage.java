package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;

import com.nopcommerce.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class DesktopsPage extends Utility {
    private static final Logger log = LogManager.getLogger(DesktopsPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Desktops']")
    WebElement desktopTextElement;
    @CacheLookup
    @FindBy(xpath = "//h2[@class='product-title']//a[normalize-space()='Build your own computer']")
    WebElement buildYourComp;
    @CacheLookup
    @FindBy(xpath = "//select[@id='products-orderby']")
    WebElement sortByElement;
    @CacheLookup
    @FindBy(xpath = "//select[@id='products-pagesize']")
    WebElement displayElement;
    @CacheLookup
    @FindBy(xpath = "//h2[@class = 'product-title']/child::a")
    WebElement productList;

    public String getDesktopText(){
        Reporter.log("Get desktop text" + desktopTextElement.toString());

        return getTextFromElement(desktopTextElement);
    }
    public void setSortByElement(String text){
        Reporter.log("Sort by products per page" + sortByElement.toString());

        selectByVisibleTextFromDropDown(sortByElement, text);
    }
    public void setDisplayElement(String text){
        Reporter.log("Display products per page" + displayElement.toString());

        selectByVisibleTextFromDropDown(displayElement, text);
    }
    public void clickOnBuildYourComp(){
        Reporter.log("Click on build your own computer" + buildYourComp.toString());

        clickOnElement(buildYourComp);
    }
}
