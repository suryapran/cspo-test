package com.fdmgroup.homepage.ticketingsystem.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fdmgroup.utilities.BrowserUtilities;

public class TicketMenuPage extends BrowserUtilities {

    @FindBy(xpath = "//div[@class = 'navlink-text' and contains(text(), 'Create Ticket')]")
    private WebElement btnCreateTicket;
    @FindBy(linkText = "Tickets")
    private WebElement butTickets;

    public TicketMenuPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnTickets() {
        butTickets.click();
    }

    public void clickCreateTicketButton() {
        btnCreateTicket.click();
    }

}
