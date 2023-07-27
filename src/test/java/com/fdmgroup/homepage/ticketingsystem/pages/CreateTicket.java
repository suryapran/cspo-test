package com.fdmgroup.homepage.ticketingsystem.pages;

import com.fdmgroup.utilities.BrowserUtilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateTicket extends BrowserUtilities {

    @FindBy(xpath = ".//h2[contains(text(),'Create Ticket')]")
    private WebElement txtPageTitle;

    public CreateTicket(){
        PageFactory.initElements(driver, this);
    }

    public String getPageTitle(){
        return txtPageTitle.getText();
    }
}
