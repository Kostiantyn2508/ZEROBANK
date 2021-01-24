package com.bitrix.step_definitions;

import com.bitrix.pages.AccountSummaryPage;
import com.bitrix.utilities.ConfigurationReader;
import com.bitrix.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AccountStepdefs {

    AccountSummaryPage accountSummaryPage = new AccountSummaryPage();

    @Given("Account summary page")
    public void account_summary_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("zero_url"));

    }


    @Then("Account summary page should have account types:")
    public void account_summary_page_should_have_account_types(List<String> accTypes) {
        for (WebElement e: accountSummaryPage.accountTypes) {
            Assert.assertTrue(accTypes.contains(e.getText()));
        }
    }



    @Then("Credit Accounts table must have columns")
    public void credit_accounts_table_must_have_columns(List<String>CrA) {
        for (WebElement e: accountSummaryPage.CrAccounts) {
            Assert.assertTrue(CrA.contains(e.getText()));


    }





}}
