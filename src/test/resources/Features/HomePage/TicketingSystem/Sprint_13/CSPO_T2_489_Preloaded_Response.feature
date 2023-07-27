@CSPO
Feature: Select a ticket 
         Send feedback 
				Disply preloaded reponse 


Background: Login to the application
		Given User launches the CSPO portal page
    When Enters valid email_id and password for "Trainee"
    And user clicks the Login button
    Then User should navigate to the Home page
    

@CSPO_511_preloaded_response	
Scenario: TC_CSPO423_1 Navigate to the Ticket page
		Given user validate the "Home page" window
		Then user navigate to the Ticket Menu page
		Then user navigate to the Ticket page
@CSPO_511_preloaded_response	
Scenario: TC_CSPO423_2 Select a ticket
		Given user validate the "Home page" window
		Then user navigate to the Ticket Menu page
		Then user navigate to the Ticket page
		Then verify the sort icon of TicketSubject
		Then user select any tickets and navigate to Ticket Details page
		
		
@CSPO_511_preloaded_response				
Scenario Outline: TC_CSPO423_3 Verify popup icon 
		Given user validate the "Home page" window
		Then user navigate to the Ticket Menu page
		Then user navigate to the Ticket page
		Then verify the sort icon of TicketSubject
		Then user select any tickets and navigate to Ticket Details page
    Then verify the plus and arrow icon displayed
    Then send a feedback message	

@CSPO_511_preloaded_response		
Scenario Outline: TC_CSPO423_4 Display popupwindow with preloaded response
		Given user validate the "Home page" window
		Then user navigate to the Ticket Menu page
		Then user navigate to the Ticket page
		Then verify the sort icon of TicketSubject
		Then user select any tickets and navigate to Ticket Details page
    Then verify the plus and arrow icon displayed
    Then send a feedback message	
		Then user wants to see and close the preloaded response 
  	Then user wants to cancel the ticket
		

		
		
		

