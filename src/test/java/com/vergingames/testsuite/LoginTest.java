package com.vergingames.testsuite;


import com.vergingames.pages.HomePage;

import com.vergingames.pages.LoginPage;
import com.vergingames.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

@Test
public void verifyErrorMessageWhenUserLogsInWithInvalidCredential(){
//homePage.clickOnLoginLink();
loginPage.enterUserNameOrEmail("Pratiksha");
loginPage.enterPassword("123456");
loginPage.clickOnLoginButton();
String expectedText = "Please try again, your username/email or password has not been recognised";
String actualText = loginPage.getErrorMessage();
    Assert.assertEquals(expectedText,actualText);
}
}
