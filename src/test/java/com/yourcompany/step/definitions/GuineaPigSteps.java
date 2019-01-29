package com.yourcompany.step.definitions;

import com.yourcompany.Pages.Actions.AnotherPageActions;
import com.yourcompany.Pages.Actions.GuineaPigActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class GuineaPigSteps {
    private GuineaPigActions GuineaPigActions = new GuineaPigActions();

    @When("^I click on the link$")
    public void user_click_on_the_link() throws Exception {
        GuineaPigActions.clickFollowLink();
    }

    @Then("^I should be on another page$")
    public void iShouldBeOnAnotherPage() {
        AnotherPageActions.verifyAnotherPage();
    }
}