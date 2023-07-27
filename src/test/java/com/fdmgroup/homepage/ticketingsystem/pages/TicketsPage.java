package com.fdmgroup.homepage.ticketingsystem.pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.fdmgroup.utilities.BrowserUtilities;
import com.fdmgroup.utilities.BrowserUtilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

import java.util.List;


public class TicketsPage extends BrowserUtilities {

    @FindBy(xpath = "//span[contains(text(),'Ticket Subject')]/following::img")
    private WebElement imgSortTicketSubject;
    
    @FindBy(xpath = "//div[@class='d-flex align-items-center']/span[contains(text(),'Ticket Subject')]/following-sibling::div/ng-multiselect-dropdown")
    private WebElement imgFilterTicketSubject;
    
  

    @FindBy(xpath = "//span[contains(text(),'Category')]/following::img")
    private WebElement imgCategory;

    @FindBy(xpath = "//span[contains(text(),'Priority')]/following::img")
    private WebElement imgPriority;

    @FindBy(xpath = "//span[contains(text(),'Status')]/following::img")
    private WebElement imgStatus;

    @FindBy(xpath = "//tbody/tr[1]/td[2]/a")
    private WebElement linkTicket;

    @FindBy(xpath = "(//div/input)[1]")
    private WebElement txtDateInput;

    @FindBy(xpath = "//button[contains(text(), 'Remove Date Filter')]")
    private WebElement btnRemoveDateFilter;

    @FindBy(xpath = "//tr/td[1]")
    private List<WebElement> txtTicketIds;

    @FindBy(xpath = "//tr/td[5]")
    private List<WebElement> txtTicketDateAndTime;

    @FindBy(xpath = "//tr")
    private List<WebElement> txtTableRows;

    @FindBy(xpath = "//span[contains(text(), 'Date & Time')]")
    private WebElement dateAndTime;

    @FindBy(xpath = "//button[contains(text(),'Filter By Dates')]")
    private WebElement btnFilterByDates;

    @FindBy(xpath = "//a/button[contains(text(),'Create Ticket')]")
    private WebElement btnCreateTicket;

    @FindBy(xpath = "//button[@mattooltip='Click to sort alphabetically']")
    private WebElement btnTicketSubjectSort;

    @FindBy(xpath = "//button[@mattooltip='Click To Sort By Category']")
    private WebElement btnCategorySort;

    @FindBy(xpath = "//th[3]/div/div/ng-multiselect-dropdown")
    private WebElement btnCategoryFilter;

    @FindBy(xpath = "//th[3]//ul/li/*[contains(text(),'Select All')]")
    private WebElement btnSelectAllCategoryFilter;
    @FindBy(xpath = "//ul/li/*[contains(text(),'LMS')]")
    private WebElement btnLMSCategoryFilter;
    @FindBy(xpath = "//ul/li/*[contains(text(),'DMS')]")
    private WebElement btnDMSCategoryFilter;
    @FindBy(xpath = "//ul/li/*[contains(text(),'Payroll')]")
    private WebElement btnPayrollCategoryFilter;
    @FindBy(xpath = "//ul/li/*[contains(text(),'Attendance')]")
    private WebElement btnAttendanceCategoryFilter;
    @FindBy(xpath = "//ul/li/*[contains(text(),'Support')]")
    private WebElement btnSupportCategoryFilter;
    @FindBy(xpath = "//ul/li/*[contains(text(),'Kimble')]")
    private WebElement btnKimbleCategoryFilter;
    @FindBy(xpath = "//ul/li/*[contains(text(),'Absences')]")
    private WebElement btnAbsencesCategoryFilter;
    @FindBy(xpath = "//ul/li/*[contains(text(),'Other')]")
    private WebElement btnOtherCategoryFilter;


    @FindBy(xpath = "//button[@mattooltip='Click To Sort By Status']")
    private WebElement btnStatusSort;

    @FindBy(xpath = "//th[4]/div/div/ng-multiselect-dropdown")
    private WebElement btnStatusFilter;
    @FindBy(xpath = "//th[4]//ul/li/*[contains(text(),'Select All')]")
    private WebElement btnSelectAllStatusFilter;
    @FindBy(xpath = "//th[5]/div/div/ng-multiselect-dropdown")
    private WebElement btnStatusFilterForAdmin;
    @FindBy(xpath = "//th[5]//ul/li/*[contains(text(),'Select All')]")
    private WebElement btnSelectAllStatusFilterForAdmin;
    @FindBy(xpath = "//ul/li/*[contains(text(),'new')]")
    private WebElement btnNewStatusFilter;
    @FindBy(xpath = "//ul/li/*[contains(text(),'In progress')]")
    private WebElement btnInProgressStatusFilter;
    @FindBy(xpath = "//ul/li/*[contains(text(),'Pending')]")
    private WebElement btnPendingStatusFilter;
    @FindBy(xpath = "//ul/li/*[contains(text(),'Resolved')]")
    private WebElement btnResolvedStatusFilter;
    @FindBy(xpath = "//ul/li/*[contains(text(),'Closed')]")
    private WebElement btnClosedStatusFilter;


    @FindBy(xpath = "//button[@mattooltip='Sort By Newest']")
    private WebElement btnDateAndTimeSort;
    @FindBy(xpath = "//td/a")
    private WebElement btnFirstTicketTitle;
    @FindBy(xpath = "//td[1]")
    private WebElement txtFirstTicketId;

    @FindBy(xpath = ".//h2[contains(text(),'Tickets')]")
    private WebElement txtPageTitle;

    public TicketsPage() {
        PageFactory.initElements(driver, this);

    }

    public boolean verifySortIcon() {
        return imgSortTicketSubject.isDisplayed();
    }
    
    public boolean verifyFilterIcon() {
        return imgFilterTicketSubject.isDisplayed();
    }

    public void clickTicketSubject() {
        imgSortTicketSubject.click();
    }

    public void clickCategory() {
        imgCategory.click();
    }

    public void clickPriority() {
        imgPriority.click();
    }

    public void clickStatus() {
        imgStatus.click();
    }

    public void selectAnyTicket() {
        linkTicket.click();
        System.out.println("i can select a ticket--------------");
    }

    public WebElement getDateAndTime() {
        return dateAndTime;
    }

    public void clickOnFilterByDates() {
        btnFilterByDates.click();
    }

    public void enterDates(String startDate, String endDate) {
        txtDateInput.sendKeys(startDate + Keys.TAB + endDate + Keys.RETURN);
    }

    public void clickOnRemoveDateFilter() {
        btnRemoveDateFilter.click();
    }

    public List<WebElement> getTicketIds() {
        return txtTicketIds;
    }

    public List<WebElement> getTicketDateAndTime() {
        return txtTicketDateAndTime;
    }

    public List<WebElement> getTableRows() {
        return txtTableRows;
    }

    public void clickButtonFilterByDates() {
        btnFilterByDates.click();
    }

    public void clickButtonCreateTicket() {
        btnCreateTicket.click();
    }

    public void clickButtonTicketSubjectSort() {
        btnTicketSubjectSort.click();
    }

    public void clickButtonCategorySort() {
        btnCategorySort.click();
    }

    public void clickButtonCategoryFilter() {

    }

    public void clickButtonStatusSort() {
        btnStatusSort.click();
    }

    public void clickButtonStatusFilter() {
        btnStatusFilter.click();
    }

    public void clickButtonSelectAllStatusFilter() {
        btnSelectAllStatusFilter.click();
    }

    public void clickButtonStatusFilterForAdmin() {
        btnStatusFilterForAdmin.click();
    }

    public void clickButtonSelectAllStatusFilterForAdmin() {
        btnSelectAllStatusFilterForAdmin.click();
    }

    public void clickButtonNewStatusFilter() {
        btnNewStatusFilter.click();
    }

    public void clickButtonInProgressStatusFilter() {
        btnInProgressStatusFilter.click();
    }

    public void clickButtonPendingStatusFilter() {
        btnPendingStatusFilter.click();
    }

    public void clickButtonResolvedStatusFilter() {
        btnResolvedStatusFilter.click();
    }

    public void clickButtonClosedStatusFilter() {
        btnClosedStatusFilter.click();
    }

    public void clickButtonDateAndTimeSort() {
        btnDateAndTimeSort.click();
    }

    public void clickButtonFirstTicketTitle() {
        btnFirstTicketTitle.click();
    }

    public String getFirstTicketIDText() {
        return txtFirstTicketId.getText();
    }

    public String getPageTitle() {
        return txtPageTitle.getText();
    }

    public Boolean isNewStatusFilter() {
        return btnNewStatusFilter.isDisplayed();
    }

    public Boolean isInProgressStatusFilter() {
        return btnInProgressStatusFilter.isDisplayed();
    }

    public Boolean isPendingStatusFilter() {
        return btnPendingStatusFilter.isDisplayed();
    }

    public Boolean isResolvedStatusFilter() {
        return btnResolvedStatusFilter.isDisplayed();
    }

    public Boolean isClosedStatusFilterSelected() {
        return btnClosedStatusFilter.isDisplayed();
    }

}
