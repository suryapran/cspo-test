@CSPO
Feature: Sorting ticket based on Ticket Name


Background: Login to the application
		Given User launches the CSPO portal page
    #When Enters valid email_id and password for "Trainee"
    When Enters valid email_id and password for "Admin"
    And user clicks the Login button
    #Then Trainee should navigate to the Home page
    Then Admin should navigate to the Home page
    
    

@CSPO_423_sorting_ticket
Scenario: TC_CSPO423_2 Test that a TRAINEE can successfully navigate to the "Tickets" page via respective buttons
		Given user validate the "Home page" window
		Then user clicks  Ticketing  button
		Then user clicks on Tickets button
@CSPO_423_sorting_ticket
Scenario: TC_CSPO423_4 Test that a TRAINEE can view a column titled "Ticket Subject" is on tickets page and a filter icon exists on the column
		Given user validate the "Home page" window
		Then user clicks  Ticketing  button
		Then user clicks on Tickets button
		Then verify the filter icon of TicketSubject
@CSPO_423_sorting_ticket				
Scenario Outline: TC_CSPO423_6 Test that a TRAINEE  can view a column titled "Ticket Subject" is on tickets page and has a sort icon
		Given user validate the "Home page" window
		Then user clicks  Ticketing  button
		Then user clicks on Tickets button
		Then verify the sort icon of TicketSubject		
@CSPO_423_sorting_ticket		
Scenario Outline: TC_CSPO423_8 Test that a TRAINEE can sort ticket names in alphabetical order (ASCENDING ORDER) using the sort icon on the Ticket Subject Column
		Given user validate the "Home page" window
		Then user clicks  Ticketing  button
		Then user clicks on Tickets button
		Then verify the sort icon of TicketSubject
		Then user clicks on Ticket Subject sort icon button for ascending order 	
@CSPO_423_sorting_ticket		
Scenario Outline: TC_CSPO423_10 Test that TRAINEE can sort ticket names in alphabetical order (DESCENDING ORDER) using the sort icon on the Ticket Subject Column
		Given user validate the "Home page" window
		Then user clicks  Ticketing  button
		Then user clicks on Tickets button
		Then verify the sort icon of TicketSubject
		Then user clicks on Ticket Subject sort icon button for descending order



@CSPO_423_sorting_ticket_Admin
Scenario: TC_CSPO423_2 Test that a ADMIN can successfully navigate to the "Tickets" page via respective buttons
		Given user validate the "Home page" window
		Then user clicks  Ticketing  button
		Then user clicks on Tickets button
@CSPO_423_sorting_ticket_Admin
Scenario: TC_CSPO423_4 Test that a ADMIN can view a column titled "Ticket Subject" is on tickets page and a filter icon exists on the column
		Given user validate the "Home page" window
		Then user clicks  Ticketing  button
		Then user clicks on Tickets button
		Then verify the filter icon of TicketSubject
@CSPO_423_sorting_ticket_Admin				
Scenario Outline: TC_CSPO423_6 Test that a ADMIN  can view a column titled "Ticket Subject" is on tickets page and has a sort icon
		Given user validate the "Home page" window
		Then user clicks  Ticketing  button
		Then user clicks on Tickets button
		Then verify the sort icon of TicketSubject		
@CSPO_423_sorting_ticket_Admin		
Scenario Outline: TC_CSPO423_8 Test that a ADMIN can sort ticket names in alphabetical order (ASCENDING ORDER) using the sort icon on the Ticket Subject Column
		Given user validate the "Home page" window
		Then user clicks  Ticketing  button
		Then user clicks on Tickets button
		Then verify the sort icon of TicketSubject
		Then user clicks on Ticket Subject sort icon button for ascending order 	
@CSPO_423_sorting_ticket_Admin		
Scenario Outline: TC_CSPO423_10 Test that ADMIN can sort ticket names in alphabetical order (DESCENDING ORDER) using the sort icon on the Ticket Subject Column
		Given user validate the "Home page" window
		Then user clicks  Ticketing  button
		Then user clicks on Tickets button
		Then verify the sort icon of TicketSubject
		Then user clicks on Ticket Subject sort icon button for descending order
		
		
