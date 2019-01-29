package com.yourcompany.Pages.Actions;

import com.yourcompany.Pages.locators.AnotherPageLocators;
import com.yourcompany.utils.SeleniumDriver;
import org.junit.Assert;

import static org.openqa.selenium.support.PageFactory.initElements;

public class AnotherPageActions {
    private AnotherPageLocators anotherPageLocators = new AnotherPageLocators();
    public AnotherPageActions(){
        initElements(SeleniumDriver.getDriver(),anotherPageLocators);
    }

    public static void verifyAnotherPage(){
        Assert.assertTrue(AnotherPageLocators.anotherPage.isDisplayed());
    }
}

