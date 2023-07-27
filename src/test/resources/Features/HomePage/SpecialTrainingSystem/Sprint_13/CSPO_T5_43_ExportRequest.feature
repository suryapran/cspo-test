@CSPO
Feature: Export selected request


Background: Login to the application
		Given User launches the CSPO portal page
    When Enters valid email_id and password for "Admin"
    And user clicks the Login button
    
    

@CSPO_142_export_request
Scenario: TC_CSPO142_1 Test that a User can successfully login to the application
		And User verify the "Home page"

@CSPO_142_export_request
Scenario: TC_CSPO142_2 Test that a User can successfully navigate to the "Training Request History" page via respective button
		Then Click on Special Training drop down menu	
	  Then Click on Training History	
	  And Verify Training Request History page	
	  
@CSPO_142_export_request
Scenario: TC_CSPO142_3 Test that a User can select start and end dates from calender
		Then Click on Special Training drop down menu	
	  Then Click on Training History	
	  Then Verify Training Request History page	
    Then Select start date and end date	
	  
@CSPO_142_export_request
Scenario: TC_CSPO142_4 Test that a User can search the request histroy in selected date range
		Then Click on Special Training drop down menu	
	  Then Click on Training History	
	  Then Verify Training Request History page	
	  Then Select start date and end date	
	  And Click on serach button

@CSPO_142_export_request
Scenario: TC_CSPO142_5 Test that a User can export the request histroy in selected date range
		Then Click on Special Training drop down menu	
	  Then Click on Training History	
	  Then Verify Training Request History page	
	  Then Select start date and end date	
	  And Click on serach button 
	  And Click on export button	
	   
	  
		