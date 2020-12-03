package com.bitrix.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Instant;

public class BrowserUtils {
    private static WebDriverWait wait=new WebDriverWait(Driver.getDriver(),20);
    public static void wait(int seconds){
        try {
            Thread.sleep(seconds*1000);
        }catch (InterruptedException e){e.printStackTrace();}
    };
    public static void clickOnElement(WebElement saveAndCloseBtn) {

        wait.until(ExpectedConditions.elementToBeClickable(saveAndCloseBtn)).click();
    }
}
