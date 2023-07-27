package  com.fdmgroup.homepage.ticketingsystem.stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import org.junit.Assert;

import com.fdmgroup.homepage.ticketingsystem.pages.TicketsPage;
;


public class TicketsPage_stepdefinitions {


		TicketsPage ticketsPageObj;
		
		@Then("^verify the sort icon of TicketSubject$")
	    public void verify_sort_Icon() throws Throwable {
		   ticketsPageObj=new TicketsPage();
		    Assert.assertTrue(ticketsPageObj.verifySortIcon());
	    
	    }
		
		@Then("^verify the filter icon of TicketSubject$")
	    public void verify_filter_Icon() throws Throwable {
		   ticketsPageObj=new TicketsPage();
		    Assert.assertTrue(ticketsPageObj.verifyFilterIcon());
	    
	    }

	   @Then("^user clicks on Ticket Subject sort icon button for ascending order$")
	    public void sort_by_Name() throws Throwable {
		  	   

		   ticketsPageObj.clickTicketSubject();

    
	    }
	   @Then("^user clicks on Ticket Subject sort icon button for descending order$")
	    public void sort_by_Name2() throws Throwable {

		   ticketsPageObj.clickTicketSubject();
		   ticketsPageObj.clickTicketSubject();
   
	    
	    }
	   @Given("^user select any tickets and navigate to Ticket Details page$")
	    public void select_any_Ticket() throws Throwable {
		   
		   ticketsPageObj.selectAnyTicket();
		   
	    
	    }
	    


  
}
