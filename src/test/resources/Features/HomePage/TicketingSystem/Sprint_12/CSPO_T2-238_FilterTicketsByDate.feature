Feature: Filter by date range
Background: User should be logged into the system
		Given User launches the CSPO portal page
    When Enters valid bruceLee Trainee email_id and password
    And user clicks the Login button
    Then User BruceLee should navigate to the Home page

Scenario: TC_CSPO_243_01 Test that a user can successfully navigate to the Tickets page via respective buttons
		Given Ticketing button exists
		When User clicks on Ticketing button
		And clicks on Tickets on the Tickets Menu page
		Then Tickets should be displayed
		
Scenario: TC_CSPO_243_02 Test that a user can view a column titled Date & Time on Tickets page	
		Given Ticketing button exists
		When User clicks on Ticketing button
		And clicks on Tickets on the Tickets Menu page
		Then Date and Time column should be displayed
		
Scenario Outline: TC_CSPO_243_03 Test that a user CAN filter tickets based on the date they were created with a VALID date with the format of mm/dd/yyyy
		Given User is on tickets page
		When User clicks on filter by dates button
		And user enters dates "<startDate>" and "<endDate>"
		Then the page should display two tickets
		Examples:
		|startDate|endDate|
		|3/18/2023|3/21/2023|
		|3/16/2023|3/18/2023|
		
Scenario Outline: TC_CSPO_243_04 Test that a user CANNOT filter tickets based on the date they were created with a INVALID date with the format of mm/dd/yyyy
		Given User is on tickets page
		When User clicks on filter by dates button
		And user enters dates "<startDate>" and "<endDate>"
		Then the page should not display any tickets
		Examples:
		|startDate|endDate|
		|3/21/2023|3/18/2023|
		|3/16/2024|3/18/2024|
		|3/16/2022|3/18/2022|
		|3/d/1999|m/12/1022|		  