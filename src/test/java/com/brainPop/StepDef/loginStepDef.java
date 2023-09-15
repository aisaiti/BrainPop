package com.brainPop.StepDef;

import com.brainPop.Utility.ConfigurationReader;
import com.brainPop.Utility.Driver;
import com.brainPop.page.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginStepDef extends LoginPage{


    @When("user click on the logIn button")
    public void user_click_on_the_log_in_button() {
        Driver.getDriver().get(ConfigurationReader.getProperty("purlBrainPo"));

    }
    @Then("user select {string} dropdown button")
    public void user_select_dropdown_button(String string) {
        SelectLogInButton.click();
        selectButton.click();
    }
    @Then("user enter valid userName")
    public void user_enter_valid_user_name() {
       userName.sendKeys(ConfigurationReader.getProperty("userName"));
    }
    @Then("user enter valid password")
    public void user_enter_valid_password() {
        password.sendKeys(ConfigurationReader.getProperty("PassWord"));
    }
    @Then("user click on logIn button")
    public void user_click_on_log_in_button() {
      loginButton.click();
    }




}
