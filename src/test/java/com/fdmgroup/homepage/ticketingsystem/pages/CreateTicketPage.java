package com.fdmgroup.homepage.ticketingsystem.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fdmgroup.utilities.BrowserUtilities;

public class CreateTicketPage extends BrowserUtilities{

	@FindBy(xpath = "//input[@id = 'inputName' and @placeholder = 'Enter Subject']")
    private WebElement inputEnterSubject;
	
	@FindBy(xpath = "//select[@id = 'inputPriority']")
    private WebElement inputSelectCategory;
	
	@FindBy(xpath = "//textarea[@name = 'description']")
    private WebElement inputDescription;
	
	@FindBy(xpath = "//label[@for = 'nameOfIssue']")
    private WebElement labelTicketSubject;
	
	@FindBy(xpath = "//*[@id = 'ngb-tooltip-0']")
    private WebElement tooltipTicketSubject;
	
	@FindBy(xpath = "//button[contains(@class, 'submitButton')]")
    private WebElement btnSubmit;
	
	public CreateTicketPage() {
        PageFactory.initElements(driver, this);
    }

	public WebElement getInputEnterSubject() {
		return inputEnterSubject;
	}
	
	public WebElement getInputSelectCategory() {
		return inputSelectCategory;
	}
	
	public WebElement getInputDescription() {
		return inputDescription;
	}
	
	public WebElement getLabelTicketSubject() {
		return labelTicketSubject;
	}
	public WebElement getTooltipTicketSubject() {
		return tooltipTicketSubject;
	}
	
	public boolean isSubmitButtonEnabled() {
		return btnSubmit.isEnabled();	
	}

	public void setInputEnterSubject(WebElement inputEnterSubject) {
		this.inputEnterSubject = inputEnterSubject;
	}
	
	public String getLabelTicketSubjectText() {
		return labelTicketSubject.getText();
	}	
	public String getToolTipText() {
		return tooltipTicketSubject.getText();
//		return inputEnterSubject.getAttribute("ngbtooltip");
		
	}
	public boolean isToolTipDisplayed() {
		return (inputEnterSubject.getAttribute("aria-describedby").equals("ngb-tooltip-0"));	
	}
	
	public boolean isToolTipNotDisplayed() {
		return (inputEnterSubject.getAttribute("aria-describedby") == null);	
	}
}
