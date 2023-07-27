package com.fdmgroup.homepage.ticketingsystem.pages;

import com.fdmgroup.utilities.BrowserUtilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.fdmgroup.utilities.BrowserUtilities;


public class TicketDetailsPage extends BrowserUtilities {


    @FindBy(xpath = "//input[@name='feedback']")
    private WebElement txtFeedback;

    @FindBy(tagName = "i")
    private WebElement imgPlus;

    @FindBy(xpath = "//mat-icon[contains(text(),'reply_all')]")
    private WebElement iconArrow;

    @FindBy(xpath = "//span[contains(text(),'Close')]")
    private WebElement butClose;

    @FindBy(xpath = "//button[contains(text(),'Cancel')]")
    private WebElement butCancel;

    @FindBy(xpath = "//label[@for='inputTicketNumber'][@class='col-lg-10']")
    private WebElement txtTicketId;

    @FindBy(xpath = ".//label[@for='ticketStatus']")
    private WebElement txtTicketStatus;

    @FindBy(xpath = "//button[contains(text(),'Resolve')]")
    private WebElement btnResolve;
    @FindBy(xpath = "//button[contains(text(),'Reopen')]")
    private WebElement btnReopen;

    @FindBy(xpath = "//button[contains(text(),'Yes')]")
    private WebElement btnResolveConfirmationYes;

    @FindBy(xpath = "//button[contains(text(),'No')]")
    private WebElement btnResolveConfirmationNo;

    public TicketDetailsPage() {
        PageFactory.initElements(driver, this);

    }

    public Boolean verifyPlusIconsDisplayed() throws InterruptedException {

        return imgPlus.isDisplayed();


    }

    public Boolean verifyArrowIconsDisplayed() throws InterruptedException {

        return iconArrow.isDisplayed();
    }

    public void sendFeedback() throws InterruptedException {
        txtFeedback.sendKeys("issue resolved");
        setExplicitWait(1000);
        imgPlus.click();
        setExplicitWait(1000);
    }

    public void popupWindow() throws InterruptedException {

        iconArrow.click();
        setExplicitWait(1000);
        butClose.click();


    }

    public void cancelTicket() throws InterruptedException {
        setExplicitWait(500);
        butCancel.click();
        setExplicitWait(1000);
    }


    public String getTicketIdText() {
        return txtTicketId.getText();
    }

    public void clickButtonResolve() {
        btnResolve.click();
    }

    public void clickButtonReopen() {
        btnReopen.click();
    }

    public void clickButtonResolveConfirmationYes() {
        btnResolveConfirmationYes.click();
    }

    public void clickButtonResolveConfirmationNo() {
        btnResolveConfirmationNo.click();
    }

    public String getTicketStatus() {
        return txtTicketStatus.getText();
    }

    public Boolean isReopenButtonVisible() {
        return btnReopen.isDisplayed();
    }

    public Boolean isResolveButtonVisible() {
        return btnResolve.isDisplayed();
    }

    public Boolean isConfirmationDialogVisible() {
        return btnResolveConfirmationYes.isDisplayed() || btnResolveConfirmationNo.isDisplayed();
    }
}
