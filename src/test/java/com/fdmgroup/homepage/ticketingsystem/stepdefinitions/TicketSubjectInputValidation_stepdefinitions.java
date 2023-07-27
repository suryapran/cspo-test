package com.fdmgroup.homepage.ticketingsystem.stepdefinitions;

import org.junit.Assert;

import com.fdmgroup.homepage.pages.IndexPage;
import com.fdmgroup.homepage.pages.LoginPage;
import com.fdmgroup.homepage.stepdefinitions.Hooks;
import com.fdmgroup.homepage.ticketingsystem.data.DataFile;
import com.fdmgroup.homepage.ticketingsystem.pages.CreateTicketPage;
import com.fdmgroup.homepage.ticketingsystem.pages.HomePage;
import com.fdmgroup.homepage.ticketingsystem.pages.TicketMenuPage;
import com.fdmgroup.utilities.ConfigurationReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TicketSubjectInputValidation_stepdefinitions {
	IndexPage indexPage;
	HomePage homePage;
	TicketMenuPage ticketMenuPage;
	CreateTicketPage createTicketPage;
	
	@Given("the trainee is on the home page")
	public void the_trainee_is_on_the_home_page() {
	  indexPage = new IndexPage();
	  homePage = new HomePage();
	  indexPage.clickLogo();
      Assert.assertEquals(DataFile.homePageURL, indexPage.currentUrl());
	  
	}

	@Given("click on Ticketing")
	public void click_on_ticketing() throws InterruptedException {
		homePage.clickTicketingButton();
	}

	@When("the trainee is navigated to the Ticket Menu page")
	public void the_trainee_is_navigated_to_the_ticket_menu_page() throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertEquals(DataFile.ticketMenuPageURL, indexPage.currentUrl());
	}

	@When("click on Create Ticket")
	public void click_on_create_ticket() {
		ticketMenuPage = new TicketMenuPage();
		ticketMenuPage.clickCreateTicketButton();
	    Assert.assertEquals(DataFile.createTicketPageURL, indexPage.currentUrl());
	}

	@Then("Ticket Subject input field should be displayed")
	public void ticket_subject_input_field_should_be_displayed() {
		createTicketPage = new CreateTicketPage();
		Assert.assertNotNull(createTicketPage.getInputEnterSubject());
	}
	
	@Then("verify that a placeholder text Enter Subject is displayed for the Ticket Subject input field")
	public void verify_that_a_placeholder_text_enter_subject_is_displayed_for_the_ticket_subject_input_field() {
		createTicketPage = new CreateTicketPage();
		String placeHolderText = createTicketPage.getInputEnterSubject().getAttribute("placeholder");
	    Assert.assertEquals(DataFile.inputSubjectPlaceHolderText, placeHolderText);
	}
	@Then("verify that Ticket Subject  should be displayed on the left side of the input field")
	public void verify_that_ticket_subject_should_be_displayed_on_the_left_side_of_the_input_field() {
		createTicketPage = new CreateTicketPage();
//		String labelTicketSubject = createTicketPage.getLabelTicketSubjectText();
	    Assert.assertEquals(DataFile.labelTicketSubjectText, createTicketPage.getLabelTicketSubjectText());

	}
	
	@When("hover the curser over the Ticket Subject input field")
	public void hover_the_curser_over_the_ticket_subject_input_field() {
		createTicketPage = new CreateTicketPage();
		createTicketPage.hover(createTicketPage.getInputEnterSubject());
	}
	
	@Then("verify that a tooltip with length validation text exists")
	public void verify_that_a_tooltip_with_length_validation_text_exists() {
		createTicketPage = new CreateTicketPage();
		Assert.assertNotNull(createTicketPage.getTooltipTicketSubject());
	}
	
	@Then("verify the tooltip text content")
	public void verify_the_tooltip_text_content() {
		createTicketPage = new CreateTicketPage();
		Assert.assertEquals(DataFile.toolTipText, createTicketPage.getToolTipText());
	}
	
	@When("Hover the cursor anywhere other than the Ticket Subject input field")
	public void hover_the_cursor_anywhere_other_than_the_ticket_subject_input_field() {
		createTicketPage = new CreateTicketPage();
		createTicketPage.hover(createTicketPage.getLabelTicketSubject());
	}
	@Then("verify that a tooltip with length validation text do not exists")
	public void verify_that_a_tooltip_with_length_validation_text_do_not_exists() {
		createTicketPage = new CreateTicketPage();
		Assert.assertEquals(true, createTicketPage.isToolTipNotDisplayed());
	}
	
	@When("populate all the required fields with Subject field less than length five")
	public void populate_all_the_required_fields_with_subject_field_less_than_length_five() {
		createTicketPage = new CreateTicketPage();
		createTicketPage.getInputEnterSubject().sendKeys("abc");
		createTicketPage.getInputDescription().sendKeys("abcdef");
	}

	@Then("the Submit button should be disabled")
	public void the_submit_button_should_be_disabled() {
		Assert.assertEquals(false, createTicketPage.isSubmitButtonEnabled());
	}
	
	@When("populate all the required fields with valid entries")
	public void populate_all_the_required_fields_with_valid_entries() {
		createTicketPage = new CreateTicketPage();
		createTicketPage.getInputEnterSubject().sendKeys("abcdef");
		createTicketPage.getInputDescription().sendKeys("abcdefgh");
	}

	@Then("the Submit button should be enabled")
	public void the_submit_button_should_be_enabled() {
		Assert.assertEquals(true, createTicketPage.isSubmitButtonEnabled());

	}

}
