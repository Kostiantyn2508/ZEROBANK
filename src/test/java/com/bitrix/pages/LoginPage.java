package com.bitrix.pages;

import com.bitrix.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id="user_login")
    private WebElement login;


    @FindBy(id="user_password")
    private WebElement password;

    @FindBy(xpath = "//input[@value='Sign in']")
    private WebElement loginButton;



    public void login(){
        String userNameValue = ConfigurationReader.getProperty("username");
        String userPasswordValue = ConfigurationReader.getProperty("password");
        login.sendKeys(userNameValue);
        password.sendKeys(userPasswordValue);
        loginButton.click();

    }

    public void setLogin(String str) {
        this.login = login;
        login.sendKeys(str);
    }

    public void setPassword(String str) {
        this.password = password;
        password.sendKeys(str);
    }

    public void setLoginButton() {
        this.loginButton = loginButton;
        loginButton.click();
    }
}
