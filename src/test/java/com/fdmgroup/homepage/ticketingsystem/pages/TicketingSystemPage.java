package com.fdmgroup.homepage.ticketingsystem.pages;

import com.fdmgroup.utilities.BrowserUtilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TicketingSystemPage extends BrowserUtilities {

    @FindBy(linkText = "Tickets")
    private WebElement btnTickets;
    @FindBy(linkText = "FAQs")
    private WebElement btnFAQs;
    @FindBy(linkText = "Create Ticket")
    private WebElement btnCreateTicket;

    @FindBy(xpath = ".//h2[contains(text(),'Ticket Menu')]")
    private WebElement txtPageTitle;

    public TicketingSystemPage(){
        PageFactory.initElements(driver, this);
    }

    public void clickTicketsButton(){
        btnTickets.click();
    }
    public void clickFAQsButton(){
        btnFAQs.click();
    }
    public void clickCreateTicketButton(){
        btnCreateTicket.click();
    }

    public String getTitle() {
        return txtPageTitle.getText();
    }
}
