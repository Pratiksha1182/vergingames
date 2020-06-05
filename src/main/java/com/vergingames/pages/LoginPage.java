package com.vergingames.pages;

import com.vergingames.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By recaptcha = By.className("recaptcha-checkbox-border");
    By usernameOrEmailField = By.id("field-username");
    By passwordField = By.id("field-password");
    By loginButton = By.xpath("//span[contains(text(),'Login')]");
    By errorMessage = By.className("//span[contains(text(),'Login')]");

    //public void clickOnRecaptcha(){clickOnElement(recaptcha);}
    public void enterUserNameOrEmail(String username){sendTextToElement(usernameOrEmailField,username);}
    public void enterPassword(String password){sendTextToElement(passwordField, password);}
    public void clickOnLoginButton(){clickOnElement(loginButton);}
    public String getErrorMessage(){return getTextFromElement(errorMessage);}

}
