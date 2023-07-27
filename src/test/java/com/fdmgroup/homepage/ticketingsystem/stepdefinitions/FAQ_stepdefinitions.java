package com.fdmgroup.homepage.ticketingsystem.stepdefinitions;

import com.fdmgroup.homepage.pages.IndexPage;
import com.fdmgroup.homepage.ticketingsystem.pages.CreateTicket;
import com.fdmgroup.homepage.ticketingsystem.pages.FaqPage;
import com.fdmgroup.homepage.ticketingsystem.pages.TicketingSystemPage;
import com.fdmgroup.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FAQ_stepdefinitions {

    IndexPage homePage = new IndexPage();
    TicketingSystemPage ticketingSystemPage = new TicketingSystemPage();
    ;
    FaqPage faqPage = new FaqPage();
    ;
    CreateTicket createTicket = new CreateTicket();


    @Given("Trainee navigate to the ticketing system page")
    public void traineeNavigateToTheTicketingSystemPage() {
        homePage.clickTicketingButton();
        Assert.assertEquals(ConfigurationReader.getProperty("pageTitleTicketingSystem"), ticketingSystemPage.getTitle());
    }

    @When("Trainee clicks on FAQ button")
    public void traineeClicksOnFAQButton() {
        ticketingSystemPage.clickFAQsButton();
        Assert.assertEquals(ConfigurationReader.getProperty("pageTitleFaqs"), faqPage.getPageTitle());
    }

    //@Trainee_Opens_FAQ_SeeMore_Page
    @And("Trainee clicks on See More button")
    public void traineeClicksOnSeeMoreButton() {
        faqPage.clickSeeMore();
        Assert.assertEquals(ConfigurationReader.getProperty("pageTitleFaqSeeMore"), faqPage.getFaqSeeMoreTitleText());
    }

    //@Trainee_Opens_CreateTicket_Page_In_FAQ_SeeMore
    @When("Trainee clicks on Create a Ticket button")
    public void traineeClicksOnCreateATicketButton() {
        faqPage.clickCreateTicket();
    }

    @Then("Trainee should be redirected to the Create Ticket page")
    public void traineeShouldBeRedirectedToTheCreateTicketPage() {
        Assert.assertEquals(ConfigurationReader.getProperty("pageTitleCreateTicket"), createTicket.getPageTitle());
    }

    //@Trainee_Opens_FAQ_Page_From_Sidebar
    @When("Trainee clicks sidebar ticketing system menu and clicks FAQs from the options")
    public void traineeClicksSidebarTicketingSystemMenuAndClicksFAQsFromTheOptions() {
        homePage.clickButtonSidebarTicketing();
        homePage.clickButtonSidebarFAQs();
        Assert.assertEquals(ConfigurationReader.getProperty("pageTitleFaqs"), faqPage.getPageTitle());
    }

    //@Trainee_Opens_CreateTicket_Page_In_Server_Error_FAQ_SeeMore
    @And("Trainee clicks See More button under Couldn't connect to server")
    public void traineeClicksSeeMoreButtonUnderCouldnTConnectToServer() {
        faqPage.clickSeeMore();
    }


}
