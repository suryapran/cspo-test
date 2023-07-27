package com.fdmgroup.homepage.pages;

import com.fdmgroup.utilities.BrowserUtilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BrowserUtilities {

    @FindBy(name = "username")
    private WebElement txtUsername;

    @FindBy(name = "password")
    private WebElement txtPassword;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnLogin;

    @FindBy(xpath = "//*[@class=\"forgotPasswordModal\"]")
    private WebElement lnkResetpassword;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public void setUsernameInput(String username) {
        txtUsername.clear();
        txtUsername.sendKeys(username);
    }

    public void setPasswordInput(String password) {
        txtPassword.clear();
        txtPassword.sendKeys(password);
    }

    public void clickLoginButton() {
        btnLogin.click();
    }
    public void clickResetpasswordLink() {
    	lnkResetpassword.click();
    }
}
