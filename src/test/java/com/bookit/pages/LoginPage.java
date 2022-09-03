package com.bookit.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(name = "email")
    public WebElement email;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(xpath = "//button[.='sign in']")
    public WebElement signInBtn;

    public void login(String userEmail, String userPassword){

        email.sendKeys(userEmail);
        password.sendKeys(userPassword);
        signInBtn.click();

    }

}
