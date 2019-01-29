package com.yourcompany.Pages.locators;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AnotherPageLocators {
    @FindBy(how= How.XPATH,using="//td[text()='  I am some other page content']")
    public static WebElement anotherPage;
}
