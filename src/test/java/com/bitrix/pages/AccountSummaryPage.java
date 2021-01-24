package com.bitrix.pages;

import com.bitrix.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountSummaryPage extends BasePage {


    @FindBy(xpath = "//h2[.='Cash Accounts']")
    private WebElement CashAccounts;

    @FindBy(xpath = "//h2[.='Investment Accounts']")
    private WebElement InvestmentAccounts;

    @FindBy(xpath = "//h2[.='Credit Accounts']")
    public WebElement CreditAccounts;

    @FindBy(xpath = "//h2[.='Loan Accounts']")
    public WebElement LoanAccounts;


    @FindBy(xpath = "//h2[@class='board-header']")
    public List<WebElement> accountTypes;

//    /html/body/div[1]/div[2]/div/div[2]/div/div/div[3]/div/table/thead/tr/th

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div/div/div[3]/div/table/thead/tr/th")
    public List<WebElement> CrAccounts;


}
