package com.vergingames.utility;


import com.vergingames.basepage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Utility extends BasePage {

    public void clickOnElement(By by) {
        driver.findElement(by).click();
    }


    public void clickOnElement(WebElement element) {
        element.click();
    }


    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    public String getTextFromElement(WebElement element) {
        return element.getText();
    }

    /**
     * This method will send text to element or field
     */
    public void sendTextToElement(By by, String str) {
        driver.findElement(by).sendKeys(str);
    }

    public void sendTextToElement(WebElement element, String str) {
        element.sendKeys(str);

    }

















    /**
     * This method will used to wait web driver until element become clickable
     */
    //public void waitUntilElementToBeClickable(By by, int timeout) {
    // WebDriverWait wait = new WebDriverWait(driver, timeout);
    // until(ExpectedConditions.elementToBeClickable(driver.findElement(by)));
    //}

    /**
     * This method will used to wait web driver until presence of element located by locator

     public void waitUntilPresenceOfElementLocated(By by, int timeout) {
     WebDriverWait wait = new WebDriverWait(driver, timeout);
     wait.until(ExpectedConditions.presenceOfElementLocated(by));
     }

     /**
     * This method will used to wait web driver until visibility of element located by locator
     */
    //public void waitUntilVisibilityOfElementLocated(By by, int timeout) {
    // WebDriverWait wait = new WebDriverWait(driver, timeout);
    // wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    //}

    /**
     * This method will verify that element is displayed
     */
    public boolean verifyThatElementIsDisplayed(By by) {
        WebElement element = driver.findElement(by);
        if (element.isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean verifyThatElementIsDisplayed(WebElement element) {
        if (element.isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * This method will verify that element is displayed
     */
    public boolean verifyThatTextIsDisplayed(By by, String text) {
        WebElement element = driver.findElement(by);
        if (text.equals(element.getText())) {
            return true;
        } else {
            return false;
        }
    }

    public boolean verifyThatTextIsDisplayed(WebElement element, String text) {
        if (text.equals(element.getText())) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * This method will returns list of web elements
     */
    public List<WebElement> webElementList(By by) {
        return driver.findElements(by);
    }

    /**
     * This method will generate random string
     */
    public static String getRandomString(int length) {
        StringBuilder sb = new StringBuilder();
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }
}
