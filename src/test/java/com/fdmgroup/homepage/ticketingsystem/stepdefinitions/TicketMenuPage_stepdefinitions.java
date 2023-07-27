package  com.fdmgroup.homepage.ticketingsystem.stepdefinitions;


import io.cucumber.java.en.Then;



import com.fdmgroup.homepage.ticketingsystem.pages.TicketMenuPage;



public class TicketMenuPage_stepdefinitions {

		
		TicketMenuPage ticketMenuPageObj;
		

                     
	    public void navigaet_to_Ticket_Menu() throws Throwable {
		   ticketMenuPageObj=new TicketMenuPage();
	    	
		   ticketMenuPageObj.clickOnTickets();
		   Thread.sleep(500);
	    
	    }
	    


  
}
