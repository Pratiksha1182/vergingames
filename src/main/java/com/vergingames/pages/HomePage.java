package com.vergingames.pages;


import com.vergingames.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
By loginLink = By.xpath("//a[contains(text(),'Login')]");

 public void clickOnLoginLink(){clickOnElement(loginLink);}
}
