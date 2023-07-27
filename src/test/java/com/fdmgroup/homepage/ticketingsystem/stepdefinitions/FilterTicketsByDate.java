package com.fdmgroup.homepage.ticketingsystem.stepdefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

import com.fdmgroup.homepage.pages.IndexPage;
import com.fdmgroup.homepage.pages.LoginPage;
import com.fdmgroup.homepage.ticketingsystem.pages.TicketMenuPage;
import com.fdmgroup.homepage.ticketingsystem.pages.TicketsPage;
import com.fdmgroup.utilities.BrowserUtilities;
import com.fdmgroup.utilities.ConfigurationReader;

import io.cucumber.java.en.*;

public class FilterTicketsByDate extends BrowserUtilities {

    TicketMenuPage ticketMenuPage;
    TicketsPage ticketsPage;
    IndexPage indexPage;
    LoginPage loginPage;

    @Given("Ticketing button exists")
    public void ticketing_button_exists() {
        indexPage = new IndexPage();
        assertTrue(indexPage.getTicketingButtonText().equals(ConfigurationReader.getProperty("ticketingButtonText")));
    }

    @When("User clicks on Ticketing button")
    public void user_clicks_on_ticketing_button() {
        IndexPage indexPage = new IndexPage();
        indexPage.clickOnTicketing();
    }

    @When("clicks on Tickets on the Tickets Menu page")
    public void clicks_on_tickets_on_the_tickets_menu_page() {
        TicketMenuPage ticketMenuPage = new TicketMenuPage();
        ticketMenuPage.clickOnTickets();
    }

    @Then("Tickets should be displayed")
    public void tickets_should_be_displayed() {
        TicketsPage ticketsPage = new TicketsPage();
        List<WebElement> ticketIds = new ArrayList<>();
        ticketIds = ticketsPage.getTicketIds();
        assertTrue(ticketIds.size() > 0);
    }

    @Then("Date and Time column should be displayed")
    public void date_and_time_column_should_be_displayed() {
        TicketsPage ticketsPage = new TicketsPage();
        assertEquals(ConfigurationReader.getProperty("dateAndTimeColumnTitle"), ticketsPage.getDateAndTime().getText());
    }

    @Given("User is on tickets page")
    public void user_is_on_tickets_page() {

        IndexPage indexPage = new IndexPage();
        indexPage.clickOnTicketing();
        TicketMenuPage ticketMenuPage = new TicketMenuPage();
        ticketMenuPage.clickOnTickets();
        ticketsPage = new TicketsPage();
        assertTrue(ticketsPage.getTicketIds() != null);

    }

    @When("User clicks on filter by dates button")
    public void user_clicks_on_filter_by_dates_button() {
        ticketsPage = new TicketsPage();
        ticketsPage.clickOnFilterByDates();
    }

    @When("user enters dates {string} and {string}")
    public void user_enters_dates_and(String startDate, String endDate) {
        ticketsPage = new TicketsPage();
        ticketsPage.enterDates(startDate, endDate);

    }

    @Then("the page should display two tickets")
    public void the_page_should_display_two_tickets() {
        ticketsPage = new TicketsPage();
        List<WebElement> ticketIds = new ArrayList<>();
        ticketIds = ticketsPage.getTicketIds();
        assertTrue(ticketIds.size() == 2);
    }

    @Then("the page should not display any tickets")
    public void the_page_should_not_display_any_tickets() {
        ticketsPage = new TicketsPage();
        List<WebElement> tableRows = new ArrayList<>();
        tableRows = ticketsPage.getTableRows();
        assertTrue(tableRows.size() == 1);

    }
}
