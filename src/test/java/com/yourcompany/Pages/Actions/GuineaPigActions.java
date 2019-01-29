package com.yourcompany.Pages.Actions;


import com.yourcompany.Pages.locators.GuineaPigPage;
import com.yourcompany.utils.SeleniumDriver;

import static org.openqa.selenium.support.PageFactory.initElements;

public class GuineaPigActions {
    private GuineaPigPage GuineaPigPage = new GuineaPigPage();

public GuineaPigActions(){
    initElements(SeleniumDriver.getDriver(), GuineaPigPage);
        }

    public void clickFollowLink() {
        GuineaPigPage.followLink.click();
    }
}

