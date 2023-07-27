package com.fdmgroup.homepage.ticketingsystem.pages;

import com.fdmgroup.utilities.BrowserUtilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaqPage extends BrowserUtilities {

    @FindBy(xpath = ".//h2[contains(text(),'FAQS')]")
    private WebElement txtPageTitle;

    @FindBy(linkText = "See more")
    private WebElement btnSeeMore;

    @FindBy(xpath = ".//p[contains(text(),'faq works')]")
    private WebElement txtFAQSeeMoreTitle;

    @FindBy(linkText = "Create Ticket")
    private WebElement btnCreateTicket;

    public FaqPage() {
        PageFactory.initElements(driver, this);
    }

    public String getPageTitle() {
        return txtPageTitle.getText();
    }

    public void clickSeeMore() {
        btnSeeMore.click();
    }
    public String getFaqSeeMoreTitleText(){
        return txtPageTitle.getText();
    }
    public void clickCreateTicket(){
        btnCreateTicket.click();
    }
}
