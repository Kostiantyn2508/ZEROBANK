package com.bitrix.step_definitions;

import com.bitrix.pages.LoginPage;
import com.bitrix.utilities.ConfigurationReader;
import com.bitrix.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepdefs {

    LoginPage loginPage = new LoginPage();

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        // Write code here that turns the phrase above into concrete actions
        Driver.getDriver().get(ConfigurationReader.getProperty("zero_url"));
    }


    @When("User logs in as user with valid credentials")
    public void user_logs_in_as_user_with_valid_credentials() {
        // Write code here that turns the phrase above into concrete actions
        loginPage.login();
    }

    @Then("User should see Account summary page")
    public void user_should_see_account_summary_page() {
        // Write code here that turns the phrase above into concrete actions
        String actualHeader = Driver.getDriver().getTitle();
        String expectedHeader = "Zero - Account Summary";
        Assert.assertTrue(actualHeader.contains(expectedHeader));
        Driver.closeDriver();
    }


    @When("User input wrong username  {string} the login page")
    public void userInputWrongUsernameTheLoginPage(String string) {
        loginPage.setLogin(string);
    }

    @When("User input wrong password {string} in the login page")
    public void userInputWrongPasswordInTheLoginPage(String string) {
        loginPage.setPassword(string);
        loginPage.loginButton.click();
    }


    @Then("User should see error message")
    public void userShouldSeeErrorMessage() throws InterruptedException {

        String actualHeader = loginPage.errorMessage.getText();
        String expectedHeader = "Login and/or password are wrong.";
        Assert.assertTrue(actualHeader.contains(expectedHeader));

    }



}
