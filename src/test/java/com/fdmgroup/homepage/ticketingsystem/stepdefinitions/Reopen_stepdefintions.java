package com.fdmgroup.homepage.ticketingsystem.stepdefinitions;

import com.fdmgroup.homepage.pages.IndexPage;
import com.fdmgroup.homepage.ticketingsystem.pages.TicketDetailsPage;
import com.fdmgroup.homepage.ticketingsystem.pages.TicketingSystemPage;
import com.fdmgroup.homepage.ticketingsystem.pages.TicketsPage;
import com.fdmgroup.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.ElementNotInteractableException;

public class Reopen_stepdefintions {

    IndexPage homePage = new IndexPage();
    TicketingSystemPage ticketingSystem = new TicketingSystemPage();
    TicketsPage ticketsPage = new TicketsPage();
    TicketDetailsPage ticketDetailsPage = new TicketDetailsPage();
    StringBuilder ticketId;

    //@ReopenTicket @Trainee_Reopen_Resolved_Ticket
    @And("Trainee navigates to the Tickets Page")
    public void traineeNavigatesToTheTicketsPage() {
        ticketingSystem.clickTicketsButton();
        Assert.assertEquals(ConfigurationReader.getProperty("pageTitleTickets"), ticketsPage.getPageTitle());
    }

    @When("Trainee apply status filter to Resolved")
    public void traineeApplyStatusFilterToResolved() {
        ticketsPage.clickButtonStatusFilter();
        ticketsPage.clickButtonResolvedStatusFilter();
        Assert.assertTrue(ticketsPage.isResolvedStatusFilter());
    }

    @And("Trainee clicks on the First Ticket Title")
    public void traineeClicksOnTheFirstTicketTitle() {
        ticketId = new StringBuilder();
        ticketId.append(ticketsPage.getFirstTicketIDText());
        ticketsPage.clickButtonFirstTicketTitle();
    }

    @Then("Trainee should be redirected to the Ticket details page")
    public void traineeShouldBeRedirectedToTheTicketDetailsPage() {
        Assert.assertEquals(ticketId.toString(), ticketDetailsPage.getTicketIdText());
    }

    @When("Trainee clicked on the Reopen button")
    public void traineeClickedOnTheReopenButton() {
        ticketDetailsPage.clickButtonReopen();
        Assert.assertTrue(ticketDetailsPage.isConfirmationDialogVisible());
    }

    @Then("Trainee clicks Yes on the confirmation dialog box")
    public void traineeClicksYesOnTheConfirmationDialogBox() {
        Assert.assertTrue(ticketDetailsPage.isConfirmationDialogVisible());
        ticketDetailsPage.clickButtonResolveConfirmationYes();
    }

    @And("Trainee click on the tickets page under Ticketing System from the side bar")
    public void traineeClickOnTheTicketsPageUnderTicketingSystemFromTheSideBar() {
        homePage.clickButtonSidebarTicketing();
        homePage.clickButtonSidebarTickets();
        Assert.assertEquals(ConfigurationReader.getProperty("pageTitleTickets"), ticketsPage.getPageTitle());
    }

    //@ReopenTicket @Trainee_Reopen_Closed_Ticket
    @When("Trainee apply status filter to Closed")
    public void traineeApplyStatusFilterToClosed() {
        ticketsPage.clickButtonStatusFilter();
        ticketsPage.clickButtonClosedStatusFilter();
        Assert.assertTrue(ticketsPage.isClosedStatusFilterSelected());
    }


    //@ReopenTicket @Trainee_Cancel_Reopen_Resolved_Ticket
    @Then("Trainee clicks No on the confirmation dialog box")
    public void traineeClicksNoOnTheConfirmationDialogBox() {
        Assert.assertTrue(ticketDetailsPage.isConfirmationDialogVisible());
        ticketDetailsPage.clickButtonResolveConfirmationNo();
    }

    @And("Trainee can view Resolved status on the Ticket")
    public void traineeCanViewResolvedStatusOnTheTicket() {
        Assert.assertEquals(ConfigurationReader.getProperty("ticketResolvedStatus"), ticketDetailsPage.getTicketStatus());
    }

    @Then("the Ticket status should be Resolved for the ticket")
    public void the_ticket_status_should_be_resolved_for_the_ticket() {
        ticketsPage.clickButtonStatusFilter();
        ticketsPage.clickButtonResolvedStatusFilter();
        Assert.assertEquals(ticketId.toString(), ticketsPage.getFirstTicketIDText());
    }

    //@ReopenTicket @Trainee_Cancel_Reopen_Closed_Ticket
    @And("Trainee can view Closed status on the Ticket")
    public void traineeCanViewClosedStatusOnTheTicket() {
        Assert.assertEquals(ConfigurationReader.getProperty("ticketClosedStatus"), ticketDetailsPage.getTicketStatus());
    }

    @And("the Ticket status should be Closed for the ticket")
    public void theTicketStatusShouldBeClosedForTheTicket() {
        ticketsPage.clickButtonStatusFilter();
        ticketsPage.clickButtonClosedStatusFilter();
        Assert.assertEquals(ticketId.toString(), ticketsPage.getFirstTicketIDText());
    }

    //@ReopenTicket @Trainee_Cannot_Reopen_New_Ticket
    @When("Trainee apply status filter to New")
    public void traineeApplyStatusFilterToNew() {
        ticketsPage.clickButtonStatusFilter();
        ticketsPage.clickButtonNewStatusFilter();
        Assert.assertTrue(ticketsPage.isNewStatusFilter());
    }

    @Then("Trainee should be redirected to the Ticket details page with status New")
    public void traineeShouldBeRedirectedToTheTicketDetailsPageWithStatusNew() {
        Assert.assertEquals(ConfigurationReader.getProperty("ticketNewStatus"), ticketDetailsPage.getTicketStatus());

    }

    @Then("The Ticket details page should open and should not display reopen button")
    public void the_ticket_details_page_should_open_and_should_not_display_reopen_button() {
        Assert.assertFalse(ticketDetailsPage.isReopenButtonVisible());
    }


    //@ReopenTicket @Trainee_Cannot_Reopen_InProgress_Ticket
    @When("Trainee apply status filter to In Progress")
    public void traineeApplyStatusFilterToInProgress() {
        ticketsPage.clickButtonStatusFilter();
        ticketsPage.clickButtonInProgressStatusFilter();
        Assert.assertTrue(ticketsPage.isInProgressStatusFilter());
    }

    @Then("Trainee should be redirected to the Ticket details page with status In Progress")
    public void traineeShouldBeRedirectedToTheTicketDetailsPageWithStatusInProgress() {
        Assert.assertEquals(ConfigurationReader.getProperty("ticketInProgressStatus"), ticketDetailsPage.getTicketStatus());
    }


    //@ReopenTicket @Trainee_Cannot_Reopen_Pending_Ticket
    @When("Trainee apply status filter to Pending")
    public void traineeApplyStatusFilterToPending() {
        ticketsPage.clickButtonStatusFilter();
        ticketsPage.clickButtonPendingStatusFilter();
        Assert.assertTrue(ticketsPage.isPendingStatusFilter());
    }

    @Then("Trainee should be redirected to the Ticket details page with status Pending")
    public void traineeShouldBeRedirectedToTheTicketDetailsPageWithStatusPending() {
        Assert.assertEquals(ConfigurationReader.getProperty("ticketPendingStatus"), ticketDetailsPage.getTicketStatus());
    }


    //@ReopenTicket @Admin_Cannot_Reopen_New_Ticket
    @Given("Admin navigate to the ticketing system page")
    public void adminNavigateToTheTicketingSystemPage() {
        homePage.clickTicketingButton();
        Assert.assertEquals(ConfigurationReader.getProperty("pageTitleTicketingSystem"), ticketingSystem.getTitle());
    }

    @And("Admin navigates to the Tickets Page")
    public void adminNavigatesToTheTicketsPage() {
        ticketingSystem.clickTicketsButton();
        Assert.assertEquals(ConfigurationReader.getProperty("pageTitleTickets"), ticketsPage.getPageTitle());
    }

    @When("Admin apply status filter to New")
    public void adminApplyStatusFilterToNew() {
        ticketsPage.clickButtonStatusFilterForAdmin();
        ticketsPage.clickButtonNewStatusFilter();
        Assert.assertTrue(ticketsPage.isNewStatusFilter());
    }

    @And("Admin clicks on the First Ticket Title")
    public void adminClicksOnTheFirstTicketTitle() {
        ticketsPage.clickButtonFirstTicketTitle();
    }

    @Then("Admin should be redirected to the Ticket details page with status New")
    public void adminShouldBeRedirectedToTheTicketDetailsPageWithStatusNew() {
        Assert.assertEquals(ConfigurationReader.getProperty("ticketNewStatus"), ticketDetailsPage.getTicketStatus());
    }

    //@ReopenTicket @Admin_Cannot_Reopen_InProgress_Ticket
    @When("Admin apply status filter to In Progress")
    public void adminApplyStatusFilterToInProgress() {
        ticketsPage.clickButtonStatusFilterForAdmin();
        ticketsPage.clickButtonInProgressStatusFilter();
        Assert.assertTrue(ticketsPage.isInProgressStatusFilter());
    }

    @Then("Admin should be redirected to the Ticket details page with status In Progress")
    public void adminShouldBeRedirectedToTheTicketDetailsPageWithStatusInProgress() {
        Assert.assertEquals(ConfigurationReader.getProperty("ticketInProgressStatus"), ticketDetailsPage.getTicketStatus());
    }

    //@ReopenTicket @Admin_Cannot_Reopen_Pending_Ticket
    @When("Admin apply status filter to Pending")
    public void adminApplyStatusFilterToPending() {
        ticketsPage.clickButtonStatusFilterForAdmin();
        ticketsPage.clickButtonPendingStatusFilter();
        Assert.assertTrue(ticketsPage.isPendingStatusFilter());
    }

    @Then("Admin should be redirected to the Ticket details page with status Pending")
    public void adminShouldBeRedirectedToTheTicketDetailsPageWithStatusPending() {
        Assert.assertEquals(ConfigurationReader.getProperty("ticketPendingStatus"), ticketDetailsPage.getTicketStatus());
    }

    //@ReopenTicket @Admin_Cannot_Reopen_Resolved_Ticket
    @When("Admin apply status filter to Resolved")
    public void adminApplyStatusFilterToResolved() {
        ticketsPage.clickButtonStatusFilterForAdmin();
        ticketsPage.clickButtonResolvedStatusFilter();
        Assert.assertTrue(ticketsPage.isResolvedStatusFilter());
    }

    @Then("Admin should be redirected to the Ticket details page with status Resolved")
    public void adminShouldBeRedirectedToTheTicketDetailsPageWithStatusResolved() {
        Assert.assertEquals(ConfigurationReader.getProperty("ticketResolvedStatus"), ticketDetailsPage.getTicketStatus());
    }

    //@ReopenTicket @Admin_Cannot_Reopen_Closed_Ticket
    @When("Admin apply status filter to Closed")
    public void adminApplyStatusFilterToClosed() {
        ticketsPage.clickButtonStatusFilterForAdmin();
        ticketsPage.clickButtonClosedStatusFilter();
        Assert.assertTrue(ticketsPage.isClosedStatusFilterSelected());
    }

    @Then("Admin should be redirected to the Ticket details page with status Closed")
    public void adminShouldBeRedirectedToTheTicketDetailsPageWithStatusClosed() {
        Assert.assertEquals(ConfigurationReader.getProperty("ticketClosedStatus"), ticketDetailsPage.getTicketStatus());
    }


}
