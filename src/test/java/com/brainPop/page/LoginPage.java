package com.brainPop.page;

import com.brainPop.Utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    };

@FindBy(xpath ="//button[@class=\"btn dropdown-toggle btn-default\"]")
    public WebElement SelectLogInButton;


@FindBy(xpath ="//span[.=\"I'm a grown-up\"]")
public WebElement selectButton;


@FindBy(id = "username")
    public WebElement userName;

@FindBy(id = "password-input")
    public WebElement password;

@FindBy(id = "login_button")
public WebElement loginButton;






}
