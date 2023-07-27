package com.fdmgroup.homepage.ticketingsystem.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.fdmgroup.utilities.BrowserUtilities;

public class HomePage extends BrowserUtilities {

    @FindBy(xpath = "//div[ contains(@class, 'navlink-text') and text()='Ticketing']")
    private WebElement btnTicketing;
    @FindBy(linkText = "Ticketing")
    private WebElement butTicketing;
    @FindBy(xpath = "//span[@id='user-type']")
    private WebElement userType;
    @FindBy(xpath = "//img[@alt='Profile-pic']")
    private WebElement userImg;
    
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
    
  
    
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void clickTicketingButton() {
        setExplicitWait(20);
        btnTicketing.click();
    }
    public String getHomePageURL() throws InterruptedException {
        Thread.sleep(2000);
        String url = driver.getCurrentUrl();
        System.out.println("commit to personal branch");
        return url;
    }

    public void clickTicketing() throws InterruptedException {
        butTicketing.click();
    }
    
    public String getUserType() 
    {  String user=userType.getText();
        return user;
    }
    
    
    public String getThreefeatures() 
    {  String user=userType.getText();
        return user;
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
    {  userImg.click();
      logOut.click();
    
    }
    
}
