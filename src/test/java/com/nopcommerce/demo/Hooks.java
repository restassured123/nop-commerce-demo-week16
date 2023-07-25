package com.nopcommerce.demo;

import com.nopcommerce.demo.propertyreader.PropertyReader;
import com.nopcommerce.demo.utilities.Utility;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.By;
import org.testng.Assert;


public class Hooks extends Utility {

    @Before
    public void setUp(){
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }
    @After
    public void tearDown(){
        closeBrowser();

    }
    public void verifyTwoStrings(By by, String text){
        String expected =text;
        String actual = getTextFromElement(by);
        Assert.assertEquals(actual,expected);
    }
}
