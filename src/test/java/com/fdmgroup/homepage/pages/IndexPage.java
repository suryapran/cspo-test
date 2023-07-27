package com.fdmgroup.homepage.pages;

import com.fdmgroup.utilities.BrowserUtilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage extends BrowserUtilities {
    @FindBy(xpath = ".//h4[@id='welcome_user']")
    private WebElement txtWelcomeUser;
    @FindBy(xpath = ".//div[@id='logo']")
    private WebElement logo;
    @FindBy(linkText = "Ticketing")
    private WebElement btnTicketingSystem;

    //SIDEBAR MENU
    @FindBy()
    private WebElement btnSidebarSpecialTraining;
    @FindBy(xpath = ".//div[contains(@class,'sidebar')]//*[contains(text(),'Ticketing')]")
    private WebElement btnSidebarTicketing;
    @FindBy()
    private WebElement btnSidebarAttendance;

    @FindBy(xpath = ".//div[contains(@class,'sidebar')]//li//*[contains(text(),'Tickets')]")
    private WebElement btnSidebarTickets;
    @FindBy(xpath = ".//div[contains(@class,'sidebar')]//li//*[contains(text(),'Create Ticket')]")
    private WebElement btnSidebarCreateTicket;
    @FindBy(xpath = ".//div[contains(@class,'sidebar')]//li//*[contains(text(),'FAQs')]")
    private WebElement btnSidebarFAQs;

    @FindBy(xpath = "//div[contains(text(), 'Ticketing')]")
    private WebElement btnTicketing;
    
    @FindBy(xpath = "//span[@id='user-type']")
    private WebElement userType;
    @FindBy(xpath = "//img[@alt='Profile-pic']")
    private WebElement imgUser;
    
    @FindBy(xpath = "//div[contains(text(),'Special Training')]")
    private WebElement specilTraning;
    @FindBy(xpath = "//div[contains(text(),'Ticketing')]")
    private WebElement Ticketing;
    @FindBy(xpath = "//div[contains(text(),'Attendance')]")
    private WebElement Attendance;
  
    
    @FindBy(xpath = "//span[contains(text(),'Special Training')]")
    private WebElement specilTraningDropDown;
    @FindBy(xpath = "//span[contains(text(),'Training History')]")
    private WebElement traningHistory;
  
    
    
    @FindBy(xpath = "//button[normalize-space()='Log Out']")
    private WebElement logOut;

    public IndexPage() {
        PageFactory.initElements(driver, this);
    }
    public String getHomePageURL() throws InterruptedException {
        Thread.sleep(2000);
        String url = driver.getCurrentUrl();
        System.out.println("commit to personal branch");
        return url;
    }
    public String getUserType() 
    {  String user=userType.getText();
        return user;
    }
    public void clickTicketing() throws InterruptedException {
    	btnTicketing.click();
    }
    public String verifySpecialTrainingFeatures() 
    { 
    	return specilTraning.getText();
    	
    }
    public String verifyTicketingFeatures() 
    { 
    	
    	return Ticketing.getText();
    	
    }
    public String verifyAttendenceFeatures() 
    { 
    	
    	return Attendance.getText();
    }
    
    public void clickSpecilTraning() 
    {  specilTraningDropDown.click();
    
    }
    
    public void clickTraningHistory() 
    {  traningHistory.click();
    
    }
    
    public void clickLogout() 
    {  imgUser.click();
      logOut.click();
    
    }

    public String getWelcomeUserText() {
        return txtWelcomeUser.getText();
    }

    public void clickLogo() {
        logo.click();
    }

    public void clickOnTicketing() {
        btnTicketing.click();
    }

    public String getTicketingButtonText() {
        return btnTicketing.getText();
    }

    public void clickTicketingButton() {
        btnTicketingSystem.click();
    }

    public void clickButtonSidebarTicketing() {
        btnSidebarTicketing.click();
    }

    public void clickButtonSidebarTickets() {
        btnSidebarTickets.click();
    }

    public void clickButtonSidebarCreateTicket() {
        btnSidebarCreateTicket.click();
    }

    public void clickButtonSidebarFAQs() {
        btnSidebarFAQs.click();
    }

    public Boolean isTicketsSidebarVisible() {
        return btnSidebarTickets.isDisplayed();
    }

    public Boolean isFAQsSidebarVisible() {
        return btnSidebarFAQs.isDisplayed();
    }

    public Boolean isCreateTicketSidebarVisible() {
        return btnSidebarCreateTicket.isDisplayed();
    }
}
