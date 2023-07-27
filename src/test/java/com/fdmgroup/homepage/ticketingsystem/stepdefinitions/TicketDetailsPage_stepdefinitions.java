package  com.fdmgroup.homepage.ticketingsystem.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import org.junit.Assert;

import com.fdmgroup.homepage.ticketingsystem.pages.TicketDetailsPage;



public class TicketDetailsPage_stepdefinitions {

		
		TicketDetailsPage ticketDetailsPageObj;
		
		 @Then("^verify the plus and arrow icon displayed$")
		    public void verify_icons_Displayed() throws Throwable {
			   ticketDetailsPageObj=new TicketDetailsPage();
			 Assert.assertTrue( ticketDetailsPageObj.verifyPlusIconsDisplayed());  
			 Assert.assertTrue(ticketDetailsPageObj.verifyArrowIconsDisplayed());
			   
		    
		    }
	   @Then("^send a feedback message$")
	    public void send_feedback_Ticket() throws Throwable {
		   ticketDetailsPageObj=new TicketDetailsPage();
		   ticketDetailsPageObj.sendFeedback();
		   
	    
	    }
	   @Then("^user wants to see and close the preloaded response$")
	    public void popUp_Window() throws Throwable {
		   
		   ticketDetailsPageObj.popupWindow();
		  
		   
	    
	    }
	   @And("^user wants to cancel the ticket$")
	    public void cancel_Ticket() throws Throwable {
		
		   
		   ticketDetailsPageObj.cancelTicket();
		  
		   
	    
	    }
	    


  
}
